package models;

import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Booking {
	private int bookingid;
	private int customerid;
	private String bookingtype;
	private Date bookingstartdate;
	private Date bookingenddate;
	private Timestamp bookingstarttime;
	private Timestamp bookingendtime;
	private Date updateddate;
	private Date createddate;
	/**
	 * @return the bookingid
	 */
	public int getBookingid() {
		return bookingid;
	}
	/**
	 * @param bookingid the bookingid to set
	 */
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
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
	 * @return the bookingtype
	 */
	public String getBookingtype() {
		return bookingtype;
	}
	/**
	 * @param bookingtype the bookingtype to set
	 */
	public void setBookingtype(String bookingtype) {
		this.bookingtype = bookingtype;
	}
	/**
	 * @return the bookingstartdate
	 */
	public Date getBookingstartdate() {
		return bookingstartdate;
	}
	/**
	 * @param bookingstartdate the bookingstartdate to set
	 */
	public void setBookingstartdate(Date bookingstartdate) {
		this.bookingstartdate = bookingstartdate;
	}
	/**
	 * @return the bookingenddate
	 */
	public Date getBookingenddate() {
		return bookingenddate;
	}
	/**
	 * @param bookingenddate the bookingenddate to set
	 */
	public void setBookingenddate(Date bookingenddate) {
		this.bookingenddate = bookingenddate;
	}
	/**
	 * @return the bookingstarttime
	 */
	public Timestamp getBookingstarttime() {
		return bookingstarttime;
	}
	/**
	 * @param bookingstarttime the bookingstarttime to set
	 */
	public void setBookingstarttime(Timestamp bookingstarttime) {
		this.bookingstarttime = bookingstarttime;
	}
	/**
	 * @return the bookingendtime
	 */
	public Timestamp getBookingendtime() {
		return bookingendtime;
	}
	/**
	 * @param bookingendtime the bookingendtime to set
	 */
	public void setBookingendtime(Timestamp bookingendtime) {
		this.bookingendtime = bookingendtime;
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

	
}
