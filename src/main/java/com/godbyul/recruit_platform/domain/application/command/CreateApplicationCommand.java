package com.godbyul.recruit_platform.domain.application.command;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
public class CreateApplicationCommand {
    UUID userId;
    UUID recruitId;
}
