
public class Pelicula {
	private int id;
	private String nombre;
	private String genero;
	private String cantidad;
	private double preciopordia;
	
	public Pelicula(int id, String nombre, String genero, int cantidad, double preciopordia) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
		this.cantidad = cantidad;
		this.preciopordia = preciopordia;
		
	}
		
	public int getId() {
		return this.id;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public String getCantidad() {
		return this.cantidad;
	}
	
	public double getPreciopordia() {
		return this.preciopordia;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
	public void setPreciopordia(double preciopordia) {
		this.preciopordia = preciopordia;
	}
}
