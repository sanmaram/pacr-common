// Generated with g9.

package com.hcsc.pacr.common.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="PACR_batch_job_execution_params")
public class PacrBatchJobExecutionParams implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * The optimistic lock. Available via standard bean get/set operations.
     */
//    @Version
//    @Column(name="LOCK_FLAG")
//    private Integer lockFlag;
//
//    /**
//     * Access method for the lockFlag property.
//     *
//     * @return the current value of the lockFlag property
//     */
//    public Integer getLockFlag() {
//        return lockFlag;
//    }
//
//    /**
//     * Sets the value of the lockFlag property.
//     *
//     * @param aLockFlag the new value of the lockFlag property
//     */
//    public void setLockFlag(Integer aLockFlag) {
//        lockFlag = aLockFlag;
//    }

    @Id
    @Column(name="job_execution_id", unique=true, nullable=false, precision=18)
    private BigDecimal jobExecutionId;
    @Column(name="type_cd", length=10)
    private String typeCd;
    @Column(name="key_name", length=20)
    private String keyName;
    @Column(name="string_val", length=50)
    private String stringVal;
    @Column(name="date_val")
    private LocalDateTime dateVal;
    @Column(name="long_val", precision=18)
    private BigDecimal longVal;
    @Column(name="double_val", precision=53)
    private double doubleVal;
    @Column(length=50)
    private String identifying;
    @OneToOne
    @JoinColumn(name="job_execution_id", nullable=false)
    private PacrBatchJobExecution pacrBatchJobExecution;

    /** Default constructor. */
    public PacrBatchJobExecutionParams() {
        super();
    }

    /**
     * Access method for typeCd.
     *
     * @return the current value of typeCd
     */
    public String getTypeCd() {
        return typeCd;
    }

    /**
     * Setter method for typeCd.
     *
     * @param aTypeCd the new value for typeCd
     */
    public void setTypeCd(String aTypeCd) {
        typeCd = aTypeCd;
    }

    /**
     * Access method for keyName.
     *
     * @return the current value of keyName
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * Setter method for keyName.
     *
     * @param aKeyName the new value for keyName
     */
    public void setKeyName(String aKeyName) {
        keyName = aKeyName;
    }

    /**
     * Access method for stringVal.
     *
     * @return the current value of stringVal
     */
    public String getStringVal() {
        return stringVal;
    }

    /**
     * Setter method for stringVal.
     *
     * @param aStringVal the new value for stringVal
     */
    public void setStringVal(String aStringVal) {
        stringVal = aStringVal;
    }

    /**
     * Access method for dateVal.
     *
     * @return the current value of dateVal
     */
    public LocalDateTime getDateVal() {
        return dateVal;
    }

    /**
     * Setter method for dateVal.
     *
     * @param aDateVal the new value for dateVal
     */
    public void setDateVal(LocalDateTime aDateVal) {
        dateVal = aDateVal;
    }

    /**
     * Access method for longVal.
     *
     * @return the current value of longVal
     */
    public BigDecimal getLongVal() {
        return longVal;
    }

    /**
     * Setter method for longVal.
     *
     * @param aLongVal the new value for longVal
     */
    public void setLongVal(BigDecimal aLongVal) {
        longVal = aLongVal;
    }

    /**
     * Access method for doubleVal.
     *
     * @return the current value of doubleVal
     */
    public double getDoubleVal() {
        return doubleVal;
    }

    /**
     * Setter method for doubleVal.
     *
     * @param aDoubleVal the new value for doubleVal
     */
    public void setDoubleVal(double aDoubleVal) {
        doubleVal = aDoubleVal;
    }

    /**
     * Access method for identifying.
     *
     * @return the current value of identifying
     */
    public String getIdentifying() {
        return identifying;
    }

    /**
     * Setter method for identifying.
     *
     * @param aIdentifying the new value for identifying
     */
    public void setIdentifying(String aIdentifying) {
        identifying = aIdentifying;
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

}