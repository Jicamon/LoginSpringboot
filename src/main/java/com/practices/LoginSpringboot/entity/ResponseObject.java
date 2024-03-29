package com.practices.LoginSpringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Type;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseObject {
    Object object;
    String error;
}
