package com.godbyul.recruit_platform.infrastructure.persistence.adapter;

import com.godbyul.recruit_platform.domain.recruit.command.CreateRecruitCommand;
import com.godbyul.recruit_platform.domain.recruit.query.FindRecruitQuery;
import com.godbyul.recruit_platform.domain.recruit.repository.RecruitRepository;
import com.godbyul.recruit_platform.entity.Company;
import com.godbyul.recruit_platform.entity.Recruit;
import com.godbyul.recruit_platform.infrastructure.persistence.jpa.CompanyJpaRepository;
import com.godbyul.recruit_platform.infrastructure.persistence.jpa.RecruitJpaRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class RecruitRepositoryAdapter implements RecruitRepository {
    private final RecruitJpaRepository recruitJpaRepository;
    private final CompanyJpaRepository companyJpaRepository;

    @Override
    public Recruit createRecruit(CreateRecruitCommand command) {
        Company company = companyJpaRepository.findById(command.getCompanyId())
                .orElseThrow(() -> new EntityNotFoundException("company not found"));
        return recruitJpaRepository.save(Recruit.builder()
                .company(company)
                .nationality(command.getNationality())
                .region(command.getRegion())
                .position(command.getPosition())
                .reward(command.getReward())
                .content(command.getContent())
                .skill(command.getSkill())
                .build());
    }

    @Override
    public List<Recruit> findRecruit(FindRecruitQuery query) {
        PageRequest pageable = PageRequest.of(query.getPage(), query.getSize(), Sort.by("createdAt").descending());
        return recruitJpaRepository.findAll(pageable).getContent();
    }

    @Override
    public Recruit findRecruitById(UUID id) {
       return recruitJpaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("recruit not found"));
    }

    @Override
    public void deleteRecruitById(UUID id) {
        recruitJpaRepository.deleteById(id);
    }
}
