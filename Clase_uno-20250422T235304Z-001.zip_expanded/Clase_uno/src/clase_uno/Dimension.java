package clase_uno;

public class Dimension {
	
	private double alto;
	private double ancho;
	private double profundidad;
	
	
	


	public Dimension(double alto, double ancho, double profundidad) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
	}
	public Dimension() {
		this(0,0,0);
	}
	
	
	

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}
	
	
	
	public double getVolumen() {
		double volumen = alto * ancho * profundidad;
		return volumen;
				
	}
	
	@Override 
	public String toString() {
		return "Dimensiones : Alto = " + getAlto() + " / Ancho = " + getAncho() + " / Profundidad = " + getProfundidad() + " / Volumen máximo = " + getVolumen();
	}
	
	
	

}
