package Examen;

public class Main {

    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Diego", "123345");
        Cliente c2 = new Cliente("Hernán", "45345");
        Cliente c3 = new Cliente("María", "78345");
        Cliente c4 = new Cliente("Ana", "98345");
        Cliente c5 = new Cliente("Carlos", "54321");

        
        Plato pt1 = new Plato("Chicharrón", 20);
        Plato pt2 = new Plato("Sajta", 30);
        Plato pt3 = new Plato("Pique Macho", 20);
        Plato pt4 = new Plato("Asado", 40);
        Plato pt5 = new Plato("Empanada", 10);
        Plato pt6 = new Plato("Lomo Saltado", 35);
        
        
        pilaPlato pi1 = new pilaPlato(10);
        pi1.adicionar(pt1);
        pi1.adicionar(pt2);
        pi1.adicionar(pt3);

        pilaPlato pi2 = new pilaPlato(10);
        pi2.adicionar(pt4);
        pi2.adicionar(pt5);

        pilaPlato pi3 = new pilaPlato(10);
        pi3.adicionar(pt6);
        pi3.adicionar(pt2);

       
        Pedidos p1 = new Pedidos(3, c1, pi1);
        Pedidos p2 = new Pedidos(2, c2, pi2);
        Pedidos p3 = new Pedidos(2, c3, pi3);
        Pedidos p4 = new Pedidos(1, c4, pi1);
        Pedidos p5 = new Pedidos(1, c5, pi3);

        
        colaPedidos cp = new colaPedidos(11);
        cp.adicionar(p1);
        cp.adicionar(p2);
        cp.adicionar(p3);
        cp.adicionar(p4);
        cp.adicionar(p5);

        
        Main m = new Main();
        m.calcularMontoPagar(cp);
    }

    
    public void calcularMontoPagar(colaPedidos c) {
        int suma = 0;
        colaPedidos caux = new colaPedidos(c.max);
        while (!c.esVacia()) {
            Pedidos x = c.eliminar();
            caux.adicionar(x);

            suma = 0; 
            pilaPlato pedidos = x.pp;
            pilaPlato paux = new pilaPlato(pedidos.max);

            while (!pedidos.esVacia()) {
                Plato t = pedidos.eliminar();
                suma += t.getPrecio();
                paux.adicionar(t); 
            }

            pedidos.Vaciar(paux);
            System.out.println("Monto total a pagar por el pedido de " + x.cli.getNombre() + ": " + suma);
        }

        c.Vaciar(caux); 
    }
}
