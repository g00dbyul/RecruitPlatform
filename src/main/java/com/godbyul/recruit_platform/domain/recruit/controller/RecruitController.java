package com.godbyul.recruit_platform.domain.recruit.controller;

import com.godbyul.recruit_platform.common.constant.HttpStatusCode;
import com.godbyul.recruit_platform.domain.recruit.dto.request.CreateRecruitRequest;
import com.godbyul.recruit_platform.domain.recruit.dto.request.UpdateRecruitRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@Tag(name = "Recruit API", description = "채용 공고 관련 API")
public interface RecruitController {

    @PostMapping
    @Operation(summary = "생성", description = "채용공고를 생성")
    @ApiResponse(responseCode = HttpStatusCode.CREATED, description = "생성 성공")
    ResponseEntity<Void> createRecruit(
            @RequestBody CreateRecruitRequest dto
    );

    @PatchMapping("/{id}")
    @Operation(summary = "업데이트", description = "채용공고를 업데이트")
    @ApiResponse(responseCode = HttpStatusCode.OK, description = "업데이트 성공")
    ResponseEntity<Void> updateRecruit(
            @Parameter(description = "채용공고 ID", required = true) @PathVariable UUID id,
            @RequestBody UpdateRecruitRequest dto
    );

    @DeleteMapping("/{id}")
    @Operation(summary = "삭제", description = "채용공고를 삭제")
    @ApiResponse(responseCode = HttpStatusCode.NO_CONTENT, description = "삭제 성공")
    ResponseEntity<Void> deleteRecruit(
            @Parameter(description = "채용공고 ID", required = true) @PathVariable UUID id
    );
}
