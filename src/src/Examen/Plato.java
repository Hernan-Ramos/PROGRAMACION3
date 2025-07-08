package Examen;

public class Plato {
	String nombre;
	int precio;
	public Plato(String nombre, int precio) {
		
		this.nombre = nombre;
		this.precio = precio;
	}
	public Plato() {
		
	}
	public void mostrarPlato() {
		System.out.println(" nombre del plato: " + this.nombre + " precio: " + this.precio);
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
	
	
}
