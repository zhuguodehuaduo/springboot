package com.lry.service;

import com.lry.po.ResultMessage;
import com.lry.po.Student;

/**
 * @author liurenyi
 * @create 2019--12--26--10:18
 */
public interface StudentSerivce {
    ResultMessage selectAll();
    ResultMessage delete(int stuid);
    ResultMessage findOne(int id);
    ResultMessage update(Student student);
}
