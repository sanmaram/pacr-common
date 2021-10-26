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

@Entity(name="PACR_npi")
public class PacrNpi implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "providerNpiPkid";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="provider_npi_pkid", unique=true, nullable=false, precision=10)
    private int providerNpiPkid;
    @Column(name="provider_id", precision=10)
    private int providerId;
    @Column(name="npi_nbr", length=10)
    private String npiNbr;
    @ManyToOne
    @JoinColumn(name="provider_pkid")
    @JsonIgnore
    private PacrProvider pacrProvider;

    /** Default constructor. */
    public PacrNpi() {
        super();
    }

    /**
     * Access method for providerNpiPkid.
     *
     * @return the current value of providerNpiPkid
     */
    public int getProviderNpiPkid() {
        return providerNpiPkid;
    }

    /**
     * Setter method for providerNpiPkid.
     *
     * @param aProviderNpiPkid the new value for providerNpiPkid
     */
    public void setProviderNpiPkid(int aProviderNpiPkid) {
        providerNpiPkid = aProviderNpiPkid;
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
     * Access method for npiNbr.
     *
     * @return the current value of npiNbr
     */
    public String getNpiNbr() {
        return npiNbr;
    }

    /**
     * Setter method for npiNbr.
     *
     * @param aNpiNbr the new value for npiNbr
     */
    public void setNpiNbr(String aNpiNbr) {
        npiNbr = aNpiNbr;
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
     * Compares the key for this instance with another PacrNpi.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PacrNpi and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PacrNpi)) {
            return false;
        }
        PacrNpi that = (PacrNpi) other;
        if (this.getProviderNpiPkid() != that.getProviderNpiPkid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PacrNpi.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PacrNpi)) return false;
        return this.equalKeys(other) && ((PacrNpi)other).equalKeys(this);
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
        i = getProviderNpiPkid();
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
        StringBuffer sb = new StringBuffer("[PacrNpi |");
        sb.append(" providerNpiPkid=").append(getProviderNpiPkid());
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
        ret.put("providerNpiPkid", Integer.valueOf(getProviderNpiPkid()));
        return ret;
    }

}
