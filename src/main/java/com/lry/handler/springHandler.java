package com.lry.handler;

import com.lry.po.Student;
import com.lry.service.StudentSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liurenyi
 * @create 2019--12--26--9:07
 */
@RestController
public class springHandler {
    @Autowired
    private StudentSerivce ser;

    @RequestMapping("/test")
    public String test(){
        System.out.println("123");
        return "Hello SpringBoot";
    }
}
