package com.godbyul.recruit_platform.infrastructure.persistence.adapter;

import com.godbyul.recruit_platform.domain.company.command.CreateCompanyCommand;
import com.godbyul.recruit_platform.domain.company.repository.CompanyRepository;
import com.godbyul.recruit_platform.entity.Company;
import com.godbyul.recruit_platform.infrastructure.persistence.jpa.CompanyJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CompanyRepositoryAdapter implements CompanyRepository {
    private final CompanyJpaRepository companyJpaRepository;

    @Override
    public Company createCompany(CreateCompanyCommand command) {
        return companyJpaRepository.save(
                Company.builder()
                        .companyName(command.getCompanyName())
                        .build()
        );
    }
}
