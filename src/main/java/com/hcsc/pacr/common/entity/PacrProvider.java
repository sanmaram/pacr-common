// Generated with g9.

package com.hcsc.pacr.common.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="PACR_provider")
public class PacrProvider implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "providerPkid";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="provider_pkid", unique=true, nullable=false, precision=10)
    private int providerPkid;
    @Column(name="provider_id", precision=10)
    private int providerId;
    @Column(name="provider_class_code", length=10)
    private String providerClassCode;
    @Column(name="medgrp_org_typ_cd", length=8)
    private String medgrpOrgTypCd;
    @Column(name="corp_ent_code", length=3)
    private String corpEntCode;
    @Column(name="provider_fname", length=35)
    private String providerFname;
    @Column(name="provider_mname", length=35)
    private String providerMname;
    @Column(name="provider_lname", length=50)
    private String providerLname;
    @Column(name="display_name", length=120)
    private String displayName;
    @Column(name="web_url", length=50)
    private String webUrl;
    @Column(name="start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name="end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Column(name="updated_by", length=20)
    private String updatedBy;
    @OneToMany(mappedBy="pacrProvider")
    private Set<PacrErrorLogs> pacrErrorLogs;
    @OneToMany(mappedBy="pacrProvider")
    private Set<PacrLicense> pacrLicense;
    @OneToMany(mappedBy="pacrProvider")
    private Set<PacrNpi> pacrNpi;
    @OneToMany(mappedBy="pacrProvider")
    private Set<PacrProviderServiceLocation> pacrProviderServiceLocation;

    /** Default constructor. */
    public PacrProvider() {
        super();
    }

    /**
     * Access method for providerPkid.
     *
     * @return the current value of providerPkid
     */
    public int getProviderPkid() {
        return providerPkid;
    }

    /**
     * Setter method for providerPkid.
     *
     * @param aProviderPkid the new value for providerPkid
     */
    public void setProviderPkid(int aProviderPkid) {
        providerPkid = aProviderPkid;
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
     * Access method for providerClassCode.
     *
     * @return the current value of providerClassCode
     */
    public String getProviderClassCode() {
        return providerClassCode;
    }

    /**
     * Setter method for providerClassCode.
     *
     * @param aProviderClassCode the new value for providerClassCode
     */
    public void setProviderClassCode(String aProviderClassCode) {
        providerClassCode = aProviderClassCode;
    }

    /**
     * Access method for medgrpOrgTypCd.
     *
     * @return the current value of medgrpOrgTypCd
     */
    public String getMedgrpOrgTypCd() {
        return medgrpOrgTypCd;
    }

    /**
     * Setter method for medgrpOrgTypCd.
     *
     * @param aMedgrpOrgTypCd the new value for medgrpOrgTypCd
     */
    public void setMedgrpOrgTypCd(String aMedgrpOrgTypCd) {
        medgrpOrgTypCd = aMedgrpOrgTypCd;
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
     * Access method for providerFname.
     *
     * @return the current value of providerFname
     */
    public String getProviderFname() {
        return providerFname;
    }

    /**
     * Setter method for providerFname.
     *
     * @param aProviderFname the new value for providerFname
     */
    public void setProviderFname(String aProviderFname) {
        providerFname = aProviderFname;
    }

    /**
     * Access method for providerMname.
     *
     * @return the current value of providerMname
     */
    public String getProviderMname() {
        return providerMname;
    }

    /**
     * Setter method for providerMname.
     *
     * @param aProviderMname the new value for providerMname
     */
    public void setProviderMname(String aProviderMname) {
        providerMname = aProviderMname;
    }

    /**
     * Access method for providerLname.
     *
     * @return the current value of providerLname
     */
    public String getProviderLname() {
        return providerLname;
    }

    /**
     * Setter method for providerLname.
     *
     * @param aProviderLname the new value for providerLname
     */
    public void setProviderLname(String aProviderLname) {
        providerLname = aProviderLname;
    }

    /**
     * Access method for displayName.
     *
     * @return the current value of displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Setter method for displayName.
     *
     * @param aDisplayName the new value for displayName
     */
    public void setDisplayName(String aDisplayName) {
        displayName = aDisplayName;
    }

    /**
     * Access method for webUrl.
     *
     * @return the current value of webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * Setter method for webUrl.
     *
     * @param aWebUrl the new value for webUrl
     */
    public void setWebUrl(String aWebUrl) {
        webUrl = aWebUrl;
    }

    /**
     * Access method for startDate.
     *
     * @return the current value of startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Setter method for startDate.
     *
     * @param aStartDate the new value for startDate
     */
    public void setStartDate(Date aStartDate) {
        startDate = aStartDate;
    }

    /**
     * Access method for endDate.
     *
     * @return the current value of endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Setter method for endDate.
     *
     * @param aEndDate the new value for endDate
     */
    public void setEndDate(Date aEndDate) {
        endDate = aEndDate;
    }

    /**
     * Access method for updatedBy.
     *
     * @return the current value of updatedBy
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Setter method for updatedBy.
     *
     * @param aUpdatedBy the new value for updatedBy
     */
    public void setUpdatedBy(String aUpdatedBy) {
        updatedBy = aUpdatedBy;
    }

    /**
     * Access method for pacrErrorLogs.
     *
     * @return the current value of pacrErrorLogs
     */
    public Set<PacrErrorLogs> getPacrErrorLogs() {
        return pacrErrorLogs;
    }

    /**
     * Setter method for pacrErrorLogs.
     *
     * @param aPacrErrorLogs the new value for pacrErrorLogs
     */
    public void setPacrErrorLogs(Set<PacrErrorLogs> aPacrErrorLogs) {
        pacrErrorLogs = aPacrErrorLogs;
    }

    /**
     * Access method for pacrLicense.
     *
     * @return the current value of pacrLicense
     */
    public Set<PacrLicense> getPacrLicense() {
        return pacrLicense;
    }

    /**
     * Setter method for pacrLicense.
     *
     * @param aPacrLicense the new value for pacrLicense
     */
    public void setPacrLicense(Set<PacrLicense> aPacrLicense) {
        pacrLicense = aPacrLicense;
    }

    /**
     * Access method for pacrNpi.
     *
     * @return the current value of pacrNpi
     */
    public Set<PacrNpi> getPacrNpi() {
        return pacrNpi;
    }

    /**
     * Setter method for pacrNpi.
     *
     * @param aPacrNpi the new value for pacrNpi
     */
    public void setPacrNpi(Set<PacrNpi> aPacrNpi) {
        pacrNpi = aPacrNpi;
    }

    /**
     * Access method for pacrProviderServiceLocation.
     *
     * @return the current value of pacrProviderServiceLocation
     */
    public Set<PacrProviderServiceLocation> getPacrProviderServiceLocation() {
        return pacrProviderServiceLocation;
    }

    /**
     * Setter method for pacrProviderServiceLocation.
     *
     * @param aPacrProviderServiceLocation the new value for pacrProviderServiceLocation
     */
    public void setPacrProviderServiceLocation(Set<PacrProviderServiceLocation> aPacrProviderServiceLocation) {
        pacrProviderServiceLocation = aPacrProviderServiceLocation;
    }

    /**
     * Compares the key for this instance with another PacrProvider.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PacrProvider and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PacrProvider)) {
            return false;
        }
        PacrProvider that = (PacrProvider) other;
        if (this.getProviderPkid() != that.getProviderPkid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PacrProvider.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PacrProvider)) return false;
        return this.equalKeys(other) && ((PacrProvider)other).equalKeys(this);
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
        i = getProviderPkid();
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
        StringBuffer sb = new StringBuffer("[PacrProvider |");
        sb.append(" providerPkid=").append(getProviderPkid());
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
        ret.put("providerPkid", Integer.valueOf(getProviderPkid()));
        return ret;
    }

}
