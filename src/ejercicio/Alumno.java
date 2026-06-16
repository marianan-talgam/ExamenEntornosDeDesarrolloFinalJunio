/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

import java.time.LocalDate;

/**
 * Clase Alumno para representar a un participante en el programa.
 */

public class Alumno {

    /**
     * Nombre del alumno
     */
    private String nombre;

    /**
     * Fecha de nacimiento del alumno
     */
    private LocalDate fechaNacimiento;

    /**
     * Instituto al que pertenece el alumno
     */
    private String instituto;

    /**
     * Estado del alumno en el programa
     */
    private EstadoAlumno estado;

    /**
     * Constructor para crear un nuevo alumno.
     * @param nombre
     * @param fechaNacimiento
     * @param instituto
     */
    public Alumno(String nombre, LocalDate fechaNacimiento, String instituto) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.instituto = instituto;
        this.estado = EstadoAlumno.INVITADO;
    }

    /**
     * Devuelve un mensaje del alumno.
     * @return
     */
    public String concederEntrevista() {
        return "Estoy muy contento de participar en ProgramaMe.";
    }

    /**
     * Devuelve la informacion del alumno.
     * @return
     */
    @Override
    public String toString() {
        return "Alumno{"
                + "nombre='" + nombre + '\''
                + ", fechaNacimiento=" + fechaNacimiento
                + ", instituto='" + instituto + '\''
                + ", estado=" + estado
                + '}';
    }
}
