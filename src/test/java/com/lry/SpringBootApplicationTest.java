package com.lry;

import com.lry.dao.StudentDao;
import com.lry.po.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/**
 * @author liurenyi
 * @create 2019--12--26--9:58
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootApplicationTest {

    @Autowired
    private StudentDao dao;

    @Test
    public void testSelectAll(){
        for (Student student : dao.selectAll()) {
            System.out.println(student );
        }
    }
}
