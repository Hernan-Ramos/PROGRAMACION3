package clase02;

public class Pila {
	public Mascota p[];
	public int tope;
	public int max;
	
	public Pila(int max) {
		this.max = max;
		this.tope = -1;
		p = new Mascota[max];
		
	}
	public boolean esLlena() {
		return tope+1==max;
	}
	public boolean esVacia() {
		return this.tope == -1;
	}
	
	public void adicionar(Mascota x) {
		if(this.esLlena()) {
			System.out.println("Pila llena");
		}else {
			tope++;
			this.p[this.tope] = x;
			
		}
	}
	
	public Mascota eliminar() {
		Mascota m ;
		if(this.esVacia()) {
			System.out.println("pila vacia");
			return null;
		}else {
			m = this.p[this.tope];
			this.tope--;
			return m;
			
		}
	}
	
	public void Mostrar() {
	    Pila aux = new Pila(this.max);
	    Mascota n;
	    while(!esVacia()) {
	        n = this.eliminar();
	        System.out.println(n);
	        aux.adicionar(n);
	    }
	    this.Vaciar(aux);  // Restaura la pila original
	}

	public void Vaciar(Pila p ) {
		while(!p.esVacia()) {
			Mascota m;
			m = p.eliminar();
			adicionar(m);
		}
	}
}
