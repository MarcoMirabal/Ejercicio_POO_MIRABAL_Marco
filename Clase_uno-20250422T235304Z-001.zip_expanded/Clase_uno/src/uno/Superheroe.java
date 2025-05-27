package uno;
public class Superheroe {

	private String Nombre;
	private String Descripcion;
	private boolean Capa;
	
	
		
	public Superheroe(String nombre, String descripcion, boolean capa) {
		
		super();
		Nombre = nombre;
		Descripcion = descripcion;
		Capa = capa;
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
	
	
	
	
	
	
}
