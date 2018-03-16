package com.wdc.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.2
 * 2018-03-16T15:38:36.873+08:00
 * Generated source version: 3.2.2
 *
 */
@WebServiceClient(name = "HelloServiceImplService",
                  wsdlLocation = "http://localhost:8080/webservice/student?wsdl",
                  targetNamespace = "http://service.wdc.com/")
public class HelloServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.wdc.com/", "HelloServiceImplService");
    public final static QName HelloServiceImplPort = new QName("http://service.wdc.com/", "HelloServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/webservice/student?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/webservice/student?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public HelloServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HelloServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HelloServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServiceImplPort")
    public HelloService getHelloServiceImplPort() {
        return super.getPort(HelloServiceImplPort, HelloService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServiceImplPort")
    public HelloService getHelloServiceImplPort(WebServiceFeature... features) {
        return super.getPort(HelloServiceImplPort, HelloService.class, features);
    }

}