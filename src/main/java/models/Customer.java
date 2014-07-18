package models;
import java.sql.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	private int customerid;
	private String customertype;
	private String customerstate;
	private String title;
	private String firstname;
	private String lastname;
	private Date dateofbirth;
	private String gender;
	private String locale;
	private String nobilitytitle;
	private String posttitle;
	private String professionaltitle;
	private String salutation;
	private Date createddate;
	private Date updateddate;
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
	 * @return the customertype
	 */
	public String getCustomertype() {
		return customertype;
	}
	/**
	 * @param customertype the customertype to set
	 */
	public void setCustomertype(String customertype) {
		this.customertype = customertype;
	}
	/**
	 * @return the customerstate
	 */
	public String getCustomerstate() {
		return customerstate;
	}
	/**
	 * @param customerstate the customerstate to set
	 */
	public void setCustomerstate(String customerstate) {
		this.customerstate = customerstate;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the dateofbirth
	 */
	public Date getDateofbirth() {
		return dateofbirth;
	}
	/**
	 * @param dateofbirth the dateofbirth to set
	 */
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the locale
	 */
	public String getLocale() {
		return locale;
	}
	/**
	 * @param locale the locale to set
	 */
	public void setLocale(String locale) {
		this.locale = locale;
	}
	/**
	 * @return the nobilitytitle
	 */
	public String getNobilitytitle() {
		return nobilitytitle;
	}
	/**
	 * @param nobilitytitle the nobilitytitle to set
	 */
	public void setNobilitytitle(String nobilitytitle) {
		this.nobilitytitle = nobilitytitle;
	}
	/**
	 * @return the posttitle
	 */
	public String getPosttitle() {
		return posttitle;
	}
	/**
	 * @param posttitle the posttitle to set
	 */
	public void setPosttitle(String posttitle) {
		this.posttitle = posttitle;
	}
	/**
	 * @return the professionaltitle
	 */
	public String getProfessionaltitle() {
		return professionaltitle;
	}
	/**
	 * @param professionaltitle the professionaltitle to set
	 */
	public void setProfessionaltitle(String professionaltitle) {
		this.professionaltitle = professionaltitle;
	}
	/**
	 * @return the salutation
	 */
	public String getSalutation() {
		return salutation;
	}
	/**
	 * @param salutation the salutation to set
	 */
	public void setSalutation(String salutation) {
		this.salutation = salutation;
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
  
	
}
