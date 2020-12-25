package com.fatmadelenn.thread.controller;
import com.fatmadelenn.thread.service.FirstThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/thread")
public class ThreadController {

    @Autowired
    FirstThreadService firstThreadService;

    @GetMapping("/first")
    private void startFirstThread() throws InterruptedException {
        firstThreadService.startFirstThread();
    }
    @GetMapping("/first/executor")
    private void firstThreadExecutorService() throws InterruptedException, ExecutionException {
        firstThreadService.firstThreadExecutorService();
    }

}
