package com.godbyul.recruit_platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RecruitPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecruitPlatformApplication.class, args);
    }

}
