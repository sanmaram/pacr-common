// Generated with g9.

package com.hcsc.pacr.common.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="PACR_exemption_config")
public class PacrSuppressionConfig implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "supprReasonCode";

    @Id
    @Column(name="exemption_reason_code", unique=true, nullable=false, length=10)
    private String supprReasonCode;
    @Column(name="exemption_description", length=50)
    private String supprDescription;

    /** Default constructor. */
    public PacrSuppressionConfig() {
        super();
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
     * Access method for supprDescription.
     *
     * @return the current value of supprDescription
     */
    public String getSupprDescription() {
        return supprDescription;
    }

    /**
     * Setter method for supprDescription.
     *
     * @param aSupprDescription the new value for supprDescription
     */
    public void setSupprDescription(String aSupprDescription) {
        supprDescription = aSupprDescription;
    }

    /**
     * Compares the key for this instance with another PacrSuppressionConfig.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PacrSuppressionConfig and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PacrSuppressionConfig)) {
            return false;
        }
        PacrSuppressionConfig that = (PacrSuppressionConfig) other;
        Object mySupprReasonCode = this.getSupprReasonCode();
        Object yourSupprReasonCode = that.getSupprReasonCode();
        if (mySupprReasonCode==null ? yourSupprReasonCode!=null : !mySupprReasonCode.equals(yourSupprReasonCode)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PacrSuppressionConfig.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PacrSuppressionConfig)) return false;
        return this.equalKeys(other) && ((PacrSuppressionConfig)other).equalKeys(this);
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
        if (getSupprReasonCode() == null) {
            i = 0;
        } else {
            i = getSupprReasonCode().hashCode();
        }
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
        StringBuffer sb = new StringBuffer("[PacrSuppressionConfig |");
        sb.append(" supprReasonCode=").append(getSupprReasonCode());
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
        ret.put("supprReasonCode", getSupprReasonCode());
        return ret;
    }

}
