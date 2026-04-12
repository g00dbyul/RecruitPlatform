package com.godbyul.recruit_platform.infrastructure.persistence.adapter;

import com.godbyul.recruit_platform.domain.application.command.CreateApplicationCommand;
import com.godbyul.recruit_platform.domain.application.repository.ApplicationRepository;
import com.godbyul.recruit_platform.entity.Application;
import com.godbyul.recruit_platform.entity.Recruit;
import com.godbyul.recruit_platform.entity.Users;
import com.godbyul.recruit_platform.infrastructure.persistence.jpa.ApplicationJpaRepository;
import com.godbyul.recruit_platform.infrastructure.persistence.jpa.RecruitJpaRepository;
import com.godbyul.recruit_platform.infrastructure.persistence.jpa.UserJpaRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ApplicationRepositoryAdapter implements ApplicationRepository {
    private final ApplicationJpaRepository applicationJpaRepository;
    private final UserJpaRepository userJpaRepository;
    private final RecruitJpaRepository recruitJpaRepository;

    @Override
    public Application createApplication(CreateApplicationCommand command) {
        Users user = userJpaRepository.findById(command.getUserId())
                .orElseThrow(() -> new EntityNotFoundException("user not found"));
        Recruit recruit = recruitJpaRepository.findById(command.getRecruitId())
                .orElseThrow(() -> new EntityNotFoundException("recruit not found"));

        return applicationJpaRepository.save(
          Application.builder()
                  .user(user)
                  .recruit(recruit)
                  .build()
        );
    }
}
