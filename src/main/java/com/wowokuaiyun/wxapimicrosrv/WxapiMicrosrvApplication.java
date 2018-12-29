package com.wowokuaiyun.wxapimicrosrv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

@ServletComponentScan   //启动器启动时，扫描本目录以及子目录带有的webservlet注解的
@EnableCaching     //缓存
@SpringBootApplication
@MapperScan("com.wowokuaiyun.wxapimicrosrv.dao")
public class WxapiMicrosrvApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxapiMicrosrvApplication.class, args);
    }

}

