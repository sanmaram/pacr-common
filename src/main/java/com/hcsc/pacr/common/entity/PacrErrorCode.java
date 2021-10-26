// Generated with g9.

package com.hcsc.pacr.common.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="PACR_error_code")
public class PacrErrorCode implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "errorId";

    @Id
    @Column(name="error_id", unique=true, nullable=false, length=10)
    private String errorId;
    @Column(name="error_description", length=50)
    private String errorDescription;

    /** Default constructor. */
    public PacrErrorCode() {
        super();
    }

    /**
     * Access method for errorId.
     *
     * @return the current value of errorId
     */
    public String getErrorId() {
        return errorId;
    }

    /**
     * Setter method for errorId.
     *
     * @param aErrorId the new value for errorId
     */
    public void setErrorId(String aErrorId) {
        errorId = aErrorId;
    }

    /**
     * Access method for errorDescription.
     *
     * @return the current value of errorDescription
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Setter method for errorDescription.
     *
     * @param aErrorDescription the new value for errorDescription
     */
    public void setErrorDescription(String aErrorDescription) {
        errorDescription = aErrorDescription;
    }

    /**
     * Compares the key for this instance with another PacrErrorCode.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PacrErrorCode and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PacrErrorCode)) {
            return false;
        }
        PacrErrorCode that = (PacrErrorCode) other;
        Object myErrorId = this.getErrorId();
        Object yourErrorId = that.getErrorId();
        if (myErrorId==null ? yourErrorId!=null : !myErrorId.equals(yourErrorId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PacrErrorCode.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PacrErrorCode)) return false;
        return this.equalKeys(other) && ((PacrErrorCode)other).equalKeys(this);
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
        if (getErrorId() == null) {
            i = 0;
        } else {
            i = getErrorId().hashCode();
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
        StringBuffer sb = new StringBuffer("[PacrErrorCode |");
        sb.append(" errorId=").append(getErrorId());
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
        ret.put("errorId", getErrorId());
        return ret;
    }

}
