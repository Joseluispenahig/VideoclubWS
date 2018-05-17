package videoclubwebservice;

public class PeliculaRes {
	/*Identificador de la película*/
	private int id;
	
	/*Nombre de la película*/
	private String nombre;
	
	/*Género\Tipo de película*/
	private String genero;
	
	/*Precio por día*/
	private double preciopordia;
	
	/*Fecha de comienzo de la reserva/alquiler*/
	//private Calendar FechaInicio;
	
	/*Fecha de fin de la reserva/alquiler*/
	//private Calendar FechaFin;
	
	/*
     *	Constructor de PeliculaRes
     */
	public PeliculaRes(int id, String nombre, String genero, double preciopordia) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
		this.preciopordia = preciopordia;
		//FechaInicio = fechaInicio;
		//FechaFin = fechaFin;
	}
	/*
     *	Getter Id
     */
	public int getId() {
		return id;
	}
	/*
     *	Setter Id
     */
	public void setId(int id) {
		this.id = id;
	}
	/*
     *	Getter Nombre
     */
	public String getNombre() {
		return nombre;
	}
	/*
     *	Setter Nombre
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/*
     *	Getter Tipo
     */
	public String getGenero() {
		return genero;
	}
	/*
     *	Setter Tipo
     */
	public void setTipo(String tipo) {
		this.genero = genero;
	}
	/*
     *	Getter Preciopordia
     */
	public double getPreciopordia() {
		return preciopordia;
	}
	/*
     *	Setter Preciopordia
     */
	public void setPreciopordia(double preciopordia) {
		this.preciopordia = preciopordia;
	}
	/*
     *	Getter FechaInicio
     */
	/*
	public Calendar getFechaInicio() {
		return FechaInicio;
	}
	*/
	/*
     *	Setter FechaInicio
     */
	/*
	public void setFechaInicio(Calendar fechaInicio) {
		FechaInicio = fechaInicio;
	}
	*/
	/*
     *	Getter FechaFin
     */
	/*
	public Calendar getFechaFin() {
		return FechaFin;
	}
	*/
	/*
     *	Setter FechaFin
     */
	
	/*public void setFechaFin(Calendar fechaFin) {
		FechaFin = fechaFin;
	}
	*/
	/*
     * Método que se encarga de calcular los dias entre la fecha de inicio y la fecha de fin
     * 
     */
	/*
	public static int getDiasRestantes(Calendar fechaInicial,Calendar fechaFinal){
		int diffDays=0;
			if(fechaFinal.before(fechaInicial) || fechaInicial.equals(fechaFinal)){
				diffDays=0;
			}else{
				while(fechaInicial.before(fechaFinal) || fechaInicial.equals(fechaFinal)){
					diffDays++;
					fechaInicial.add(Calendar.DATE, 1);
				}
			}
			return diffDays==0?0:diffDays-1;
	}
	*/
}
