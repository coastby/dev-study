package com.study.dev.user.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum UserStatus {
    ACTIVE(1),
    RESTRICTED(2),
    DORMANT(3),
    WITHDRAWAL(4),
    ;
    private int code;
}
