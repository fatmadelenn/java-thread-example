package com.fatmadelenn.thread.first;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstThreadRunnable implements Runnable{

    private static final Logger logger = LoggerFactory.getLogger(FirstThreadRunnable.class);

    String message;

    public FirstThreadRunnable(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        logger.info(message);
    }
}
