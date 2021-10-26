// Generated with g9.

package com.hcsc.pacr.common.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="PACR_network")
public class PacrNetwork implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "networkPkid";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="network_pkid", unique=true, nullable=false, precision=10)
    private int networkPkid;
    @Column(name="pal_id", precision=10)
    private int palId;
    @Column(name="provider_id", precision=10)
    private int providerId;
    @Column(name="corp_ent_code", length=3)
    private String corpEntCode;
    @Column(name="network_code", length=3)
    private String networkCode;
    @Column(name="sub_network_code", length=3)
    private String subNetworkCode;
    @Column(name="network_type", length=10)
    private String networkType;
    @Column(name="network_status_code", length=1)
    private String networkStatusCode;
    @Column(name="status_effective_date")
    @Temporal(TemporalType.DATE)
    private Date statusEffectiveDate;
    @Column(name="status_end_date")
    @Temporal(TemporalType.DATE)
    private Date statusEndDate;
    @ManyToOne
    @JoinColumn(name="provider_svc_loc_pkid")
    @JsonIgnore
    private PacrProviderServiceLocation pacrProviderServiceLocation;
    @ManyToOne
    @JoinColumn(name="provider_oth_svc_loc_pkid")
    @JsonIgnore
    private PacrProviderOthSvcLocation pacrProviderOthSvcLocation;

    /** Default constructor. */
    public PacrNetwork() {
        super();
    }

    /**
     * Access method for networkPkid.
     *
     * @return the current value of networkPkid
     */
    public int getNetworkPkid() {
        return networkPkid;
    }

    /**
     * Setter method for networkPkid.
     *
     * @param aNetworkPkid the new value for networkPkid
     */
    public void setNetworkPkid(int aNetworkPkid) {
        networkPkid = aNetworkPkid;
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
     * Access method for corpEntCode.
     *
     * @return the current value of corpEntCode
     */
    public String getCorpEntCode() {
        return corpEntCode;
    }

    /**
     * Setter method for corpEntCode.
     *
     * @param aCorpEntCode the new value for corpEntCode
     */
    public void setCorpEntCode(String aCorpEntCode) {
        corpEntCode = aCorpEntCode;
    }

    /**
     * Access method for networkCode.
     *
     * @return the current value of networkCode
     */
    public String getNetworkCode() {
        return networkCode;
    }

    /**
     * Setter method for networkCode.
     *
     * @param aNetworkCode the new value for networkCode
     */
    public void setNetworkCode(String aNetworkCode) {
        networkCode = aNetworkCode;
    }

    /**
     * Access method for subNetworkCode.
     *
     * @return the current value of subNetworkCode
     */
    public String getSubNetworkCode() {
        return subNetworkCode;
    }

    /**
     * Setter method for subNetworkCode.
     *
     * @param aSubNetworkCode the new value for subNetworkCode
     */
    public void setSubNetworkCode(String aSubNetworkCode) {
        subNetworkCode = aSubNetworkCode;
    }

    /**
     * Access method for networkType.
     *
     * @return the current value of networkType
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * Setter method for networkType.
     *
     * @param aNetworkType the new value for networkType
     */
    public void setNetworkType(String aNetworkType) {
        networkType = aNetworkType;
    }

    /**
     * Access method for networkStatusCode.
     *
     * @return the current value of networkStatusCode
     */
    public String getNetworkStatusCode() {
        return networkStatusCode;
    }

    /**
     * Setter method for networkStatusCode.
     *
     * @param aNetworkStatusCode the new value for networkStatusCode
     */
    public void setNetworkStatusCode(String aNetworkStatusCode) {
        networkStatusCode = aNetworkStatusCode;
    }

    /**
     * Access method for statusEffectiveDate.
     *
     * @return the current value of statusEffectiveDate
     */
    public Date getStatusEffectiveDate() {
        return statusEffectiveDate;
    }

    /**
     * Setter method for statusEffectiveDate.
     *
     * @param aStatusEffectiveDate the new value for statusEffectiveDate
     */
    public void setStatusEffectiveDate(Date aStatusEffectiveDate) {
        statusEffectiveDate = aStatusEffectiveDate;
    }

    /**
     * Access method for statusEndDate.
     *
     * @return the current value of statusEndDate
     */
    public Date getStatusEndDate() {
        return statusEndDate;
    }

    /**
     * Setter method for statusEndDate.
     *
     * @param aStatusEndDate the new value for statusEndDate
     */
    public void setStatusEndDate(Date aStatusEndDate) {
        statusEndDate = aStatusEndDate;
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
     * Compares the key for this instance with another PacrNetwork.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PacrNetwork and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PacrNetwork)) {
            return false;
        }
        PacrNetwork that = (PacrNetwork) other;
        if (this.getNetworkPkid() != that.getNetworkPkid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PacrNetwork.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PacrNetwork)) return false;
        return this.equalKeys(other) && ((PacrNetwork)other).equalKeys(this);
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
        i = getNetworkPkid();
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
        StringBuffer sb = new StringBuffer("[PacrNetwork |");
        sb.append(" networkPkid=").append(getNetworkPkid());
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
        ret.put("networkPkid", Integer.valueOf(getNetworkPkid()));
        return ret;
    }

}
