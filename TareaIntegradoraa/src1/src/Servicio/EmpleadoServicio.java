package Servicio;


import Modelo.Empleado;
import Modelo.Medico;
import Modelo.Administrativo;

import java.util.ArrayList;

public class EmpleadoServicio {

    private ArrayList<Empleado> lista = new ArrayList<>();

    // CREATE
    public boolean agregarEmpleado(Empleado empleado) {

        if (buscarPorCedula(empleado.getCedula()) != null) {
            return false;
        }

        lista.add(empleado);
        return true;
    }

    // READ
    public void mostrarEmpleados() {

        if (lista.isEmpty()) {
            System.out.println("No existen registros.");
            return;
        }

        for (Empleado e : lista) {
            System.out.println("---------------------");
            e.mostrarInformacion();
        }
    }

    // SEARCH
    public Empleado buscarPorCedula(String cedula) {

        for (Empleado e : lista) {

            if (e.getCedula().equals(cedula)) {
                return e;
            }
        }

        return null;
    }

    // UPDATE
    public boolean reemplazarEmpleado(String cedula, Empleado nuevo) {

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getCedula().equals(cedula)) {

                lista.set(i, nuevo);
                return true;
            }
        }

        return false;
    }

    // DELETE
    public boolean eliminarEmpleado(String cedula) {

        Empleado e = buscarPorCedula(cedula);

        if (e != null) {
            lista.remove(e);
            return true;
        }

        return false;
    }

    // ESTADÍSTICAS
    public void mostrarEstadisticas() {

        int totalMedicos = 0;
        int totalAdministrativos = 0;

        double pagoMedicos = 0;
        double pagoAdministrativos = 0;

        Empleado mayor = null;

        for (Empleado e : lista) {

            if (e instanceof Medico) {
                totalMedicos++;
                pagoMedicos += e.calcularPago();
            }

            if (e instanceof Administrativo) {
                totalAdministrativos++;
                pagoAdministrativos += e.calcularPago();
            }

            if (mayor == null ||
                    e.calcularPago() > mayor.calcularPago()) {

                mayor = e;
            }
        }

        System.out.println("===== ESTADÍSTICAS =====");
        System.out.println("Total médicos: " + totalMedicos);
        System.out.println("Total administrativos: " + totalAdministrativos);
        System.out.println("Total empleados: " + lista.size());

        System.out.println("Pago total médicos: " + pagoMedicos);
        System.out.println("Pago total administrativos: " + pagoAdministrativos);

        if (mayor != null) {
            System.out.println("Empleado con mayor ingreso:");
            mayor.mostrarInformacion();
        }
    }
}
