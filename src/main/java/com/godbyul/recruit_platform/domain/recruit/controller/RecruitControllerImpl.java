package com.godbyul.recruit_platform.domain.recruit.controller;

import com.godbyul.recruit_platform.domain.recruit.dto.request.CreateRecruitRequest;
import com.godbyul.recruit_platform.domain.recruit.dto.request.UpdateRecruitRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/recruits")
public class RecruitControllerImpl implements RecruitController {

    @Override
    public ResponseEntity<Void> createRecruit(CreateRecruitRequest dto) {
        return ResponseEntity.status(201).build();
    }

    @Override
    public ResponseEntity<Void> updateRecruit(UUID id, UpdateRecruitRequest dto) {
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> deleteRecruit(UUID id) {
        return ResponseEntity.noContent().build();
    }
}
