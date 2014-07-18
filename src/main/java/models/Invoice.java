package models;
import java.sql.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Invoice {
	private int invoiceid;
	private int vehicleid;
	private int accountid; 
	private Date updateddate;
	private Date createddate;
	private Date opendate;
	private Date closedate;
	private String comments;
	private String department;
	private java.math.BigDecimal hoursbooked;
	private java.math.BigDecimal hoursworked;
	private String paymentmethod;
	private String paymenttype;
	private String status;
	private java.math.BigDecimal totalinvoicevalue;
	private java.math.BigDecimal totallabour;
	private java.math.BigDecimal totalparts;
	private java.math.BigDecimal totaltax;
	private java.math.BigDecimal totalthirdparty;
	private Timestamp plannedarrivaltime;
	private Timestamp planneddeparttime;
	private Timestamp plannedrepairendtime;
	private Timestamp plannedrepairstarttime;
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
	 * @return the vehicleid
	 */
	public int getVehicleid() {
		return vehicleid;
	}
	/**
	 * @param vehicleid the vehicleid to set
	 */
	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}
	/**
	 * @return the accountid
	 */
	public int getAccountid() {
		return accountid;
	}
	/**
	 * @param accountid the accountid to set
	 */
	public void setAccountid(int accountid) {
		this.accountid = accountid;
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
	 * @return the opendate
	 */
	public Date getOpendate() {
		return opendate;
	}
	/**
	 * @param opendate the opendate to set
	 */
	public void setOpendate(Date opendate) {
		this.opendate = opendate;
	}
	/**
	 * @return the closedate
	 */
	public Date getClosedate() {
		return closedate;
	}
	/**
	 * @param closedate the closedate to set
	 */
	public void setClosedate(Date closedate) {
		this.closedate = closedate;
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
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the hoursbooked
	 */
	public java.math.BigDecimal getHoursbooked() {
		return hoursbooked;
	}
	/**
	 * @param hoursbooked the hoursbooked to set
	 */
	public void setHoursbooked(java.math.BigDecimal hoursbooked) {
		this.hoursbooked = hoursbooked;
	}
	/**
	 * @return the hoursworked
	 */
	public java.math.BigDecimal getHoursworked() {
		return hoursworked;
	}
	/**
	 * @param hoursworked the hoursworked to set
	 */
	public void setHoursworked(java.math.BigDecimal hoursworked) {
		this.hoursworked = hoursworked;
	}
	/**
	 * @return the paymentmethod
	 */
	public String getPaymentmethod() {
		return paymentmethod;
	}
	/**
	 * @param paymentmethod the paymentmethod to set
	 */
	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}
	/**
	 * @return the paymenttype
	 */
	public String getPaymenttype() {
		return paymenttype;
	}
	/**
	 * @param paymenttype the paymenttype to set
	 */
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the totalinvoicevalue
	 */
	public java.math.BigDecimal getTotalinvoicevalue() {
		return totalinvoicevalue;
	}
	/**
	 * @param totalinvoicevalue the totalinvoicevalue to set
	 */
	public void setTotalinvoicevalue(java.math.BigDecimal totalinvoicevalue) {
		this.totalinvoicevalue = totalinvoicevalue;
	}
	/**
	 * @return the totallabour
	 */
	public java.math.BigDecimal getTotallabour() {
		return totallabour;
	}
	/**
	 * @param totallabour the totallabour to set
	 */
	public void setTotallabour(java.math.BigDecimal totallabour) {
		this.totallabour = totallabour;
	}
	/**
	 * @return the totalparts
	 */
	public java.math.BigDecimal getTotalparts() {
		return totalparts;
	}
	/**
	 * @param totalparts the totalparts to set
	 */
	public void setTotalparts(java.math.BigDecimal totalparts) {
		this.totalparts = totalparts;
	}
	/**
	 * @return the totaltax
	 */
	public java.math.BigDecimal getTotaltax() {
		return totaltax;
	}
	/**
	 * @param totaltax the totaltax to set
	 */
	public void setTotaltax(java.math.BigDecimal totaltax) {
		this.totaltax = totaltax;
	}
	/**
	 * @return the totalthirdparty
	 */
	public java.math.BigDecimal getTotalthirdparty() {
		return totalthirdparty;
	}
	/**
	 * @param totalthirdparty the totalthirdparty to set
	 */
	public void setTotalthirdparty(java.math.BigDecimal totalthirdparty) {
		this.totalthirdparty = totalthirdparty;
	}
	/**
	 * @return the plannedarrivaltime
	 */
	public Timestamp getPlannedarrivaltime() {
		return plannedarrivaltime;
	}
	/**
	 * @param plannedarrivaltime the plannedarrivaltime to set
	 */
	public void setPlannedarrivaltime(Timestamp plannedarrivaltime) {
		this.plannedarrivaltime = plannedarrivaltime;
	}
	/**
	 * @return the planneddeparttime
	 */
	public Timestamp getPlanneddeparttime() {
		return planneddeparttime;
	}
	/**
	 * @param planneddeparttime the planneddeparttime to set
	 */
	public void setPlanneddeparttime(Timestamp planneddeparttime) {
		this.planneddeparttime = planneddeparttime;
	}
	/**
	 * @return the plannedrepairendtime
	 */
	public Timestamp getPlannedrepairendtime() {
		return plannedrepairendtime;
	}
	/**
	 * @param plannedrepairendtime the plannedrepairendtime to set
	 */
	public void setPlannedrepairendtime(Timestamp plannedrepairendtime) {
		this.plannedrepairendtime = plannedrepairendtime;
	}
	/**
	 * @return the plannedrepairstarttime
	 */
	public Timestamp getPlannedrepairstarttime() {
		return plannedrepairstarttime;
	}
	/**
	 * @param plannedrepairstarttime the plannedrepairstarttime to set
	 */
	public void setPlannedrepairstarttime(Timestamp plannedrepairstarttime) {
		this.plannedrepairstarttime = plannedrepairstarttime;
	}

	
}
