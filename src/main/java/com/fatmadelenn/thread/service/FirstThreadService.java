package com.fatmadelenn.thread.service;

import com.fatmadelenn.thread.first.FirstThread;
import com.fatmadelenn.thread.first.FirstThreadRunnable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.*;

@Service
public class FirstThreadService {
    private static final Logger logger = LoggerFactory.getLogger(FirstThreadService.class);

    public void startFirstThread() throws InterruptedException {
//        Thread firstThread = new FirstThread("FirstThread executed using Thread");
//        firstThread.start(); // Causes this thread to begin execution
//        firstThread.join(); // Waits for this thread to die.
        Thread firstThreadRunnable = new Thread(new FirstThreadRunnable("FirstThread executed using Thread"));
        logger.info("Thread state: " +firstThreadRunnable.getState());
        firstThreadRunnable.start();
        logger.info("Thread state: " +firstThreadRunnable.getState());
        firstThreadRunnable.join();
    }

    public void firstThreadExecutorService() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //executorService.submit(new FirstThread("FirstThread executed using Thread")).get();
        executorService.submit(new FirstThreadRunnable("FirstThread executed using Thread")).get();
    }
}
