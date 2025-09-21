package src.core;
public class Habilidad {

    private String nombre;
    private int poder;
    private int costoStamina;

    public Habilidad(String nombre, int poder, int costoStamina) {
        this.nombre = nombre;
        this.poder = poder;
        this.costoStamina = costoStamina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getCostoStamina() {
        return costoStamina;
    }

    public void setCostoStamina(int costoStamina) {
        this.costoStamina = costoStamina;
    }
}
