package models;
import java.sql.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class TelephoneNumber {
	private int telephoneid;
	private int customerid;
	private String teltype;
	private String areacode;
	private String internationalcode;
	private String telnumber;
	private String contacttimes;
	private String extension;
	private Date updateddate;
	private Date createddate;
	private boolean oktocontact;
	/**
	 * @return the telephoneid
	 */
	public int getTelephoneid() {
		return telephoneid;
	}
	/**
	 * @param telephoneid the telephoneid to set
	 */
	public void setTelephoneid(int telephoneid) {
		this.telephoneid = telephoneid;
	}
	/**
	 * @return the customerid
	 */
	public int getCustomerid() {
		return customerid;
	}
	/**
	 * @param customerid the customerid to set
	 */
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	/**
	 * @return the teltype
	 */
	public String getTeltype() {
		return teltype;
	}
	/**
	 * @param teltype the teltype to set
	 */
	public void setTeltype(String teltype) {
		this.teltype = teltype;
	}
	/**
	 * @return the areacode
	 */
	public String getAreacode() {
		return areacode;
	}
	/**
	 * @param areacode the areacode to set
	 */
	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}
	/**
	 * @return the internationalcode
	 */
	public String getInternationalcode() {
		return internationalcode;
	}
	/**
	 * @param internationalcode the internationalcode to set
	 */
	public void setInternationalcode(String internationalcode) {
		this.internationalcode = internationalcode;
	}
	/**
	 * @return the telnumber
	 */
	public String getTelnumber() {
		return telnumber;
	}
	/**
	 * @param telnumber the telnumber to set
	 */
	public void setTelnumber(String telnumber) {
		this.telnumber = telnumber;
	}
	/**
	 * @return the contacttimes
	 */
	public String getContacttimes() {
		return contacttimes;
	}
	/**
	 * @param contacttimes the contacttimes to set
	 */
	public void setContacttimes(String contacttimes) {
		this.contacttimes = contacttimes;
	}
	/**
	 * @return the extension
	 */
	public String getExtension() {
		return extension;
	}
	/**
	 * @param extension the extension to set
	 */
	public void setExtension(String extension) {
		this.extension = extension;
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
	 * @return the oktocontact
	 */
	public boolean isOktocontact() {
		return oktocontact;
	}
	/**
	 * @param oktocontact the oktocontact to set
	 */
	public void setOktocontact(boolean oktocontact) {
		this.oktocontact = oktocontact;
	}
	
	
}
