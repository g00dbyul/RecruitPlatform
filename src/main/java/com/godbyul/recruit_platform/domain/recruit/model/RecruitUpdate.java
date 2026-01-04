package com.godbyul.recruit_platform.domain.recruit.model;

import com.godbyul.recruit_platform.domain.recruit.model.enums.RecruitPosition;
import com.godbyul.recruit_platform.domain.recruit.model.enums.TechStack;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RecruitUpdate {
    final RecruitPosition position;

    @Positive // null이면 검증 안함, 값이 있으면 양수인지 검증
    final Integer reward; // int를 쓰면 값이 없을 때 0으로 처리 됨

    final String description;

    final TechStack techStack;
}
