package participacion;
public class PilaJugadores {
    public static void main(String[] args) {
        Pila p = new Pila(3);
        Pila p1 = new Pila(3);
        Jugador j1 = new Jugador("Diego", "12345", "Masculino", 19, "Delantero");
        Jugador j2 = new Jugador("jhoana","14683678", "Femenino", 19, "Centro");
        Jugador j3 = new Jugador("Cris","190467", "Masculino", 18, "Defensa");
        Jugador j4 = new Jugador("Gus","18934789", "Masculino", 17, "Centro");
        Jugador j5 = new Jugador("Ana","1904567", "Femenino", 18, "Defensa");
        Jugador j6 = new Jugador("Maria","834789", "Femenino", 17, "Centro");
        p.adicionar(j1);
        p.adicionar(j2);
        p.adicionar(j3);
        p1.adicionar(j4);
        p1.adicionar(j5);
        p1.adicionar(j6);
        
    	Equipo e1 = new Equipo("Umsa", "Futbol","senior",2000,p);
    	Equipo e2 = new Equipo("Bolivia", "Futsal","master",2010,p1);
    	
    	Cola equi = new Cola(10);
    	equi.adicionar(e1);
    	equi.adicionar(e2);

        //p.Mostrar();
        //System.out.println("----------------------------");
        PilaJugadores pj = new PilaJugadores();
        //pj.EliminarporEdad(p);
        //System.out.println("---------------------------");
        //pj.crearPilaMasculino(p);
        pj.mostrarSexoEquipoDisciplina("masculino", "Umsa", "Futbol", equi);

    }
    public void EliminarporEdad(Pila p){
        Jugador x;
        Pila paux = new Pila(p.max);
        boolean sw = false;
        while(!p.esVacia()){
            x = p.eliminar();

            if(x.getEdad()<18){
                sw = true;

            }else{
                paux.adicionar(x);
            }
        }
        p.Vaciar(paux);
        if(!sw){
            System.out.println("No hay ningun Jugador menor de 18");
        }else{
            System.out.println("se elimino al siguiente jugador menor de 18 " );
        }
        System.out.println("Pila actualizada:");
        p.Mostrar();
    }

    public void crearPilaMasculino(Pila p){
        Pila mas = new Pila(p.max);
        Pila paux = new Pila(p.max);
        while(!p.esVacia()){
            Jugador x = p.eliminar();
            if(x.getSexo().equals("Masculino")){
                mas.adicionar(x);
            }else{
                paux.adicionar(x);

            }

        }
        p.Vaciar(paux);
        System.out.println("pila masculino");
        mas.Mostrar();
        System.out.println("pila femenino");
        p.Mostrar();
    }
    public void mostrarSexoEquipoDisciplina(String s, String nomEquipo, String disciplina, Cola c) {
        Equipo x;
        Cola aux = new Cola(c.max);
        boolean sw = false;

        while (!c.esVacia()) {
            x = c.eliminar();
            aux.adicionar(x);

            if (x.nomEquipo.equalsIgnoreCase(nomEquipo) && x.disciplina.equalsIgnoreCase(disciplina)) {
                System.out.println(" Equipo: " + x.nomEquipo + " Disciplina: " + x.disciplina);
                Pila jugadores = x.jugadores;
                Pila paux = new Pila(jugadores.max);
                System.out.println("🔍 Jugadores con sexo " + s + ":");

                while (!jugadores.esVacia()) {
                    Jugador j = jugadores.eliminar();
                    paux.adicionar(j);

                    if (j.getSexo().equalsIgnoreCase(s)) {
                        j.mostrar(); 
                        sw = true;
                    }
                }

                jugadores.Vaciar(paux);
            }
        }

        c.Vaciar(aux);

        if (!sw) {
            System.out.println(" No se encontraron jugadores con sexo " + s + " en el equipo y disciplina especificados.");
        }
    }

    	
    	
    	
}
    

