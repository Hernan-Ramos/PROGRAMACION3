package participacion;

public class Cola {
    public Equipo cad[];
    public int frente;
    public int fin;
    public int max;

    public Cola(int max) {
        this.max = max;
        this.cad = new Equipo[this.max];
        this.frente = -1;
        this.fin = -1;
    }

    public boolean esVacia(){
        return this.frente == -1 && this.fin == -1;
    }

    public boolean esLlena(){
        return this.fin == this.max - 1;
    }

    public void adicionar(Equipo e){
        if(this.esLlena()){
            System.out.println("La cola está llena. No se puede adicionar.");
        } else {
            if(this.frente == -1){
                this.frente = 0;
            }
            this.fin++;
            this.cad[this.fin] = e;
        }
    }

    public Equipo eliminar(){
        if(this.esVacia()){
            System.out.println("La cola está vacía. No hay elementos para eliminar.");
            return null;
        } else {
            Equipo x = this.cad[this.frente];
            if(this.fin == this.frente){
                this.frente = -1;
                this.fin = -1;
            } else {
                this.frente++;
            }
            return x;
        }
    }

    public void Mostrar(){
        Cola caux = new Cola(this.max);
        Equipo e;
        while(!this.esVacia()){
            e = this.eliminar();
            caux.adicionar(e);
            e.Mostrar(); 
        }
        Vaciar(caux);
    }

    public void Vaciar(Cola c){
        while(!c.esVacia()){
            Equipo e = c.eliminar();
            this.adicionar(e);
        }
    }
}
