package com.hcsc.pacr.utils;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogUtils {

	public static final class ModuleType {
		public static final String PROVIDER_SEARCH = "PROVIDER_SEARCH";
		public static final String PROVIDER_UPDATE = "PROVIDER_UPDATE";
	}

	public static final class MessageCodeType {
		public static final String DB = "CMN.TECH.ERROR.5004";
		public static final String BPM = "CMN.TECH.ERROR.5006";
		public static final String SMTP = "CMN.TECH.ERROR.5007";
		public static final String ENF = "CMN.TECH.ERROR.5009";
		public static final String GENERIC = "CMN.TECH.ERROR.5000";
	}

	public static final class LoggingTypeType {
		public static final String EXCEPTION = "exception";
		public static final String AUDIT = "audit";
		public static final String PERFORMANCE = "performance";
	}

	public static String getExceptionStacktrace(Exception e) {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(outputStream);
		if (e.getCause() != null) {
			e.getCause().printStackTrace(printStream);
			e.getCause().printStackTrace(System.out);
		} else {
			e.printStackTrace(printStream);
			e.printStackTrace(System.out);
		}
		String stackTrace = "";
		try {
			stackTrace = outputStream.toString("UTF8");
		} catch (UnsupportedEncodingException ex) {
			Logger.getLogger(LogUtils.class.getName()).log(Level.SEVERE, null, ex);
		}
		return stackTrace;
	}

}
