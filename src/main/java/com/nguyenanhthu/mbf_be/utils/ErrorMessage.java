package com.nguyenanhthu.mbf_be.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ErrorMessage {
    private static final String JWT_UNAUTHORIZED = "Unauthorized";//không cho phép

    private static final String NOT_NULL = "Must not be empty";// không được để rỗng
}
