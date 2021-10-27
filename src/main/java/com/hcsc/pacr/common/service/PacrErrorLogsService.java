package com.hcsc.pacr.common.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcsc.pacr.common.dao.PacrErrorLogsDao;
import com.hcsc.pacr.common.entity.PacrErrorLogs;

public class PacrErrorLogsService {

	@Autowired
	PacrErrorLogsDao errorLogsDao;

	public void saveBatchErrors(int providerPkid, int providerId, int batchJobId, String userId, String errorCode,
			String exceptionStacktrace, String serviceEndPoInteger, LocalDateTime errorTimestamp, int spanId,
			int traceId) {

		PacrErrorLogs error = new PacrErrorLogs();

		error.setProviderPkid(providerPkid);
		error.setProviderId(providerId);
		error.setBatchId(batchJobId);
		error.setUserId(userId);
		error.setErrorCode(errorCode);
		error.setExceptionStacktrace(exceptionStacktrace);
		error.setErrorTimestamp(errorTimestamp);
		error.setServiceEndPoint(serviceEndPoInteger);
		error.setSpanId(spanId);
		error.setTraceId(traceId);
		errorLogsDao.save(error);

	}

	public void saveErrors(String userId, String errorCode, String exceptionStacktrace, String serviceEndPoInteger,
			LocalDateTime errorTimestamp, int spanId, int traceId) {

		PacrErrorLogs error = new PacrErrorLogs();

		error.setUserId(userId);
		error.setErrorCode(errorCode);
		error.setExceptionStacktrace(exceptionStacktrace);
		error.setErrorTimestamp(errorTimestamp);
		error.setServiceEndPoint(serviceEndPoInteger);
		error.setSpanId(spanId);
		error.setTraceId(traceId);
		errorLogsDao.save(error);

	}

}
