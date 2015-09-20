package com.hand.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.hand.model.User;
import com.hand.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Namespace("")
@ParentPackage("basePackage")
@Action(value = "userAction", results = {
		@Result(name = "success", type = "redirect", location = "/normalDiscountAction!listNormalDiscount.action"),
		@Result(name = "error", location = "/error.jsp"),
		@Result(name = "saveUser", type = "redirect", location = "/normalDiscountAction!listNormalDiscount.action"),
		@Result(name = "listUser", location = "/listUser.jsp"),
		@Result(name = "removeUser", type = "redirect", location = "/userAction!listUser.action"),
		@Result(name = "updateUser", type = "redirect", location = "/userAction!listUser.action"),
		@Result(name = "input", location = "/saveUser.jsp"),
		@Result(name = "updatePreUser", location = "/updateUser.jsp") })
public class UserAction extends ActionSupport {

	private User user;

	HttpServletRequest request = ServletActionContext.getRequest();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Autowired
	private UserService userService;

	@Override
	public String execute() throws Exception {
		return this.isExist();
	}

	public String isExist() {
		if (this.userService.isExist(user)) {
			return SUCCESS;
		}
		return "notExist";
	}

	public String saveUser() {
		this.userService.save(user);
		System.out.println("User save successfully");
		return "saveUser";
	}

	public String removeUser() {
		System.out.println("Delete a user");
		this.userService.removeUser(user);
		return "removeUser";
	}

	public String listUser() {
		System.out.println("List Users");
		ArrayList<User> users = (ArrayList<User>) this.userService.findAllUser();
		request.setAttribute("users", users);
		return "listUser";
	}

	public String updateUser() {
		System.out.println("List Users");
		this.userService.update(user);
		return "updateUser";
	}

	public String updatePreUser() {
		System.out.println("Show user message before update:");
		user = userService.findSingleById(user.getUser_id());
		return "updatePreUser";
	}

}
