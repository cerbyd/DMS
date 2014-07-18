package models;
import java.sql.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Address {
	private int addressid;
	private int customerid;
	private String addresstype;
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	private String country;
	private String county;
	private String postcode;
	private String town;
	private Date updateddate;
	private Date createddate;
	private boolean oktocontact;
	/**
	 * @return the addressid
	 */
	public int getAddressid() {
		return addressid;
	}
	/**
	 * @param addressid the addressid to set
	 */
	public void setAddressid(int addressid) {
		this.addressid = addressid;
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
	 * @return the addresstype
	 */
	public String getAddresstype() {
		return addresstype;
	}
	/**
	 * @param addresstype the addresstype to set
	 */
	public void setAddresstype(String addresstype) {
		this.addresstype = addresstype;
	}
	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}
	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	/**
	 * @return the address3
	 */
	public String getAddress3() {
		return address3;
	}
	/**
	 * @param address3 the address3 to set
	 */
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	/**
	 * @return the address4
	 */
	public String getAddress4() {
		return address4;
	}
	/**
	 * @param address4 the address4 to set
	 */
	public void setAddress4(String address4) {
		this.address4 = address4;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}
	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}
	/**
	 * @return the postcode
	 */
	public String getPostcode() {
		return postcode;
	}
	/**
	 * @param postcode the postcode to set
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}
	/**
	 * @param town the town to set
	 */
	public void setTown(String town) {
		this.town = town;
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
