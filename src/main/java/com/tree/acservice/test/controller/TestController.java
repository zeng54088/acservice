package com.tree.acservice.test.controller;

import com.tree.acservice.common.entity.BaseVo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/12/23.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    public BaseVo hello(){
        BaseVo ba=new BaseVo();
        Subject currentUser = SecurityUtils.getSubject();
        System.out.println(currentUser);
        return ba;
    }

}
