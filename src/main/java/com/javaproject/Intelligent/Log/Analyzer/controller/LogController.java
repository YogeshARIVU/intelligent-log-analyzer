package com.javaproject.Intelligent.Log.Analyzer.controller;

import com.javaproject.Intelligent.Log.Analyzer.dto.LogStatsDTO;
import com.javaproject.Intelligent.Log.Analyzer.model.LogEntry;
import com.javaproject.Intelligent.Log.Analyzer.service.LogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class LogController {

    private final LogService service;

    public LogController(LogService service) {
        this.service = service;
    }

    @GetMapping
    public String home() {
        return "Intelligent Log Analyzer Running";
    }

    @PostMapping
    public LogEntry add(@RequestBody String log) {
        return service.save(log);
    }

    @GetMapping("/all")
    public List<LogEntry> getAll() {
        return service.getAllLogs();
    }

    @GetMapping("/level/{level}")
    public List<LogEntry> getByLevel(@PathVariable String level) {
        return service.getByLevel(level);
    }

    @GetMapping("/service/{name}")
    public List<LogEntry> getByService(@PathVariable String name) {
        return service.getByService(name);
    }

    @GetMapping("/stats")
    public LogStatsDTO getStats() {
        return service.getStats();
    }
}