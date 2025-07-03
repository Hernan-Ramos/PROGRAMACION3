package clase_03;

public class Propietario {
	public String nombre;
	public String direccion;
	public String carnet;
	public int edad;
	public String genero;
	public Pila mascotas;
	
	public Propietario(String nombre,String direccion, String carnet, int edad, String genero, Pila mascotas ) {
		super();
		this.nombre = nombre;
		this.carnet = carnet;
		this.edad = edad;
		this.genero = genero;
		this.direccion = direccion;
		this.mascotas = mascotas;
	}


	public void mostrar() {
		System.out.println( "Propietario [nombre=" + nombre + ", direccion=" + direccion + ", carnet=" + carnet + ", edad=" + edad
				+ ", genero=" + genero + ", mascotas=" + mascotas + "]");
		this.mascotas.Mostrar();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
