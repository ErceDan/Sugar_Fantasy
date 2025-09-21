package src.core;
public class HeroeFamily {

    private String nombre;
    private Habilidad habilidad;

    public HeroeFamily(String nombre, Habilidad habilidad) {
        this.nombre = nombre;
        this.habilidad = habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }

}
