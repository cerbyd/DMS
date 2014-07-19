package models;

import java.math.BigDecimal;
import java.sql.*;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Invoice extends BaseModel {
   
    @ManyToOne
    private Vehicle vehicle;
    
    @ManyToOne
    private Customer customer;
    
    @OneToMany
    private List<InvoiceLine> invoiceLines;
    
    @ManyToOne
    private Department department;
    
    private String invoiceNumber;
    private Date opendate;
    private Date closedate;
    private String comments;
 
    private BigDecimal hoursbooked;
    private BigDecimal hoursworked;
    private String paymentmethod;
    private String paymenttype;
    private Timestamp plannedarrivaltime;
    private Timestamp planneddeparttime;
    private Timestamp plannedrepairendtime;
    private Timestamp plannedrepairstarttime;

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    
    public List<InvoiceLine> getInvoiceLines() {
        return invoiceLines;
    }

    public void setInvoiceLines(List<InvoiceLine> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }

    
    /**
     * @return the vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

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
    public Department getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(Department department) {
        this.department = department;
    }

    /**
     * @return the hoursbooked
     */
    public BigDecimal getHoursbooked() {
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
    public BigDecimal getHoursworked() {
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
        return new InvoiceStatus(this).getValue();
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
