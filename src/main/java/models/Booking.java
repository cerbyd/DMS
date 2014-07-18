package models;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Booking extends BaseModel  {
    
    @ManyToMany
    private Customer customer;
    
    @ManyToOne
    private BookingType type;
    
    private Date bookingstartdate;
    private Date bookingenddate;
    private Timestamp bookingstarttime;
    private Timestamp bookingendtime;


    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the type
     */
    public BookingType geType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(BookingType type) {
        this.type = type;
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


}
