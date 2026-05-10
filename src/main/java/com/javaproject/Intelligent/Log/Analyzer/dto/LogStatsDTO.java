package com.javaproject.Intelligent.Log.Analyzer.dto;

public class LogStatsDTO {

    private long totalLogs;
    private long infoLogs;
    private long warnLogs;
    private long errorLogs;

    public LogStatsDTO() {
    }

    public LogStatsDTO(long totalLogs, long infoLogs, long warnLogs, long errorLogs) {
        this.totalLogs = totalLogs;
        this.infoLogs = infoLogs;
        this.warnLogs = warnLogs;
        this.errorLogs = errorLogs;
    }

    public long getTotalLogs() {
        return totalLogs;
    }

    public void setTotalLogs(long totalLogs) {
        this.totalLogs = totalLogs;
    }

    public long getInfoLogs() {
        return infoLogs;
    }

    public void setInfoLogs(long infoLogs) {
        this.infoLogs = infoLogs;
    }

    public long getWarnLogs() {
        return warnLogs;
    }

    public void setWarnLogs(long warnLogs) {
        this.warnLogs = warnLogs;
    }

    public long getErrorLogs() {
        return errorLogs;
    }

    public void setErrorLogs(long errorLogs) {
        this.errorLogs = errorLogs;
    }
}