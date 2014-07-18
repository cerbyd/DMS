package models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class InvoiceLine extends BaseModel implements Serializable  {

    @ManyToOne
    private Invoice invoice;
    
    @ManyToOne
    private LineType type;
       
    private String comments;
    private String complaint;
    private String menupricingcode;
    private String menupricingdescription;
    private String mennupricingtype;
    private String codeforservice;
    private String servicedetails;
    private boolean includedoninvoice;
   

    /**
     * @return the invoice
     */
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * @param invoice the invoice to set
     */
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
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
     * @return the complaint
     */
    public String getComplaint() {
        return complaint;
    }

    /**
     * @param complaint the complaint to set
     */
    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    /**
     * @return the menupricingcode
     */
    public String getMenupricingcode() {
        return menupricingcode;
    }

    /**
     * @param menupricingcode the menupricingcode to set
     */
    public void setMenupricingcode(String menupricingcode) {
        this.menupricingcode = menupricingcode;
    }

    /**
     * @return the menupricingdescription
     */
    public String getMenupricingdescription() {
        return menupricingdescription;
    }

    /**
     * @param menupricingdescription the menupricingdescription to set
     */
    public void setMenupricingdescription(String menupricingdescription) {
        this.menupricingdescription = menupricingdescription;
    }

    /**
     * @return the mennupricingtype
     */
    public String getMennupricingtype() {
        return mennupricingtype;
    }

    /**
     * @param mennupricingtype the mennupricingtype to set
     */
    public void setMennupricingtype(String mennupricingtype) {
        this.mennupricingtype = mennupricingtype;
    }

    /**
     * @return the codeforservice
     */
    public String getCodeforservice() {
        return codeforservice;
    }

    /**
     * @param codeforservice the codeforservice to set
     */
    public void setCodeforservice(String codeforservice) {
        this.codeforservice = codeforservice;
    }

    /**
     * @return the servicedetails
     */
    public String getServicedetails() {
        return servicedetails;
    }

    /**
     * @param servicedetails the servicedetails to set
     */
    public void setServicedetails(String servicedetails) {
        this.servicedetails = servicedetails;
    }

    /**
     * @return the includedoninvoice
     */
    public boolean isIncludedoninvoice() {
        return includedoninvoice;
    }

    /**
     * @param includedoninvoice the includedoninvoice to set
     */
    public void setIncludedoninvoice(boolean includedoninvoice) {
        this.includedoninvoice = includedoninvoice;
    }

    /**
     * @return the type
     */
    public LineType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(LineType type) {
        this.type = type;
    }

}
