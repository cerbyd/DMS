package models;

import javax.persistence.ManyToOne;

public class TelephoneNumber extends BaseModel {

    @ManyToOne
    private Customer customer;
    private TelephoneType type;
    private String areacode;
    private String internationalcode;
    private String telnumber;
    private String contacttimes;
    private String extension;
    private boolean oktocontact;


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
     * @return the teltype
     */
    public TelephoneType getType() {
        return type;
    }

    /**
     * @param type the teltype to set
     */
    public void setType(TelephoneType type) {
        this.type = type;
    }

    /**
     * @return the areacode
     */
    public String getAreacode() {
        return areacode;
    }

    /**
     * @param areacode the areacode to set
     */
    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    /**
     * @return the internationalcode
     */
    public String getInternationalcode() {
        return internationalcode;
    }

    /**
     * @param internationalcode the internationalcode to set
     */
    public void setInternationalcode(String internationalcode) {
        this.internationalcode = internationalcode;
    }

    /**
     * @return the telnumber
     */
    public String getTelnumber() {
        return telnumber;
    }

    /**
     * @param telnumber the telnumber to set
     */
    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber;
    }

    /**
     * @return the contacttimes
     */
    public String getContacttimes() {
        return contacttimes;
    }

    /**
     * @param contacttimes the contacttimes to set
     */
    public void setContacttimes(String contacttimes) {
        this.contacttimes = contacttimes;
    }

    /**
     * @return the extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * @param extension the extension to set
     */
    public void setExtension(String extension) {
        this.extension = extension;
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
