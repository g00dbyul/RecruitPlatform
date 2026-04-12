package com.godbyul.recruit_platform.domain.company.repository;

import com.godbyul.recruit_platform.domain.company.command.CreateCompanyCommand;
import com.godbyul.recruit_platform.entity.Company;

public interface CompanyRepository {
    Company createCompany(CreateCompanyCommand command);
}
