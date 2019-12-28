package com.lry.handler;

import com.lry.po.ResultMessage;
import com.lry.po.Student;
import com.lry.service.StudentSerivce;
import com.sun.org.apache.regexp.internal.RE;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liurenyi
 * @create 2019--12--26--10:50
 */
@Controller
@Api
public class StudentHandler {
    @Autowired
    private StudentSerivce ser;
    @RequestMapping("/")
    public String selectAll(Model model){
        model.addAttribute("rm",ser.selectAll());
        return "index";
    }

    @RequestMapping("/selectAll")
    @ResponseBody
    public ResultMessage selectAll(){
        return ser.selectAll();
    }


    @RequestMapping("/delete")
    @ResponseBody
    public ResultMessage delete(int stuid) {
        return ser.delete(stuid);
    }

    @RequestMapping("/findOne")
    @ResponseBody
    public ResultMessage findOne(int id) {
        System.out.println(id);
        return ser.findOne(id);
    }



}
