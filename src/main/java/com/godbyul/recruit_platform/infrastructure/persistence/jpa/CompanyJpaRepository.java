package com.godbyul.recruit_platform.infrastructure.persistence.jpa;

import com.godbyul.recruit_platform.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyJpaRepository extends JpaRepository<Company, UUID> {
}
