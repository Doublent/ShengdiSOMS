package com.hand.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class CheckLoginInterceptor implements Interceptor {

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
//		System.out.println("Request to " + pathTo);
		if (pathTo.equals("/userAction.action")) {
			return actionInvocation.invoke();
		}
		HttpSession session = null;
		session = request.getSession(false);
		if (session != null && session.getAttribute("current_user") != null) {
			return actionInvocation.invoke();
		} else {
			return "unLogin";
		}
	}

}
