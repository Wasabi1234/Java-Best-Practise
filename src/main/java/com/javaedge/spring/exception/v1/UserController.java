package com.javaedge.spring.exception.v1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author JavaEdge
 * @date 2021/10/17
 */
@Controller
@Slf4j
public class UserController {

    public UserController() {
        log.info("construct");
    }

    @GetMapping("/reg/{name}")
    @ResponseBody
    public String saveUser(String name) {
        log.info("register JavaEdge success!");
        return "OK";
    }
}
