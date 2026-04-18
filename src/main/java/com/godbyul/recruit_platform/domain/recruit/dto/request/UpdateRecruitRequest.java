package com.godbyul.recruit_platform.domain.recruit.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UpdateRecruitRequest {

    @Schema(description = "근무 국가", example = "Korea", nullable = true)
    private String nationality;

    @Schema(description = "근무 지역", example = "Seoul", nullable = true)
    private String region;

    @Schema(description = "담당 업무", example = "Backend Developer", nullable = true)
    private String position;

    @Schema(description = "합격 보상금", example = "500000", nullable = true)
    private Integer reward;

    @Schema(description = "공고 내용", example = "...", nullable = true)
    private String content;

    @Schema(description = "기술 스택", example = "[\"Java\", \"Spring\"]", nullable = true)
    private String[] skill;
}
