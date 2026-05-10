package com.javaproject.Intelligent.Log.Analyzer.service;

import com.javaproject.Intelligent.Log.Analyzer.dto.LogStatsDTO;
import com.javaproject.Intelligent.Log.Analyzer.model.LogEntry;
import com.javaproject.Intelligent.Log.Analyzer.parser.RegexLogParser;
import com.javaproject.Intelligent.Log.Analyzer.repository.LogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {

    private final RegexLogParser parser;
    private final LogRepository repo;

    public LogService(RegexLogParser parser, LogRepository repo) {
        this.parser = parser;
        this.repo = repo;
    }

    public LogEntry save(String rawLog) {
        LogEntry entry = parser.parse(rawLog);
        return repo.save(entry);
    }

    public List<LogEntry> getAllLogs() {
        return repo.findAll();
    }

    public List<LogEntry> getByLevel(String level) {
        return repo.findByLevel(level);
    }

    public List<LogEntry> getByService(String service) {
        return repo.findByService(service);
    }

    public LogStatsDTO getStats() {

        long total = repo.count();
        long info = repo.findByLevel("INFO").size();
        long warn = repo.findByLevel("WARN").size();
        long error = repo.findByLevel("ERROR").size();

        return new LogStatsDTO(total, info, warn, error);
    }
}