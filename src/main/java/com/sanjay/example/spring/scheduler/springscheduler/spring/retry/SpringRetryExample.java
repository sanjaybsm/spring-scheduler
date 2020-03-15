package com.sanjay.example.spring.scheduler.springscheduler.spring.retry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

@Component
public class SpringRetryExample {

    private static final Logger log = LoggerFactory.getLogger(SpringRetryExample.class);
    @Retryable(value = { Exception.class }, maxAttempts = 3, backoff = @Backoff(delay = 1000))
    public void retryExample() throws Exception {
        log.info("Printing attempts :: ");
       throw new Exception();
    }


}
