package src.core;
import java.util.List;

public class LibroHabilidades {

    private List<Habilidad> habilidades;

    public LibroHabilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }
}