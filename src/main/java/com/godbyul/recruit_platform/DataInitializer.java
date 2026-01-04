package com.godbyul.recruit_platform;

import com.godbyul.recruit_platform.domain.recruit.model.Recruit;
import com.godbyul.recruit_platform.domain.recruit.model.enums.RecruitPosition;
import com.godbyul.recruit_platform.domain.recruit.model.enums.TechStack;
import com.godbyul.recruit_platform.domain.recruit.repository.RecruitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final RecruitRepository recruitRepository;

    public DataInitializer(RecruitRepository recruitRepository) {
        this.recruitRepository = recruitRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("===== 목 데이터 초기화 시작 =====");

        Recruit recruit1 = Recruit.builder()
                .id("1")
                .companyId("company1")
                .positon(RecruitPosition.Developer)
                .reward(1000000)
                .description("Spring Boot 백엔드 개발자를 모집합니다.")
                .techStack(TechStack.Spring)
                .build();

        Recruit recruit2 = Recruit.builder()
                .id("2")
                .companyId("company2")
                .positon(RecruitPosition.Developer)
                .reward(1500000)
                .description("React 프론트엔드 개발자를 모집합니다.")
                .techStack(TechStack.React)
                .build();

        Recruit recruit3 = Recruit.builder()
                .id("3")
                .companyId("company1")
                .positon(RecruitPosition.Developer)
                .reward(800000)
                .description("Node.js 백엔드 개발자를 모집합니다.")
                .techStack(TechStack.NodeJS)
                .build();

        Recruit recruit4 = Recruit.builder()
                .id("4")
                .companyId("company3")
                .positon(RecruitPosition.Designer)
                .reward(900000)
                .description("UI/UX 디자이너를 모집합니다.")
                .techStack(TechStack.React)
                .build();

        Recruit recruit5 = Recruit.builder()
                .id("5")
                .companyId("company4")
                .positon(RecruitPosition.Developer)
                .reward(2000000)
                .description("Flutter 모바일 앱 개발자를 모집합니다.")
                .techStack(TechStack.Flutter)
                .build();

        recruitRepository.createRecruit(recruit1);
        recruitRepository.createRecruit(recruit2);
        recruitRepository.createRecruit(recruit3);
        recruitRepository.createRecruit(recruit4);
        recruitRepository.createRecruit(recruit5);

        System.out.println("===== 목 데이터 초기화 완료 (총 5개) =====");
    }
}
