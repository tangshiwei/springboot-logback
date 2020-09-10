package com.logback.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TaskDemo {
    Logger logger= LoggerFactory.getLogger(TaskDemo.class);
    SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void demo(){
        String time="当前时间："+format.format(new Date());
        logger.debug("DEBUG:"+time);
        logger.info("INFO:"+time);
        logger.warn("WARN:"+time);
        logger.error("ERROR:"+time);
    }
}
