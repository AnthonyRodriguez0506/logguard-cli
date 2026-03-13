package com.anthony.logguard;
import com.anthony.logguard.logic.LogAnalyzer;

public class Main {
    public static void main(String[] args) {
        String filePath = args[0];
        LogAnalyzer analyzer = new LogAnalyzer();

        analyzer.analyzeLog(filePath);

        System.out.println("===== LOG ANALYZER =====");
        System.out.println("Errors = " + analyzer.errors);
        System.out.println("Success = " + analyzer.successes);
        System.out.println("Warnings = " + analyzer.warnings);
    }
}
