package controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {

    @RequestMapping(value = "/aaa",produces = "application/json; charset=utf-8")
    public String aa(){
        System.out.println(111);
        //return "bbb";
        return "edf公共模块";
    }
}
