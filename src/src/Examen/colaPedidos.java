package Examen;

public class colaPedidos {
    public Pedidos[] cp;
    public int frente, fin, max;

    public colaPedidos(int max) {
        this.cp = new Pedidos[max];
        this.frente = 0;
        this.fin = 0;
        this.max = max;
    }

    public int nroElementos() {
        return (this.fin - this.frente + this.max) % this.max;
    }

    public boolean esVacia() {
        return this.frente == this.fin;
    }

    public boolean esLlena() {
        
        return (this.fin + 1) % this.max == this.frente;
    }

    public void adicionar(Pedidos x) {
        if (esLlena()) {
            System.out.println("Cola llena");
        } else {
            this.fin = (this.fin + 1) % this.max;
            this.cp[this.fin] = x;
        }
    }

    public Pedidos eliminar() {
        if (esVacia()) {
            System.out.println("Cola vacía");
            return null;
        } else {
            this.frente = (this.frente + 1) % this.max;
            Pedidos x = this.cp[this.frente];
            return x;
        }
    }

    public void Mostrar() {
        Pedidos x;
        colaPedidos caux = new colaPedidos(this.max);
        while (!esVacia()) {
            x = eliminar();
            caux.adicionar(x);
            x.mostrarPedidos(); 
        }
        Vaciar(caux);
    }

    public void Vaciar(colaPedidos aux) {
        Pedidos x;
        while (!aux.esVacia()) {
            x = aux.eliminar();
            adicionar(x);
        }
    }
}
