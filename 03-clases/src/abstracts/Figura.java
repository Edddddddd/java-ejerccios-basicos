package abstracts;

public abstract class Figura {
    private int numeroLados;

    public Figura() {
        this.numeroLados = 0 ;
    }

    public abstract float area();

    // get and set
    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }
}
