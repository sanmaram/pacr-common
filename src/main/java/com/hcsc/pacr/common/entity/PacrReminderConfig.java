// Generated with g9.

package com.hcsc.pacr.common.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="PACR_reminder_config")
public class PacrReminderConfig implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "reminderId";

    @Id
    @Column(name="reminder_id", unique=true, nullable=false, precision=10)
    private int reminderId;
    @Column(name="reminder_type", length=10)
    private String reminderType;
    @Column(name="provider_class_code", length=10)
    private String providerClassCode;
    @Column(name="reminder_days", precision=10)
    private int reminderDays;
    @Column(name="grace_period", length=10)
    private String gracePeriod;
    @Column(name="final_reminder_flag", length=5)
    private String finalReminderFlag;

    /** Default constructor. */
    public PacrReminderConfig() {
        super();
    }

    /**
     * Access method for reminderId.
     *
     * @return the current value of reminderId
     */
    public int getReminderId() {
        return reminderId;
    }

    /**
     * Setter method for reminderId.
     *
     * @param aReminderId the new value for reminderId
     */
    public void setReminderId(int aReminderId) {
        reminderId = aReminderId;
    }

    /**
     * Access method for reminderType.
     *
     * @return the current value of reminderType
     */
    public String getReminderType() {
        return reminderType;
    }

    /**
     * Setter method for reminderType.
     *
     * @param aReminderType the new value for reminderType
     */
    public void setReminderType(String aReminderType) {
        reminderType = aReminderType;
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
     * Access method for reminderDays.
     *
     * @return the current value of reminderDays
     */
    public int getReminderDays() {
        return reminderDays;
    }

    /**
     * Setter method for reminderDays.
     *
     * @param aReminderDays the new value for reminderDays
     */
    public void setReminderDays(int aReminderDays) {
        reminderDays = aReminderDays;
    }

    /**
     * Access method for gracePeriod.
     *
     * @return the current value of gracePeriod
     */
    public String getGracePeriod() {
        return gracePeriod;
    }

    /**
     * Setter method for gracePeriod.
     *
     * @param aGracePeriod the new value for gracePeriod
     */
    public void setGracePeriod(String aGracePeriod) {
        gracePeriod = aGracePeriod;
    }

    /**
     * Access method for finalReminderFlag.
     *
     * @return the current value of finalReminderFlag
     */
    public String getFinalReminderFlag() {
        return finalReminderFlag;
    }

    /**
     * Setter method for finalReminderFlag.
     *
     * @param aFinalReminderFlag the new value for finalReminderFlag
     */
    public void setFinalReminderFlag(String aFinalReminderFlag) {
        finalReminderFlag = aFinalReminderFlag;
    }

    /**
     * Compares the key for this instance with another PacrReminderConfig.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PacrReminderConfig and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PacrReminderConfig)) {
            return false;
        }
        PacrReminderConfig that = (PacrReminderConfig) other;
        if (this.getReminderId() != that.getReminderId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PacrReminderConfig.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PacrReminderConfig)) return false;
        return this.equalKeys(other) && ((PacrReminderConfig)other).equalKeys(this);
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
        i = getReminderId();
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
        StringBuffer sb = new StringBuffer("[PacrReminderConfig |");
        sb.append(" reminderId=").append(getReminderId());
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
        ret.put("reminderId", Integer.valueOf(getReminderId()));
        return ret;
    }

}
