package com.lhcis.api.entity;

import lombok.Data;

import javax.validation.constraints.*;
import java.util.Date;

@Data
public class User {

    private int id;
    @NotEmpty(message = "姓名不能为空")
    @Size(min = 2, max = 8, message = "姓名长度必须大于 2 且小于 20 字")
    private String username;

//    @NotNull(message = "年龄不能为空")
//    @Min(value = 0, message = "年龄大于 0")
//    @Max(value = 300, message = "年龄不大于 300")
    private int age;
    private Date ctm;

}