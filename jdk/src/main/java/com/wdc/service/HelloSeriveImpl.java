/**
 * FileName: HelloSeriveImpl
 * Author: 汪栋才
 * Date: 2018/3/16 14:31
 * Description: 测试接口实现类
 */
package com.wdc.service;

import com.wdc.bean.User;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * <一句话功能简述><br>
 *<测试接口实现类>
 * @author 汪栋才
 * @greate 2018/3/16
 * */
@WebService
public class HelloSeriveImpl implements HelloSerice{
    @WebMethod
    @Override
    public String say(String name) {
        return "你好:"+name;
    }
    @WebMethod
    @Override
    public User getUser(User user) {
        System.out.println("来自客户端的"+user.getName()+"请求");
        User user2 = new User(3,"股天乐",18,"1123213213");
        return user2;
    }
}
