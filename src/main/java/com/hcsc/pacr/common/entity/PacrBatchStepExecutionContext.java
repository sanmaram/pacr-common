// Generated with g9.

package com.hcsc.pacr.common.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="PACR_batch_step_execution_context")
public class PacrBatchStepExecutionContext implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    
    @Id
    @Column(name="job_execution_id", unique=true, nullable=false, precision=18)
    private BigDecimal jobExecutionId;

    @Column(name="short_context", length=50)
    private String shortContext;
    @Column(name="serialized_context", length=150)
    private String serializedContext;
    @OneToOne
    @JoinColumn(name="step_execution_id", nullable=false)
    private PacrBatchStepExecution pacrBatchStepExecution;

    /** Default constructor. */
    public PacrBatchStepExecutionContext() {
        super();
    }

    /**
     * Access method for shortContext.
     *
     * @return the current value of shortContext
     */
    public String getShortContext() {
        return shortContext;
    }

    /**
     * Setter method for shortContext.
     *
     * @param aShortContext the new value for shortContext
     */
    public void setShortContext(String aShortContext) {
        shortContext = aShortContext;
    }

    /**
     * Access method for serializedContext.
     *
     * @return the current value of serializedContext
     */
    public String getSerializedContext() {
        return serializedContext;
    }

    /**
     * Setter method for serializedContext.
     *
     * @param aSerializedContext the new value for serializedContext
     */
    public void setSerializedContext(String aSerializedContext) {
        serializedContext = aSerializedContext;
    }

    /**
     * Access method for pacrBatchStepExecution.
     *
     * @return the current value of pacrBatchStepExecution
     */
    public PacrBatchStepExecution getPacrBatchStepExecution() {
        return pacrBatchStepExecution;
    }

    /**
     * Setter method for pacrBatchStepExecution.
     *
     * @param aPacrBatchStepExecution the new value for pacrBatchStepExecution
     */
    public void setPacrBatchStepExecution(PacrBatchStepExecution aPacrBatchStepExecution) {
        pacrBatchStepExecution = aPacrBatchStepExecution;
    }

}