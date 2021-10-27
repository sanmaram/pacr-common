// Generated with g9.

package com.hcsc.pacr.common.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "PACR_error_logs")
public class PacrErrorLogs implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
	protected static final String PK = "logId";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "log_id", unique = true, nullable = false, precision = 10)
	private int logId;
	@Column(name = "Provider_id", precision = 10)
	private int providerId;
	@Column(name = "user_id", length = 20)
	private String userId;
	@Column(name = "error_code", length = 10)
	private String errorCode;
	@Column(name = "exception_stacktrace", length = 150)
	private String exceptionStacktrace;
	@Column(name = "error_timestamp")
	private LocalDateTime errorTimestamp;
	@Column(name = "service_end_point", length = 150)
	private String serviceEndPoint;
	@Column(name = "span_id", precision = 10)
	private int spanId;
	@Column(name = "trace_id", precision = 10)
	private int traceId;
	@Column(name = "batch_job_id")
	private int batchId;
	@Column(name = "provider_pkid")
	private int providerPkid;

	/** Default constructor. */
	public PacrErrorLogs() {
		super();
	}

	/**
	 * Access method for logId.
	 *
	 * @return the current value of logId
	 */
	public int getLogId() {
		return logId;
	}

	/**
	 * Setter method for logId.
	 *
	 * @param aLogId the new value for logId
	 */
	public void setLogId(int aLogId) {
		logId = aLogId;
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
	 * Access method for userId.
	 *
	 * @return the current value of userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Setter method for userId.
	 *
	 * @param aUserId the new value for userId
	 */
	public void setUserId(String aUserId) {
		userId = aUserId;
	}

	/**
	 * Access method for errorCode.
	 *
	 * @return the current value of errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * Setter method for errorCode.
	 *
	 * @param aErrorCode the new value for errorCode
	 */
	public void setErrorCode(String aErrorCode) {
		errorCode = aErrorCode;
	}

	/**
	 * Access method for exceptionStacktrace.
	 *
	 * @return the current value of exceptionStacktrace
	 */
	public String getExceptionStacktrace() {
		return exceptionStacktrace;
	}

	/**
	 * Setter method for exceptionStacktrace.
	 *
	 * @param aExceptionStacktrace the new value for exceptionStacktrace
	 */
	public void setExceptionStacktrace(String aExceptionStacktrace) {
		exceptionStacktrace = aExceptionStacktrace;
	}

	/**
	 * Access method for errorTimestamp.
	 *
	 * @return the current value of errorTimestamp
	 */
	public LocalDateTime getErrorTimestamp() {
		return errorTimestamp;
	}

	/**
	 * Setter method for errorTimestamp.
	 *
	 * @param aErrorTimestamp the new value for errorTimestamp
	 */
	public void setErrorTimestamp(LocalDateTime aErrorTimestamp) {
		errorTimestamp = aErrorTimestamp;
	}

	/**
	 * Access method for serviceEndPoint.
	 *
	 * @return the current value of serviceEndPoint
	 */
	public String getServiceEndPoint() {
		return serviceEndPoint;
	}

	/**
	 * Setter method for serviceEndPoint.
	 *
	 * @param aServiceEndPoint the new value for serviceEndPoint
	 */
	public void setServiceEndPoint(String aServiceEndPoint) {
		serviceEndPoint = aServiceEndPoint;
	}

	/**
	 * Access method for spanId.
	 *
	 * @return the current value of spanId
	 */
	public int getSpanId() {
		return spanId;
	}

	/**
	 * Setter method for spanId.
	 *
	 * @param aSpanId the new value for spanId
	 */
	public void setSpanId(int aSpanId) {
		spanId = aSpanId;
	}

	/**
	 * Access method for traceId.
	 *
	 * @return the current value of traceId
	 */
	public int getTraceId() {
		return traceId;
	}

	/**
	 * Setter method for traceId.
	 *
	 * @param aTraceId the new value for traceId
	 */
	public void setTraceId(int aTraceId) {
		traceId = aTraceId;
	}
	
	

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public int getProviderPkid() {
		return providerPkid;
	}

	public void setProviderPkid(int providerPkid) {
		this.providerPkid = providerPkid;
	}

	/**
	 * Compares the key for this instance with another PacrErrorLogs.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class PacrErrorLogs and the key
	 *         objects are equal
	 */
	private boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PacrErrorLogs)) {
			return false;
		}
		PacrErrorLogs that = (PacrErrorLogs) other;
		if (this.getLogId() != that.getLogId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another PacrErrorLogs.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof PacrErrorLogs))
			return false;
		return this.equalKeys(other) && ((PacrErrorLogs) other).equalKeys(this);
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
		i = getLogId();
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
		StringBuffer sb = new StringBuffer("[PacrErrorLogs |");
		sb.append(" logId=").append(getLogId());
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
		ret.put("logId", Integer.valueOf(getLogId()));
		return ret;
	}

}
