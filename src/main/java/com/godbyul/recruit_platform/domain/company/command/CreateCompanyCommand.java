package com.godbyul.recruit_platform.domain.company.command;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateCompanyCommand {
    String companyName;
}
