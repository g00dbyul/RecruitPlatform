package com.godbyul.recruit_platform.domain.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor()
@Builder()
public class User {
    private final String id;
    private String name;
}
