package Conversiones;

public class Conversiones {
    public static void main(String[] args) {

        // String → int
        String edad = "25";
        int e = Integer.parseInt(edad);
        System.out.println("Edad: " + e);

        // String → double
        String valor = "15.75";
        double precio = Double.parseDouble(valor);
        System.out.println("Precio: " + precio);

        // Casting
        double promedio = 8.9;
        int nota = (int) promedio;
        System.out.println("Promedio original: " + promedio);
        System.out.println("Promedio convertido: " + nota);
    }
}
