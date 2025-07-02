package clase02;
import java.util.Scanner;

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
		pr.PromedioEdad(p);
		System.out.println("--------------------------------");
		pr.eliminaNombre("Diana", p);
		System.out.println("--------------------------------");
		p.Mostrar();
		pr.modifica("Jason", p);
		p.Mostrar();
	}
	public void PromedioEdad(Pila p) {
		Pila paux = new Pila(p.max);
		float pro,su = 0 ,n = 0;
		while(!p.esVacia()) {
			Mascota x = p.eliminar();
			paux.adicionar(x);
			n = n + 1;
			su = su + x.getEdad();
		}
		
		p.Vaciar(paux);
		System.out.println("la suma es" + su);
		pro = su/n;
		System.out.println("promedio" + pro);
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
	
	public void eliminaNombre(String nom, Pila p) {
	    Pila paux = new Pila(p.max);
	    boolean sw = false;

	    while (!p.esVacia()) {
	        Mascota x = p.eliminar();

	        if (x.getNombre().equals(nom)) {
	            sw = true; 
	        } else {
	            paux.adicionar(x); 
	        }
	    }

	    p.Vaciar(paux); 

	    if (!sw) {
	        System.out.println("No hay mascotas con ese nombre");
	    } 
	}
	
	public void modifica(String nom, Pila p) {
		Scanner lee = new Scanner(System.in);
		Pila paux = new Pila(p.max);
		boolean sw = false;
		while(!p.esVacia()) {
			Mascota x= p.eliminar();
			if(x.getNombre().equals(nom)) {
				System.out.println("Los datos son: ");
				x.mostrarMascota();
				sw = true;
				System.out.println("Escriba raza,el sexo y edad");
				String ra= lee.next();
				String se = lee.next();
				int ed = lee.nextInt();
				
				x.setEdad(ed);
				x.setRaza(ra);
				x.setSexo(se);
			}
			paux.adicionar(x);
			
		}
		p.Vaciar(paux);
		if(!sw) {
			System.out.println("No existe esa mascota");
		}
		
	}
	
	

}
