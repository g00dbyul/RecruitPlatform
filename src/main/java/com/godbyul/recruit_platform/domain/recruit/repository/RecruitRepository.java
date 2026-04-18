package com.godbyul.recruit_platform.domain.recruit.repository;

import com.godbyul.recruit_platform.domain.recruit.command.CreateRecruitCommand;
import com.godbyul.recruit_platform.domain.recruit.query.FindRecruitQuery;
import com.godbyul.recruit_platform.entity.Recruit;

import java.util.List;
import java.util.UUID;

public interface RecruitRepository {
    Recruit createRecruit(CreateRecruitCommand command);

    List<Recruit> findRecruit(FindRecruitQuery query);

    Recruit findRecruitById(UUID id);

    void deleteRecruitById(UUID id);
}
