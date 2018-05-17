
public class Pelicula {
	private int id;
	private String nombre;
	private String genero;
	private String cantidad;
	
	public Pelicula(int id, String nombre, String genero, int cantidad) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
		this.cantidad = cantidad;
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
}
