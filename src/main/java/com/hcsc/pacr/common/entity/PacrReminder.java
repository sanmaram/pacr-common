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

@Entity(name = "PACR_reminder")
public class PacrReminder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
	protected static final String PK = "reminderPk";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reminder_pk", unique = true, nullable = false, precision = 10)
	private int reminderPk;
	@Column(name = "provider_id", precision = 10)
	private int providerId;
	@Column(name = "pal_id", precision = 10)
	private int palId;
	@Column(name = "pfin_key_id", length = 10)
	private String pfinKeyId;
	@Column(name = "reminder_id", precision = 10)
	private int reminderId;
	@Column(name = "reminder_type", length = 10)
	private String reminderType;
	@Column(name = "reminder_date")
	@Temporal(TemporalType.DATE)
	private Date reminderDate;
	@ManyToOne
	@JoinColumn(name = "provider_svc_loc_pkid")
	@JsonIgnore
	private PacrProviderServiceLocation pacrProviderServiceLocation;
	@ManyToOne
	@JoinColumn(name = "provider_oth_svc_loc_pkid")
	@JsonIgnore
	private PacrProviderOthSvcLocation pacrProviderOthSvcLocation;

	/** Default constructor. */
	public PacrReminder() {
		super();
	}

	/**
	 * Access method for reminderPk.
	 *
	 * @return the current value of reminderPk
	 */
	public int getReminderPk() {
		return reminderPk;
	}

	/**
	 * Setter method for reminderPk.
	 *
	 * @param aReminderPk the new value for reminderPk
	 */
	public void setReminderPk(int aReminderPk) {
		reminderPk = aReminderPk;
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
	 * Access method for reminderDate.
	 *
	 * @return the current value of reminderDate
	 */
	public Date getReminderDate() {
		return reminderDate;
	}

	/**
	 * Setter method for reminderDate.
	 *
	 * @param aReminderDate the new value for reminderDate
	 */
	public void setReminderDate(Date aReminderDate) {
		reminderDate = aReminderDate;
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
	 * @param aPacrProviderServiceLocation the new value for
	 *                                     pacrProviderServiceLocation
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
	 * @param aPacrProviderOthSvcLocation the new value for
	 *                                    pacrProviderOthSvcLocation
	 */
	public void setPacrProviderOthSvcLocation(PacrProviderOthSvcLocation aPacrProviderOthSvcLocation) {
		pacrProviderOthSvcLocation = aPacrProviderOthSvcLocation;
	}

	/**
	 * Compares the key for this instance with another PacrReminder.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class PacrReminder and the key
	 *         objects are equal
	 */
	private boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PacrReminder)) {
			return false;
		}
		PacrReminder that = (PacrReminder) other;
		if (this.getReminderPk() != that.getReminderPk()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another PacrReminder.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof PacrReminder))
			return false;
		return this.equalKeys(other) && ((PacrReminder) other).equalKeys(this);
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
		i = getReminderPk();
		result = 37 * result + i;
		return result;
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[PacrReminder |");
		sb.append(" reminderPk=").append(getReminderPk());
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
		ret.put("reminderPk", Integer.valueOf(getReminderPk()));
		return ret;
	}

}
