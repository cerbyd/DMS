package models;
import java.sql.*;
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

}
