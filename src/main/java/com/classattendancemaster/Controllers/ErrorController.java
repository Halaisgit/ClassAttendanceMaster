package com.classattendancemaster.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Konrad on 2017-06-07.
 */
@Controller
@RequestMapping("/error")
public class ErrorController {
    public String error(){
        return "redirect:";
    }
}
