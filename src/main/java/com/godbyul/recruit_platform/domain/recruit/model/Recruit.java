package com.godbyul.recruit_platform.domain.recruit.model;

import com.godbyul.recruit_platform.domain.recruit.model.enums.RecruitPosition;
import com.godbyul.recruit_platform.domain.recruit.model.enums.TechStack;
import lombok.Builder;
import lombok.Getter;

@Getter
public class Recruit {
    private final String id;
    private String companyId;
    private RecruitPosition positon;
    private Integer reward;
    private String description;
    private TechStack techStack;

    @Builder
    public Recruit(String id, String companyId, RecruitPosition positon, Integer reward, String description, TechStack techStack) {
        this.id = id;
        this.companyId = companyId;
        this.positon = positon;
        this.reward = reward;
        this.description = description;
        this.techStack = techStack;
    }

    public void updateRecruit(RecruitUpdate update) {
        if (update.getPosition() != null) {
            this.positon = update.getPosition();
        }

        if (update.getReward() != null) {
            this.reward = update.getReward();
        }

        if (update.getDescription() != null) {
            this.description = update.getDescription();
        }

        if (update.getTechStack() != null) {
            this.techStack = update.getTechStack();
        }
    }
}
