package clase_uno;

public class Superheroe {

	private String Nombre;
	private String Descripcion;
	private boolean Capa;
	public Superheroe(String nombre) {
		super();
		Nombre = nombre;
	}
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public boolean isCapa() {
		return Capa;
	}
	public void setCapa(boolean capa) {
		Capa = capa;
	}
	
	
	//Metodo toString
	
	@Override
	public String toString() {
		return "Superheroe :  Nombre = " + getNombre() +  " / Descripción = " + getDescripcion() + " / ¿Tiene Capa? = " + isCapa();
	}
	
	
	
	
}
