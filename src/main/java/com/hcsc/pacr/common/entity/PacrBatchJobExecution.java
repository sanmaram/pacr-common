// Generated with g9.

package com.hcsc.pacr.common.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="PACR_batch_job_execution")
public class PacrBatchJobExecution implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "jobExecutionId";

    @Id
    @Column(name="job_execution_id", unique=true, nullable=false, precision=10)
    private int jobExecutionId;
    @Column(precision=10)
    private int version;
    @Column(name="create_time")
    private LocalDateTime createTime;
    @Column(name="start_time")
    private LocalDateTime startTime;
    @Column(name="end_time")
    private LocalDateTime endTime;
    @Column(length=10)
    private String status;
    @Column(name="exit_code", length=20)
    private String exitCode;
    @Column(name="exit_message", length=50)
    private String exitMessage;
    @Column(name="last_updated")
    private LocalDateTime lastUpdated;
    @Column(name="job_configuration_location", length=50)
    private String jobConfigurationLocation;
    @OneToOne
    private PacrBatchJobExecutionContext pacrBatchJobExecutionContext;
    @OneToOne
    private PacrBatchJobExecutionParams pacrBatchJobExecutionParams;
    @OneToMany
    private Set<PacrBatchStepExecution> pacrBatchStepExecution;
    @ManyToOne
    @JoinColumn(name="job_instance_id")
    private PacrBatchJobInstance pacrBatchJobInstance;

    /** Default constructor. */
    public PacrBatchJobExecution() {
        super();
    }

    /**
     * Access method for jobExecutionId.
     *
     * @return the current value of jobExecutionId
     */
    public int getJobExecutionId() {
        return jobExecutionId;
    }

    /**
     * Setter method for jobExecutionId.
     *
     * @param aJobExecutionId the new value for jobExecutionId
     */
    public void setJobExecutionId(int aJobExecutionId) {
        jobExecutionId = aJobExecutionId;
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
     * Access method for createTime.
     *
     * @return the current value of createTime
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * Setter method for createTime.
     *
     * @param aCreateTime the new value for createTime
     */
    public void setCreateTime(LocalDateTime aCreateTime) {
        createTime = aCreateTime;
    }

    /**
     * Access method for startTime.
     *
     * @return the current value of startTime
     */
    public LocalDateTime getStartTime() {
        return startTime;
    }

    /**
     * Setter method for startTime.
     *
     * @param aStartTime the new value for startTime
     */
    public void setStartTime(LocalDateTime aStartTime) {
        startTime = aStartTime;
    }

    /**
     * Access method for endTime.
     *
     * @return the current value of endTime
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * Setter method for endTime.
     *
     * @param aEndTime the new value for endTime
     */
    public void setEndTime(LocalDateTime aEndTime) {
        endTime = aEndTime;
    }

    /**
     * Access method for status.
     *
     * @return the current value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for status.
     *
     * @param aStatus the new value for status
     */
    public void setStatus(String aStatus) {
        status = aStatus;
    }

    /**
     * Access method for exitCode.
     *
     * @return the current value of exitCode
     */
    public String getExitCode() {
        return exitCode;
    }

    /**
     * Setter method for exitCode.
     *
     * @param aExitCode the new value for exitCode
     */
    public void setExitCode(String aExitCode) {
        exitCode = aExitCode;
    }

    /**
     * Access method for exitMessage.
     *
     * @return the current value of exitMessage
     */
    public String getExitMessage() {
        return exitMessage;
    }

    /**
     * Setter method for exitMessage.
     *
     * @param aExitMessage the new value for exitMessage
     */
    public void setExitMessage(String aExitMessage) {
        exitMessage = aExitMessage;
    }

    /**
     * Access method for lastUpdated.
     *
     * @return the current value of lastUpdated
     */
    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Setter method for lastUpdated.
     *
     * @param aLastUpdated the new value for lastUpdated
     */
    public void setLastUpdated(LocalDateTime aLastUpdated) {
        lastUpdated = aLastUpdated;
    }

    /**
     * Access method for jobConfigurationLocation.
     *
     * @return the current value of jobConfigurationLocation
     */
    public String getJobConfigurationLocation() {
        return jobConfigurationLocation;
    }

    /**
     * Setter method for jobConfigurationLocation.
     *
     * @param aJobConfigurationLocation the new value for jobConfigurationLocation
     */
    public void setJobConfigurationLocation(String aJobConfigurationLocation) {
        jobConfigurationLocation = aJobConfigurationLocation;
    }

    /**
     * Access method for pacrBatchJobExecutionContext.
     *
     * @return the current value of pacrBatchJobExecutionContext
     */
    public PacrBatchJobExecutionContext getPacrBatchJobExecutionContext() {
        return pacrBatchJobExecutionContext;
    }

    /**
     * Setter method for pacrBatchJobExecutionContext.
     *
     * @param aPacrBatchJobExecutionContext the new value for pacrBatchJobExecutionContext
     */
    public void setPacrBatchJobExecutionContext(PacrBatchJobExecutionContext aPacrBatchJobExecutionContext) {
        pacrBatchJobExecutionContext = aPacrBatchJobExecutionContext;
    }

    /**
     * Access method for pacrBatchJobExecutionParams.
     *
     * @return the current value of pacrBatchJobExecutionParams
     */
    public PacrBatchJobExecutionParams getPacrBatchJobExecutionParams() {
        return pacrBatchJobExecutionParams;
    }

    /**
     * Setter method for pacrBatchJobExecutionParams.
     *
     * @param aPacrBatchJobExecutionParams the new value for pacrBatchJobExecutionParams
     */
    public void setPacrBatchJobExecutionParams(PacrBatchJobExecutionParams aPacrBatchJobExecutionParams) {
        pacrBatchJobExecutionParams = aPacrBatchJobExecutionParams;
    }

    /**
     * Access method for pacrBatchStepExecution.
     *
     * @return the current value of pacrBatchStepExecution
     */
    public Set<PacrBatchStepExecution> getPacrBatchStepExecution() {
        return pacrBatchStepExecution;
    }

    /**
     * Setter method for pacrBatchStepExecution.
     *
     * @param aPacrBatchStepExecution the new value for pacrBatchStepExecution
     */
    public void setPacrBatchStepExecution(Set<PacrBatchStepExecution> aPacrBatchStepExecution) {
        pacrBatchStepExecution = aPacrBatchStepExecution;
    }

    /**
     * Access method for pacrBatchJobInstance.
     *
     * @return the current value of pacrBatchJobInstance
     */
    public PacrBatchJobInstance getPacrBatchJobInstance() {
        return pacrBatchJobInstance;
    }

    /**
     * Setter method for pacrBatchJobInstance.
     *
     * @param aPacrBatchJobInstance the new value for pacrBatchJobInstance
     */
    public void setPacrBatchJobInstance(PacrBatchJobInstance aPacrBatchJobInstance) {
        pacrBatchJobInstance = aPacrBatchJobInstance;
    }

    /**
     * Compares the key for this instance with another PacrBatchJobExecution.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PacrBatchJobExecution and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PacrBatchJobExecution)) {
            return false;
        }
        PacrBatchJobExecution that = (PacrBatchJobExecution) other;
        if (this.getJobExecutionId() != that.getJobExecutionId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PacrBatchJobExecution.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PacrBatchJobExecution)) return false;
        return this.equalKeys(other) && ((PacrBatchJobExecution)other).equalKeys(this);
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
        i = getJobExecutionId();
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
        StringBuffer sb = new StringBuffer("[PacrBatchJobExecution |");
        sb.append(" jobExecutionId=").append(getJobExecutionId());
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
        ret.put("jobExecutionId", Integer.valueOf(getJobExecutionId()));
        return ret;
    }

}
