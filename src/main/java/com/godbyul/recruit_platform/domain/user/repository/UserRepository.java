package com.godbyul.recruit_platform.domain.user.repository;

import com.godbyul.recruit_platform.domain.user.command.CreateUserCommand;
import com.godbyul.recruit_platform.entity.Users;

public interface UserRepository {
    Users createUser(CreateUserCommand command);
}
