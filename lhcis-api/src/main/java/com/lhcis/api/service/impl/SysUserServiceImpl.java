package com.lhcis.api.service.impl;

import com.lhcis.api.entity.SysUser;
import com.lhcis.api.dao.SysUserDao;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lhcis.api.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author duany
 * @since 2018-06-03
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUser> implements SysUserService {

    @Resource
    private SysUserDao sysUserDao;

    @Override
    public List<SysUser> selectUserAll() {
        return sysUserDao.selectUserAll();
    }
}
