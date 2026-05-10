package com.javaproject.Intelligent.Log.Analyzer.parser;

import com.javaproject.Intelligent.Log.Analyzer.model.LogEntry;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class RegexLogParser {

    private static final Pattern pattern =
            Pattern.compile("(INFO|ERROR|WARN)\\s+(\\w+)\\s*-\\s*(.*)");

    public LogEntry parse(String rawLog) {

        Matcher m = pattern.matcher(rawLog);

        if (!m.find()) {
            throw new RuntimeException("Invalid log format");
        }

        return LogEntry.builder()
                .level(m.group(1))
                .service(m.group(2))
                .message(m.group(3))
                .build();
    }
}