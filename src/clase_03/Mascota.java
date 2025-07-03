package clase_03;

public class Mascota {
	private String nombre;
	private String raza;
	private String sexo;
	private int edad;
	
	public Mascota() {
		
	}
	public Mascota(String nombre, String raza, String sexo, int edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.sexo = sexo;
		this.edad = edad;
	}
	
	public void mostrarMascota() {
		System.out.println("Mascota [nombre=" + nombre + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad + "]");
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
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
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad + "]";
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	

}