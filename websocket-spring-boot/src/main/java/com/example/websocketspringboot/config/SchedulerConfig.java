package com.example.websocketspringboot.config;

import com.example.websocketspringboot.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
public class SchedulerConfig {

    @Autowired
    SimpleMessagingTemplate template;

    @Scheduled(fixedDelay = 5000)
    public void sendAdhocMessage(){
        template.convertAndSend("/topic/user", new UserResponse("Scheduler");
    }

}
