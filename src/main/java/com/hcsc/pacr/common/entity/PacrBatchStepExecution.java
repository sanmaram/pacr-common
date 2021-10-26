// Generated with g9.

package com.hcsc.pacr.common.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name="PACR_batch_step_execution")
public class PacrBatchStepExecution implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "stepExecutionId";

    @Id
    @Column(name="step_execution_id", unique=true, nullable=false, precision=10)
    private int stepExecutionId;
    @Column(precision=10)
    private int version;
    @Column(name="step_name", length=20)
    private String stepName;
    @Column(name="start_time")
    private LocalDateTime startTime;
    @Column(name="end_time")
    private LocalDateTime endTime;
    @Column(length=10)
    private String status;
    @Column(name="commit_count", precision=10)
    private int commitCount;
    @Column(name="read_count", precision=10)
    private int readCount;
    @Column(name="filter_count", precision=10)
    private int filterCount;
    @Column(name="write_count", precision=10)
    private int writeCount;
    @Column(name="read_skip_count", precision=10)
    private int readSkipCount;
    @Column(name="write_skip_count", precision=10)
    private int writeSkipCount;
    @Column(name="process_skip_count", precision=10)
    private int processSkipCount;
    @Column(name="rollback_count", precision=10)
    private int rollbackCount;
    @Column(name="exit_code", length=20)
    private String exitCode;
    @Column(name="exit_message", length=50)
    private String exitMessage;
    @Column(name="last_updated")
    private LocalDateTime lastUpdated;
    @ManyToOne
    @JoinColumn(name="job_execution_id")
    private PacrBatchJobExecution pacrBatchJobExecution;
    @OneToOne
    private PacrBatchStepExecutionContext pacrBatchStepExecutionContext;

    /** Default constructor. */
    public PacrBatchStepExecution() {
        super();
    }

    /**
     * Access method for stepExecutionId.
     *
     * @return the current value of stepExecutionId
     */
    public int getStepExecutionId() {
        return stepExecutionId;
    }

    /**
     * Setter method for stepExecutionId.
     *
     * @param aStepExecutionId the new value for stepExecutionId
     */
    public void setStepExecutionId(int aStepExecutionId) {
        stepExecutionId = aStepExecutionId;
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
     * Access method for stepName.
     *
     * @return the current value of stepName
     */
    public String getStepName() {
        return stepName;
    }

    /**
     * Setter method for stepName.
     *
     * @param aStepName the new value for stepName
     */
    public void setStepName(String aStepName) {
        stepName = aStepName;
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
     * Access method for commitCount.
     *
     * @return the current value of commitCount
     */
    public int getCommitCount() {
        return commitCount;
    }

    /**
     * Setter method for commitCount.
     *
     * @param aCommitCount the new value for commitCount
     */
    public void setCommitCount(int aCommitCount) {
        commitCount = aCommitCount;
    }

    /**
     * Access method for readCount.
     *
     * @return the current value of readCount
     */
    public int getReadCount() {
        return readCount;
    }

    /**
     * Setter method for readCount.
     *
     * @param aReadCount the new value for readCount
     */
    public void setReadCount(int aReadCount) {
        readCount = aReadCount;
    }

    /**
     * Access method for filterCount.
     *
     * @return the current value of filterCount
     */
    public int getFilterCount() {
        return filterCount;
    }

    /**
     * Setter method for filterCount.
     *
     * @param aFilterCount the new value for filterCount
     */
    public void setFilterCount(int aFilterCount) {
        filterCount = aFilterCount;
    }

    /**
     * Access method for writeCount.
     *
     * @return the current value of writeCount
     */
    public int getWriteCount() {
        return writeCount;
    }

    /**
     * Setter method for writeCount.
     *
     * @param aWriteCount the new value for writeCount
     */
    public void setWriteCount(int aWriteCount) {
        writeCount = aWriteCount;
    }

    /**
     * Access method for readSkipCount.
     *
     * @return the current value of readSkipCount
     */
    public int getReadSkipCount() {
        return readSkipCount;
    }

    /**
     * Setter method for readSkipCount.
     *
     * @param aReadSkipCount the new value for readSkipCount
     */
    public void setReadSkipCount(int aReadSkipCount) {
        readSkipCount = aReadSkipCount;
    }

    /**
     * Access method for writeSkipCount.
     *
     * @return the current value of writeSkipCount
     */
    public int getWriteSkipCount() {
        return writeSkipCount;
    }

    /**
     * Setter method for writeSkipCount.
     *
     * @param aWriteSkipCount the new value for writeSkipCount
     */
    public void setWriteSkipCount(int aWriteSkipCount) {
        writeSkipCount = aWriteSkipCount;
    }

    /**
     * Access method for processSkipCount.
     *
     * @return the current value of processSkipCount
     */
    public int getProcessSkipCount() {
        return processSkipCount;
    }

    /**
     * Setter method for processSkipCount.
     *
     * @param aProcessSkipCount the new value for processSkipCount
     */
    public void setProcessSkipCount(int aProcessSkipCount) {
        processSkipCount = aProcessSkipCount;
    }

    /**
     * Access method for rollbackCount.
     *
     * @return the current value of rollbackCount
     */
    public int getRollbackCount() {
        return rollbackCount;
    }

    /**
     * Setter method for rollbackCount.
     *
     * @param aRollbackCount the new value for rollbackCount
     */
    public void setRollbackCount(int aRollbackCount) {
        rollbackCount = aRollbackCount;
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
     * Access method for pacrBatchJobExecution.
     *
     * @return the current value of pacrBatchJobExecution
     */
    public PacrBatchJobExecution getPacrBatchJobExecution() {
        return pacrBatchJobExecution;
    }

    /**
     * Setter method for pacrBatchJobExecution.
     *
     * @param aPacrBatchJobExecution the new value for pacrBatchJobExecution
     */
    public void setPacrBatchJobExecution(PacrBatchJobExecution aPacrBatchJobExecution) {
        pacrBatchJobExecution = aPacrBatchJobExecution;
    }

    /**
     * Access method for pacrBatchStepExecutionContext.
     *
     * @return the current value of pacrBatchStepExecutionContext
     */
    public PacrBatchStepExecutionContext getPacrBatchStepExecutionContext() {
        return pacrBatchStepExecutionContext;
    }

    /**
     * Setter method for pacrBatchStepExecutionContext.
     *
     * @param aPacrBatchStepExecutionContext the new value for pacrBatchStepExecutionContext
     */
    public void setPacrBatchStepExecutionContext(PacrBatchStepExecutionContext aPacrBatchStepExecutionContext) {
        pacrBatchStepExecutionContext = aPacrBatchStepExecutionContext;
    }

    /**
     * Compares the key for this instance with another PacrBatchStepExecution.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PacrBatchStepExecution and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PacrBatchStepExecution)) {
            return false;
        }
        PacrBatchStepExecution that = (PacrBatchStepExecution) other;
        if (this.getStepExecutionId() != that.getStepExecutionId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PacrBatchStepExecution.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PacrBatchStepExecution)) return false;
        return this.equalKeys(other) && ((PacrBatchStepExecution)other).equalKeys(this);
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
        i = getStepExecutionId();
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
        StringBuffer sb = new StringBuffer("[PacrBatchStepExecution |");
        sb.append(" stepExecutionId=").append(getStepExecutionId());
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
        ret.put("stepExecutionId", Integer.valueOf(getStepExecutionId()));
        return ret;
    }

}
