package com.anthony.logguard.logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogAnalyzer {
    public int errors = 0;
    public int warnings = 0;
    public int successes = 0;

    public void analyzeLog (String logFilePath) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(logFilePath));
            String linea = reader.readLine();

            while (linea != null) {
                if (linea.contains("ERROR")) {
                    errors++;
                }

                else if (linea.contains("WARN")) {
                    warnings++;
                }

                else if (linea.contains("SUCCESS")) {
                    successes++;
                }
                linea = reader.readLine();
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("No file was found in the specified path");
        }
    }
}