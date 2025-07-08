package clase_05;

public class Cola {
    public int max, fin, frente;
    public Producto[] p;

    public Cola(int max) {
        this.max = max;
        this.fin = -1;
        this.frente = -1;
        this.p = new Producto[this.max];
    }

    public void adicionar(Producto x) {
        if (esLlena()) {
            System.out.println("Cola llena");
        } else {
            fin++;
            if (frente == -1) {
                frente = 0;
            }
            p[fin] = x;
        }
    }

    public Producto eliminar() {
        if (esVacia()) {
            System.out.println("Cola vacía");
            return null;
        } else {
            Producto x = p[frente];
            if (frente == fin) {
               
                frente = -1;
                fin = -1;
            } else {
                frente++;
            }
            return x;
        }
    }

    public void mostrarCola() {
        Producto x;
        Cola caux = new Cola(this.max);
        while (!esVacia()) {
            x = eliminar();
            if (x != null) {
                caux.adicionar(x);
                x.mostrarProducto(); 
            }
        }
        Vaciar(caux);
    }

    public void Vaciar(Cola c) {
        while (!c.esVacia()) {
            Producto x = c.eliminar();
            if (x != null) {
                adicionar(x);
            }
        }
    }

    public boolean esVacia() {
        return frente == -1 && fin == -1;
    }

    public boolean esLlena() {
        return fin == max - 1;
    }
}
