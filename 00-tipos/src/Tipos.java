import java.util.Arrays;

public class Tipos {
    public static Integer valorEstatico = 15;

    public static void main(String[] args) {
        int pago = 100000000;
        float porcentaje = 25f;
        double porcentajeDouble = 0;
        boolean esAccesible = false;

        System.out.println("pago        :"+pago);
        System.out.println("porcentaje:"+porcentaje);
        System.out.println("porcentajeDouble:"+porcentajeDouble);
        System.out.println("porcentajeDouble:"+esAccesible);

        Integer pagoObj = 1_000_000;
        Float porcentajeObj = 1_000_000f;
        Double porcentajeObjD = 1_000_000d;
        Boolean esAccesibleObj = true;

        System.out.println("pagoObj:"+pagoObj);
        System.out.println("porcentajeObj:"+porcentajeObj);
        System.out.println("porcentajeObjD:"+porcentajeObjD);
        System.out.println("esAccesibleObj:"+esAccesibleObj);

        Integer pagoObj2 = new Integer(12);
        Float porcentajeObj2 = Float.valueOf("1212");
        Boolean esAccesibleObj2 = Boolean.valueOf("true");
        String cadena = new String();
        String cadena2 = "valor string";
        char ascii = 253;

        System.out.println("pagoObj2:"+pagoObj2);
        System.out.println("porcentajeObj2:"+porcentajeObj2);
        System.out.println("cadena:"+cadena);
        System.out.println("cadena2:"+cadena2);
        System.out.println("ascii:"+ascii);
        System.out.println("esAccesibleObj2:"+esAccesibleObj2);

        StringBuilder cadena3 = new StringBuilder("inicial");
        StringBuffer cadena5 = new StringBuffer("inicial2");

        cadena3.append(" espacio ").append(" - ").append(" fin");
        cadena5.append(" espacio2 ").append(" - ").append(" fin2");
        String cadena4 = cadena3.toString();
        System.out.println("cadena4:"+cadena4);
        System.out.println("cadena5:"+cadena4);

        // staticos
        System.out.println("valorEstatico : "+valorEstatico);

        // constantes
        final boolean valorConstante = false;
        System.out.println("args = " + valorConstante);
    }
}
