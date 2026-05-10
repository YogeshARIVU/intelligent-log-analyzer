package com.javaproject.Intelligent.Log.Analyzer.dto;

public class LogResponseDTO {

    private Long id;
    private String level;
    private String service;
    private String message;

    public LogResponseDTO(Long id, String level, String service, String message) {
        this.id = id;
        this.level = level;
        this.service = service;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public String getLevel() {
        return level;
    }

    public String getService() {
        return service;
    }

    public String getMessage() {
        return message;
    }
}