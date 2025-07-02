package Ejercicio_2;


public class PilaJugadores {
	public static void main(String[] args) {
		Jugador j1 = new Jugador("123456","Diego",15,"Masculino","Delantero");
		Jugador j2 = new Jugador("234444","Hernan",18,"Masculino","Defensa");
		Jugador j3 = new Jugador("233445","Cris",18,"Masculino","Centro");
		Jugador j4 = new Jugador("125678","Jhoana",18,"Femenino","Delantero");
		Jugador j5 = new Jugador("178899","Sara",18,"Femenino","Centro");
		
		Pila p1 = new Pila(10);
		p1.adicionar(j1);
		p1.adicionar(j2);
		p1.adicionar(j3);
		p1.adicionar(j4);
		p1.adicionar(j5);
		PilaJugadores pj =new PilaJugadores();
		pj.EliminarEdad(p1);
		
	}
	
	public void EliminarEdad(Pila p) {
		Pila paux = new Pila(p.max);
		boolean sw = false;

		while (!p.esVacia()) {
		    Jugador x = p.eliminar();

		        if (x.getEdad()< 18) {
		            sw = true; 
		        } else {
		            paux.adicionar(x); 
		        }
		    }

		    p.Vaciar(paux); 

		    if (!sw) {
		        System.out.println("No hay Jugadores de esa edad");
		    } 
		
	} 
	
	public void Pila2(Pila p) {
		Pila p2 = new Pila(p.max);
		Jugador m ;
		while(!p.esVacia()) {
			m = p.eliminar();
			if(m.getSexo().equals("masculino")) {
				p2.adicionar(m);
				
			}
		}
		
	}

}
