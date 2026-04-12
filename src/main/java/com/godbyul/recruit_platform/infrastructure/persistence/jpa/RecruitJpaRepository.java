package com.godbyul.recruit_platform.infrastructure.persistence.jpa;

import com.godbyul.recruit_platform.entity.Recruit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RecruitJpaRepository extends JpaRepository<Recruit, UUID> {
}
