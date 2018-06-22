package me.divyanshu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @RequestMapping("/")
    public String index(){
        return "COngratulations this is your first spring boot app, up and Running !";
    }

}
