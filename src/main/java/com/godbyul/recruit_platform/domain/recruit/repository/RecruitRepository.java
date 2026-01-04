package com.godbyul.recruit_platform.domain.recruit.repository;

import com.godbyul.recruit_platform.domain.recruit.model.Recruit;

import java.util.List;

public interface RecruitRepository {
    Recruit createRecruit(Recruit recruit);

    Recruit updateRecruit(Recruit recruit);

    void deleteRecruit(String id);

    Recruit findOneById(String id);

    List<Recruit> findAllRecruit();
}
