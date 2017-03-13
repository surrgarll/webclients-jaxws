
package com.ipartek.formacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ipartek.formacion package. 
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

    private final static QName _ObtenerTodosPeli_QNAME = new QName("http://ws.formacion.ipartek.com/", "obtenerTodos_peli");
    private final static QName _ObtenerTodosPeliResponse_QNAME = new QName("http://ws.formacion.ipartek.com/", "obtenerTodos_peliResponse");
    private final static QName _ObtenerporidPeli_QNAME = new QName("http://ws.formacion.ipartek.com/", "obtenerporid_peli");
    private final static QName _ObtenerporidPeliResponse_QNAME = new QName("http://ws.formacion.ipartek.com/", "obtenerporid_peliResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ipartek.formacion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Pelicula }
     * 
     */
    public Pelicula createPelicula() {
        return new Pelicula();
    }

    /**
     * Create an instance of {@link Genero }
     * 
     */
    public Genero createGenero() {
        return new Genero();
    }

    /**
     * Create an instance of {@link ObtenerporidPeli }
     * 
     */
    public ObtenerporidPeli createObtenerporidPeli() {
        return new ObtenerporidPeli();
    }

    /**
     * Create an instance of {@link ObtenerTodosPeli }
     * 
     */
    public ObtenerTodosPeli createObtenerTodosPeli() {
        return new ObtenerTodosPeli();
    }

    /**
     * Create an instance of {@link ObtenerTodosPeliResponse }
     * 
     */
    public ObtenerTodosPeliResponse createObtenerTodosPeliResponse() {
        return new ObtenerTodosPeliResponse();
    }

    /**
     * Create an instance of {@link PeliculaMensaje }
     * 
     */
    public PeliculaMensaje createPeliculaMensaje() {
        return new PeliculaMensaje();
    }

    /**
     * Create an instance of {@link ObtenerporidPeliResponse }
     * 
     */
    public ObtenerporidPeliResponse createObtenerporidPeliResponse() {
        return new ObtenerporidPeliResponse();
    }

    /**
     * Create an instance of {@link PeliculaColeccion }
     * 
     */
    public PeliculaColeccion createPeliculaColeccion() {
        return new PeliculaColeccion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodosPeli }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.formacion.ipartek.com/", name = "obtenerTodos_peli")
    public JAXBElement<ObtenerTodosPeli> createObtenerTodosPeli(ObtenerTodosPeli value) {
        return new JAXBElement<ObtenerTodosPeli>(_ObtenerTodosPeli_QNAME, ObtenerTodosPeli.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodosPeliResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.formacion.ipartek.com/", name = "obtenerTodos_peliResponse")
    public JAXBElement<ObtenerTodosPeliResponse> createObtenerTodosPeliResponse(ObtenerTodosPeliResponse value) {
        return new JAXBElement<ObtenerTodosPeliResponse>(_ObtenerTodosPeliResponse_QNAME, ObtenerTodosPeliResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerporidPeli }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.formacion.ipartek.com/", name = "obtenerporid_peli")
    public JAXBElement<ObtenerporidPeli> createObtenerporidPeli(ObtenerporidPeli value) {
        return new JAXBElement<ObtenerporidPeli>(_ObtenerporidPeli_QNAME, ObtenerporidPeli.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerporidPeliResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.formacion.ipartek.com/", name = "obtenerporid_peliResponse")
    public JAXBElement<ObtenerporidPeliResponse> createObtenerporidPeliResponse(ObtenerporidPeliResponse value) {
        return new JAXBElement<ObtenerporidPeliResponse>(_ObtenerporidPeliResponse_QNAME, ObtenerporidPeliResponse.class, null, value);
    }

}
