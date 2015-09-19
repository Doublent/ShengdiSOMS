package com.hand.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.hand.model.CustContactors;
import com.hand.model.CustomersInfo;
import com.hand.service.CustContactorsService;
import com.hand.service.CustomersInfoService;
import com.mysql.fabric.Response;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class CustomerInfoAction extends ActionSupport implements RequestAware {

	/*
	 * 注入customersInfoService
	 */
	@Autowired
	private CustomersInfoService customersInfoService;
	/**
	 * 注入custContactorsService
	 */
	 @Autowired
	 private CustContactorsService custContactorsService;

	// private CustomersInfo customersInfo;
	//
	// public CustomersInfo getCustomersInfo() {
	// return customersInfo;
	// }
	//
	// public void setCustomersInfo(CustomersInfo customersInfo) {
	// this.customersInfo = customersInfo;
	// }

	private int cust_id;
	private String cust_name;
	private String type;
	private String cust_code;
	private String group_company;
	private String corporation;
	private String country;
	private String city;
	private String address1;
	private String address2;
	private String postcode;
	private String port_of_destination;
	private String shipping_mark;
	private String status;
	private String invoice_group;
	private String currency;
	private String payment_method;
	private String price_term1;
	private String price_term2;
	private String price_term3;
	private String markup_name;
	private String discount_name;
	private String market_area;
	private String business_manager;
	private String business_assistant;
	private String discount_id;

	private String mailFrom;
	private String prePO_MailTo;
	private String po_MailTo;
	private String ocpi_MailTo;
	private String inv_Pklist_mailto;

	@Override
	public String execute() throws Exception {

		return super.execute();
	}

	public String create() throws Exception {
		// SessionFactory factory = null;
		boolean flag = false;
		System.out.println("name:" + cust_name);
		flag = (cust_name.length() > 0);
		System.out.println("flag:" + flag);
		if (flag)
			// type;
			// cust_code;
			// group_company;
			// corporation;
			// country;
			// city;
			// address1;
			// address2;
			// postcode;
			// port_of_destination;
			// shipping_mark;
			// status;
			// invoice_group;
			// currency;
			// payment_method;
			// price_term1;
			// price_term2;
			// price_term3;
			// markup_name;
			// discount_name;
			// market_area;
			// business_manager;
			// business_assistant;
			// discount_id;)
		{

			CustomersInfo customersInfo = new CustomersInfo(cust_name, type, cust_code, group_company, corporation,
					country, city, address1, address2, postcode, port_of_destination, shipping_mark, status,
					invoice_group, currency, payment_method, price_term1, price_term2, price_term3, markup_name,
					discount_name, market_area, business_manager, business_assistant, discount_id);
			Integer id = customersInfoService.create(customersInfo);
			
			CustContactors custContactors = new CustContactors(id, mailFrom, prePO_MailTo, po_MailTo, ocpi_MailTo,
					inv_Pklist_mailto);
			custContactorsService.create(custContactors);
			
			request.put("customersInfo", customersInfoService.read4ID(id));
			request.put("custContactors", custContactorsService.read4ID(id));
			
			return "success";
		} else {
			return "failure";
		}
	}

	public String read() throws Exception {

		// customersInfoService.read(cust_name);
		request.put("customersInfo", customersInfoService.read(cust_name,type,group_company,cust_code,status,corporation));

		return "success";
	}
	
	public String readAll() throws Exception {
		
		request.put("customersInfo", customersInfoService.readAll());
		return "success";
	}

	public String confirm() throws Exception {

		customersInfoService.confirm(cust_id, "有效");
		request.put("customersInfo", customersInfoService.read4ID(cust_id));
		// request.put("customersInfo", customersInfoService.read(cust_name));

		return "success";

	}

	public String check() throws Exception {

		// customersInfoService.check(cust_id, "有效");
		request.put("customersInfo", customersInfoService.read4ID(cust_id));
		request.put("custContactors", custContactorsService.read4ID(cust_id));
		return "check";

	}

	public String edit() throws Exception {

		request.put("customersInfo", customersInfoService.read4ID(cust_id));
		request.put("custContactors", custContactorsService.read4ID(cust_id));

		return "edit";
	}

	public String update() throws Exception {

		CustomersInfo customersInfo = customersInfoService.get(cust_id);
		CustContactors custContactors = custContactorsService.get(cust_id);
		
		System.out.println(customersInfo.toString());

		if (cust_name != null) {
			customersInfo.setCust_name(cust_name);
		}
		if (type != null ) {
			customersInfo.setType(type);
		}
		if (cust_code != null) {
			customersInfo.setCust_code(cust_code);
		}
		if (group_company != null) {
			customersInfo.setGroup_company(group_company);
		}
		if (corporation != null) {
			customersInfo.setCorporation(corporation);
		}
		if (country != null) {
			customersInfo.setCountry(country);
		}
		if (city != null) {
			customersInfo.setCity(city);
		}
		if (address1 != null) {
			customersInfo.setAddress1(address1);
		}
		if (address2 != null) {
			customersInfo.setAddress2(address2);
		}
		if (postcode != null) {
			customersInfo.setPostcode(postcode);
		}
		if (port_of_destination != null) {
			customersInfo.setPort_of_destination(port_of_destination);
		}
		if (shipping_mark != null) {
			customersInfo.setShipping_mark(shipping_mark);
		}
		if (status != null) {
			customersInfo.setStatus(status);
		}
		if (invoice_group != null) {
			customersInfo.setInvoice_group(invoice_group);
		}
		if (currency != null) {
			customersInfo.setCurrency(currency);
		}
		if (payment_method != null) {
			customersInfo.setPayment_method(payment_method);
		}
		if (price_term1 != null) {
			customersInfo.setPrice_term1(price_term1);
		}
		if (price_term2 != null) {
			customersInfo.setPrice_term2(price_term2);
		}
		if (price_term3 != null) {
			customersInfo.setPrice_term3(price_term3);
		}
		if (markup_name != null) {
			customersInfo.setMarkup_name(markup_name);
		}
		if (discount_name != null) {
			customersInfo.setDiscount_name(discount_name);
		}
		if (market_area != null) {
			customersInfo.setMarket_area(market_area);
		}
		if (business_manager != null) {
			customersInfo.setBusiness_manager(business_manager);
		}
		if (business_assistant != null) {
			customersInfo.setBusiness_assistant(business_assistant);
		}
		if (discount_id != null) {
			customersInfo.setDiscount_id(discount_id);
		}
		
//------	CustContactors	-------	
		if(mailFrom!=null){
			custContactors.setMailFrom(mailFrom);
		}
		if(prePO_MailTo!=null){
			custContactors.setPrePO_MailTo(prePO_MailTo);
		}
		if(po_MailTo!=null){
			custContactors.setPo_MailTo(po_MailTo);
		}
		if(ocpi_MailTo!=null){
			custContactors.setOcpi_MailTo(ocpi_MailTo);
		}
		if(inv_Pklist_mailto!=null){
			custContactors.setInv_Pklist_mailto(inv_Pklist_mailto);
		}

		customersInfoService.update(customersInfo);
		custContactorsService.update(custContactors);

//		HttpServletResponse response = ServletActionContext.getResponse();
//		response.getWriter().write("success");
		
		return null;
		// return SUCCESS;
	}

	private Map<String, Object> request;

	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.request = arg0;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCust_code() {
		return cust_code;
	}

	public void setCust_code(String cust_code) {
		this.cust_code = cust_code;
	}

	public String getGroup_company() {
		return group_company;
	}

	public void setGroup_company(String group_company) {
		this.group_company = group_company;
	}

	public String getCorporation() {
		return corporation;
	}

	public void setCorporation(String corporation) {
		this.corporation = corporation;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPort_of_destination() {
		return port_of_destination;
	}

	public void setPort_of_destination(String port_of_destination) {
		this.port_of_destination = port_of_destination;
	}

	public String getShipping_mark() {
		return shipping_mark;
	}

	public void setShipping_mark(String shipping_mark) {
		this.shipping_mark = shipping_mark;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInvoice_group() {
		return invoice_group;
	}

	public void setInvoice_group(String invoice_group) {
		this.invoice_group = invoice_group;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public String getPrice_term1() {
		return price_term1;
	}

	public void setPrice_term1(String price_term1) {
		this.price_term1 = price_term1;
	}

	public String getPrice_term2() {
		return price_term2;
	}

	public void setPrice_term2(String price_term2) {
		this.price_term2 = price_term2;
	}

	public String getPrice_term3() {
		return price_term3;
	}

	public void setPrice_term3(String price_term3) {
		this.price_term3 = price_term3;
	}

	public String getMarkup_name() {
		return markup_name;
	}

	public void setMarkup_name(String markup_name) {
		this.markup_name = markup_name;
	}

	public String getDiscount_name() {
		return discount_name;
	}

	public void setDiscount_name(String discount_name) {
		this.discount_name = discount_name;
	}

	public String getMarket_area() {
		return market_area;
	}

	public void setMarket_area(String market_area) {
		this.market_area = market_area;
	}

	public String getBusiness_manager() {
		return business_manager;
	}

	public void setBusiness_manager(String business_manager) {
		this.business_manager = business_manager;
	}

	public String getBusiness_assistant() {
		return business_assistant;
	}

	public void setBusiness_assistant(String business_assistant) {
		this.business_assistant = business_assistant;
	}

	public String getDiscount_id() {
		return discount_id;
	}

	public void setDiscount_id(String discount_id) {
		this.discount_id = discount_id;
	}

	// **************************

	public String getMailFrom() {
		return mailFrom;
	}

	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}

	public String getPrePO_MailTo() {
		return prePO_MailTo;
	}

	public void setPrePO_MailTo(String prePO_MailTo) {
		this.prePO_MailTo = prePO_MailTo;
	}

	public String getPo_MailTo() {
		return po_MailTo;
	}

	public void setPo_MailTo(String po_MailTo) {
		this.po_MailTo = po_MailTo;
	}

	public String getOcpi_MailTo() {
		return ocpi_MailTo;
	}

	public void setOcpi_MailTo(String ocpi_MailTo) {
		this.ocpi_MailTo = ocpi_MailTo;
	}

	public String getInv_Pklist_mailto() {
		return inv_Pklist_mailto;
	}

	public void setInv_Pklist_mailto(String inv_Pklist_mailto) {
		this.inv_Pklist_mailto = inv_Pklist_mailto;
	}

}
