package com.godbyul.recruit_platform.domain.application.repository;

import com.godbyul.recruit_platform.domain.application.command.CreateApplicationCommand;
import com.godbyul.recruit_platform.entity.Application;

public interface ApplicationRepository {
    Application createApplication(CreateApplicationCommand command);
}
