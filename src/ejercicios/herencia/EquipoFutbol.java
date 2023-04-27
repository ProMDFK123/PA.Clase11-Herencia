package ejercicios.herencia;

public class EquipoFutbol {
    private String nombre;
    private int cantActual;
    private int cantMax;
    private Persona[] listaPersonas;

    public EquipoFutbol(String nombre, int cantMax) {
        this.cantMax = cantMax;
        this.cantActual=0;
        this.listaPersonas = new Persona[cantMax];
        this.nombre= nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantActual() {
        return cantActual;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void agregarPersona(Persona persona){
        if(this.cantActual>=this.cantMax){
            System.out.println("Lista llena.");
            return;
        }
        this.listaPersonas[this.cantActual]=persona;
        this.cantActual++;
    }

    public void imprimir(){
        for(int i=0;i<this.cantActual;i++){
            Persona persona = this.listaPersonas[i];
            if(persona instanceof Futbolista){
                Futbolista futbolista = (Futbolista) persona;
                System.out.println(futbolista.getDemarcacion());
            } else if (persona instanceof Entrenador) {
                Entrenador entrenador = (Entrenador) persona;
                System.out.println(entrenador.getIdFederacion());
            }else if (persona instanceof Masajista){
                Masajista masajista = (Masajista) persona;
                System.out.println(masajista.getTrabajo());
            }

        }
    }
}
