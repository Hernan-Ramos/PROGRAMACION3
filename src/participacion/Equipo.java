package participacion;

public class Equipo {
	public String nomEquipo, disciplina,categoria;
	public int anio;
	public Pila jugadores;
	public Equipo(String nomEquipo, String disciplina, String categoria, int anio, Pila jugadores) {
		super();
		this.nomEquipo = nomEquipo;
		this.disciplina = disciplina;
		this.categoria = categoria;
		this.anio = anio;
		this.jugadores = jugadores;
	}
	
	public void Mostrar() {
	    System.out.println("Información del equipo:");
	    System.out.println("Nombre del equipo: " + this.nomEquipo);
	    System.out.println("Disciplina: " + this.disciplina);
	    System.out.println("Categoría: " + this.categoria);
	    System.out.println("Año de participación: " + this.anio);
	    System.out.println("Jugadores:");

	    if (this.jugadores != null) {
	        this.jugadores.Mostrar(); 
	    } else {
	        System.out.println("No hay jugadores registrados en el equipo.");
	    }
	}

	public String getNomEquipo() {
		return nomEquipo;
	}

	public void setNomEquipo(String nomEquipo) {
		this.nomEquipo = nomEquipo;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Pila getJugadores() {
		return jugadores;
	}

	public void setJugadores(Pila jugadores) {
		this.jugadores = jugadores;
	}

	
	
	
	
}
