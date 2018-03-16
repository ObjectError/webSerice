/**
 * FileName: WebServiceClient
 * Author: 汪栋才
 * Date: 2018/3/16 15:39
 * Description: 访问服务器
 */
package com.wdc.client;

/**
 * <一句话功能简述><br>
 *<访问服务器>
 * @author 汪栋才
 * @greate 2018/3/16
 * */
public class WebServiceClient {
    public static void main(String[] args) {
        HelloServiceImplService helloServiceImplService = new HelloServiceImplService();
        HelloService helloService = helloServiceImplService.getHelloServiceImplPort();
        String massage = helloService.hello("渣渣辉");
        System.out.println(massage);
        Student student = new Student();
        student.setId(3);
        student.setName("陈小蠢");
        student.setAge(20);
        student.setPhone("2312321321");
        Student student1 = helloService.sendStudent(student);
        System.out.println(student1.getName()+"响应了请求");
    }
}
