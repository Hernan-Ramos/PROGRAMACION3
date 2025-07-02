package clase02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mascota m1 = new Mascota("Jason","salchicha","macho", 5);
		Mascota m2 = new Mascota("Diana","doberman","hembra", 6);
		Pila p = new Pila(4);
		p.adicionar(m1);
		p.adicionar(m2);
		p.Mostrar();
		System.out.println("--------------------------------");
		Principal pr = new Principal();
		pr.mostrarRaza("salchicha", p);
		System.out.println("--------------------------------");
		pr.mostrarEdadMenor(7, p);
	}
	
	public void mostrarRaza(String r, Pila p) {
		Pila paux = new Pila(p.max);
		boolean sw = false;
		while(!p.esVacia()){
			Mascota x = p.eliminar();
			paux.adicionar(x);
			if(x.getRaza().equals(r)) {
				x.mostrarMascota();
				sw = true;
			}
		}
		if (!sw) {
			System.out.println("No hay mascotas de esa raza");
		
		}
		p.Vaciar(paux);
	}
	
	public void mostrarEdadMenor(int e, Pila p) {
		Pila paux = new Pila(p.max);
		boolean sw = false;
		while(!p.esVacia()) {
			
			Mascota x = p.eliminar();
			paux.adicionar(x);
			if(x.getEdad()< e) {
				x.mostrarMascota();
				sw= true;
			}
			
		}
		if(!sw) {
			System.out.println("No hay mascotas de esa edad");
			
		}
		p.Vaciar(paux);
	}

}
