package com.zpc.sericefeign;

import org.springframework.stereotype.Component;

/**
 * @program: springcloud
 * @author: zpc
 * @create: 2019-06-10 16:44
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name + " some error happened";
    }
}
