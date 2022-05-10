package abstracts;

public class Circulo extends Figura{

    private float radio  = 0f;

    @Override
    public float area() {
        return 0;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
}
