package com.example.zyp.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.text.DateFormat;
import java.util.Date;

/**
 * @ Author     ：ZYP
 * @ Date       ：Created in 15:56 2018/8/3
 * @ Description：${description}
 * @ Modified By：
 * @Version: $version$
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model m){
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }
}
