package com.godbyul.recruit_platform.domain.recruit.repository;

import com.godbyul.recruit_platform.domain.recruit.model.Recruit;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class RecruitRepositoryMapImpl implements RecruitRepository {
    Map<String, Recruit> recruitMap = new HashMap<>();

    @Override
    public Recruit createRecruit(Recruit recruit) {
        recruitMap.put(recruit.getId(), recruit);
        return recruit;
    }

    @Override
    public Recruit updateRecruit(Recruit recruit) {
        Recruit origin = recruitMap.get(recruit.getId());
        if (origin != null) {
            recruitMap.put(recruit.getId(), recruit);
        }
        return recruit;
    }

    @Override
    public void deleteRecruit(String id) {
        recruitMap.remove(id);
    }

    @Override
    public Recruit findOneById(String id) {
        return recruitMap.get(id);
    }

    @Override
    public List<Recruit> findAllRecruit() {
        Collection<Recruit> recruits = recruitMap.values();
        return new ArrayList<>(recruits);
    }
}
