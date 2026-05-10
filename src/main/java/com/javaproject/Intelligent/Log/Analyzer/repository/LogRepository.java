package com.javaproject.Intelligent.Log.Analyzer.repository;

import com.javaproject.Intelligent.Log.Analyzer.model.LogEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LogRepository extends JpaRepository<LogEntry, Long> {

    List<LogEntry> findByLevel(String level);

    List<LogEntry> findByService(String service);
}