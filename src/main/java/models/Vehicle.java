package models;
import java.sql.*;
import java.math.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Vehicle {
	private int vehicleid;
	private String bodytype;
	private String brand;
	private String model;
	private String modelyear;
	private String fueltype;
	private double enginesize;
	private Date lastservicedate;
	private Date lastworked;
	private Date nextservicedate;
	private Date lastmotdate;
	private Date nextmotdate;
	private String nextservicedescription;
	private int odometer;
	private String odometerunit;
	private String registration;
	private BigDecimal serviceintervalmiles;
	private BigDecimal serviceintervalmonths;
	private String transmissiontype;
	private String vehiclecolour;
	private String vin;
	private Date updateddate;
	private Date createddate;
	private int lastinvoicenumber;
	/**
	 * @return the vehicleid
	 */
	public int getVehicleid() {
		return vehicleid;
	}
	/**
	 * @param vehicleid the vehicleid to set
	 */
	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}
	/**
	 * @return the bodytype
	 */
	public String getBodytype() {
		return bodytype;
	}
	/**
	 * @param bodytype the bodytype to set
	 */
	public void setBodytype(String bodytype) {
		this.bodytype = bodytype;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the modelyear
	 */
	public String getModelyear() {
		return modelyear;
	}
	/**
	 * @param modelyear the modelyear to set
	 */
	public void setModelyear(String modelyear) {
		this.modelyear = modelyear;
	}
	/**
	 * @return the fueltype
	 */
	public String getFueltype() {
		return fueltype;
	}
	/**
	 * @param fueltype the fueltype to set
	 */
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	/**
	 * @return the enginesize
	 */
	public double getEnginesize() {
		return enginesize;
	}
	/**
	 * @param enginesize the enginesize to set
	 */
	public void setEnginesize(double enginesize) {
		this.enginesize = enginesize;
	}
	/**
	 * @return the lastservicedate
	 */
	public Date getLastservicedate() {
		return lastservicedate;
	}
	/**
	 * @param lastservicedate the lastservicedate to set
	 */
	public void setLastservicedate(Date lastservicedate) {
		this.lastservicedate = lastservicedate;
	}
	/**
	 * @return the lastworked
	 */
	public Date getLastworked() {
		return lastworked;
	}
	/**
	 * @param lastworked the lastworked to set
	 */
	public void setLastworked(Date lastworked) {
		this.lastworked = lastworked;
	}
	/**
	 * @return the nextservicedate
	 */
	public Date getNextservicedate() {
		return nextservicedate;
	}
	/**
	 * @param nextservicedate the nextservicedate to set
	 */
	public void setNextservicedate(Date nextservicedate) {
		this.nextservicedate = nextservicedate;
	}
	/**
	 * @return the lastmotdate
	 */
	public Date getLastmotdate() {
		return lastmotdate;
	}
	/**
	 * @param lastmotdate the lastmotdate to set
	 */
	public void setLastmotdate(Date lastmotdate) {
		this.lastmotdate = lastmotdate;
	}
	/**
	 * @return the nextmotdate
	 */
	public Date getNextmotdate() {
		return nextmotdate;
	}
	/**
	 * @param nextmotdate the nextmotdate to set
	 */
	public void setNextmotdate(Date nextmotdate) {
		this.nextmotdate = nextmotdate;
	}
	/**
	 * @return the nextservicedescription
	 */
	public String getNextservicedescription() {
		return nextservicedescription;
	}
	/**
	 * @param nextservicedescription the nextservicedescription to set
	 */
	public void setNextservicedescription(String nextservicedescription) {
		this.nextservicedescription = nextservicedescription;
	}
	/**
	 * @return the odometer
	 */
	public int getOdometer() {
		return odometer;
	}
	/**
	 * @param odometer the odometer to set
	 */
	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}
	/**
	 * @return the odometerunit
	 */
	public String getOdometerunit() {
		return odometerunit;
	}
	/**
	 * @param odometerunit the odometerunit to set
	 */
	public void setOdometerunit(String odometerunit) {
		this.odometerunit = odometerunit;
	}
	/**
	 * @return the registration
	 */
	public String getRegistration() {
		return registration;
	}
	/**
	 * @param registration the registration to set
	 */
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	/**
	 * @return the serviceintervalmiles
	 */
	public BigDecimal getServiceintervalmiles() {
		return serviceintervalmiles;
	}
	/**
	 * @param serviceintervalmiles the serviceintervalmiles to set
	 */
	public void setServiceintervalmiles(BigDecimal serviceintervalmiles) {
		this.serviceintervalmiles = serviceintervalmiles;
	}
	/**
	 * @return the serviceintervalmonths
	 */
	public BigDecimal getServiceintervalmonths() {
		return serviceintervalmonths;
	}
	/**
	 * @param serviceintervalmonths the serviceintervalmonths to set
	 */
	public void setServiceintervalmonths(BigDecimal serviceintervalmonths) {
		this.serviceintervalmonths = serviceintervalmonths;
	}
	/**
	 * @return the transmissiontype
	 */
	public String getTransmissiontype() {
		return transmissiontype;
	}
	/**
	 * @param transmissiontype the transmissiontype to set
	 */
	public void setTransmissiontype(String transmissiontype) {
		this.transmissiontype = transmissiontype;
	}
	/**
	 * @return the vehiclecolour
	 */
	public String getVehiclecolour() {
		return vehiclecolour;
	}
	/**
	 * @param vehiclecolour the vehiclecolour to set
	 */
	public void setVehiclecolour(String vehiclecolour) {
		this.vehiclecolour = vehiclecolour;
	}
	/**
	 * @return the vin
	 */
	public String getVin() {
		return vin;
	}
	/**
	 * @param vin the vin to set
	 */
	public void setVin(String vin) {
		this.vin = vin;
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
	 * @return the lastinvoicenumber
	 */
	public int getLastinvoicenumber() {
		return lastinvoicenumber;
	}
	/**
	 * @param lastinvoicenumber the lastinvoicenumber to set
	 */
	public void setLastinvoicenumber(int lastinvoicenumber) {
		this.lastinvoicenumber = lastinvoicenumber;
	}


}
