package com.godbyul.recruit_platform.domain.recruit.controller;

import com.godbyul.recruit_platform.domain.recruit.model.Recruit;
import com.godbyul.recruit_platform.domain.recruit.model.RecruitUpdate;
import com.godbyul.recruit_platform.domain.recruit.service.RecruitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("api/v1/recruit")
@RequiredArgsConstructor
public class RecruitController {
    private final RecruitService recruitService;

    @GetMapping
    public ResponseEntity<List<Recruit>> findAllRecruit() {
        return ResponseEntity.ok(recruitService.findAllRecruit());
    }

    @GetMapping("/{recruitId}")
    public ResponseEntity<Recruit> getDetailRecruit(@PathVariable String recruitId) {
        return ResponseEntity.ok(recruitService.getDetailRecruit(recruitId));
    }

    @PatchMapping("/{recruitId}")
    public ResponseEntity<Recruit> updateRecruit(final @Valid @RequestBody RecruitUpdate updateDto, @PathVariable String recruitId) {
        return ResponseEntity.ok(recruitService.updateRecruit(updateDto, recruitId));
    }
}
