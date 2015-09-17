package com.hand.model;

public class CustomersInfo {

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
	
	
	
//	private CustContactors custContactors;
//		
//	public CustContactors getCustContactors() {
//		return custContactors;
//	}
//
//	public void setCustContactors(CustContactors custContactors) {
//		this.custContactors = custContactors;
//	}
//
	
	
	
	public CustomersInfo() {
		super();
	}	

	public CustomersInfo( String cust_name, String type, String cust_code, String group_company,
			String corporation, String country, String city, String address1, String address2, String postcode,
			String port_of_destination, String shipping_mark, String status, String invoice_group, String currency,
			String payment_method, String price_term1, String price_term2, String price_term3, String markup_name,
			String discount_name, String market_area, String business_manager, String business_assistant,
			String discount_id) {
		super();
		this.cust_name = cust_name;
		this.type = type;
		this.cust_code = cust_code;
		this.group_company = group_company;
		this.corporation = corporation;
		this.country = country;
		this.city = city;
		this.address1 = address1;
		this.address2 = address2;
		this.postcode = postcode;
		this.port_of_destination = port_of_destination;
		this.shipping_mark = shipping_mark;
		this.status = status;
		this.invoice_group = invoice_group;
		this.currency = currency;
		this.payment_method = payment_method;
		this.price_term1 = price_term1;
		this.price_term2 = price_term2;
		this.price_term3 = price_term3;
		this.markup_name = markup_name;
		this.discount_name = discount_name;
		this.market_area = market_area;
		this.business_manager = business_manager;
		this.business_assistant = business_assistant;
		this.discount_id = discount_id;
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

	public void setPayment_method(String payment_methor) {
		this.payment_method = payment_methor;
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

	@Override
	public String toString() {
		return "CustomersInfo [cust_id=" + cust_id + ", cust_name=" + cust_name + ", type=" + type + ", cust_code="
				+ cust_code + ", group_company=" + group_company + ", corporation=" + corporation + ", country="
				+ country + ", city=" + city + ", address1=" + address1 + ", address2=" + address2 + ", postcode="
				+ postcode + ", port_of_destination=" + port_of_destination + ", shipping_mark=" + shipping_mark
				+ ", status=" + status + ", invoice_group=" + invoice_group + ", currency=" + currency
				+ ", payment_method=" + payment_method + ", price_term1=" + price_term1 + ", price_term2=" + price_term2
				+ ", price_term3=" + price_term3 + ", markup_name=" + markup_name + ", discount_name=" + discount_name
				+ ", market_area=" + market_area + ", business_manager=" + business_manager + ", business_assistant="
				+ business_assistant + ", discount_id=" + discount_id + "]";
	}
	
	
	
}
