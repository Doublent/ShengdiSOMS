package com.hand.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hand.model.User;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class CheckPosition implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String pathTo = request.getServletPath();
		User user = (User) request.getSession().getAttribute("current_user");
//		 System.out.println("Request to " + pathTo);
		if (pathTo.startsWith("/customerconfirm.action")) {
			if (user.getPosition().equals("财务人员")) {
				return actionInvocation.invoke();
			} else {
				return "errorPosition";
			}
		}
		if(pathTo.startsWith("/customeredit.action")){
			if (user.getPosition().equals("业务经理")||user.getPosition().equals("业务助理")) {
				return actionInvocation.invoke();
			} else {
				return "errorPosition";
			}
		}
		return actionInvocation.invoke();
	}

}
