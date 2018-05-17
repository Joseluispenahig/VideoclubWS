package videoclubwebservice;

import java.util.Vector;


public class Videoclub {

    private Vector cuentas = null;

    public Videoclub() {
    	cuentas = new Vector();
    }
    public void crearCuenta(String numCuenta, Usuario usuario) throws Exception{
    	if(usuario==null)
    		throw new Exception ("Usuario invalido!");
    	else {
    		int balance=0;
    		Cuenta cuenta=new Cuenta();
    		cuenta.setNumCuenta(numCuenta);
    		cuenta.setUsuario(usuario);
    		cuenta.setBalance(balance);
    		cuentas.add(cuenta);
        	System.out.println("Cuenta: "+ numCuenta+" creada correctamente");
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
    public Cuenta[] cuentasDelUsuario(String dni) throws Exception{
    	Vector v=new Vector();
    	for(int i=0; i<cuentas.size();i++) {
    		if(((Cuenta)cuentas.get(i)).getUsuario().getDni().equals(dni)) {
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
    public Usuario usuarioDeCuenta(String numCuenta) throws Exception{
    	boolean encontrado=false;
    	Usuario usuario=null;
    	for(int i=0; i<cuentas.size();i++) {
    		if(((Cuenta)cuentas.get(i)).getNumCuenta().equals(numCuenta)) {
    			usuario=((Cuenta)cuentas.get(i)).getUsuario();
    			encontrado=true;
    			i=cuentas.size(); // Para que no siga buscando
    		}
    	}
    	if(encontrado==false)
    		throw new Exception ("La cuenta no existe!");
    	
    	return usuario;
    }

}
