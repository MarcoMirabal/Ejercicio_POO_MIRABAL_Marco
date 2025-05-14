package clase_uno;

import java.util.ArrayList;

public class Coleccion {
	private String nombreColeccion;
	ArrayList<Figura> listaFiguras;
	public Coleccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
		this.listaFiguras = new ArrayList<Figura>();
		
	}
	public String getNombreColeccion() {
		return nombreColeccion;
	}
	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}
	


	public void añadirFigura(Figura fig) {
		listaFiguras.add(fig);
	}
	
	public void subirPrecio (double cantidad, int posicion) {
		listaFiguras.get(posicion).subirPrecio(cantidad);

	}
	@Override
	public String toString() {
		String lista = "";
		for (Figura f : listaFiguras) {
			lista += f.toString();
			lista += " | ";
		}
		return "Coleccion = Lista de Figuras: " + lista;
	}







}
	
	