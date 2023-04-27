package ejercicios.herencia;

public class Futbolista extends Persona{
    private String demarcacion;

    public Futbolista(String id, String nombre, String apellido, int edad, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.demarcacion=demarcacion;
    }

    public String getDemarcacion() {
        return demarcacion;
    }
}
