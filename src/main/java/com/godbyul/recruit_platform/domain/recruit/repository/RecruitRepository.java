package com.godbyul.recruit_platform.domain.recruit.repository;

import com.godbyul.recruit_platform.domain.recruit.command.CreateRecruitCommand;
import com.godbyul.recruit_platform.entity.Recruit;

public interface RecruitRepository {
    Recruit createRecruit(CreateRecruitCommand command);
}
