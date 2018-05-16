import es.uc3m.www.WS.Banco.*;
import alfonso_portatil.axis.services.Banco.*;
 
 public class BancoClient {
 public static void main(String [] args) throws Exception {
 BancoService service = new BancoServiceLocator();
 Banco port = service.getBanco();
 
 if(args[0].equals("crearCuenta")) {
	 if(args.length==3) {
		 Titular titular = new Titular();
		 titular.setNombre(args[1]);
		 titular.setDni(args[2]);
		 try {
		 port.crearCuenta("1234",titular);
		 }catch(Exception e) {
			 System.out.println(e);
		 }
	 }
	 else
		 System.out.println("Uso: crearCuenta nombre DNI");
 }
 else if(args[0].equals("cerrarCuenta")) {
	 if(args.length==2) {
		 try {
		 port.cerrarCuenta(args[1]);
		 }catch(Exception e) {
			 System.out.println(e);
		 }
	 }else
		 System.out.println("Uso: cerrarCuenta numerodecuenta"); 
 }
 
 else if(args[0].equals("ingresar")) {
	 if(args.length==3) {
		 try {
		 port.ingresar(args[1], Integer.parseInt(args[2]));
		 }catch(Exception e) {
			 System.out.println(e);
		 }
	 }else
		 System.out.println("Uso: ingresar numerodecuenta cantidad"); 
 }
 else if(args[0].equals("retirar")) {
	 if(args.length==3) {
		 try {
		 port.retirar(args[1], Integer.parseInt(args[2]));
		 }catch(Exception e) {
			 System.out.println(e);
		 }
	 }else
		 System.out.println("Uso: retirar numerodecuenta cantidad"); 
 }
 else if(args[0].equals("obtenercuentas")) {
	 if(args.length==2) {
		 try {
		 Cuenta[] cuentas=port.cuentasDelTitular(args[1]);
		 System.out.println("Cuentas del titular: "+args[1]);
		 for(int i=0;i<cuentas.length;i++) {
			 System.out.println(cuentas[i].getNumCuenta());
		 }
		 }catch(Exception e) {
			 System.out.println(e);
		 }
		 
	 }else
		 System.out.println("Uso: obtenercuentas DNI"); 
 }
 else if(args[0].equals("obtenertitular")) {
	 if(args.length==2) {
		 try {
		 Titular titular=port.titularDeCuenta(args[1]);
		 System.out.println(args[1]);
		 System.out.println(titular.getNombre());
		 System.out.println(titular.getDni());
		 }catch(Exception e) {
			 System.out.println(e);
		 }
	
	 }else
		 System.out.println("Uso: obtenertitular numerodecuenta");
 }

 }
 }
