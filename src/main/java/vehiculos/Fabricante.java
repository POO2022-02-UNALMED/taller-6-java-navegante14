package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	
	
	public Fabricante(String nombre) {
		this.nombre=nombre;
	}
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	//metodos
	
	public static Fabricante fabricaMayorVentas() {
		ArrayList<String> fabricante = new ArrayList<String>();
		ArrayList<Integer> contador = new ArrayList<Integer>();
		for (Vehiculo i: Vehiculo.getVehiculos()) {
			
			if (fabricante.contains(i.fabricante.getNombre())) {
			}
			else {
				fabricante.add(i.fabricante.getNombre());
				int cont=0;
				for (Vehiculo j: Vehiculo.getVehiculos()) {
					if (i.fabricante.getNombre().equals(j.fabricante.getNombre())) {
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
		
		String nombre=fabricante.get(index);
		Fabricante a=new Fabricante(nombre);
		return a;
		}
	}


