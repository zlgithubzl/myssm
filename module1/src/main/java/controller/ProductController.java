package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(produces = "application/json; charset=utf-8")
public class ProductController {

    @RequestMapping("/aaa")
    //@RequestMapping(value = "/aaa",produces = "application/html; charset=utf-8")  //这样写会直接下载未以aaa未名字的一个文件,但是该为返回json就正常了********
    public String getProduct(String name){
        System.out.println(name);
        //return "aaa";e
        return "abcdef获取到了商品信息，哈哈";
    }
}
