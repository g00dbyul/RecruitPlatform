package com.godbyul.recruit_platform.infrastructure.persistence.jpa;

import com.godbyul.recruit_platform.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ApplicationJpaRepository extends JpaRepository<Application, UUID> {
}
