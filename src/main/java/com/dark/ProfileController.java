package com.dark;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * config-client
 * User: dark xue
 * Date: 2017/7/19
 * Time: 10:30
 * description:
 */
@RestController
@RefreshScope
public class ProfileController {

    @Value("${mybatis.password}")
    private String  url;
    @Value("${mybatis.driverClassName}")
    private String driverClassName;
    @Value("${mybatis.username}")
    private String username;
    @Value("${mybatis.password}")
    private String password;
    @GetMapping("/getProfileInfo")
    public String getProfileInfo(){

        return "mybatis.password:"+url+";mybatis.driverClassName"+driverClassName+";mybatis.username:"+username+";mybatis.password:"+password;
    }
}
