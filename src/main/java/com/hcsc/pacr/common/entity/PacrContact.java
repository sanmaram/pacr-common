// Generated with g9.

package com.hcsc.pacr.common.entity;

import java.io.Serializable;
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

@Entity(name="PACR_contact")
public class PacrContact implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "palContactPkid";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="pal_contact_pkid", unique=true, nullable=false, precision=10)
    private int palContactPkid;
    @Column(name="contact_id", precision=10)
    private int contactId;
    @Column(name="provider_id", precision=10)
    private int providerId;
    @Column(name="pal_id", precision=10)
    private int palId;
    @Column(name="contact_email", length=50)
    private String contactEmail;
    @Column(name="phone_nbr", length=10)
    private String phoneNbr;
    @Column(name="phone_cntry_code", length=3)
    private String phoneCntryCode;
    @ManyToOne
    @JoinColumn(name="provider_svc_loc_pkid")
    @JsonIgnore
    private PacrProviderServiceLocation pacrProviderServiceLocation;
    @ManyToOne
    @JoinColumn(name="provider_oth_svc_loc_pkid")
    @JsonIgnore
    private PacrProviderOthSvcLocation pacrProviderOthSvcLocation;

    /** Default constructor. */
    public PacrContact() {
        super();
    }

    /**
     * Access method for palContactPkid.
     *
     * @return the current value of palContactPkid
     */
    public int getPalContactPkid() {
        return palContactPkid;
    }

    /**
     * Setter method for palContactPkid.
     *
     * @param aPalContactPkid the new value for palContactPkid
     */
    public void setPalContactPkid(int aPalContactPkid) {
        palContactPkid = aPalContactPkid;
    }

    /**
     * Access method for contactId.
     *
     * @return the current value of contactId
     */
    public int getContactId() {
        return contactId;
    }

    /**
     * Setter method for contactId.
     *
     * @param aContactId the new value for contactId
     */
    public void setContactId(int aContactId) {
        contactId = aContactId;
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
     * Access method for palId.
     *
     * @return the current value of palId
     */
    public int getPalId() {
        return palId;
    }

    /**
     * Setter method for palId.
     *
     * @param aPalId the new value for palId
     */
    public void setPalId(int aPalId) {
        palId = aPalId;
    }

    /**
     * Access method for contactEmail.
     *
     * @return the current value of contactEmail
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Setter method for contactEmail.
     *
     * @param aContactEmail the new value for contactEmail
     */
    public void setContactEmail(String aContactEmail) {
        contactEmail = aContactEmail;
    }

    /**
     * Access method for phoneNbr.
     *
     * @return the current value of phoneNbr
     */
    public String getPhoneNbr() {
        return phoneNbr;
    }

    /**
     * Setter method for phoneNbr.
     *
     * @param aPhoneNbr the new value for phoneNbr
     */
    public void setPhoneNbr(String aPhoneNbr) {
        phoneNbr = aPhoneNbr;
    }

    /**
     * Access method for phoneCntryCode.
     *
     * @return the current value of phoneCntryCode
     */
    public String getPhoneCntryCode() {
        return phoneCntryCode;
    }

    /**
     * Setter method for phoneCntryCode.
     *
     * @param aPhoneCntryCode the new value for phoneCntryCode
     */
    public void setPhoneCntryCode(String aPhoneCntryCode) {
        phoneCntryCode = aPhoneCntryCode;
    }

    /**
     * Access method for pacrProviderServiceLocation.
     *
     * @return the current value of pacrProviderServiceLocation
     */
    public PacrProviderServiceLocation getPacrProviderServiceLocation() {
        return pacrProviderServiceLocation;
    }

    /**
     * Setter method for pacrProviderServiceLocation.
     *
     * @param aPacrProviderServiceLocation the new value for pacrProviderServiceLocation
     */
    public void setPacrProviderServiceLocation(PacrProviderServiceLocation aPacrProviderServiceLocation) {
        pacrProviderServiceLocation = aPacrProviderServiceLocation;
    }

    /**
     * Access method for pacrProviderOthSvcLocation.
     *
     * @return the current value of pacrProviderOthSvcLocation
     */
    public PacrProviderOthSvcLocation getPacrProviderOthSvcLocation() {
        return pacrProviderOthSvcLocation;
    }

    /**
     * Setter method for pacrProviderOthSvcLocation.
     *
     * @param aPacrProviderOthSvcLocation the new value for pacrProviderOthSvcLocation
     */
    public void setPacrProviderOthSvcLocation(PacrProviderOthSvcLocation aPacrProviderOthSvcLocation) {
        pacrProviderOthSvcLocation = aPacrProviderOthSvcLocation;
    }

    /**
     * Compares the key for this instance with another PacrContact.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PacrContact and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PacrContact)) {
            return false;
        }
        PacrContact that = (PacrContact) other;
        if (this.getPalContactPkid() != that.getPalContactPkid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PacrContact.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PacrContact)) return false;
        return this.equalKeys(other) && ((PacrContact)other).equalKeys(this);
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
        i = getPalContactPkid();
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
        StringBuffer sb = new StringBuffer("[PacrContact |");
        sb.append(" palContactPkid=").append(getPalContactPkid());
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
        ret.put("palContactPkid", Integer.valueOf(getPalContactPkid()));
        return ret;
    }

}
