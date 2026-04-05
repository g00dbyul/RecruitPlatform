package com.godbyul.recruit_platform.domain.recruit.command;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
public class CreateRecruitCommand {
    private UUID companyId;
    private String nationality;
    private String region;
    private String position;
    private Integer reward;
    private String content;
    private String[] skill;
}
