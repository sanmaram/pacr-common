package com.hcsc.pacr.common.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcsc.pacr.common.entity.PacrErrorLogs;
public interface PacrErrorLogsDao extends JpaRepository<PacrErrorLogs, Integer>{

}
