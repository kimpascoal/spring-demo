
package org.xmlsoap.schemas.ws._2003._03.addressing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.xmlsoap.schemas.ws._2003._03.addressing package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EndpointReference_QNAME = new QName("http://schemas.xmlsoap.org/ws/2003/03/addressing", "EndpointReference");
    private final static QName _MessageID_QNAME = new QName("http://schemas.xmlsoap.org/ws/2003/03/addressing", "MessageID");
    private final static QName _RelatesTo_QNAME = new QName("http://schemas.xmlsoap.org/ws/2003/03/addressing", "RelatesTo");
    private final static QName _To_QNAME = new QName("http://schemas.xmlsoap.org/ws/2003/03/addressing", "To");
    private final static QName _Action_QNAME = new QName("http://schemas.xmlsoap.org/ws/2003/03/addressing", "Action");
    private final static QName _From_QNAME = new QName("http://schemas.xmlsoap.org/ws/2003/03/addressing", "From");
    private final static QName _ReplyTo_QNAME = new QName("http://schemas.xmlsoap.org/ws/2003/03/addressing", "ReplyTo");
    private final static QName _FaultTo_QNAME = new QName("http://schemas.xmlsoap.org/ws/2003/03/addressing", "FaultTo");
    private final static QName _Recipient_QNAME = new QName("http://schemas.xmlsoap.org/ws/2003/03/addressing", "Recipient");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.xmlsoap.schemas.ws._2003._03.addressing
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EndpointReferenceType }
     * 
     */
    public EndpointReferenceType createEndpointReferenceType() {
        return new EndpointReferenceType();
    }

    /**
     * Create an instance of {@link AttributedURI }
     * 
     */
    public AttributedURI createAttributedURI() {
        return new AttributedURI();
    }

    /**
     * Create an instance of {@link Relationship }
     * 
     */
    public Relationship createRelationship() {
        return new Relationship();
    }

    /**
     * Create an instance of {@link ReferencePropertiesType }
     * 
     */
    public ReferencePropertiesType createReferencePropertiesType() {
        return new ReferencePropertiesType();
    }

    /**
     * Create an instance of {@link ServiceNameType }
     * 
     */
    public ServiceNameType createServiceNameType() {
        return new ServiceNameType();
    }

    /**
     * Create an instance of {@link AttributedQName }
     * 
     */
    public AttributedQName createAttributedQName() {
        return new AttributedQName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2003/03/addressing", name = "EndpointReference")
    public JAXBElement<EndpointReferenceType> createEndpointReference(EndpointReferenceType value) {
        return new JAXBElement<EndpointReferenceType>(_EndpointReference_QNAME, EndpointReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributedURI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2003/03/addressing", name = "MessageID")
    public JAXBElement<AttributedURI> createMessageID(AttributedURI value) {
        return new JAXBElement<AttributedURI>(_MessageID_QNAME, AttributedURI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Relationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2003/03/addressing", name = "RelatesTo")
    public JAXBElement<Relationship> createRelatesTo(Relationship value) {
        return new JAXBElement<Relationship>(_RelatesTo_QNAME, Relationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributedURI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2003/03/addressing", name = "To")
    public JAXBElement<AttributedURI> createTo(AttributedURI value) {
        return new JAXBElement<AttributedURI>(_To_QNAME, AttributedURI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributedURI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2003/03/addressing", name = "Action")
    public JAXBElement<AttributedURI> createAction(AttributedURI value) {
        return new JAXBElement<AttributedURI>(_Action_QNAME, AttributedURI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2003/03/addressing", name = "From")
    public JAXBElement<EndpointReferenceType> createFrom(EndpointReferenceType value) {
        return new JAXBElement<EndpointReferenceType>(_From_QNAME, EndpointReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2003/03/addressing", name = "ReplyTo")
    public JAXBElement<EndpointReferenceType> createReplyTo(EndpointReferenceType value) {
        return new JAXBElement<EndpointReferenceType>(_ReplyTo_QNAME, EndpointReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2003/03/addressing", name = "FaultTo")
    public JAXBElement<EndpointReferenceType> createFaultTo(EndpointReferenceType value) {
        return new JAXBElement<EndpointReferenceType>(_FaultTo_QNAME, EndpointReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2003/03/addressing", name = "Recipient")
    public JAXBElement<EndpointReferenceType> createRecipient(EndpointReferenceType value) {
        return new JAXBElement<EndpointReferenceType>(_Recipient_QNAME, EndpointReferenceType.class, null, value);
    }

}
