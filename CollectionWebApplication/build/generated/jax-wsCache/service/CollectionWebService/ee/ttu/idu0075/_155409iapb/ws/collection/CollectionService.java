
package ee.ttu.idu0075._155409iapb.ws.collection;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CollectionService", targetNamespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", wsdlLocation = "file:/C:/Users/allutk/Desktop/Veebi/Project/source/CollectionWebApplication/src/conf/xml-resources/web-services/CollectionWebService/wsdl/CollectionService.wsdl")
public class CollectionService
    extends Service
{

    private final static URL COLLECTIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException COLLECTIONSERVICE_EXCEPTION;
    private final static QName COLLECTIONSERVICE_QNAME = new QName("http://www.ttu.ee/idu0075/155409IAPB/ws/collection", "CollectionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/allutk/Desktop/Veebi/Project/source/CollectionWebApplication/src/conf/xml-resources/web-services/CollectionWebService/wsdl/CollectionService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COLLECTIONSERVICE_WSDL_LOCATION = url;
        COLLECTIONSERVICE_EXCEPTION = e;
    }

    public CollectionService() {
        super(__getWsdlLocation(), COLLECTIONSERVICE_QNAME);
    }

    public CollectionService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COLLECTIONSERVICE_QNAME, features);
    }

    public CollectionService(URL wsdlLocation) {
        super(wsdlLocation, COLLECTIONSERVICE_QNAME);
    }

    public CollectionService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COLLECTIONSERVICE_QNAME, features);
    }

    public CollectionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CollectionService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CollectionPortType
     */
    @WebEndpoint(name = "CollectionPort")
    public CollectionPortType getCollectionPort() {
        return super.getPort(new QName("http://www.ttu.ee/idu0075/155409IAPB/ws/collection", "CollectionPort"), CollectionPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CollectionPortType
     */
    @WebEndpoint(name = "CollectionPort")
    public CollectionPortType getCollectionPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ttu.ee/idu0075/155409IAPB/ws/collection", "CollectionPort"), CollectionPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COLLECTIONSERVICE_EXCEPTION!= null) {
            throw COLLECTIONSERVICE_EXCEPTION;
        }
        return COLLECTIONSERVICE_WSDL_LOCATION;
    }

}
