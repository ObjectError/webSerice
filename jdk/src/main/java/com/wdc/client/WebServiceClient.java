/**
 * FileName: WebServiceClient
 * Author: 汪栋才
 * Date: 2018/3/16 14:53
 * Description: 服务端响应请求
 */
package com.wdc.client;


import com.wdc.client.User;

/**
 * <一句话功能简述><br>
 *<服务端响应请求>
 * @author 汪栋才
 * @greate 2018/3/16
 * */
public class WebServiceClient {
    public static void main(String[] args) {
        HelloSeriveImplService helloSeriveImplService = new HelloSeriveImplService();
        HelloSeriveImpl helloSeriveImplService1 = helloSeriveImplService.getHelloSeriveImplPort();
        String massage = helloSeriveImplService1.say("来自客户端的请求");
        System.out.println("服务器返回信息"+massage);

        User user = new User();
        user.setAge(18);
        user.setName("渣渣辉");
        user.setId(1);
        user.setPhone("31231232132");
        User user1 = helloSeriveImplService1.getUser(user);
        System.out.println("服务器返回的是"+user1.getName());
    }
}
