package participacion;

public class Pila {
    public Jugador j[];
    public int tope;
    public int max;

    public Pila() {
    }

    public Pila(int max) {
        this.max = max;
        this.tope = -1;
        this.j = new Jugador[this.max];

    }
    public boolean esVacia (){
        if(this.tope == -1){
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean esLlena(){
        return this.max-1 == this.tope;
    }
    public void adicionar(Jugador x){
        if(esLlena()){
            System.out.println("la pila esta llena, no se puede adicionar otro elemento ");
        }else{
            tope++;
            this.j[this.tope] = x;

        }

    }
    public Jugador eliminar(){
        if(esVacia()){
            System.out.println("Pila vacia, no hay ellementos que eliminar");
            return null;
        }
        else{
         Jugador x = this.j[this.tope] ;
         tope--;
         return x;
        }
    }
    public void Mostrar(){
        Jugador x ;
        Pila paux = new Pila(this.max);
        while(!esVacia()){
            x = this.eliminar();
            paux.adicionar(x);
            x.mostrar();;
        }
        Vaciar(paux);
    }
    public void Vaciar(Pila p){

        while(!p.esVacia()){
          Jugador x = p.eliminar();
            adicionar(x);
        }

    }

}