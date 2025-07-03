package clase_03;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mascota m1 = new Mascota("Jason","salchicha","macho", 5);
		Mascota m2 = new Mascota("Diana","doberman","hembra", 6);
		Mascota m3 = new Mascota("Eslinkie","salchicha","macho", 5);
		Mascota m4 = new Mascota("Peluza","meztizo","hembra", 6);
		
		Pila p1 = new Pila(4);
		Pila p2 = new Pila(4);
		p1.adicionar(m1);
		p1.adicionar(m2);
		p2.adicionar(m3);
		p2.adicionar(m4);
		p1.Mostrar();
		p2.Mostrar();
		System.out.println("--------------------------------");
		Principal pr = new Principal();
		pr.mostrarRaza("salchicha", p1);
		System.out.println("--------------------------------");
		pr.mostrarEdadMenor(7, p1);
		Propietario pr1 = new Propietario("Diego","Calle f", "1234", 18,"Masculino", p1 );
		Propietario pr2 = new Propietario("Gus","Calle f", "5634", 18,"Masculino", p1 );
		Propietario pr3 = new Propietario("Jhoana","Calle f", "9934", 18,"Femenino", p1 );
		ColaP x = new ColaP(5);
		x.adicionar(pr1);
		x.adicionar(pr2);
		x.adicionar(pr3);
		
		x.Mostrar();
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
