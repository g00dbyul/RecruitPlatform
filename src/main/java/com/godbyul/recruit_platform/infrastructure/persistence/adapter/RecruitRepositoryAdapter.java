package com.godbyul.recruit_platform.infrastructure.persistence.adapter;

import com.godbyul.recruit_platform.domain.recruit.repository.RecruitRepository;
import com.godbyul.recruit_platform.infrastructure.persistence.jpa.RecruitJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class RecruitRepositoryAdapter implements RecruitRepository {
    private final RecruitJpaRepository recruitJpaRepository;
}
