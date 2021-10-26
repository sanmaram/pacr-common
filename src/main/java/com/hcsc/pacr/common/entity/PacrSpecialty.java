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

@Entity(name="PACR_specialty")
public class PacrSpecialty implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "providerSpecialtyPkid";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="provider_specialty_pkid", unique=true, nullable=false, precision=10)
    private int providerSpecialtyPkid;
    @Column(name="provider_id", precision=10)
    private int providerId;
    @Column(name="pal_id", precision=10)
    private int palId;
    @Column(name="pfin_key_id", length=10)
    private String pfinKeyId;
    @Column(name="provider_type_cd", length=2)
    private String providerTypeCd;
    @Column(name="specialty_code", length=3)
    private String specialtyCode;
    @Column(name="sub_specialty_code", length=3)
    private String subSpecialtyCode;
    @Column(name="primary_specialty_ind", length=1)
    private String primarySpecialtyInd;
    @ManyToOne
    @JoinColumn(name="provider_svc_loc_pkid")
    @JsonIgnore
    private PacrProviderServiceLocation pacrProviderServiceLocation;
    @ManyToOne
    @JoinColumn(name="provider_oth_svc_loc_pkid")
    @JsonIgnore
    private PacrProviderOthSvcLocation pacrProviderOthSvcLocation;

    /** Default constructor. */
    public PacrSpecialty() {
        super();
    }

    /**
     * Access method for providerSpecialtyPkid.
     *
     * @return the current value of providerSpecialtyPkid
     */
    public int getProviderSpecialtyPkid() {
        return providerSpecialtyPkid;
    }

    /**
     * Setter method for providerSpecialtyPkid.
     *
     * @param aProviderSpecialtyPkid the new value for providerSpecialtyPkid
     */
    public void setProviderSpecialtyPkid(int aProviderSpecialtyPkid) {
        providerSpecialtyPkid = aProviderSpecialtyPkid;
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
     * Access method for pfinKeyId.
     *
     * @return the current value of pfinKeyId
     */
    public String getPfinKeyId() {
        return pfinKeyId;
    }

    /**
     * Setter method for pfinKeyId.
     *
     * @param aPfinKeyId the new value for pfinKeyId
     */
    public void setPfinKeyId(String aPfinKeyId) {
        pfinKeyId = aPfinKeyId;
    }

    /**
     * Access method for providerTypeCd.
     *
     * @return the current value of providerTypeCd
     */
    public String getProviderTypeCd() {
        return providerTypeCd;
    }

    /**
     * Setter method for providerTypeCd.
     *
     * @param aProviderTypeCd the new value for providerTypeCd
     */
    public void setProviderTypeCd(String aProviderTypeCd) {
        providerTypeCd = aProviderTypeCd;
    }

    /**
     * Access method for specialtyCode.
     *
     * @return the current value of specialtyCode
     */
    public String getSpecialtyCode() {
        return specialtyCode;
    }

    /**
     * Setter method for specialtyCode.
     *
     * @param aSpecialtyCode the new value for specialtyCode
     */
    public void setSpecialtyCode(String aSpecialtyCode) {
        specialtyCode = aSpecialtyCode;
    }

    /**
     * Access method for subSpecialtyCode.
     *
     * @return the current value of subSpecialtyCode
     */
    public String getSubSpecialtyCode() {
        return subSpecialtyCode;
    }

    /**
     * Setter method for subSpecialtyCode.
     *
     * @param aSubSpecialtyCode the new value for subSpecialtyCode
     */
    public void setSubSpecialtyCode(String aSubSpecialtyCode) {
        subSpecialtyCode = aSubSpecialtyCode;
    }

    /**
     * Access method for primarySpecialtyInd.
     *
     * @return the current value of primarySpecialtyInd
     */
    public String getPrimarySpecialtyInd() {
        return primarySpecialtyInd;
    }

    /**
     * Setter method for primarySpecialtyInd.
     *
     * @param aPrimarySpecialtyInd the new value for primarySpecialtyInd
     */
    public void setPrimarySpecialtyInd(String aPrimarySpecialtyInd) {
        primarySpecialtyInd = aPrimarySpecialtyInd;
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
     * Compares the key for this instance with another PacrSpecialty.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PacrSpecialty and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PacrSpecialty)) {
            return false;
        }
        PacrSpecialty that = (PacrSpecialty) other;
        if (this.getProviderSpecialtyPkid() != that.getProviderSpecialtyPkid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PacrSpecialty.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PacrSpecialty)) return false;
        return this.equalKeys(other) && ((PacrSpecialty)other).equalKeys(this);
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
        i = getProviderSpecialtyPkid();
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
        StringBuffer sb = new StringBuffer("[PacrSpecialty |");
        sb.append(" providerSpecialtyPkid=").append(getProviderSpecialtyPkid());
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
        ret.put("providerSpecialtyPkid", Integer.valueOf(getProviderSpecialtyPkid()));
        return ret;
    }

}
