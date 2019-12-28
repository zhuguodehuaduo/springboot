package com.lry.service;

import com.lry.dao.StudentDao;
import com.lry.po.ResultMessage;
import com.lry.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liurenyi
 * @create 2019--12--26--10:44
 */
@Service
public class StudentSerivceImpl implements StudentSerivce {
    @Autowired
    private StudentDao dao;

    @Override
    public ResultMessage selectAll() {
        ResultMessage rm=null;
        try {
            List<Student> students=dao.selectAll();
            rm=new ResultMessage(1,"查询成功",students);
        }catch (Exception e){
            rm=new ResultMessage(5,"查询失败,数据库连接异常/服务器不稳定",null);
        }
        return rm;
    }

    @Override
    public ResultMessage delete(int id) {
        ResultMessage rm = null;
        try {
            if (dao.delete(id) > 0) {
                rm = new ResultMessage(1, "删除成功", null);
            }else{
                rm = new ResultMessage(5, "删除失败,数据库连接异常或服务器不稳定", null);
            }
        } catch (Exception e) {
            rm = new ResultMessage(5, "删除失败,数据库连接异常或服务器不稳定", null);
        }
        return rm;
    }

    @Override
    public ResultMessage findOne(int id) {
        ResultMessage rm = null;
        try {
            Student student = dao.selectOne(id);
            rm = new ResultMessage(1, "查询成功", student);
        } catch (Exception e) {
            rm = new ResultMessage(5, "查询失败,数据库连接异常或服务器不稳定", null);
        }
        return rm;
    }

    @Override
    public ResultMessage update(Student student) {
        ResultMessage rm = null;
        try {
            if (dao.update(student) > 0) {
                rm = new ResultMessage(1, "修改成功", null);
            }else{
                rm = new ResultMessage(5, "修改失败,数据库连接异常或服务器不稳定", null);
            }
        } catch (Exception e) {
            rm = new ResultMessage(5, "修改失败,数据库连接异常或服务器不稳定", null);
        }
        return rm;
    }


}
