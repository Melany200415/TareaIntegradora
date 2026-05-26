package app;
import Modelo.Empleado;
import Modelo.Medico;
import Modelo.Administrativo;
import Servicio.EmpleadoServicio;
import Util.Validador;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmpleadoServicio servicio = new EmpleadoServicio();

        int opcion = 0;

        do {

            try {

                System.out.println("\n===== CLÍNICA SALUD TOTAL =====");
                System.out.println("1. Registrar médico");
                System.out.println("2. Registrar administrativo");
                System.out.println("3. Mostrar empleados");
                System.out.println("4. Buscar por cédula");
                System.out.println("5. Reemplazar información");
                System.out.println("6. Eliminar registro");
                System.out.println("7. Calcular pagos");
                System.out.println("8. Mostrar estadísticas");
                System.out.println("9. Salir");

                System.out.print("Ingrese opción: ");

                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {

                    case 1:

                        System.out.print("Cédula: ");
                        String cedula = sc.nextLine();

                        if (servicio.buscarPorCedula(cedula) != null) {
                            System.out.println("Cédula repetida.");
                            break;
                        }

                        // NOMBRE
                        String nombre;

                        do {

                            System.out.print("Nombre: ");
                            nombre = sc.nextLine();

                            if (!Validador.validarTexto(nombre)) {
                                System.out.println("Error: nombre vacío.");
                            }

                        } while (!Validador.validarTexto(nombre));

                        // EDAD
                        int edad;

                        do {

                            try {

                                System.out.print("Edad: ");
                                edad = Integer.parseInt(sc.nextLine());

                                if (!Validador.validarEdad(edad)) {
                                    System.out.println("Edad inválida.");
                                }

                            } catch (NumberFormatException e) {

                                System.out.println("Debe ingresar números.");
                                edad = -1;
                            }

                        } while (!Validador.validarEdad(edad));

                        // TELÉFONO
                        String telefono;

                        do {

                            System.out.print("Teléfono: ");
                            telefono = sc.nextLine();

                            if (!Validador.validarTelefono(telefono)) {
                                System.out.println("Error: solo números.");
                            }

                        } while (!Validador.validarTelefono(telefono));

                        // CORREO
                        String correo;

                        do {

                            System.out.print("Correo: ");
                            correo = sc.nextLine();

                            if (!Validador.validarCorreo(correo)) {
                                System.out.println("Correo inválido.");
                            }

                        } while (!Validador.validarCorreo(correo));

                        // ESPECIALIDAD
                        String especialidad;

                        do {

                            System.out.print("Especialidad: ");
                            especialidad = sc.nextLine();

                            if (!Validador.validarTexto(especialidad)) {
                                System.out.println("Especialidad vacía.");
                            }

                        } while (!Validador.validarTexto(especialidad));

                        // PACIENTES
                        int pacientes;

                        do {

                            try {

                                System.out.print("Pacientes atendidos: ");
                                pacientes = Integer.parseInt(sc.nextLine());

                                if (pacientes <= 0) {
                                    System.out.println("Debe ser mayor a cero.");
                                }

                            } catch (NumberFormatException e) {

                                System.out.println("Ingrese números válidos.");
                                pacientes = -1;
                            }

                        } while (pacientes <= 0);

                        // VALOR CONSULTA
                        double valorConsulta;

                        do {

                            try {

                                System.out.print("Valor consulta: ");
                                valorConsulta = Double.parseDouble(sc.nextLine());

                                if (valorConsulta <= 0) {
                                    System.out.println("Debe ser mayor a cero.");
                                }

                            } catch (NumberFormatException e) {

                                System.out.println("Ingrese valores válidos.");
                                valorConsulta = -1;
                            }

                        } while (valorConsulta <= 0);

                        Medico medico = new Medico(
                                cedula,
                                nombre,
                                edad,
                                telefono,
                                correo,
                                especialidad,
                                pacientes,
                                valorConsulta
                        );

                        servicio.agregarEmpleado(medico);

                        System.out.println("Médico registrado.");

                        break;
                    case 2:

                        System.out.print("Cédula: ");
                        String cedulaAdmin = sc.nextLine();

                        if (servicio.buscarPorCedula(cedulaAdmin) != null) {
                            System.out.println("Cédula repetida.");
                            break;
                        }

                        // NOMBRE
                        String nombreAdmin;

                        do {

                            System.out.print("Nombre: ");
                            nombreAdmin = sc.nextLine();

                            if (!Validador.validarTexto(nombreAdmin)) {
                                System.out.println("Nombre vacío.");
                            }

                        } while (!Validador.validarTexto(nombreAdmin));

                        // EDAD
                        int edadAdmin;

                        do {

                            try {

                                System.out.print("Edad: ");
                                edadAdmin = Integer.parseInt(sc.nextLine());

                                if (!Validador.validarEdad(edadAdmin)) {
                                    System.out.println("Edad inválida.");
                                }

                            } catch (NumberFormatException e) {

                                System.out.println("Debe ingresar números.");
                                edadAdmin = -1;
                            }

                        } while (!Validador.validarEdad(edadAdmin));

                        // TELÉFONO
                        String telefonoAdmin;

                        do {

                            System.out.print("Teléfono: ");
                            telefonoAdmin = sc.nextLine();

                            if (!Validador.validarTelefono(telefonoAdmin)) {
                                System.out.println("Solo números.");
                            }

                        } while (!Validador.validarTelefono(telefonoAdmin));

                        // CORREO
                        String correoAdmin;

                        do {

                            System.out.print("Correo: ");
                            correoAdmin = sc.nextLine();

                            if (!Validador.validarCorreo(correoAdmin)) {
                                System.out.println("Correo inválido.");
                            }

                        } while (!Validador.validarCorreo(correoAdmin));

                        // DEPARTAMENTO
                        String departamento;

                        do {

                            System.out.print("Departamento: ");
                            departamento = sc.nextLine();

                            if (!Validador.validarTexto(departamento)) {
                                System.out.println("Departamento vacío.");
                            }

                        } while (!Validador.validarTexto(departamento));

                        // HORAS
                        int horasTrabajadas;

                        do {

                            try {

                                System.out.print("Horas trabajadas: ");
                                horasTrabajadas =
                                        Integer.parseInt(sc.nextLine());

                                if (horasTrabajadas <= 0) {
                                    System.out.println("Debe ser mayor a cero.");
                                }

                            } catch (NumberFormatException e) {

                                System.out.println("Ingrese números válidos.");
                                horasTrabajadas = -1;
                            }

                        } while (horasTrabajadas <= 0);

                        // VALOR HORA
                        double valorHora;

                        do {

                            try {

                                System.out.print("Valor por hora: ");
                                valorHora =
                                        Double.parseDouble(sc.nextLine());

                                if (valorHora <= 0) {
                                    System.out.println("Debe ser mayor a cero.");
                                }

                            } catch (NumberFormatException e) {

                                System.out.println("Ingrese valores válidos.");
                                valorHora = -1;
                            }

                        } while (valorHora <= 0);

                        Administrativo admin = new Administrativo(
                                cedulaAdmin,
                                nombreAdmin,
                                edadAdmin,
                                telefonoAdmin,
                                correoAdmin,
                                departamento,
                                horasTrabajadas,
                                valorHora
                        );

                        servicio.agregarEmpleado(admin);

                        System.out.println("Administrativo registrado.");

                        break;

                    case 3:

                        servicio.mostrarEmpleados();
                        break;

                    case 4:

                        System.out.print("Ingrese cédula: ");
                        String buscar = sc.nextLine();

                        Empleado encontrado =
                                servicio.buscarPorCedula(buscar);

                        if (encontrado != null) {
                            encontrado.mostrarInformacion();
                        } else {
                            System.out.println("Registro no encontrado.");
                        }

                        break;
                    case 5:

                        System.out.print("Ingrese cédula a reemplazar: ");
                        String cedulaReemplazar = sc.nextLine();

                        Empleado encontradoReemplazo =
                                servicio.buscarPorCedula(cedulaReemplazar);

                        if (encontradoReemplazo == null) {

                            System.out.println("Empleado no encontrado.");
                            break;
                        }

                        System.out.print("Nuevo nombre: ");
                        String nuevoNombre = sc.nextLine();

                        System.out.print("Nueva edad: ");
                        int nuevaEdad = Integer.parseInt(sc.nextLine());

                        System.out.print("Nuevo teléfono: ");
                        String nuevoTelefono = sc.nextLine();

                        System.out.print("Nuevo correo: ");
                        String nuevoCorreo = sc.nextLine();

                        if (encontradoReemplazo instanceof Medico) {

                            System.out.print("Nueva especialidad: ");
                            String nuevaEspecialidad = sc.nextLine();

                            System.out.print("Pacientes atendidos: ");
                            int nuevosPacientes =
                                    Integer.parseInt(sc.nextLine());

                            System.out.print("Valor consulta: ");
                            double nuevoValorConsulta =
                                    Double.parseDouble(sc.nextLine());

                            Medico nuevoMedico = new Medico(
                                    cedulaReemplazar,
                                    nuevoNombre,
                                    nuevaEdad,
                                    nuevoTelefono,
                                    nuevoCorreo,
                                    nuevaEspecialidad,
                                    nuevosPacientes,
                                    nuevoValorConsulta
                            );

                            servicio.reemplazarEmpleado(
                                    cedulaReemplazar,
                                    nuevoMedico
                            );

                        } else if (encontradoReemplazo instanceof Administrativo) {

                            System.out.print("Nuevo departamento: ");
                            String nuevoDepartamento = sc.nextLine();

                            System.out.print("Horas trabajadas: ");
                            int nuevasHoras =
                                    Integer.parseInt(sc.nextLine());

                            System.out.print("Valor hora: ");
                            double nuevoValorHora =
                                    Double.parseDouble(sc.nextLine());

                            Administrativo nuevoAdmin = new Administrativo(
                                    cedulaReemplazar,
                                    nuevoNombre,
                                    nuevaEdad,
                                    nuevoTelefono,
                                    nuevoCorreo,
                                    nuevoDepartamento,
                                    nuevasHoras,
                                    nuevoValorHora
                            );

                            servicio.reemplazarEmpleado(
                                    cedulaReemplazar,
                                    nuevoAdmin
                            );
                        }

                        System.out.println("Información reemplazada.");

                        break;
                    case 6:

                        System.out.print("Ingrese cédula a eliminar: ");
                        String cedulaEliminar = sc.nextLine();

                        boolean eliminado =
                                servicio.eliminarEmpleado(cedulaEliminar);

                        if (eliminado) {

                            System.out.println("Empleado eliminado.");

                        } else {

                            System.out.println("Empleado no encontrado.");
                        }

                        break;
                    case 7:

                        System.out.println("===== PAGOS =====");

                        servicio.mostrarEmpleados();

                        break;
                    case 8:

                        servicio.mostrarEstadisticas();
                        break;

                    case 9:

                        System.out.println("Saliendo...");
                        break;

                    default:

                        System.out.println("Error: opción inválida.");
                }

            } catch (NumberFormatException e) {

                System.out.println("Error: opción inválida.");

            } catch (Exception e) {

                System.out.println("Error: " + e.getMessage());
            }

        } while (opcion != 9);

        sc.close();
    }
}
