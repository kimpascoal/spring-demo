package ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * SONProvTA service
 *
 * This class was generated by Apache CXF 3.2.1
 * 2019-10-07T14:47:51.478+03:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "SONProvTAService", 
                  wsdlLocation = "file:/C:/Users/User/IdeaProjects/spring/boot/demo/src/main/resources/son/SONProvTAWrapper1.wsdl",
                  targetNamespace = "http://www.vtb24.ru/ApplicationConnectorServiceLibrary/SON/Providers/SONProvTA/V1") 
public class SONProvTAService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.vtb24.ru/ApplicationConnectorServiceLibrary/SON/Providers/SONProvTA/V1", "SONProvTAService");
    public final static QName SONProvTAPortAsyncRequest = new QName("http://www.vtb24.ru/ApplicationConnectorServiceLibrary/SON/Providers/SONProvTA/V1", "SONProvTA_Port_async_Request");
    public final static QName SONProvTAPortAsyncResponse = new QName("http://www.vtb24.ru/ApplicationConnectorServiceLibrary/SON/Providers/SONProvTA/V1", "SONProvTA_Port_async_Response");
    public final static QName SONProvTAPortSync = new QName("http://www.vtb24.ru/ApplicationConnectorServiceLibrary/SON/Providers/SONProvTA/V1", "SONProvTA_Port_sync");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/User/IdeaProjects/spring/boot/demo/src/main/resources/son/SONProvTAWrapper1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SONProvTAService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/User/IdeaProjects/spring/boot/demo/src/main/resources/son/SONProvTAWrapper1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SONProvTAService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SONProvTAService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SONProvTAService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SONProvTAService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SONProvTAService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SONProvTAService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns AsyncSONProvTARequest
     */
    @WebEndpoint(name = "SONProvTA_Port_async_Request")
    public AsyncSONProvTARequest getSONProvTAPortAsyncRequest() {
        return super.getPort(SONProvTAPortAsyncRequest, AsyncSONProvTARequest.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AsyncSONProvTARequest
     */
    @WebEndpoint(name = "SONProvTA_Port_async_Request")
    public AsyncSONProvTARequest getSONProvTAPortAsyncRequest(WebServiceFeature... features) {
        return super.getPort(SONProvTAPortAsyncRequest, AsyncSONProvTARequest.class, features);
    }


    /**
     *
     * @return
     *     returns AsyncSONProvTAResponse
     */
    @WebEndpoint(name = "SONProvTA_Port_async_Response")
    public AsyncSONProvTAResponse getSONProvTAPortAsyncResponse() {
        return super.getPort(SONProvTAPortAsyncResponse, AsyncSONProvTAResponse.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AsyncSONProvTAResponse
     */
    @WebEndpoint(name = "SONProvTA_Port_async_Response")
    public AsyncSONProvTAResponse getSONProvTAPortAsyncResponse(WebServiceFeature... features) {
        return super.getPort(SONProvTAPortAsyncResponse, AsyncSONProvTAResponse.class, features);
    }


    /**
     *
     * @return
     *     returns SyncSONProvTA
     */
    @WebEndpoint(name = "SONProvTA_Port_sync")
    public SyncSONProvTA getSONProvTAPortSync() {
        return super.getPort(SONProvTAPortSync, SyncSONProvTA.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SyncSONProvTA
     */
    @WebEndpoint(name = "SONProvTA_Port_sync")
    public SyncSONProvTA getSONProvTAPortSync(WebServiceFeature... features) {
        return super.getPort(SONProvTAPortSync, SyncSONProvTA.class, features);
    }

}
