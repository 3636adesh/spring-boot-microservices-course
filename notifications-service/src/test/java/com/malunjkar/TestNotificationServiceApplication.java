package com.malunjkar;

import org.springframework.boot.SpringApplication;

public class TestNotificationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(NotificationsServiceApplication::main)
                .with(ContainersConfig.class)
                .run(args);
    }
}
