package com.sanjay.example.spring.scheduler.springscheduler.scheduler;

import com.sanjay.example.spring.scheduler.springscheduler.spring.retry.SpringRetryExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SchedulerTasks {


    private static final Logger log = LoggerFactory.getLogger(SchedulerTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    private SpringRetryExample retryExample;

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        try {
            retryExample.retryExample();
        }catch (Exception e){
            log.info("exception : ",e.getMessage());
        }
        log.info("The time is now {}", dateFormat.format(new Date()));
    }

}
