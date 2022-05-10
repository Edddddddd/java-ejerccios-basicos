
public class ClasseEjemplo {
    public static void main(String[] args) {

        /**
         * Mascota
         */
        Mascota perrito = new Mascota();
        System.out.println("Mascota sin valores = "+perrito);

        Mascota gato = new Mascota(1, "gato", 60.50, "Juanito");
        System.out.println("Mascota sin valores = "+gato);


    }
}
