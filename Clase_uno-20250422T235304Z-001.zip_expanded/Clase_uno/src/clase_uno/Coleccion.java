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

	public String conCapa() {
		String conCapa = "";
		for(Figura f : listaFiguras) {
			if(f.getPersonaje().isCapa()) {
				conCapa += f.toString();
				conCapa += " | ";
			}
		}
		return conCapa;

	}
	
	
	public Figura masValiosa() {
		Figura masValiosa = listaFiguras.get(0);
		for(Figura f : listaFiguras) {
			if(f.getPrecio() > masValiosa.getPrecio()) {
				masValiosa = f;
			}
		}
		return masValiosa;
	}
	
	public double valorColeccion() {
		double precioTotal = 0;
		for(Figura f :listaFiguras) {
			precioTotal += f.getPrecio();
		}
		return precioTotal;
	}
	
	
	public double volumenTotal() {
		double volumenAprox = 0;
		for(Figura f : listaFiguras) {
			volumenAprox += f.getDimensiones().getVolumen();
		}
		return volumenAprox + 200;
	}
	

}
	
	