package clase_uno;

public class Figura{

	private String código;
	private double precio;
	private Superheroe personaje;
	private Dimension dimensiones;
	
	public Figura(String nombre, String código, double precio, Superheroe personaje, Dimension dimensiones) {

		this.código = código;
		this.precio = precio;
		this.personaje = personaje;
		this.dimensiones = dimensiones;
	}

	public String getCódigo() {
		return código;
	}

	public void setCódigo(String código) {
		this.código = código;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Superheroe getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Superheroe personaje) {
		this.personaje = personaje;
	}

	public Dimension getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(Dimension dimensiones) {
		this.dimensiones = dimensiones;
	}

	@Override
	public String toString() {
		return "Figura [código=" + código + ", precio=" + precio + ", personaje=" + personaje + ", dimensiones="
				+ dimensiones + "]";
	}
	
	public void subirPrecio(double cantidad) {
		precio += cantidad;
	}
	
	
	
	
	
	
	
	
		//Investigar acerca del polimorfismo en herencia.
}
