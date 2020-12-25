package com.fatmadelenn.thread.first;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstThread extends Thread {

    private static final Logger logger = LoggerFactory.getLogger(FirstThread.class);

    String message;

    public FirstThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        logger.info(message);
    }
}
