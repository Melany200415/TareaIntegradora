# Sistema de Gestión de Personal para Clínica Privada

## ESCUELA POLITÉCNICA NACIONAL
### Escuela de Formación de Tecnólogos
##Estudiante:Melany Perugachi 

---

# Descripción del Proyecto

Este proyecto consiste en un sistema desarrollado en Java para gestionar el personal de una clínica privada.

El sistema permite registrar médicos y personal administrativo aplicando Programación Orientada a Objetos (POO), CRUD, excepciones, validaciones y conversiones.

---

# Funcionalidades

- Registrar médicos
- Registrar administrativos
- Mostrar empleados
- Buscar por cédula
- Reemplazar información
- Eliminar registros
- Calcular pagos
- Mostrar estadísticas

---

# Tecnologías Utilizadas

- Java
- Programación Orientada a Objetos
- ArrayList
- Scanner
- Manejo de excepciones

---

# Estructura del Proyecto

```text
src/
│
├── Modelo/
│   ├── Empleado.java
│   ├── Medico.java
│   └── Administrativo.java
│
├── Servicio/
│   └── EmpleadoServicio.java
│
├── Util/
│   └── Validador.java
│
└── app/
    └── Main.java
```

---

# Programación Orientada a Objetos

## Herencia

La clase `Empleado` es la clase padre del sistema.

Las clases:

- `Medico`
- `Administrativo`

heredan atributos y métodos de `Empleado`.

Ejemplo:

```java
public class Medico extends Empleado
```

Esto permite reutilizar código y organizar mejor el sistema.

---

## Encapsulamiento

Los atributos de las clases son privados (`private`) y se accede a ellos mediante métodos getters y setters.

Ejemplo:

```java
private String nombre;

public String getNombre() {
    return nombre;
}
```

Esto protege la información de los objetos.

---

## Polimorfismo

Se utiliza polimorfismo mediante:

```java
ArrayList<Empleado>
```

La lista puede almacenar objetos de tipo:

- Medico
- Administrativo

porque ambos heredan de `Empleado`.

---

# CRUD Implementado

## CREATE

Registrar empleados.

Ejemplo:

```java
servicio.agregarEmpleado(medico);
```

## READ

Mostrar empleados registrados.

Ejemplo:

```java
servicio.mostrarEmpleados();
```

## UPDATE

Reemplazar información de empleados.

Ejemplo:

```java
servicio.reemplazarEmpleado(cedula, nuevoEmpleado);
```

## DELETE

Eliminar empleados.

Ejemplo:

```java
servicio.eliminarEmpleado(cedula);
```

---

# Validaciones

El sistema valida:

- Edad válida
- Campos vacíos
- Correos válidos
- Teléfonos numéricos
- Valores mayores a cero
- Cédulas duplicadas

Ejemplo:

```java
Validador.validarCorreo(correo);
```

---

# Excepciones

El sistema utiliza `try-catch` para controlar errores.

## NumberFormatException

Se produce cuando se ingresan letras en lugar de números.

Ejemplo:

```java
int edad = Integer.parseInt(sc.nextLine());
```

## Exception

Captura errores generales del sistema.

Ejemplo:

```java
catch (Exception e)
```

---

# Conversiones

## String a int

```java
Integer.parseInt()
```

Ejemplo:

```java
int edad = Integer.parseInt(sc.nextLine());
```

## String a double

```java
Double.parseDouble()
```

Ejemplo:

```java
double valor = Double.parseDouble(sc.nextLine());
```

---

# Estadísticas

El sistema muestra:

- Total de médicos
- Total de administrativos
- Total de empleados
- Pago total médicos
- Pago total administrativos
- Empleado con mayor ingreso

---

# UML

El UML incluye:

- Herencia
- Métodos
- Atributos
- Relación entre clases

---

# Menú del Sistema

```text
===== CLÍNICA SALUD TOTAL =====
1. Registrar médico
2. Registrar administrativo
3. Mostrar empleados
4. Buscar por cédula
5. Reemplazar información
6. Eliminar registro
7. Calcular pagos
8. Mostrar estadísticas
9. Salir
```
