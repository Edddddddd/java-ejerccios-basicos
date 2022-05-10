import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Decision {
    public static void main(String[] args) {

        /**
         * Explicar:
         * AND = &&
         * OR  = ||
         * negado = !
         * Listas vacias = lista.isEmpty()
         */

        Boolean estaPagado  = true;
        Boolean estaVencido = Boolean.FALSE;
        Boolean esAprobada = null;
        // funciona el AND
        if (estaPagado && !estaVencido) {
            System.out.println("Esta pagado y no esta vencido");
        } else {
            System.out.println("Alguna de las condiciones no es cumplida");
        }
        // Negado
        if (!(estaPagado && !estaVencido)) {
            System.out.println("Alguna de las condiciones no es cumplida");
        } else {
            System.out.println("Esta pagado y no esta vencido");
        }
        // OR
        if (estaPagado || !estaVencido) {
            System.out.println("Esta pagado o no esta vencido");
        } else {
            System.out.println("Alguna de las condiciones no es cumplida");
        }
        // validar nulos pd: si es posible una llegada de un null siempre evaluar primero
        if (esAprobada != null && esAprobada == true) {
            System.out.println("Esta aprobada");
        } else {
            System.out.println("Esta es null o no esta aprobada");
        }
        // validar listas pd: comparaciones de listas para saber el valor a valor se deben iterar o recorer por estructuras loop
        List<Integer> listaNumerosPrimos = Arrays.asList();
        if (listaNumerosPrimos.isEmpty()) {
            System.out.println("Lista de numeros primos se encuentra vacia");
        } else {
            System.out.println("Lista de numeros primos no se encuentra vacia");
        }
        // validar contenido solo para tipos primitivos o Objetos basicos funciona bien
        listaNumerosPrimos = Arrays.asList(1,3,5,7,9,11);
        if (listaNumerosPrimos.contains(1)) {
            System.out.println("1 es parte del la lista");
        } else {
            System.out.println("1 no es parte de la lista");
        }

        // validar Strings
        String nombre = "Angello";
        if ("Angello".equals(nombre)){
            System.out.println("nombre es igual sensible");
        }
        nombre = "mauricio";
        if ("Mauricio".equalsIgnoreCase(nombre)) {
            System.out.println("nombre es igual no sensible");
        }
        String prefijo = "Cri";
        if ("Cristian".startsWith(nombre)) {
            System.out.println("nombre es comienza con Ma");
        }

        // if else pd: recomendado si tienes las condiciones definidas y no más de 3 consecutivas.
        if (estaPagado)
        {
            System.out.println("esta pagado");
        } else if (esAprobada) {
            System.out.println("no esta aprobado");
        } else if (estaVencido) {
            System.out.println("no esta aprobado");
        }

        //switch pd: recomendado para casos donde se saben todos los valores posibles y que hacer en caso por defecto
        int valor = 1;
        switch (valor) {
            case 1:
                System.out.println(" Es 1 ");
                break;
            case 2:
                System.out.println(" Es 2 ");
                break;
            default:
                System.out.println("Caso defecto no es 1 ni 2");
        }

        // NOTA: Opinion y estandar
        esAprobada = false;
        estaPagado = false;
        /**
         * Necesitamos hacer unos calculos pero es posible que nos encontremos con casos bordes o de error por ejemplo:
         * 1 ) no se encuentre pagado
         * 2 ) no este aprobado un pago
         */
        if (!estaPagado) {
            System.out.println("no esta pagado (paguen luego plis jajaj)");
            // return;
        }
        if (!esAprobada) {
            System.out.println("no esta aprobado el pago");
        }

    }
}
