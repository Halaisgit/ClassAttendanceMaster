package com.classattendancemaster.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Konrad on 2017-04-11.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    String index(){
        return "index";
    }
}
