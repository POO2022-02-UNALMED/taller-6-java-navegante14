package vehiculos;


public class Camioneta extends Vehiculo {
	boolean volco;
	private static int cantidadCamionetas;

	public Camioneta(String placa, int puertas, String nombre, int precio, float peso, Fabricante fabricante,boolean volco) {
		super(placa,puertas,90,nombre,precio, peso,"4X4",fabricante);
		this.volco=volco;
		Camioneta.cantidadCamionetas++;
		}
	
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public static int getCantidadCamionetas() {
		return cantidadCamionetas;
	}

	public static void setCantidadCamionetas(int cantidadCamionetas) {
		Camioneta.cantidadCamionetas = cantidadCamionetas;
	}
	
	
}
	
