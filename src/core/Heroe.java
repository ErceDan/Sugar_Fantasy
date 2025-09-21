package src.core;
public class Heroe {

    private String nombre;
    private int vida;
    private int stamina;
    private int resistencia;
    private int experiencia;
    private int nivel;
    private HeroeFamily heroeFamily;
    private LibroHabilidades libroHabilidades;

    public Heroe(int experiencia, HeroeFamily heroeFamily, LibroHabilidades libroHabilidades, int nivel, String nombre, int resistencia, int stamina, int vida) {
        this.experiencia = experiencia;
        this.heroeFamily = heroeFamily;
        this.libroHabilidades = libroHabilidades;
        this.nivel = nivel;
        this.nombre = nombre;
        this.resistencia = resistencia;
        this.stamina = stamina;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public HeroeFamily getHeroeFamily() {
        return heroeFamily;
    }

    public void setHeroeFamily(HeroeFamily heroeFamily) {
        this.heroeFamily = heroeFamily;
    }

    public LibroHabilidades getLibroHabilidades() {
        return libroHabilidades;
    }
}
