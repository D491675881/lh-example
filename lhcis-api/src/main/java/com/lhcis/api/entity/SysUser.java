package com.lhcis.api.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * <p>
 * 管理员表
 * </p>
 *
 * @author duany
 * @since 2018-06-03
 */
@Data
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Integer id;
    /**
     * 头像
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String avatar;
    /**
     * 账号
     */
    private String account;
    /**
     * 密码
     */
    private String password;
    /**
     * md5密码盐
     */
    private String salt;
    /**
     * 名字
     */
    @NotNull(message = "名字不能为空")
    private String name;
    /**
     * 生日
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    /**
     * 性别（1：男 2：女）
     */
    private Integer sex;
    /**
     * 电子邮件
     */
    private String email;
    /**
     * 电话
     */
    private String phone;
    /**
     * 角色id
     */
    private String roleid;
    /**
     * 部门id
     */
    private Integer deptid;
    /**
     * 状态(1：启用  2：冻结  3：删除）
     */
    private Integer status;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createtime;
    /**
     * 保留字段
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer version;


}
