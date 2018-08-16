package com.jason.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: c6_3
 * @description:
 * @author: Liu
 * @create: 2018-08-15
 */
@Controller
@RequestMapping
public class DefaultController {
    @RequestMapping
    public String list(Model model){
        model.addAttribute("msg","welcome book store123f");
        return "book/list";
    }
}
