package com.godbyul.recruit_platform.infrastructure.persistence.adapter;

import com.godbyul.recruit_platform.domain.application.repository.ApplicationRepository;
import com.godbyul.recruit_platform.infrastructure.persistence.jpa.ApplicationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ApplicationRepositoryAdapter implements ApplicationRepository {
    private final ApplicationJpaRepository applicationJpaRepository;
}
