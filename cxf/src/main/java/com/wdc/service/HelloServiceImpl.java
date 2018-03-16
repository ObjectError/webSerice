/**
 * FileName: HelloService
 * Author: 汪栋才
 * Date: 2018/3/16 15:18
 * Description: 服务接口
 */
package com.wdc.service;

import com.wdc.bean.Student;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * <一句话功能简述><br>
 *<服务接口>
 * @author 汪栋才
 * @greate 2018/3/16
 * */
@WebService
@Component
public class HelloServiceImpl implements HelloService{

    @WebMethod
    @Override
    public String hello(String name) {
        System.out.println("客户端"+name+"来了请求");
        return "你好"+name;
    }

    @WebMethod
    @Override
    public Student sendStudent(Student student) {
        System.out.println("客户端"+student.getName()+"发来了贺电");
        Student student1 = new Student(1,"渣渣辉",18,"3213213123");
        return student1;
    }
}
