package Examen;

public class pilaPlato {
	public Plato[] pp;
	public int tope,max;
	public pilaPlato(int max) {
		this.max = max;
		this.pp = new Plato[this.max];
		this.tope = -1;
		
	}
	public boolean esVacia() {
		return this.tope == -1;
	}
	public boolean esLlena() {
		return this.tope == this.max-1;
	}
	public void adicionar(Plato x) {
		if(esLlena()) {
			System.out.println("pila llena");
		}else {
			this.tope++;
			this.pp[this.tope] = x;
			
		}
	}
	public Plato eliminar() {
		if(esVacia()) {
			System.out.println("pila vacia");
			return null;
		}else {
			Plato x = this.pp[this.tope];
			this.tope--;
			return x;
		}
	}
	public void mostrarPila() {
		Plato x;
		pilaPlato paux = new pilaPlato(this.max);
		while(!esVacia()) {
			x = eliminar();
			paux.adicionar(x);
			x.mostrarPlato();
		}
		Vaciar(paux);
	}
	public void Vaciar(pilaPlato p) {
		Plato x;
		while(!p.esVacia()) {
			x = p.eliminar();
			adicionar(x);
		}
	}
	
	
	
	

}
