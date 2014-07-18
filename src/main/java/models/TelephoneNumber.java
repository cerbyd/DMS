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
}
