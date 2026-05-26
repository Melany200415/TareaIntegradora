package Util;

public class Validador {

    public static boolean validarCorreo(String correo) {

        return correo != null
                && correo.contains("@")
                && correo.contains(".");
    }

    public static boolean validarTelefono(String telefono) {

        return telefono.matches("\\d+");
    }

    public static boolean validarTexto(String texto) {

        return texto != null
                && !texto.trim().isEmpty();
    }

    public static boolean validarEdad(int edad) {

        return edad > 0 && edad < 150;
    }
}
