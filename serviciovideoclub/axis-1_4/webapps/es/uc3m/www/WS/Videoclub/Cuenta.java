/**
 * Cuenta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.uc3m.www.WS.Videoclub;

public class Cuenta  implements java.io.Serializable {
    private double balance;

    private java.lang.String numCuenta;

    private es.uc3m.www.WS.Videoclub.Usuario usuario;

    public Cuenta() {
    }

    public Cuenta(
           double balance,
           java.lang.String numCuenta,
           es.uc3m.www.WS.Videoclub.Usuario usuario) {
           this.balance = balance;
           this.numCuenta = numCuenta;
           this.usuario = usuario;
    }


    /**
     * Gets the balance value for this Cuenta.
     * 
     * @return balance
     */
    public double getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this Cuenta.
     * 
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }


    /**
     * Gets the numCuenta value for this Cuenta.
     * 
     * @return numCuenta
     */
    public java.lang.String getNumCuenta() {
        return numCuenta;
    }


    /**
     * Sets the numCuenta value for this Cuenta.
     * 
     * @param numCuenta
     */
    public void setNumCuenta(java.lang.String numCuenta) {
        this.numCuenta = numCuenta;
    }


    /**
     * Gets the usuario value for this Cuenta.
     * 
     * @return usuario
     */
    public es.uc3m.www.WS.Videoclub.Usuario getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this Cuenta.
     * 
     * @param usuario
     */
    public void setUsuario(es.uc3m.www.WS.Videoclub.Usuario usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cuenta)) return false;
        Cuenta other = (Cuenta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.balance == other.getBalance() &&
            ((this.numCuenta==null && other.getNumCuenta()==null) || 
             (this.numCuenta!=null &&
              this.numCuenta.equals(other.getNumCuenta()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Double(getBalance()).hashCode();
        if (getNumCuenta() != null) {
            _hashCode += getNumCuenta().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cuenta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.uc3m.es/WS/Videoclub", "Cuenta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numCuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.uc3m.es/WS/Videoclub", "Usuario"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
