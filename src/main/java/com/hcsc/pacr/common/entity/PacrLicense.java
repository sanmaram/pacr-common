// Generated with g9.

package com.hcsc.pacr.common.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="PACR_license")
public class PacrLicense implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "providerLicPkid";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="provider_lic_pkid", unique=true, nullable=false, precision=10)
    private int providerLicPkid;
    @Column(name="provider_id", precision=10)
    private int providerId;
    @Column(name="license_nbr", length=11)
    private String licenseNbr;
    @Column(name="license_exp_dt")
    private LocalDate licenseExpDt;
    @ManyToOne
    @JoinColumn(name="provider_pkid")
    @JsonIgnore
    private PacrProvider pacrProvider;

    /** Default constructor. */
    public PacrLicense() {
        super();
    }

    /**
     * Access method for providerLicPkid.
     *
     * @return the current value of providerLicPkid
     */
    public int getProviderLicPkid() {
        return providerLicPkid;
    }

    /**
     * Setter method for providerLicPkid.
     *
     * @param aProviderLicPkid the new value for providerLicPkid
     */
    public void setProviderLicPkid(int aProviderLicPkid) {
        providerLicPkid = aProviderLicPkid;
    }

    /**
     * Access method for providerId.
     *
     * @return the current value of providerId
     */
    public int getProviderId() {
        return providerId;
    }

    /**
     * Setter method for providerId.
     *
     * @param aProviderId the new value for providerId
     */
    public void setProviderId(int aProviderId) {
        providerId = aProviderId;
    }

    /**
     * Access method for licenseNbr.
     *
     * @return the current value of licenseNbr
     */
    public String getLicenseNbr() {
        return licenseNbr;
    }

    /**
     * Setter method for licenseNbr.
     *
     * @param aLicenseNbr the new value for licenseNbr
     */
    public void setLicenseNbr(String aLicenseNbr) {
        licenseNbr = aLicenseNbr;
    }

    /**
     * Access method for licenseExpDt.
     *
     * @return the current value of licenseExpDt
     */
    public LocalDate getLicenseExpDt() {
        return licenseExpDt;
    }

    /**
     * Setter method for licenseExpDt.
     *
     * @param aLicenseExpDt the new value for licenseExpDt
     */
    public void setLicenseExpDt(LocalDate aLicenseExpDt) {
        licenseExpDt = aLicenseExpDt;
    }

    /**
     * Access method for pacrProvider.
     *
     * @return the current value of pacrProvider
     */
    public PacrProvider getPacrProvider() {
        return pacrProvider;
    }

    /**
     * Setter method for pacrProvider.
     *
     * @param aPacrProvider the new value for pacrProvider
     */
    public void setPacrProvider(PacrProvider aPacrProvider) {
        pacrProvider = aPacrProvider;
    }

    /**
     * Compares the key for this instance with another PacrLicense.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PacrLicense and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PacrLicense)) {
            return false;
        }
        PacrLicense that = (PacrLicense) other;
        if (this.getProviderLicPkid() != that.getProviderLicPkid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PacrLicense.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PacrLicense)) return false;
        return this.equalKeys(other) && ((PacrLicense)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getProviderLicPkid();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[PacrLicense |");
        sb.append(" providerLicPkid=").append(getProviderLicPkid());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("providerLicPkid", Integer.valueOf(getProviderLicPkid()));
        return ret;
    }

}
