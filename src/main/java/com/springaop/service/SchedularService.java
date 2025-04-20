package com.springaop.service;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SchedularService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
   // @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.SECONDS)
    @Scheduled(cron = "1 * * * * ?")
    public void schedularOnEverySecond(){
        logger.info("--------------------------Running every Second---------------------------");
    }
}
