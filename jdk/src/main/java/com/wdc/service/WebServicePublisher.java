/**
 * FileName: WebServicePublisher
 * Author: 汪栋才
 * Date: 2018/3/16 14:33
 * Description: 发布类
 */
package com.wdc.service;

import javax.xml.ws.Endpoint;

/**
 * <一句话功能简述><br>
 *<发布类>
 * @author 汪栋才
 * @greate 2018/3/16
 * */
public class WebServicePublisher {
    public static void main(String[] args) {
        Endpoint endpoint = Endpoint.publish("http://127.0.0.1/webservice/user",new HelloSeriveImpl());
    }
}
