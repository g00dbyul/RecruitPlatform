package com.godbyul.recruit_platform.domain.recruit.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor
public class CreateRecruitRequest {
    @Schema(description = "회사 ID", example = "0820225c-c0a8-4fcc-9c50-ae6ce0f6a602")
    UUID companyId;

    @Schema(description = "근무 국가", example = "Korea")
    String nationality;

    @Schema(description = "근무 지역", example = "Seoul")
    String region;

    @Schema(description = "담당 업무", example = "Backend Developer")
    String position;

    @Schema(description = "합격 보상금", example = "500000")
    Integer reward;

    @Schema(description = "채용 공고 내용", example = "백엔드 개발자 모집!")
    String content;

    @Schema(description = "기술 스택", example = "[\"Java\", \"Spring\"]")
    String[] skill;
}
