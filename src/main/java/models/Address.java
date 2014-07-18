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

}
