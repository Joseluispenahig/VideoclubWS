package videoclubwebservice;

import java.util.Vector;
import java.util.*;

public class Videoclub {

    private Vector cuentas = null;
    List <Pelicula> peldisponibles;
    List <PeliculaRes> pelreservadas;
    String contraadmin="admin";
    

    public Videoclub() {
    	cuentas = new Vector();
    	pelreservadas = new LinkedList<PeliculaRes>();
        peldisponibles = new LinkedList<Pelicula>();
    }
    
    public void insertarPeliculas(String nombre,String genero,int cantidad,double preciopordia, String contrasena) throws Exception{
    	if(contrasena.equals(contraadmin)) {
    	
    	/* Se generan las peliculas con los atributos correspondientes de cada una,para ello
    	 * usamos un bucle para ir rellenando la lista
    	 */
    		Pelicula peli=new Pelicula(peldisponibles.size()+1,nombre,genero,cantidad,preciopordia);
    		peldisponibles.add(peli);
    	}
    }
    
    public void obtenerPeliculas() throws Exception{
    	for (Pelicula i: peldisponibles) {
			System.out.println("-----------------------------");
			System.out.println("ID de la película: " + i.getId());
			System.out.println("Nombre de la película: " + i.getNombre());
			System.out.println("Género: " + i.getGenero());
			System.out.println("Cantidad disponible: " + i.getCantidad());
			System.out.println("Precio/dia: " + i.getPreciopordia());
		}
		System.out.println("-----------------------------\n");
		
    }
    
    public void ReservarPelicula(int idpeli, String numCuenta, int numdias) throws Exception {
    	//añadir pelicula a lista de peliculas reservadas y comprobaciones
    	double precio=0.0;
    	PeliculaRes peliselec=null;
    	for (Pelicula i: peldisponibles) {
			if(i.getId()==idpeli) {		
				i.setCantidad(i.getCantidad()-1);
				peliselec = new PeliculaRes(i.getId(),i.getNombre(),i.getGenero(),i.getPreciopordia());
				precio = i.getPreciopordia();
			}
    	}
    	
    	Cuenta cuenta = obtenerCuenta(numCuenta);
    	cuenta.reservarPelicula(peliselec);
    	retirar(numCuenta,precio*numdias);	
    }
    
    public void DevolverPelicula(int idpeli, String numCuenta) throws Exception{
    	//eliminar pelicula de la lista de peliculas reservadas y comprobaciones
    	
    	List <PeliculaRes> listapelisres;
    	for (Pelicula i: peldisponibles) {
			if(i.getId()==idpeli) {
				i.setCantidad(i.getCantidad()+1);	
				idpeli = i.getId();
			}
    	}
    	Cuenta cuenta = obtenerCuenta(numCuenta);
    	cuenta.devolverPelicula(idpeli);
		boolean encontrada=false;
		/* Actualizamos la lista de películas reservadas */
	    listapelisres = cuenta.obtenerPeliculasReservadas();
	    		/* Variable utilizada para llevar la cuenta de la posición donde se encuentra en la lista 
	    		 * la película que queremos devolver */
	    int indice = 0;
	    		/* Recorremos la lista de películas reservadas */
	    for (PeliculaRes i: listapelisres) {
	    			/* Si encontramos la película, entramos */
	    	if(i.getId()==idpeli) {
	    		encontrada=true;
	    				/* Eliminamos la película de la lista de películas reservadas */
	    		cuenta.devolverPelicula(indice);
	    				/* Actualizamos la cantidad de películas disponibles */
	    		System.out.println("Has devuelto la película con éxito\n");
	    	}
	    	indice++;
	    }
	    if(encontrada==false){
	    			/* Si no se ha encontrado la película */
	    	System.out.println("No se ha encontrado la película\n");
	    }
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
    public void retirar(String numCuenta, double cantidad) throws Exception{
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
    public Cuenta obtenerCuenta(String numCuenta) throws Exception{
    	boolean encontrado=false;
    	Cuenta cuenta=null;
    	for(int i=0; i<cuentas.size();i++) {
    		if(((Cuenta)cuentas.get(i)).getNumCuenta().equals(numCuenta)) {
    			cuenta=((Cuenta)cuentas.get(i));
    			encontrado=true;
    			i=cuentas.size(); // Para que no siga buscando
    		}
    	}
    	if(encontrado==false)
    		throw new Exception ("La cuenta no existe!");
    	
    	return cuenta;
    }

}
