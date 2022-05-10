import interfaces.Animal;

import java.lang.*;

public class Mascota { // implements Animal
    // características
    private Integer edad;
    private String tipoAnimal;
    private Double estatura;
    private String nombre;

    //constructor
    public Mascota() {}

    public Mascota(Integer edad, String tipoAnimal, Double estatura, String nombre) {
        this.edad = edad;
        this.tipoAnimal = tipoAnimal;
        this.estatura = estatura;
        this.nombre = nombre;
    }

    //acciones de mascota
    public void emitirSonido() {
        System.out.println("miau");
    }

    public void correr() {
        System.out.println("corriendo");
    }

    public void dormir() {
        System.out.println("ZZZzzz.... -.-");
    }

    //get & setters
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //toStrings ejemplo
    @Override
    public String toString() {
        return "Mascota{" +
                "edad=" + edad +
                ", tipoAnimal='" + tipoAnimal + '\'' +
                ", estatura=" + estatura +
                '}';
    }
}