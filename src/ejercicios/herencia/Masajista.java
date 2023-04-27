package ejercicios.herencia;

public class Masajista extends Persona{
    private String trabajo;
    private int aniosExperiencia;

    public Masajista(String id, String nombre, String apellido, int edad, String trabajo, int aniosExperiencia) {
        super(id, nombre, apellido, edad);
        this.trabajo=trabajo;
        this.aniosExperiencia=aniosExperiencia;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
}
