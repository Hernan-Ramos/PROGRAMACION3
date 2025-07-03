package clase_03;

public class Pila {
    public Mascota p[];
    public int tope;
    public int max;

    public Pila(int max) {
        this.max = max;
        tope=-1;
        p=new Mascota[max];
    }
    public boolean esVacia()
    {
        if(tope==-1)
            return true;
        else
            return false;
    }
    public boolean esLlena()
    {
        if(tope+1==max)
            return true;
        else
            return false;
    }
    public void adicionar( Mascota x){
        if(esLlena())
            System.out.println("Pila llena");
        else {
            tope=tope+1;
            p[tope]=x;
    }
    }
    public Mascota eliminar()
    {
        Mascota x=new Mascota();
        if(esVacia())
            System.out.println("Pila Vacia");
        else {
            x=p[tope];
            tope=tope-1;
        }
        return x;
    }
    public void Mostrar()
    {
        Pila paux=new Pila(max);
        while (!esVacia())
        {
            Mascota x=eliminar();
            x.mostrarMascota();
            paux.adicionar(x);
        }
        Vaciar(paux);
    }
    public void Vaciar(Pila p)
    {
        while (!p.esVacia()){
            Mascota x=p.eliminar();
            adicionar(x);
        }
    }
}
