package clase_05;

public class Main {
	public static void main(String[] args) {

		Cola colaProductos = new Cola(5);

		Producto prod1 = new Producto("Leche", "si", 10, 2, 2025);
		Producto prod2 = new Producto("Pan", "si", 5, 10, 2024);
		Producto prod3 = new Producto("Arroz", "si", 15, 5, 2026);
		Producto prod4 = new Producto("Aceite", "no", 20, 3, 2025);
		Producto prod5 = new Producto("Jugo", "no", 8, 6, 2024);

		colaProductos.adicionar(prod1);
		colaProductos.adicionar(prod2);
		colaProductos.adicionar(prod3);
		colaProductos.adicionar(prod4);
		colaProductos.adicionar(prod5);

		System.out.println("=== Cola ORIGINAL ===");
		colaProductos.mostrarCola();

		Main m1 = new Main();
		
		System.out.println("\n=== Cola después de mover al principio los productos con año 2025 ===");
		//colaProductos.mostrarCola();
		m1.llevarlPrincipioanioX(2025, colaProductos);

		System.out.println("------------------------");
		m1.mostrarEstadoSi(colaProductos);
	}

	public void llevarlPrincipioanioX(int anio, Cola c) {
		Producto x;
		Cola caux = new Cola(c.max);
		Cola aux1 = new Cola(c.max);

		while (!c.esVacia()) {
			x = c.eliminar();
			if (x.aniodevec == anio) {
				caux.adicionar(x);
			} else {
				aux1.adicionar(x);
			}
		}
		c.Vaciar(caux);
		c.Vaciar(aux1);
		c.mostrarCola();
	}
	public void mostrarEstadoSi(Cola c) {
		Producto x;
		Cola caux = new Cola(c.max);
		boolean sw = false;
		while (!c.esVacia()) {
			x = c.eliminar();
			caux.adicionar(x);
			if (x.getEstado().equalsIgnoreCase("SI")) {
				x.mostrarProducto();
				sw = true;
			}
		}
		c.Vaciar(caux);
		if(!sw) {
			System.out.println("no se encontro producto de estado SI");
		}
	
	}
}
