package com.wowokuaiyun.wxapimicrosrv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @author DingJie on 2018/12/4
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "微信小程序微服务";
    }
}
