package com.lhcis.api.entity;

import lombok.Data;

@Data
public class JsonResult {

    private String status;

    private Object result;

    private String code;

}