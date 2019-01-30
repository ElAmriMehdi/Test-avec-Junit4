//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.01.30 à 10:09:22 AM WET 
//


package helpers2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Rationnel complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Rationnel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="numerateur" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="denominateur" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rationnel")
public class Rationnel {

    @XmlAttribute(name = "numerateur")
    protected Integer numerateur;
    @XmlAttribute(name = "denominateur")
    protected Integer denominateur;

    /**
     * Obtient la valeur de la propriété numerateur.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumerateur() {
        return numerateur;
    }

    /**
     * Définit la valeur de la propriété numerateur.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumerateur(Integer value) {
        this.numerateur = value;
    }

    /**
     * Obtient la valeur de la propriété denominateur.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDenominateur() {
        return denominateur;
    }

    /**
     * Définit la valeur de la propriété denominateur.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDenominateur(Integer value) {
        this.denominateur = value;
    }

}
