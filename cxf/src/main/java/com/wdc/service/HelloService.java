/**
 * FileName: HelloService
 * Author: 汪栋才
 * Date: 2018/3/16 15:18
 * Description: 服务接口
 */
package com.wdc.service;

import com.wdc.bean.Student;

import javax.jws.WebService;

/**
 * <一句话功能简述><br>
 *<服务接口>
 * @author 汪栋才
 * @greate 2018/3/16
 * */
@WebService
public interface HelloService {
    String hello(String name);
    Student sendStudent(Student student);
}
