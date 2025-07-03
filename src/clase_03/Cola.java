package clase_03;

public class Cola {
	public String cad[]; 
	public int frente; 
	public int fin;
	public int max;
	
	public Cola(int max) {
		this.max = max;
		this.cad = new String[this.max];
		this.frente = -1;
		this.fin = -1;
		
	}
	
	public boolean esVacia(){
		return this.frente == -1 && this.fin== -1;
	}
	
	public boolean esLlena() {
		return this.fin == this.max-1;
	}
	
	public void adicionar(String s) {
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
	public String eliminar() {
	    if (this.esVacia()) {
	        return "No se puede eliminar, no hay elementos";
	    } else {
	        String x = this.cad[this.frente];
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
		Cola caux = new Cola(this.max);
		String s;
		while(!this.esVacia()) {
			s = this.eliminar();
			caux.adicionar(s);
			System.out.println(s);
			
		}
		Vaciar(caux);
		
	}
	public void Vaciar(Cola c) {
		String s;
		while(!c.esVacia()) {
			s = c.eliminar();
			this.adicionar(s);
		}
	}
	
	
	
	
	
	
	
}
