package com.hand.model;

public class CustContactors {
	
	private int cust_id;
	private String mailFrom;
	private String prePO_MailTo;
	private String po_MailTo;
	private String ocpi_MailTo;
	private String inv_Pklist_mailto;
	
	
	
//	private CustomersInfo customersInfo;
//	
//	public CustomersInfo getCustomersInfo() {
//		return customersInfo;
//	}
//
//	public void setCustomersInfo(CustomersInfo customersInfo) {
//		this.customersInfo = customersInfo;
//	}

	
	
	public CustContactors() {
		super();
	}
	
	public CustContactors( Integer cust_id, String mailFrom, String prePO_MailTo, String po_MailTo, String ocpi_MailTo,
			String inv_Pklist_mailto) {
		super();
		this.cust_id = cust_id;
		this.mailFrom = mailFrom;
		this.prePO_MailTo = prePO_MailTo;
		this.po_MailTo = po_MailTo;
		this.ocpi_MailTo = ocpi_MailTo;
		this.inv_Pklist_mailto = inv_Pklist_mailto;
	}

	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
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

	@Override
	public String toString() {
		return "CustContactors [cust_id=" + cust_id + ", mailFrom=" + mailFrom + ", prePO_MailTo=" + prePO_MailTo
				+ ", po_MailTo=" + po_MailTo + ", ocpi_MailTo=" + ocpi_MailTo + ", inv_Pklist_mailto="
				+ inv_Pklist_mailto + "]";
	}
	
}
