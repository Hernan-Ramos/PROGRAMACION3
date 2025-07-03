package clase_03;

public class ColaP {
	public Propietario cad[]; 
	public int frente; 
	public int fin;
	public int max;
	
	public ColaP(int max) {
		this.max = max;
		this.cad = new Propietario[this.max];
		this.frente = -1;
		this.fin = -1;
		
	}
	
	public boolean esVacia(){
		return this.frente == -1 && this.fin== -1;
	}
	
	public boolean esLlena() {
		return this.fin == this.max-1;
	}
	
	public void adicionar(Propietario s) {
		if(this.esLlena()) {
			System.out.println("Cola llena no se puede adicionar");
		}
		else {
            if (this.frente == -1) { 
                this.frente = 0;
            }
            this.fin++;
            this.cad[this.fin] = s;
            
        
		}
	}
	public Propietario eliminar() {
	    if (this.esVacia()) {
	    	System.out.println("No se puede eliminar, no hay elementos");
	        return null;
	    } else {
	        Propietario x = this.cad[this.frente];
	        if (this.fin == this.frente) {
	            this.frente = -1;
	            this.fin = -1;
	        } else {
	            this.frente++;
	        }
	        return x;
	    }
	}
	
	public void Mostrar() {
		ColaP caux = new ColaP(this.max);
		Propietario s;
		while(!this.esVacia()) {
			s = this.eliminar();
			caux.adicionar(s);
			System.out.println(s);
			
		}
		Vaciar(caux);
		
	}
	public void Vaciar(ColaP c) {
		Propietario s;
		while(!c.esVacia()) {
			s = c.eliminar();
			this.adicionar(s);
		}
	}
	
	
	
	
	
	
	
}
