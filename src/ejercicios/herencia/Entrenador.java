package ejercicios.herencia;

public class Entrenador extends Persona{
    private String idFederacion;

    public Entrenador(String id, String nombre, String apellido, int edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion=idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }
}
