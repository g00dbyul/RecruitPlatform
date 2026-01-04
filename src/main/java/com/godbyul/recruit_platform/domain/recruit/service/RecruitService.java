package com.godbyul.recruit_platform.domain.recruit.service;

import com.godbyul.recruit_platform.domain.recruit.model.Recruit;
import com.godbyul.recruit_platform.domain.recruit.model.RecruitUpdate;
import com.godbyul.recruit_platform.domain.recruit.repository.RecruitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecruitService {
    private final RecruitRepository recruitRepository;

    public List<Recruit> findAllRecruit() {
        return recruitRepository.findAllRecruit();
    }

    public Recruit getDetailRecruit(String recruitId) {
        Recruit recruit = recruitRepository.findOneById(recruitId);

        if (recruit == null) {
            /**
             * Error Handling 추가
             */
            throw new RuntimeException("Not found recruit with id: " + recruitId);
        }

        return recruit;
    }

    public Recruit updateRecruit(RecruitUpdate updateDto, String recruitId) {
        Recruit recruit = recruitRepository.findOneById(recruitId);

        if (recruit == null) {
            throw new RuntimeException("Not found recruit with id: " + recruitId);
        }

        recruit.updateRecruit(updateDto);

        return recruitRepository.findOneById(recruitId);
    }
}
