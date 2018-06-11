package com.lhcis.api.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.plugins.Page;
import com.lhcis.api.entity.SysUser;
import com.lhcis.api.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 管理员表 前端控制器
 * </p>
 *
 * @author duany
 * @since 2018-06-03
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 分页page
     */
    @GetMapping("test")
    public Page<SysUser> test() {
        Page<SysUser> sysUserPage = sysUserService.selectPage(new Page<>(2, 3));
        return sysUserPage;
    }

    @PostMapping("add")
    public Object add() {
        SysUser sysUser = new SysUser() {
            {
                setBirthday(new Date());
                setCreatetime(new Date());
                setEmail("491675881@qq.com");
                setName("duany");
                setPassword("1233456");

            }
        };

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result",sysUserService.insert(sysUser));
        return jsonObject;

    }

    @GetMapping("selectAll")
    public List<SysUser> selectUserAll() {
        return sysUserService.selectUserAll();
    }

}

