package com.godbyul.recruit_platform.common.query;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class CommonQuery {
    private Integer page;
    private Integer size;
}
