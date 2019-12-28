package com.lry.dao;

import com.lry.po.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @author liurenyi
 * @create 2019--12--26--10:07
 */
@Repository
@Mapper
public interface StudentDao {
    //注解形式
    @Select("select * from student")
    @Results(id = "stuResult",value = {
            @Result(id = true,property = "stuid",column = "id"),
            @Result(property = "stuname",column = "name"),
            @Result(property = "stupassword",column = "password")
    })
    List<Student> selectAll();

    @Delete("delete from student where id=#{stuid}")
    int delete(int id);

    @ResultMap("stuResult")
    @Select("select * from student where id=#{stuid}")
    Student selectOne(int id);

    @Update("update student set name=#{stuname},password=#{stupassword} where id=#{stuid}")
    int update(Student student);
}
