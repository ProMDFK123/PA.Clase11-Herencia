package ejercicios.herencia;

public class SistemaImpl implements Sistema{
    private EquipoFutbol listaEquipos;

    public SistemaImpl(){
        this.listaEquipos = new EquipoFutbol("Lakers",20);
        menu();
    }

    public void menu(){
        System.out.println("Welcome to Los Angeles Lakers");
        Persona jugador = new Futbolista("1839","Carmelo","Anthony", 30,"Base");
        this.listaEquipos.agregarPersona(jugador);
        this.listaEquipos.imprimir();
    }
    @Override
    public void agregarEquipo() {

    }
}
