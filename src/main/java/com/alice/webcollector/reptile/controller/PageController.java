package com.alice.webcollector.reptile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alice
 * @version 1.0
 * @date 2020/8/15 15:44
 */

@Controller
public class PageController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
