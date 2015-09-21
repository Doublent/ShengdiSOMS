package com.hand.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.hand.model.DiscountAppliedRecords;
import com.hand.model.SpecialDiscount;
import com.hand.service.SpecialDiscountService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Namespace("/")
@ParentPackage("basePackage")
@Action(value = "specialDiscountAction", results = { @Result(name = "success", location = "/specialDiscount.jsp"),
		@Result(name = "saveSpecialDiscount", type = "redirect", location = "/specialDiscountAction!listSpecialDiscount.action "),
		@Result(name = "removeSpecialDiscount", type = "redirect", location = "/specialDiscountAction!listSpecialDiscount.action "),
		@Result(name = "updateSpecialDiscount", type = "redirect", location = "/specialDiscountAction!listSpecialDiscount.action "),
		@Result(name = "updatePreSpecialDiscount", location = "/updateSpecialDiscount.jsp"),
		@Result(name = "listSpecialDiscount", location = "/specialDiscount.jsp"),
		@Result(name = "findAppliedRecords", location = "/listAppliedRecords.jsp") })
public class SpecialDiscountAction extends ActionSupport {

	private SpecialDiscount specialDiscount;

	public SpecialDiscount getSpecialDiscount() {
		return specialDiscount;
	}

	public void setSpecialDiscount(SpecialDiscount specialDiscount) {
		this.specialDiscount = specialDiscount;
	}

	@Autowired
	private SpecialDiscountService specialDiscountService;

	// HttpServletRequest request = ServletActionContext.getRequest();

	/**
	 * http://localhost:8080/ShengdiSOMS/specialDiscountAction.action
	 */
	@Override
	public String execute() throws Exception {
		System.out.println("List SpecialDiscount");
		ArrayList<SpecialDiscount> specialDiscounts = (ArrayList<SpecialDiscount>) this.specialDiscountService
				.findAll();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("specialDiscounts", specialDiscounts);
		return SUCCESS;
	}

	/*
	 * http://localhost:8080/ShengdiSOMS/specialDiscountAction!
	 * saveSpecialDiscount.action
	 */
	public String saveSpecialDiscount() {
		// NormalDiscount normalDiscount = new NormalDiscount();
		// normalDiscount.setDiscount_name("world");
		// normalDiscount.setType("world");
		// normalDiscount.setDiscount_base("world");
		// normalDiscount.setBase_qty(100);
		// normalDiscount.setDiscount_rate(100);
		// normalDiscount.setActivity("是");
		this.specialDiscountService.save(specialDiscount);
		System.out.println("save a NormalDiscount successfully");
		return "saveSpecialDiscount";
	}

	public String removeSpecialDiscount() {
		this.specialDiscountService.remove(specialDiscount);
		System.out.println("delete a NormalDiscount successfully");
		return "removeSpecialDiscount";
	}

	public String updateSpecialDiscount() {
		System.out.println(specialDiscount.toString());
		this.specialDiscountService.update(specialDiscount);
		System.out.println("update a NormalDiscount successfully");
		return "updateSpecialDiscount";
	}

	public String updatePreSpecialDiscount() {
		System.out.println("Show NormalDiscount message before update:");
		specialDiscount = this.specialDiscountService.findSingleById(specialDiscount.getDiscount_id());
		specialDiscount.toString();
		return "updatePreSpecialDiscount";
	}

	/**
	 * http://localhost:8080/ShengdiSOMS/specialDiscountAction!listSpecialDiscount.action
	 */
	public String listSpecialDiscount() {
		System.out.println("List SpecialDiscount");
		ArrayList<SpecialDiscount> specialDiscounts = (ArrayList<SpecialDiscount>) this.specialDiscountService
				.findAll();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("specialDiscounts", specialDiscounts);
		return "listSpecialDiscount";
	}

	/**
	 * http://localhost:8080/ShengdiSOMS/specialDiscountAction!findByCondition.
	 * action
	 */
	public String findByCondition() {
		ArrayList<SpecialDiscount> specialDiscounts = (ArrayList<SpecialDiscount>) this.specialDiscountService
				.findByCondition(specialDiscount);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("specialDiscounts", specialDiscounts);
		return "listSpecialDiscount";
	}

	/**
	 * http://localhost:8080/ShengdiSOMS/specialDiscountAction!findAppliedRecords.action
	 * @return
	 */
	public String findAppliedRecords() {
		ArrayList<DiscountAppliedRecords> discountAppliedRecords = (ArrayList<DiscountAppliedRecords>) this.specialDiscountService
				.findAppliedRecordsById(specialDiscount.getDiscount_id());
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("discountAppliedRecords", discountAppliedRecords);
		return "findAppliedRecords";
	}
}
