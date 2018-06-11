package com.lhcis.api.dao;

import com.lhcis.api.entity.SysUser;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 管理员表 Mapper 接口
 * </p>
 *
 * @author duany
 * @since 2018-06-03
 */
@Repository
public interface SysUserDao extends BaseMapper<SysUser> {

    List<SysUser> selectUserAll();
}
