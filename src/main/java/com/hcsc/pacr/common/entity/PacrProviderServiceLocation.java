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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="PACR_provider_service_location")
public class PacrProviderServiceLocation implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "providerSvcLocPkid";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="provider_svc_loc_pkid", unique=true, nullable=false, precision=10)
    private int providerSvcLocPkid;
    
    @Column(name="pal_id", precision=10)
    private int palId;
    
    @Column(name="provider_id", precision=10)
    private int providerId;
    
    @Column(name="pfin_key_id", length=10)
    private String pfinKeyId;
    
    @Column(name="bill_pfin_key_id", length=10)
    private String billPfinKeyId;
    
    @Column(name="corp_ent_code", length=3)
    private String corpEntCode;
    
    @Column(name="tax_id_nbr", length=9)
    private String taxIdNbr;
    
    @Column(name="email_id", length=50)
    private String emailId;
    
    @Column(name="primary_location_ind", length=1)
    private String primaryLocationInd;
    
    @Column(name="override_fname", length=35)
    private String overrideFname;
    
    @Column(name="override_mname", length=35)
    private String overrideMname;
    
    @Column(name="override_lname", length=35)
    private String overrideLname;
    
    @Column(name="override_title", length=8)
    private String overrideTitle;
    
    @Column(name="override_suffix", length=3)
    private String overrideSuffix;
    
    @Column(name="override_org_name", length=50)
    private String overrideOrgName;
    
    @Column(name="override_org_name2", length=50)
    private String overrideOrgName2;
    
    @Column(name="service_loc_eff_date")
    @Temporal(TemporalType.DATE)
    private Date serviceLocEffDate;
    
    @Column(name="service_loc_end_date")
    @Temporal(TemporalType.DATE)
    private Date serviceLocEndDate;
    
    @Column(name="attestation_date")
    @Temporal(TemporalType.DATE)
    private Date attestationDate;
    
    @Column(name="attestation_updt_flag", length=10)
    private String attestationUpdtFlag;
    
    @Column(name="attestation_updt_date")
    @Temporal(TemporalType.DATE)
    private Date attestationUpdtDate;
    
    @Column(name="provider_exemption_flag", length=10)
    private String providerSupprFlag;
    
    @Column(name="provider_exemption_date")
    @Temporal(TemporalType.DATE)
    private Date providerSupprDate;
    
    @Column(name="provider_exemption_dwnstrm", length=50)
    private String providerSupprDwnstrm;
    
    @Column(name="provider_suppression_ind", length=3)
    private String providerExclusionInd;
    
    @Column(name="exemption_reason_code", length=10)
    private String supprReasonCode;
    
    @Column(name="attestation_comments", length=50)
    private String attestationComments;
    
    @Column(name="end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    
    @Column(name="updated_by", length=20)
    private String updatedBy;
    
    @OneToMany(mappedBy="pacrProviderServiceLocation")
    private Set<PacrContact> pacrContact;
    
    @OneToMany(mappedBy="pacrProviderServiceLocation")
    private Set<PacrNetwork> pacrNetwork;
    
    @ManyToOne
    @JoinColumn(name="addr_id")
    private PacrAddr pacrAddr;
    
    @ManyToOne
    @JoinColumn(name="provider_pkid")
    @JsonIgnore
    private PacrProvider pacrProvider;
    
    @OneToMany(mappedBy="pacrProviderServiceLocation")
    private Set<PacrProviderOthSvcLocation> pacrProviderOthSvcLocation;
    
    @OneToMany(mappedBy="pacrProviderServiceLocation")
    private Set<PacrReminder> pacrReminder;
    
    @OneToMany(mappedBy="pacrProviderServiceLocation")
    private Set<PacrSpecialty> pacrSpecialty;

    /** Default constructor. */
    public PacrProviderServiceLocation() {
        super();
    }

    /**
     * Access method for providerSvcLocPkid.
     *
     * @return the current value of providerSvcLocPkid
     */
    public int getProviderSvcLocPkid() {
        return providerSvcLocPkid;
    }

    /**
     * Setter method for providerSvcLocPkid.
     *
     * @param aProviderSvcLocPkid the new value for providerSvcLocPkid
     */
    public void setProviderSvcLocPkid(int aProviderSvcLocPkid) {
        providerSvcLocPkid = aProviderSvcLocPkid;
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
     * Access method for billPfinKeyId.
     *
     * @return the current value of billPfinKeyId
     */
    public String getBillPfinKeyId() {
        return billPfinKeyId;
    }

    /**
     * Setter method for billPfinKeyId.
     *
     * @param aBillPfinKeyId the new value for billPfinKeyId
     */
    public void setBillPfinKeyId(String aBillPfinKeyId) {
        billPfinKeyId = aBillPfinKeyId;
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
     * Access method for taxIdNbr.
     *
     * @return the current value of taxIdNbr
     */
    public String getTaxIdNbr() {
        return taxIdNbr;
    }

    /**
     * Setter method for taxIdNbr.
     *
     * @param aTaxIdNbr the new value for taxIdNbr
     */
    public void setTaxIdNbr(String aTaxIdNbr) {
        taxIdNbr = aTaxIdNbr;
    }

    /**
     * Access method for emailId.
     *
     * @return the current value of emailId
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * Setter method for emailId.
     *
     * @param aEmailId the new value for emailId
     */
    public void setEmailId(String aEmailId) {
        emailId = aEmailId;
    }

    /**
     * Access method for primaryLocationInd.
     *
     * @return the current value of primaryLocationInd
     */
    public String getPrimaryLocationInd() {
        return primaryLocationInd;
    }

    /**
     * Setter method for primaryLocationInd.
     *
     * @param aPrimaryLocationInd the new value for primaryLocationInd
     */
    public void setPrimaryLocationInd(String aPrimaryLocationInd) {
        primaryLocationInd = aPrimaryLocationInd;
    }

    /**
     * Access method for overrideFname.
     *
     * @return the current value of overrideFname
     */
    public String getOverrideFname() {
        return overrideFname;
    }

    /**
     * Setter method for overrideFname.
     *
     * @param aOverrideFname the new value for overrideFname
     */
    public void setOverrideFname(String aOverrideFname) {
        overrideFname = aOverrideFname;
    }

    /**
     * Access method for overrideMname.
     *
     * @return the current value of overrideMname
     */
    public String getOverrideMname() {
        return overrideMname;
    }

    /**
     * Setter method for overrideMname.
     *
     * @param aOverrideMname the new value for overrideMname
     */
    public void setOverrideMname(String aOverrideMname) {
        overrideMname = aOverrideMname;
    }

    /**
     * Access method for overrideLname.
     *
     * @return the current value of overrideLname
     */
    public String getOverrideLname() {
        return overrideLname;
    }

    /**
     * Setter method for overrideLname.
     *
     * @param aOverrideLname the new value for overrideLname
     */
    public void setOverrideLname(String aOverrideLname) {
        overrideLname = aOverrideLname;
    }

    /**
     * Access method for overrideTitle.
     *
     * @return the current value of overrideTitle
     */
    public String getOverrideTitle() {
        return overrideTitle;
    }

    /**
     * Setter method for overrideTitle.
     *
     * @param aOverrideTitle the new value for overrideTitle
     */
    public void setOverrideTitle(String aOverrideTitle) {
        overrideTitle = aOverrideTitle;
    }

    /**
     * Access method for overrideSuffix.
     *
     * @return the current value of overrideSuffix
     */
    public String getOverrideSuffix() {
        return overrideSuffix;
    }

    /**
     * Setter method for overrideSuffix.
     *
     * @param aOverrideSuffix the new value for overrideSuffix
     */
    public void setOverrideSuffix(String aOverrideSuffix) {
        overrideSuffix = aOverrideSuffix;
    }

    /**
     * Access method for overrideOrgName.
     *
     * @return the current value of overrideOrgName
     */
    public String getOverrideOrgName() {
        return overrideOrgName;
    }

    /**
     * Setter method for overrideOrgName.
     *
     * @param aOverrideOrgName the new value for overrideOrgName
     */
    public void setOverrideOrgName(String aOverrideOrgName) {
        overrideOrgName = aOverrideOrgName;
    }

    /**
     * Access method for overrideOrgName2.
     *
     * @return the current value of overrideOrgName2
     */
    public String getOverrideOrgName2() {
        return overrideOrgName2;
    }

    /**
     * Setter method for overrideOrgName2.
     *
     * @param aOverrideOrgName2 the new value for overrideOrgName2
     */
    public void setOverrideOrgName2(String aOverrideOrgName2) {
        overrideOrgName2 = aOverrideOrgName2;
    }

    /**
     * Access method for serviceLocEffDate.
     *
     * @return the current value of serviceLocEffDate
     */
    public Date getServiceLocEffDate() {
        return serviceLocEffDate;
    }

    /**
     * Setter method for serviceLocEffDate.
     *
     * @param aServiceLocEffDate the new value for serviceLocEffDate
     */
    public void setServiceLocEffDate(Date aServiceLocEffDate) {
        serviceLocEffDate = aServiceLocEffDate;
    }

    /**
     * Access method for serviceLocEndDate.
     *
     * @return the current value of serviceLocEndDate
     */
    public Date getServiceLocEndDate() {
        return serviceLocEndDate;
    }

    /**
     * Setter method for serviceLocEndDate.
     *
     * @param aServiceLocEndDate the new value for serviceLocEndDate
     */
    public void setServiceLocEndDate(Date aServiceLocEndDate) {
        serviceLocEndDate = aServiceLocEndDate;
    }

    /**
     * Access method for attestationDate.
     *
     * @return the current value of attestationDate
     */
    public Date getAttestationDate() {
        return attestationDate;
    }

    /**
     * Setter method for attestationDate.
     *
     * @param aAttestationDate the new value for attestationDate
     */
    public void setAttestationDate(Date aAttestationDate) {
        attestationDate = aAttestationDate;
    }

    /**
     * Access method for attestationUpdtFlag.
     *
     * @return the current value of attestationUpdtFlag
     */
    public String getAttestationUpdtFlag() {
        return attestationUpdtFlag;
    }

    /**
     * Setter method for attestationUpdtFlag.
     *
     * @param aAttestationUpdtFlag the new value for attestationUpdtFlag
     */
    public void setAttestationUpdtFlag(String aAttestationUpdtFlag) {
        attestationUpdtFlag = aAttestationUpdtFlag;
    }

    /**
     * Access method for attestationUpdtDate.
     *
     * @return the current value of attestationUpdtDate
     */
    public Date getAttestationUpdtDate() {
        return attestationUpdtDate;
    }

    /**
     * Setter method for attestationUpdtDate.
     *
     * @param aAttestationUpdtDate the new value for attestationUpdtDate
     */
    public void setAttestationUpdtDate(Date aAttestationUpdtDate) {
        attestationUpdtDate = aAttestationUpdtDate;
    }

    /**
     * Access method for providerSupprFlag.
     *
     * @return the current value of providerSupprFlag
     */
    public String getProviderSupprFlag() {
        return providerSupprFlag;
    }

    /**
     * Setter method for providerSupprFlag.
     *
     * @param aProviderSupprFlag the new value for providerSupprFlag
     */
    public void setProviderSupprFlag(String aProviderSupprFlag) {
        providerSupprFlag = aProviderSupprFlag;
    }

    /**
     * Access method for providerSupprDate.
     *
     * @return the current value of providerSupprDate
     */
    public Date getProviderSupprDate() {
        return providerSupprDate;
    }

    /**
     * Setter method for providerSupprDate.
     *
     * @param aProviderSupprDate the new value for providerSupprDate
     */
    public void setProviderSupprDate(Date aProviderSupprDate) {
        providerSupprDate = aProviderSupprDate;
    }

    /**
     * Access method for providerSupprDwnstrm.
     *
     * @return the current value of providerSupprDwnstrm
     */
    public String getProviderSupprDwnstrm() {
        return providerSupprDwnstrm;
    }

    /**
     * Setter method for providerSupprDwnstrm.
     *
     * @param aProviderSupprDwnstrm the new value for providerSupprDwnstrm
     */
    public void setProviderSupprDwnstrm(String aProviderSupprDwnstrm) {
        providerSupprDwnstrm = aProviderSupprDwnstrm;
    }

    /**
     * Access method for providerExclusionInd.
     *
     * @return the current value of providerExclusionInd
     */
    public String getProviderExclusionInd() {
        return providerExclusionInd;
    }

    /**
     * Setter method for providerExclusionInd.
     *
     * @param aProviderExclusionInd the new value for providerExclusionInd
     */
    public void setProviderExclusionInd(String aProviderExclusionInd) {
        providerExclusionInd = aProviderExclusionInd;
    }

    /**
     * Access method for supprReasonCode.
     *
     * @return the current value of supprReasonCode
     */
    public String getSupprReasonCode() {
        return supprReasonCode;
    }

    /**
     * Setter method for supprReasonCode.
     *
     * @param aSupprReasonCode the new value for supprReasonCode
     */
    public void setSupprReasonCode(String aSupprReasonCode) {
        supprReasonCode = aSupprReasonCode;
    }

    /**
     * Access method for attestationComments.
     *
     * @return the current value of attestationComments
     */
    public String getAttestationComments() {
        return attestationComments;
    }

    /**
     * Setter method for attestationComments.
     *
     * @param aAttestationComments the new value for attestationComments
     */
    public void setAttestationComments(String aAttestationComments) {
        attestationComments = aAttestationComments;
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
     * Access method for pacrContact.
     *
     * @return the current value of pacrContact
     */
    public Set<PacrContact> getPacrContact() {
        return pacrContact;
    }

    /**
     * Setter method for pacrContact.
     *
     * @param aPacrContact the new value for pacrContact
     */
    public void setPacrContact(Set<PacrContact> aPacrContact) {
        pacrContact = aPacrContact;
    }

    /**
     * Access method for pacrNetwork.
     *
     * @return the current value of pacrNetwork
     */
    public Set<PacrNetwork> getPacrNetwork() {
        return pacrNetwork;
    }

    /**
     * Setter method for pacrNetwork.
     *
     * @param aPacrNetwork the new value for pacrNetwork
     */
    public void setPacrNetwork(Set<PacrNetwork> aPacrNetwork) {
        pacrNetwork = aPacrNetwork;
    }

    /**
     * Access method for pacrAddr.
     *
     * @return the current value of pacrAddr
     */
    public PacrAddr getPacrAddr() {
        return pacrAddr;
    }

    /**
     * Setter method for pacrAddr.
     *
     * @param aPacrAddr the new value for pacrAddr
     */
    public void setPacrAddr(PacrAddr aPacrAddr) {
        pacrAddr = aPacrAddr;
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
     * Access method for pacrProviderOthSvcLocation.
     *
     * @return the current value of pacrProviderOthSvcLocation
     */
    public Set<PacrProviderOthSvcLocation> getPacrProviderOthSvcLocation() {
        return pacrProviderOthSvcLocation;
    }

    /**
     * Setter method for pacrProviderOthSvcLocation.
     *
     * @param aPacrProviderOthSvcLocation the new value for pacrProviderOthSvcLocation
     */
    public void setPacrProviderOthSvcLocation(Set<PacrProviderOthSvcLocation> aPacrProviderOthSvcLocation) {
        pacrProviderOthSvcLocation = aPacrProviderOthSvcLocation;
    }

    /**
     * Access method for pacrReminder.
     *
     * @return the current value of pacrReminder
     */
    public Set<PacrReminder> getPacrReminder() {
        return pacrReminder;
    }

    /**
     * Setter method for pacrReminder.
     *
     * @param aPacrReminder the new value for pacrReminder
     */
    public void setPacrReminder(Set<PacrReminder> aPacrReminder) {
        pacrReminder = aPacrReminder;
    }

    /**
     * Access method for pacrSpecialty.
     *
     * @return the current value of pacrSpecialty
     */
    public Set<PacrSpecialty> getPacrSpecialty() {
        return pacrSpecialty;
    }

    /**
     * Setter method for pacrSpecialty.
     *
     * @param aPacrSpecialty the new value for pacrSpecialty
     */
    public void setPacrSpecialty(Set<PacrSpecialty> aPacrSpecialty) {
        pacrSpecialty = aPacrSpecialty;
    }

    /**
     * Compares the key for this instance with another PacrProviderServiceLocation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PacrProviderServiceLocation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PacrProviderServiceLocation)) {
            return false;
        }
        PacrProviderServiceLocation that = (PacrProviderServiceLocation) other;
        if (this.getProviderSvcLocPkid() != that.getProviderSvcLocPkid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PacrProviderServiceLocation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PacrProviderServiceLocation)) return false;
        return this.equalKeys(other) && ((PacrProviderServiceLocation)other).equalKeys(this);
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
        i = getProviderSvcLocPkid();
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
        StringBuffer sb = new StringBuffer("[PacrProviderServiceLocation |");
        sb.append(" providerSvcLocPkid=").append(getProviderSvcLocPkid());
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
        ret.put("providerSvcLocPkid", Integer.valueOf(getProviderSvcLocPkid()));
        return ret;
    }

}
