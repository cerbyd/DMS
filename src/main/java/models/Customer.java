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
  
}
