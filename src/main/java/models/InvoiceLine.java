package models;
import java.sql.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class InvoiceLine {
	private int lineid;
	private int invoiceid;
	private String comments;
	private String complaint;
	private String menupricingcode;
	private String menupricingdescription;
	private String mennupricingtype;
	private String codeforservice;
	private String servicedetails;
	private Date createddate;
	private boolean includedoninvoice;
	private Date updateddate;
	private String linetype;
	/**
	 * @return the lineid
	 */
	public int getLineid() {
		return lineid;
	}
	/**
	 * @param lineid the lineid to set
	 */
	public void setLineid(int lineid) {
		this.lineid = lineid;
	}
	/**
	 * @return the invoiceid
	 */
	public int getInvoiceid() {
		return invoiceid;
	}
	/**
	 * @param invoiceid the invoiceid to set
	 */
	public void setInvoiceid(int invoiceid) {
		this.invoiceid = invoiceid;
	}
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/**
	 * @return the complaint
	 */
	public String getComplaint() {
		return complaint;
	}
	/**
	 * @param complaint the complaint to set
	 */
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}
	/**
	 * @return the menupricingcode
	 */
	public String getMenupricingcode() {
		return menupricingcode;
	}
	/**
	 * @param menupricingcode the menupricingcode to set
	 */
	public void setMenupricingcode(String menupricingcode) {
		this.menupricingcode = menupricingcode;
	}
	/**
	 * @return the menupricingdescription
	 */
	public String getMenupricingdescription() {
		return menupricingdescription;
	}
	/**
	 * @param menupricingdescription the menupricingdescription to set
	 */
	public void setMenupricingdescription(String menupricingdescription) {
		this.menupricingdescription = menupricingdescription;
	}
	/**
	 * @return the mennupricingtype
	 */
	public String getMennupricingtype() {
		return mennupricingtype;
	}
	/**
	 * @param mennupricingtype the mennupricingtype to set
	 */
	public void setMennupricingtype(String mennupricingtype) {
		this.mennupricingtype = mennupricingtype;
	}
	/**
	 * @return the codeforservice
	 */
	public String getCodeforservice() {
		return codeforservice;
	}
	/**
	 * @param codeforservice the codeforservice to set
	 */
	public void setCodeforservice(String codeforservice) {
		this.codeforservice = codeforservice;
	}
	/**
	 * @return the servicedetails
	 */
	public String getServicedetails() {
		return servicedetails;
	}
	/**
	 * @param servicedetails the servicedetails to set
	 */
	public void setServicedetails(String servicedetails) {
		this.servicedetails = servicedetails;
	}
	/**
	 * @return the createddate
	 */
	public Date getCreateddate() {
		return createddate;
	}
	/**
	 * @param createddate the createddate to set
	 */
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	/**
	 * @return the includedoninvoice
	 */
	public boolean isIncludedoninvoice() {
		return includedoninvoice;
	}
	/**
	 * @param includedoninvoice the includedoninvoice to set
	 */
	public void setIncludedoninvoice(boolean includedoninvoice) {
		this.includedoninvoice = includedoninvoice;
	}
	/**
	 * @return the updateddate
	 */
	public Date getUpdateddate() {
		return updateddate;
	}
	/**
	 * @param updateddate the updateddate to set
	 */
	public void setUpdateddate(Date updateddate) {
		this.updateddate = updateddate;
	}
	/**
	 * @return the linetype
	 */
	public String getLinetype() {
		return linetype;
	}
	/**
	 * @param linetype the linetype to set
	 */
	public void setLinetype(String linetype) {
		this.linetype = linetype;
	}

	
}