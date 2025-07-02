package Ejercicio_2;

public class Pila {
	public Jugador j[];
	public int tope;
	public int max;
	
	public Pila(int max) {
		this.tope = -1;
		this.max = max;
		j = new Jugador[this.max];
		
	}
	public boolean esVacia() {
		return this.tope == -1;
	}
	public boolean esLlena() {
		return this.tope == this.max;
	}
	public void adicionar(Jugador j) {
		if(this.esLlena()) {
			System.out.println("Pila llena");
		}
		else {
			this.tope++;
			this.j[this.tope] = j;
			
			
		}
		
	}
	public Jugador eliminar() {
		Jugador x ;
		if(this.esVacia()) {
			System.out.println("Pila Vacia");
			return null;
		}
		else {
			x = this.j[this.tope];
			this.tope--;
			return x;
		}
	}
	
	public void  mostrar() {
		Pila paux = new Pila(this.max);
		Jugador x;
		while(!esVacia()) {
			x = this.eliminar();
			paux.adicionar(x);
			System.out.println(x);
			
		}
		Vaciar(paux);
	}
	
	public void Vaciar(Pila p){
		Jugador x;
		while(!esVacia()) {
			 x =p.eliminar();
			 adicionar(x);
			 
		}
		
	}
}
