
package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Lab_Controller", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LabController {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://services/", className = "services.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://services/", className = "services.HelloResponse")
    @Action(input = "http://services/Lab_Controller/helloRequest", output = "http://services/Lab_Controller/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param priority
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "connect", targetNamespace = "http://services/", className = "services.Connect")
    @ResponseWrapper(localName = "connectResponse", targetNamespace = "http://services/", className = "services.ConnectResponse")
    @Action(input = "http://services/Lab_Controller/connectRequest", output = "http://services/Lab_Controller/connectResponse")
    public Integer connect(
        @WebParam(name = "priority", targetNamespace = "")
        int priority);

}
