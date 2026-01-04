package com.godbyul.recruit_platform.domain.company.model;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor()
@Builder()
public class Company {
    private final String id;
    private String name;
}
