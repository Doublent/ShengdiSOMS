<<<<<<< HEAD
package com.hand.action;

import com.hand.model.NormalDiscount;
import com.hand.service.NormalDiscountService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@SuppressWarnings("serial")
@Namespace("/")
@ParentPackage("basePackage")
@Action(value = "normalDiscountAction", results = { @Result(name = "success", location = "/listNormalDiscount.jsp"),
		@Result(name = "saveNormalDiscount", type = "redirect", location = "/normalDiscountAction!listNormalDiscount.action "),
		@Result(name = "removeNormalDiscount", type = "redirect", location = "/normalDiscountAction!listNormalDiscount.action "),
		@Result(name = "updateNormalDiscount", type = "redirect", location = "/normalDiscountAction!listNormalDiscount.action "),
		@Result(name = "updatePreNormalDiscount", location = "/updateNormalDiscount.jsp"),
		@Result(name = "listNormalDiscount", location = "/normalDiscount.jsp") })
public class NormalDiscountAction extends ActionSupport {

	private NormalDiscount normalDiscount;

	public NormalDiscount getNormalDiscount() {
		return normalDiscount;
	}

	public void setNormalDiscount(NormalDiscount normalDiscount) {
		this.normalDiscount = normalDiscount;
	}

	@Autowired
	private NormalDiscountService normalDiscountService;

	// HttpServletRequest request = ServletActionContext.getRequest();

	public NormalDiscountService getNormalDiscountService() {
		return normalDiscountService;
	}

	public void setNormalDiscountService(NormalDiscountService normalDiscountService) {
		this.normalDiscountService = normalDiscountService;
	}

	/**
	 * http://localhost:8080/ShengdiSOMS/normalDiscountAction.action
	 */
	@Override
	public String execute() throws Exception {
		System.out.println("List NormalDiscount");
		ArrayList<NormalDiscount> normalDiscounts = (ArrayList<NormalDiscount>) this.normalDiscountService.findAll();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("normalDiscounts", normalDiscounts);
		return SUCCESS;
	}

	/*
	 * http://localhost:8080/ShengdiSOMS/normalDiscountAction!saveNormalDiscount.action
	 */
	public String saveNormalDiscount() {
		// NormalDiscount normalDiscount = new NormalDiscount();
		// normalDiscount.setDiscount_name("world");
		// normalDiscount.setType("world");
		// normalDiscount.setDiscount_base("world");
		// normalDiscount.setBase_qty(100);
		// normalDiscount.setDiscount_rate(100);
		// normalDiscount.setActivity("是");
		this.normalDiscountService.save(normalDiscount);
		System.out.println("save a NormalDiscount successfully");
		return "saveNormalDiscount";
	}

	public String removeNormalDiscount() {
		this.normalDiscountService.remove(normalDiscount);
		System.out.println("delete a NormalDiscount successfully");
		return "removeNormalDiscount";
	}

	public String updateNormalDiscount() {
		System.out.println(normalDiscount.toString());
		this.normalDiscountService.update(normalDiscount);
		System.out.println("update a NormalDiscount successfully");
		return "updateNormalDiscount";
	}

	public String updatePreNormalDiscount() {
		System.out.println("Show NormalDiscount message before update:");
		normalDiscount = normalDiscountService.findSingleById(normalDiscount.getDiscount_id());
		return "updatePreNormalDiscount";
	}

	/**
	 * http://localhost:8080/ShengdiSOMS/normalDiscountAction!listNormalDiscount.action
	 */
	public String listNormalDiscount() {
		System.out.println("List NormalDiscount");
		ArrayList<NormalDiscount> normalDiscounts = (ArrayList<NormalDiscount>) this.normalDiscountService.findAll();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("normalDiscounts", normalDiscounts);
		return "listNormalDiscount";
	}

	/**
	 * http://localhost:8080/ShengdiSOMS/normalDiscountAction!findByCondition.action
	 */
	public String findByCondition() {
		ArrayList<NormalDiscount> normalDiscounts = (ArrayList<NormalDiscount>) this.normalDiscountService
				.findByCondition(normalDiscount);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("normalDiscounts", normalDiscounts);
		return "listNormalDiscount";
	}
}
=======
package com.hand.action;

import com.hand.model.NormalDiscount;
import com.hand.service.NormalDiscountService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@SuppressWarnings("serial")
@Namespace("/")
@ParentPackage("basePackage")
@Action(value = "normalDiscountAction", results = { @Result(name = "success", location = "/listNormalDiscount.jsp"),
		@Result(name = "saveNormalDiscount", type = "redirect", location = "/normalDiscountAction!listNormalDiscount.action "),
		@Result(name = "removeNormalDiscount", type = "redirect", location = "/normalDiscountAction!listNormalDiscount.action "),
		@Result(name = "updateNormalDiscount", type = "redirect", location = "/normalDiscountAction!listNormalDiscount.action "),
		@Result(name = "updatePreNormalDiscount", location = "/updateNormalDiscount.jsp"),
		@Result(name = "listNormalDiscount", location = "/normalDiscount.jsp") })
public class NormalDiscountAction extends ActionSupport {

	private NormalDiscount normalDiscount;

	public NormalDiscount getNormalDiscount() {
		return normalDiscount;
	}

	public void setNormalDiscount(NormalDiscount normalDiscount) {
		this.normalDiscount = normalDiscount;
	}

	@Autowired
	private NormalDiscountService normalDiscountService;

	// HttpServletRequest request = ServletActionContext.getRequest();

	public NormalDiscountService getNormalDiscountService() {
		return normalDiscountService;
	}

	public void setNormalDiscountService(NormalDiscountService normalDiscountService) {
		this.normalDiscountService = normalDiscountService;
	}

	/**
	 * http://localhost:8080/ShengdiSOMS/normalDiscountAction.action
	 */
	@Override
	public String execute() throws Exception {
		System.out.println("List NormalDiscount");
		ArrayList<NormalDiscount> normalDiscounts = (ArrayList<NormalDiscount>) this.normalDiscountService.findAll();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("normalDiscounts", normalDiscounts);
		return SUCCESS;
	}

	/*
	 * http://localhost:8080/ShengdiSOMS/normalDiscountAction!saveNormalDiscount.action
	 */
	public String saveNormalDiscount() {
		// NormalDiscount normalDiscount = new NormalDiscount();
		// normalDiscount.setDiscount_name("world");
		// normalDiscount.setType("world");
		// normalDiscount.setDiscount_base("world");
		// normalDiscount.setBase_qty(100);
		// normalDiscount.setDiscount_rate(100);
		// normalDiscount.setActivity("是");
		this.normalDiscountService.save(normalDiscount);
		System.out.println("save a NormalDiscount successfully");
		return "saveNormalDiscount";
	}

	public String removeNormalDiscount() {
		this.normalDiscountService.remove(normalDiscount);
		System.out.println("delete a NormalDiscount successfully");
		return "removeNormalDiscount";
	}

	public String updateNormalDiscount() {
		System.out.println(normalDiscount.toString());
		this.normalDiscountService.update(normalDiscount);
		System.out.println("update a NormalDiscount successfully");
		return "updateNormalDiscount";
	}

	public String updatePreNormalDiscount() {
		System.out.println("Show NormalDiscount message before update:");
		normalDiscount = normalDiscountService.findSingleById(normalDiscount.getDiscount_id());
		return "updatePreNormalDiscount";
	}

	/**
	 * http://localhost:8080/ShengdiSOMS/normalDiscountAction!listNormalDiscount.action
	 */
	public String listNormalDiscount() {
		System.out.println("List NormalDiscount");
		ArrayList<NormalDiscount> normalDiscounts = (ArrayList<NormalDiscount>) this.normalDiscountService.findAll();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("normalDiscounts", normalDiscounts);
		return "listNormalDiscount";
	}

	/**
	 * http://localhost:8080/ShengdiSOMS/normalDiscountAction!findByCondition.action
	 */
	public String findByCondition() {
		ArrayList<NormalDiscount> normalDiscounts = (ArrayList<NormalDiscount>) this.normalDiscountService
				.findByCondition(normalDiscount);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("normalDiscounts", normalDiscounts);
		return "listNormalDiscount";
	}
}
>>>>>>> huangzijing
