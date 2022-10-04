package vehiculos;

import java.util.ArrayList;

public class Vehiculo {
	String placa;
	int puertas;
	int velocidadMaxima;
	String nombre;
	int precio;
	float peso;
	String traccion;
	Fabricante fabricante;
	private static int CantidadVehiculos;
	private static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, float peso, String traccion, Fabricante fabricante) {
		this.placa=placa;
		this.puertas=puertas;
		this.velocidadMaxima=velocidadMaxima;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion=traccion;
		this.fabricante=fabricante;
		Vehiculo.CantidadVehiculos++;
		Vehiculo.vehiculos.add(this);
	}
	
	public String vehiculosPorTipo() {
		return "Automoviles: "+Automovil.getCantidadAutomoviles()+
				"Camionetas: #"+Camioneta.getCantidadCamionetas()+
				"Camiones: #"+Camion.getCantidadCamiones();
	}
	
	
	
	
	//getters y setters
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos = cantidadVehiculos;
	}

	public static ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public static void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		Vehiculo.vehiculos = vehiculos;
	}

}
