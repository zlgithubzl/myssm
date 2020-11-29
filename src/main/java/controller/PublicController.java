package controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {

    @RequestMapping(value = "/public",produces = "application/html; charset=utf-8")
    public String aa(){
        System.out.println(111);
        //return "bbb";
        return "ccc公共模块";
    }
}
