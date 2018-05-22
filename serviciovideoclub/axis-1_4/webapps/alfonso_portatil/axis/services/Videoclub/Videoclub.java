/**
 * Videoclub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package alfonso_portatil.axis.services.Videoclub;

public interface Videoclub extends java.rmi.Remote {
    public void ingresar(java.lang.String in0, int in1) throws java.rmi.RemoteException;
    public void retirar(java.lang.String in0, double in1) throws java.rmi.RemoteException;
    public void insertarPeliculas(java.lang.String in0, java.lang.String in1, int in2, double in3, java.lang.String in4) throws java.rmi.RemoteException;
    public es.uc3m.www.WS.Videoclub.Cuenta[] cuentasDelUsuario(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String obtenerPeliculas() throws java.rmi.RemoteException;
    public void reservarPelicula(int in0, java.lang.String in1, int in2) throws java.rmi.RemoteException;
    public void devolverPelicula(int in0, java.lang.String in1) throws java.rmi.RemoteException;
    public void crearCuenta(java.lang.String in0, es.uc3m.www.WS.Videoclub.Usuario in1) throws java.rmi.RemoteException;
    public void cerrarCuenta(java.lang.String in0) throws java.rmi.RemoteException;
    public es.uc3m.www.WS.Videoclub.Usuario usuarioDeCuenta(java.lang.String in0) throws java.rmi.RemoteException;
    public es.uc3m.www.WS.Videoclub.Cuenta obtenerCuenta(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String obtenerPelisReservadas(java.lang.String in0) throws java.rmi.RemoteException;
}
