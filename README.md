# 🛡️ LogGuard CLI

A simple command-line tool written in Java that analyzes log files and summarizes their content.

## What it does

Instead of reading hundreds of log lines manually, LogGuard CLI reads your log file and tells you exactly how many errors, warnings, and successes it contains.

## Requirements

- Java 21 or higher

## Usage

Place `logAnalyzer.jar` in the same folder as your log file and run:

java -jar logAnalyzer.jar your-file.log

## Output

===== LOG ANALYZER =====

Errors = 2

Success = 5

Warnings = 2


## Log format

LogGuard detects lines containing the keywords `ERROR`, `SUCCESS` and `WARN` in uppercase.

## Roadmap

- [ ] Line-by-line breakdown per keyword