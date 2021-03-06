import es.uc3m.www.WS.Videoclub.*;
import java.lang.*;
import alfonso_portatil.axis.services.Videoclub.*;
import videoclubwebservice.Pelicula;
import java.util.*;

public class VideoclubClient {
	public static void main(String[] args) throws Exception {
		VideoclubService service = new VideoclubServiceLocator();
		Videoclub port = service.getVideoclub();

		if (args[0].equals("crearCuenta")) {
			if (args.length == 5) {
				Usuario usuario = new Usuario();
				usuario.setId(Integer.parseInt(args[1]));
				usuario.setNombre(args[2]);
				usuario.setDni(args[3]);
				try {
					port.crearCuenta(args[4], usuario);
				} catch (Exception e) {
					System.out.println(e);
				}
			} else
				System.out.println("Uso: crearCuenta id nombre DNI numcuenta");
		} else if (args[0].equals("cerrarCuenta")) {
			if (args.length == 2) {
				try {
					port.cerrarCuenta(args[1]);
				} catch (Exception e) {
					System.out.println(e);
				}
			} else
				System.out.println("Uso: cerrarCuenta numerodecuenta");
		}

		else if (args[0].equals("ingresar")) {
			if (args.length == 3) {
				try {
					
					port.ingresar(args[1], Integer.parseInt(args[2]));
					System.out.println("Se han ingresado " + args[2] + "€");
					Cuenta cuenta = port.obtenerCuenta(args[1]);
					System.out.println("Cantidad total: " + cuenta.getBalance() + "€");
				} catch (Exception e) {
					System.out.println(e);
				}
			} else
				System.out.println("Uso: ingresar numerodecuenta cantidad");
		} else if (args[0].equals("retirar")) {
			if (args.length == 3) {
				try {
					Cuenta cuenta = port.obtenerCuenta(args[1]);
					port.retirar(args[1], Integer.parseInt(args[2]));
					cuenta = port.obtenerCuenta(args[1]);
					System.out.println("Cantidad restante: " + cuenta.getBalance() + "€");
				} catch (Exception e) {
					System.out.println(e);
				}
			} else
				System.out.println("Uso: retirar numerodecuenta cantidad");
		} else if (args[0].equals("obtenercuentas")) {
			if (args.length == 2) {
				try {
					Cuenta[] cuentas = port.cuentasDelUsuario(args[1]);
					System.out.println("Cuentas del usuario: " + args[1]);
					for (int i = 0; i < cuentas.length; i++) {
						System.out.println(cuentas[i].getNumCuenta());
					}
				} catch (Exception e) {
					System.out.println(e);
				}

			} else
				System.out.println("Uso: obtenercuentas DNI");
		} else if (args[0].equals("obtenerusuario")) {
			if (args.length == 2) {
				try {
					Usuario usuario = port.usuarioDeCuenta(args[1]);
					System.out.println(args[1]);
					System.out.println(usuario.getId());
					System.out.println(usuario.getNombre());
					System.out.println(usuario.getDni());
				} catch (Exception e) {
					System.out.println(e);
				}

			} else
				System.out.println("Uso: obtenerusuario numerodecuenta");
		} else if (args[0].equals("insertarpeli")) {
			if (args.length == 6) {
				try {
					port.insertarPeliculas(args[1], args[2], Integer.parseInt(args[3]), 
							Double.parseDouble(args[4]),
							args[5]);
					System.out.println("Pelicula insertada");
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		} else if (args[0].equals("reservar")) {
			if (args.length == 4) {
				try {
					port.reservarPelicula(Integer.parseInt(args[1]), args[2], Integer.parseInt(args[3]));
					Cuenta cuenta = port.obtenerCuenta(args[2]);
					System.out.println("Cantidad restante: " + cuenta.getBalance() + "€");
					System.out.println("Pelicula reservada");
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		} else if (args[0].equals("devolver")) {
			if (args.length == 3) {
				try {
					port.devolverPelicula(Integer.parseInt(args[1]), args[2]);
					System.out.println("Pelicula devuelta");
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		} else if (args[0].equals("obtenerpelis")) {
			if (args.length == 1) {
				try {
					String pelis = port.obtenerPeliculas();
					System.out.println(pelis);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		} else if (args[0].equals("obtenerpelisreservadas")) {
			if (args.length == 2) {
				try {
					String pelis = port.obtenerPelisReservadas(args[1]);
					System.out.println(pelis);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}

	}
}
