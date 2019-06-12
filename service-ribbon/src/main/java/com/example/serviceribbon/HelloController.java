package com.example.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud
 * @author: zpc
 * @create: 2019-06-06 10:05
 **/
@RestController
public class HelloController {
   @Autowired
   HelloService helloService;
   @GetMapping("/hi")
    public String hi(@RequestParam String name){
       return helloService.hiService(name);
   }
}
