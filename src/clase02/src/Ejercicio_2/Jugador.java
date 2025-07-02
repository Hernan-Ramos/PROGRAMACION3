package Ejercicio_2;

public class Jugador {
	public String carnet;
	public String nombre;
	public String sexo;
	public int edad;
	public String posicion;
	public Jugador(String carnet, String nombre,int edad, String sexo, String posicion) {
		super();
		this.carnet = carnet;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.posicion = posicion;
	}
	public String getCarnet() {
		return carnet;
	}
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Jugador [carnet=" + carnet + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", posicion="
				+ posicion + "]";
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	
}
