package com.godbyul.recruit_platform.infrastructure.persistence.adapter;

import com.godbyul.recruit_platform.domain.user.command.CreateUserCommand;
import com.godbyul.recruit_platform.domain.user.repository.UserRepository;
import com.godbyul.recruit_platform.entity.Users;
import com.godbyul.recruit_platform.infrastructure.persistence.jpa.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserRepository {
    private final UserJpaRepository userJpaRepository;

    @Override
    public Users createUser(CreateUserCommand command) {
        return userJpaRepository.save(
                Users.builder()
                        .userName(command.getUserName())
                        .build()
        );
    }
}
