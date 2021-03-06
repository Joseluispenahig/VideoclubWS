package videoclubwebservice;

import java.util.*;

public class Cuenta implements java.io.Serializable {
	private String numCuenta;
	private Usuario usuario;
	private double balance;
	private List<PeliculaRes> peliculaRes;
	
	public Cuenta() {
		this.peliculaRes = new LinkedList<PeliculaRes>();
	}

	public void setNumCuenta(String numero) {
		this.numCuenta = numero;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getNumCuenta() {
		return this.numCuenta;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public double getBalance() {
		return this.balance;
	}

	public void ingresar(double cantidad) {
		this.balance += cantidad;
	}

	public void retirar(double cantidad) throws Exception {
		if (cantidad > this.balance)
			throw new Exception("Balance insuficiente!");

		else
			this.balance = this.balance - cantidad;

	}

	/*
	 * Método que se encarga de añadir la pelicula seleccionada en la lista de
	 * peliculas reservadas por el usuario
	 * 
	 */
	public void reservarPelicula(PeliculaRes pelicula) throws Exception {
		peliculaRes.add(pelicula);
	}

	/*
	 * Método que se encarga de quitar la pelicula con un id de la lista de
	 * peliculas reservadas por el usuario
	 * 
	 */
	public void devolverPelicula(int id) throws Exception {
		peliculaRes.remove(id);
	}

	/*
	 * Método que se encarga de obtener la lista de peliculas reservadas por el
	 * usuario
	 * 
	 */
	public List<PeliculaRes> obtenerPeliculasReservadas() throws Exception {
		return peliculaRes;
	}
}
