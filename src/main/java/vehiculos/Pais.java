package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	
	
	public Pais(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//metodos
	public static Pais paisMasVendedor() {
		ArrayList<String> pais2 = new ArrayList<String>();
		ArrayList<Integer> contador = new ArrayList<Integer>();
		for (Vehiculo i: Vehiculo.getVehiculos()) {
			
			if (pais2.contains(i.fabricante.getPais().getNombre())) {
			}
			else {
				pais2.add(i.fabricante.getPais().getNombre());
				int cont=0;
				for (Vehiculo j: Vehiculo.getVehiculos()) {
					if (i.fabricante.getPais().getNombre().equals(j.fabricante.getPais().getNombre())) {
						cont++;
					}	
				}
				contador.add(cont);
			}
		}
		//hallar mayor de contador
		int mayor=0;
		int temp=0;
		int index = 0;
		for ( Integer k:contador) {
			
			if (k>mayor) {
				mayor=k;
				index=temp;
			}
			temp++;
		}
		//encontrar la coincidencia en la lista pais2
		String nombre=pais2.get(index);
		Pais a=new Pais(nombre);
		return a;
		}
	
}
