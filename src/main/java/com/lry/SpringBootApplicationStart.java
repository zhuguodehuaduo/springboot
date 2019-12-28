package com.lry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author liurenyi
 * @create 2019--12--26--8:52
 */
@SpringBootApplication //标注当前是唯一启动类
@EnableSwagger2 //开启Swaagger
public class SpringBootApplicationStart {
    //springboot工程的唯一启动类   具有main方法的入口程序

    public static void main(String[] args){
        //调用run方法 实现当前springboot独立运行的类名
        //.class就可以获得这个启动类 和 注解com.lry就可以进行扫描
        //这个标下的所有文件和子包文件
        SpringApplication.run(SpringBootApplicationStart.class,args);
    }
}
