
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1;

import org.springframework.ws.server.endpoint.annotation.Endpoint;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-09-30T23:57:26.945+03:00
 * Generated source version: 3.2.1
 * 
 */

@javax.jws.WebService(
                      serviceName = "$service.ServiceName",
                      targetNamespace = "$service.Namespace",
                      wsdlLocation = "file:/C:/Users/User/IdeaProjects/spring/boot/demo/src/main/resources/son/SONProvTAWrapper1.wsdl",
                      endpointInterface = "ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1.SyncSONProvTA")

public class SyncSONProvTAImpl implements SyncSONProvTA {

    private static final Logger LOG = Logger.getLogger(SyncSONProvTAImpl.class.getName());

    /* (non-Javadoc)
     * @see ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1.SyncSONProvTA#syncSONRequest(ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1.SONReqMsgType syncSONRequestEBM)*
     */
    public ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1.SONRespMsgType syncSONRequest(SONReqMsgType syncSONRequestEBM) throws CommonFaultMessage   { 
        LOG.info("Executing operation syncSONRequest");
        System.out.println(syncSONRequestEBM);
        try {
            ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1.SONRespMsgType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new CommonFaultMessage("CommonFaultMessage...");
    }

}
