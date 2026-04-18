package com.godbyul.recruit_platform.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonApiResponse<T> {

    private final T result;
    private final String message;

    private CommonApiResponse(T result, String message) {
        this.result = result;
        this.message = message;
    }

    public static <T> CommonApiResponse<T> ok(T result) {
        return new CommonApiResponse<>(result, null);
    }

    public static <T> CommonApiResponse<T> fail(String message) {
        return new CommonApiResponse<>(null, message);
    }
}
