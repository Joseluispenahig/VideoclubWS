import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
import org.apache.axis.utils.Options;

import javax.xml.rpc.ParameterMode;
import javax.xml.namespace.QName;
import bancowebservice.*;


public class BancoClient2{
    static String endpoint="http://localhost:8888/axis/services/Banco";
	
    public static void main(String [] args) throws Exception{
	int dinero;
	String nombre;
	String dni;	
	Cuenta cuentas;
	Titular titular;

	if(args[0].equals("crearCuenta")){
	    if(args.length==3){
		nombre=args[1];
		dni=args[2];
		titular=new Titular();
		titular.setNombre(nombre);
		titular.setDni(dni);
		try{
		    invoca_crear("1234", titular);
		}catch(Exception ex){
		    System.out.println(ex);
		    System.exit(1);
		}
	    }else
		System.out.println("Uso: crearCuenta nombre DNI");
	}
	else if(args[0].equals("cerrarCuenta")){
	    if(args.length==2){
		try{
		    invoca_cerrar(args[1]);
		}catch(Exception ex){
		    System.out.println(ex);
		    System.exit(1);
		}
	    }else
		System.out.println("Uso: cerrarCuenta numerodecuenta");
	}
	else if(args[0].equals("ingresar")){
	    if(args.length==3){
		try{
		    invoca_ingresar(args[1], Integer.parseInt(args[2]));
		}catch(Exception ex){
		    System.out.println(ex);
		    System.exit(1);
		}
	    }else
		System.out.println("Uso: ingresar numerodecuenta cantidad"); 
	}
	else if(args[0].equals("retirar")){
	    if(args.length==3){
		try{
		    invoca_retirar(args[1], Integer.parseInt(args[2]));
		}catch(Exception ex){
		    System.out.println(ex);
		    System.exit(1);
		}
	    }else
		System.out.println("Uso: retirar numerodecuenta cantidad"); 
	}
	else if(args[0].equals("obtenercuentas")){
	    if(args.length==2){
		try{
		    invoca_cuentas(args[1]);
		}catch(Exception ex){
		    System.out.println(ex);
		    System.exit(1);
		}
	    }else
		System.out.println("Uso: cuentas_de DNI"); 				
	}
	else if(args[0].equals("obtenertitular")){
	    if(args.length==2){
		try{
		    invoca_titular(args[1]);
		}catch(Exception ex){
		    System.out.println(ex);
		    System.exit(1);
		}
	    }else
		System.out.println("Uso: titular_de numerodecuenta");
	}
	else
	    System.out.println("Operaciones disponibles: crearCuenta, cerrarCuenta, ingresar, retirar, obtenercuentas, obtenertitular");
			

    }

    private static void invoca_crear(String cuenta, Titular titular){
	try{
	    Service service = new Service();
	    Call call =(Call) service.createCall();
	    QName qn = new QName("http://www.uc3m.es/WS/Banco", "Titular");
	    call.registerTypeMapping(bancowebservice.Titular.class, qn,new org.apache.axis.encoding.ser.BeanSerializerFactory(bancowebservice.Titular.class, qn),new org.apache.axis.encoding.ser.BeanDeserializerFactory(bancowebservice.Titular.class, qn));
	    call.setTargetEndpointAddress( new java.net.URL(endpoint) );
	    call.setOperationName("crearCuenta");
	    call.addParameter("numCuenta", org.apache.axis.Constants.XSD_STRING, ParameterMode.IN);
	    call.addParameter("titular",qn, ParameterMode.IN);
	    call.setReturnType(XMLType.AXIS_VOID);
	    call.invoke(new Object [] { cuenta, titular });
	}catch (Exception ex) {
	    System.out.println(ex);
	}
    }

    private static void invoca_cerrar(String cuenta){
	try{
	    Service service = new Service();
	    Call call =(Call) service.createCall();
	    call.setTargetEndpointAddress( new java.net.URL(endpoint) );
	    call.setOperationName("cerrarCuenta");
	    call.addParameter("numCuenta", org.apache.axis.Constants.XSD_STRING, ParameterMode.IN);
	    call.setReturnType(XMLType.AXIS_VOID);
	    call.invoke(new Object [] { cuenta });
	}catch (Exception ex) {
	    System.out.println(ex);
	}
    }

    private static void invoca_ingresar(String cuenta, int dinero){
	try{
	    Service service = new Service();
	    Call call =(Call) service.createCall();
	    call.setTargetEndpointAddress( new java.net.URL(endpoint) );
	    call.setOperationName("ingresar");
	    call.addParameter("numCuenta", org.apache.axis.Constants.XSD_STRING, ParameterMode.IN);
	    call.addParameter("cantidad", org.apache.axis.Constants.XSD_INT, ParameterMode.IN);
	    call.setReturnType(XMLType.AXIS_VOID);
	    call.invoke(new Object [] { cuenta, dinero });
	}catch (Exception ex) {
	    System.out.println(ex);
	}
    }

    private static void invoca_retirar(String cuenta, int dinero){
	try{
	    Service service = new Service();
	    Call call =(Call) service.createCall();
	    call.setTargetEndpointAddress( new java.net.URL(endpoint) );
	    call.setOperationName("retirar");
	    call.addParameter("numCuenta", org.apache.axis.Constants.XSD_STRING, ParameterMode.IN);
	    call.addParameter("cantidad", org.apache.axis.Constants.XSD_INT, ParameterMode.IN);
	    call.setReturnType(XMLType.AXIS_VOID);
	    call.invoke(new Object [] { cuenta, dinero });
	}catch (Exception ex) {
	    System.out.println(ex);
	}
    }

    private static void invoca_cuentas(String dni){
	try {
	    Service service = new Service();
	    Call call = (Call) service.createCall();
	    QName qn = new QName( "http://www.uc3m.es/WS/Banco","Cuenta" );
	    QName qn2 = new QName("http://www.uc3m.es/WS/Banco","Titular");
	    QName qna = new QName( "http://www.uc3m.es/WS/Banco","ArrayOfCuenta" );
	    call.registerTypeMapping(bancowebservice.Cuenta.class, qn, new org.apache.axis.encoding.ser.BeanSerializerFactory(bancowebservice.Cuenta.class, qn),new org.apache.axis.encoding.ser.BeanDeserializerFactory(bancowebservice.Cuenta.class, qn));
	    call.registerTypeMapping(bancowebservice.Titular.class, qn2, new org.apache.axis.encoding.ser.BeanSerializerFactory(bancowebservice.Titular.class, qn2),new org.apache.axis.encoding.ser.BeanDeserializerFactory(bancowebservice.Titular.class, qn2));
	    call.setTargetEndpointAddress( new java.net.URL(endpoint) );
	    call.setOperationName("cuentasDelTitular");
	    call.addParameter("dni", XMLType.XSD_STRING, ParameterMode.IN );
	    call.setReturnType(qna);

	    System.out.println("Cuentas del titular: "+dni);
	    Cuenta cuenta[] = (Cuenta [])call.invoke(new Object [] { dni });
	    for (int k=0; k < cuenta.length; k++) {
		Cuenta n = cuenta[k];
		System.out.println(n.getNumCuenta());
	    }
	}catch (Exception e) {
	    System.out.println(e);
	}
    }

    private static void invoca_titular(String numCuenta){
	try{
	    Service service = new Service();
	    Call call =(Call) service.createCall();
	    QName qn = new QName( "http://www.uc3m.es/WS/Banco","Titular" );
	    call.registerTypeMapping(bancowebservice.Titular.class, qn, new org.apache.axis.encoding.ser.BeanSerializerFactory(bancowebservice.Titular.class, qn),new org.apache.axis.encoding.ser.BeanDeserializerFactory(bancowebservice.Titular.class, qn));
	    call.setTargetEndpointAddress( new java.net.URL(endpoint) );
	    call.setOperationName("titularDeCuenta");
	    call.addParameter("numCuenta", org.apache.axis.Constants.XSD_STRING, ParameterMode.IN);
	    call.setReturnType(qn);
	    Titular titular=(Titular)call.invoke(new Object [] { numCuenta });
	    System.out.println(numCuenta);
	    System.out.println(titular.getNombre());
	    System.out.println(titular.getDni());
					   
	}catch (Exception ex) {
	    System.out.println(ex);
	}
    }
}
