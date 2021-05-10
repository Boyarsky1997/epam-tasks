package com.github.boyarsky1997.task.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/***
 * Add and configure logger. The log information should be displayed in the console and saved to a file.
 * Make different appenders for debug and info.
 * Configure logger for recording in the file and make the following options:
 * file will not be overwritten;
 * file will be overwritten every day;
 * file will be overwritten after reaching the size of 1 MB;
 * every day log will be written to a new file.
 * Configure logger that all levels higher than “WARN” will be saved in the file.
 * Configure logger that in the file will be recorded only “WARN”, and in the console – only “INFO”.
 * * Who will have time – configure logger that “ERROR” will be sent on e-mail and SMS.
 */
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    static {
        String path = Main.class.getResource("/log4j-6taskemail.xml").getPath();
        DOMConfigurator.configure(path);
    }

    public static void main(String[] args) {
        try {
            throw new Exception("Generating Exception To Test Log4j Mail Notification...");
        } catch (Exception e) {
            logger.error("Sample Result?= " + e);
        }
    }
}
