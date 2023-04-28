package com.bwf.study.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version v1.0
 * @description:
 * @author: lenovo
 * @date: 2023/4/14 15:10
 * @copyright: 赵氏
 */
@RestController
@RequestMapping(value = "/sec",method = RequestMethod.GET)
public class SecurityController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
