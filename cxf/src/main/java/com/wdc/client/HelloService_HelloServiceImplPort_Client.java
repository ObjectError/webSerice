
package com.wdc.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.2
 * 2018-03-16T15:38:36.706+08:00
 * Generated source version: 3.2.2
 *
 */
public final class HelloService_HelloServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.wdc.com/", "HelloServiceImplService");

    private HelloService_HelloServiceImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = HelloServiceImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        HelloServiceImplService ss = new HelloServiceImplService(wsdlURL, SERVICE_NAME);
        HelloService port = ss.getHelloServiceImplPort();

        {
        System.out.println("Invoking hello...");
        java.lang.String _hello_arg0 = "";
        java.lang.String _hello__return = port.hello(_hello_arg0);
        System.out.println("hello.result=" + _hello__return);


        }
        {
        System.out.println("Invoking sendStudent...");
        com.wdc.client.Student _sendStudent_arg0 = null;
        com.wdc.client.Student _sendStudent__return = port.sendStudent(_sendStudent_arg0);
        System.out.println("sendStudent.result=" + _sendStudent__return);


        }

        System.exit(0);
    }

}