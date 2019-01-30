//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.01.30 à 10:09:22 AM WET 
//


package helpers2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Data complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Data">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="r1" type="{http://www.example.org/RationnelSchema}Rationnel"/>
 *         &lt;element name="r2" type="{http://www.example.org/RationnelSchema}Rationnel"/>
 *         &lt;element name="resultAddition" type="{http://www.example.org/RationnelSchema}Rationnel"/>
 *         &lt;element name="resultSoustraction" type="{http://www.example.org/RationnelSchema}Rationnel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Data", propOrder = {
    "r1",
    "r2",
    "resultAddition",
    "resultSoustraction"
})
public class Data {

    @XmlElement(required = true)
    protected Rationnel r1;
    @XmlElement(required = true)
    protected Rationnel r2;
    @XmlElement(required = true)
    protected Rationnel resultAddition;
    @XmlElement(required = true)
    protected Rationnel resultSoustraction;

    /**
     * Obtient la valeur de la propriété r1.
     * 
     * @return
     *     possible object is
     *     {@link Rationnel }
     *     
     */
    public Rationnel getR1() {
        return r1;
    }

    /**
     * Définit la valeur de la propriété r1.
     * 
     * @param value
     *     allowed object is
     *     {@link Rationnel }
     *     
     */
    public void setR1(Rationnel value) {
        this.r1 = value;
    }

    /**
     * Obtient la valeur de la propriété r2.
     * 
     * @return
     *     possible object is
     *     {@link Rationnel }
     *     
     */
    public Rationnel getR2() {
        return r2;
    }

    /**
     * Définit la valeur de la propriété r2.
     * 
     * @param value
     *     allowed object is
     *     {@link Rationnel }
     *     
     */
    public void setR2(Rationnel value) {
        this.r2 = value;
    }

    /**
     * Obtient la valeur de la propriété resultAddition.
     * 
     * @return
     *     possible object is
     *     {@link Rationnel }
     *     
     */
    public Rationnel getResultAddition() {
        return resultAddition;
    }

    /**
     * Définit la valeur de la propriété resultAddition.
     * 
     * @param value
     *     allowed object is
     *     {@link Rationnel }
     *     
     */
    public void setResultAddition(Rationnel value) {
        this.resultAddition = value;
    }

    /**
     * Obtient la valeur de la propriété resultSoustraction.
     * 
     * @return
     *     possible object is
     *     {@link Rationnel }
     *     
     */
    public Rationnel getResultSoustraction() {
        return resultSoustraction;
    }

    /**
     * Définit la valeur de la propriété resultSoustraction.
     * 
     * @param value
     *     allowed object is
     *     {@link Rationnel }
     *     
     */
    public void setResultSoustraction(Rationnel value) {
        this.resultSoustraction = value;
    }

}
