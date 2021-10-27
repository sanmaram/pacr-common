// Generated with g9.

package com.hcsc.pacr.common.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "PACR_batch_job_instance")
public class PacrBatchJobInstance implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
	protected static final String PK = "jobInstanceId";

	@Id
	@Column(name = "job_instance_id", unique = true, nullable = false, precision = 10)
	private int jobInstanceId;
	@Column(precision = 10)
	private int version;
	@Column(name = "job_name", length = 50)
	private String jobName;
	@Column(name = "job_key", length = 50)
	private String jobKey;
	@OneToMany
	private Set<PacrBatchJobExecution> pacrBatchJobExecution;

	/** Default constructor. */
	public PacrBatchJobInstance() {
		super();
	}

	/**
	 * Access method for jobInstanceId.
	 *
	 * @return the current value of jobInstanceId
	 */
	public int getJobInstanceId() {
		return jobInstanceId;
	}

	/**
	 * Setter method for jobInstanceId.
	 *
	 * @param aJobInstanceId the new value for jobInstanceId
	 */
	public void setJobInstanceId(int aJobInstanceId) {
		jobInstanceId = aJobInstanceId;
	}

	/**
	 * Access method for version.
	 *
	 * @return the current value of version
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * Setter method for version.
	 *
	 * @param aVersion the new value for version
	 */
	public void setVersion(int aVersion) {
		version = aVersion;
	}

	/**
	 * Access method for jobName.
	 *
	 * @return the current value of jobName
	 */
	public String getJobName() {
		return jobName;
	}

	/**
	 * Setter method for jobName.
	 *
	 * @param aJobName the new value for jobName
	 */
	public void setJobName(String aJobName) {
		jobName = aJobName;
	}

	/**
	 * Access method for jobKey.
	 *
	 * @return the current value of jobKey
	 */
	public String getJobKey() {
		return jobKey;
	}

	/**
	 * Setter method for jobKey.
	 *
	 * @param aJobKey the new value for jobKey
	 */
	public void setJobKey(String aJobKey) {
		jobKey = aJobKey;
	}

	/**
	 * Access method for pacrBatchJobExecution.
	 *
	 * @return the current value of pacrBatchJobExecution
	 */
	public Set<PacrBatchJobExecution> getPacrBatchJobExecution() {
		return pacrBatchJobExecution;
	}

	/**
	 * Setter method for pacrBatchJobExecution.
	 *
	 * @param aPacrBatchJobExecution the new value for pacrBatchJobExecution
	 */
	public void setPacrBatchJobExecution(Set<PacrBatchJobExecution> aPacrBatchJobExecution) {
		pacrBatchJobExecution = aPacrBatchJobExecution;
	}

	/**
	 * Compares the key for this instance with another PacrBatchJobInstance.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class PacrBatchJobInstance and
	 *         the key objects are equal
	 */
	private boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PacrBatchJobInstance)) {
			return false;
		}
		PacrBatchJobInstance that = (PacrBatchJobInstance) other;
		if (this.getJobInstanceId() != that.getJobInstanceId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another PacrBatchJobInstance.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof PacrBatchJobInstance))
			return false;
		return this.equalKeys(other) && ((PacrBatchJobInstance) other).equalKeys(this);
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
		i = getJobInstanceId();
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
		StringBuffer sb = new StringBuffer("[PacrBatchJobInstance |");
		sb.append(" jobInstanceId=").append(getJobInstanceId());
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
		ret.put("jobInstanceId", Integer.valueOf(getJobInstanceId()));
		return ret;
	}

}
