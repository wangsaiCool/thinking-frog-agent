package com.wonder.thinking.frog.agent.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ThinkingFrogJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThinkingFrogJobApplication.class, args);
    }
}
