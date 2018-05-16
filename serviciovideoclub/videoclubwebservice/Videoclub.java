package videoclubwebservice;

import java.util.Vector;


public class Videoclub {

    private Vector cuentas = null;

    public Banco() {
    	cuentas = new Vector();
    }
    public void crearCuenta(String numCuenta, Titular titular) throws Exception{
    	if(titular==null)
    		throw new Exception ("Titular invalido!");
    	else {
    		int balance=0;
    		Cuenta cuenta=new Cuenta();
    		cuenta.setNumCuenta(numCuenta);
    		cuenta.setTitular(titular);
    		cuenta.setBalance(balance);
    		cuentas.add(cuenta);
        	System.out.println("Cuenta :"+ numCuenta+" creada correctamente");
    	}
    }
    
    public void cerrarCuenta(String numCuenta) throws Exception{
    	boolean encontrado=false;
    	for(int i=0; i<cuentas.size();i++) {
    		if(((Cuenta)cuentas.get(i)).getNumCuenta().equals(numCuenta)){
    			cuentas.removeElementAt(i);
    			cuentas.trimToSize();
    			encontrado=true;
    			i=cuentas.size(); // Para que no siga buscando
    		}
    	}
    	if(encontrado==false)
    		throw new Exception ("La cuenta no existe!");
    	else
    		System.out.println("Cuenta :"+ numCuenta+" eliminada");
    }
    public void ingresar(String numCuenta, int cantidad) throws Exception{
    	boolean encontrado=false;
    	for(int i=0; i<cuentas.size();i++) {
    		if(((Cuenta)cuentas.get(i)).getNumCuenta().equals(numCuenta)) {
    			((Cuenta)cuentas.get(i)).ingresar(cantidad);
    			encontrado=true;
    	    	if(encontrado==true)
    	    		System.out.println("Dinero en la cuenta "+numCuenta+ " "+((Cuenta)cuentas.get(i)).getBalance());
    			i=cuentas.size(); // Para que no siga buscando    			
    		}
    	}
    	if(encontrado==false)
    		throw new Exception ("La cuenta no existe!");

    }
    public void retirar(String numCuenta, int cantidad) throws Exception{
    	boolean encontrado=false;
    	for(int i=0; i<cuentas.size();i++) {
    		if(((Cuenta)cuentas.get(i)).getNumCuenta().equals(numCuenta)) {
    			((Cuenta)cuentas.get(i)).retirar(cantidad);
    			encontrado=true;
    			if(encontrado==true)
    	    		System.out.println("Dinero en la cuenta "+numCuenta+ " "+((Cuenta)cuentas.get(i)).getBalance());
    			i=cuentas.size(); // Para que no siga buscando
    		}
    	}
    	if(encontrado==false)
    		throw new Exception ("La cuenta no existe!");
    }
    public Cuenta[] cuentasDelTitular(String dni) throws Exception{
    	Vector v=new Vector();
    	for(int i=0; i<cuentas.size();i++) {
    		if(((Cuenta)cuentas.get(i)).getTitular().getDni().equals(dni)) {
    			v.add((Cuenta)cuentas.get(i));
    		}
    	}
    	
    	if(v.size()==0)
    		throw new Exception ("DNI no encontrado!");

    	else {
        	Cuenta[] cuenta=new Cuenta[v.size()];
    		for(int i=0;i<v.size();i++) {
    			cuenta[i]=(Cuenta)v.get(i);
    		}
        	return cuenta;
    	}
    }
    public Titular titularDeCuenta(String numCuenta) throws Exception{
    	boolean encontrado=false;
    	Titular titular=null;
    	for(int i=0; i<cuentas.size();i++) {
    		if(((Cuenta)cuentas.get(i)).getNumCuenta().equals(numCuenta)) {
    			titular=((Cuenta)cuentas.get(i)).getTitular();
    			encontrado=true;
    			i=cuentas.size(); // Para que no siga buscando
    		}
    	}
    	if(encontrado==false)
    		throw new Exception ("La cuenta no existe!");
    	
    	return titular;
    }

}
