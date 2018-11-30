package com.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author：linma
 * @date: 2018/11/27 16:45
 * @email: linma@homeinns.com
 **/
@RestController
@RequestMapping("/homeinns")
public class DemoController {

    @GetMapping("/congratulations")
    @PreAuthorize("hasAnyAuthority('order:add')")
    public String congratulations() {
        return "恭喜你";
    }

    @GetMapping("/demo")
    public ModelAndView demo() {
        ModelAndView mv = new ModelAndView("Demo");
        return mv;
    }


}
