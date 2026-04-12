package com.godbyul.recruit_platform.domain.user.command;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateUserCommand {
    String userName;
}
