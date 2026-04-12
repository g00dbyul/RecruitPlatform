package com.godbyul.recruit_platform.infrastructure.persistence.jpa;

import com.godbyul.recruit_platform.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserJpaRepository extends JpaRepository<Users, UUID> {
}
