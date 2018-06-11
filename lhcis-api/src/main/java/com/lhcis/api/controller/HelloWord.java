package com.lhcis.api.controller;

import com.lhcis.api.core.util.RedisUtil;
import com.lhcis.api.entity.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@RestController
public class HelloWord {

    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("hello")
    public SysUser hello(){
        SysUser user = new SysUser();
        user.setId(1);
        user.setBirthday(new Date());
        log.info("test");
        log.error("test1");
        log.debug("test2");
        log.trace("test3");
        redisUtil.set("hhh", "hhhhhh");
        System.err.println(redisUtil.get("hhh"));
        return user;
    }

    @PostMapping("save")
    public boolean save(SysUser user){
        System.err.println(user.toString());
        log.info("test");
        return true;
    }
//
//    @PostMapping("save")
//    public boolean save(@RequestBody SysUser user){
//        System.err.println(user.toString());
//
//        return true;
//    }



}
