/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;
import java.time.LocalDate;
/**
 *
 * @author Pacoep
 */
    

public class Alumno {

    private String nombre;
    private LocalDate fechaNacimiento;
    private String instituto;
    private EstadoAlumno estado;

    public Alumno(String nombre, LocalDate fechaNacimiento, String instituto) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.instituto = instituto;
        this.estado = EstadoAlumno.INVITADO;
    }

    public String concederEntrevista() {
        return "Estoy muy contento de participar en ProgramaMe.";
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", instituto='" + instituto + '\'' +
                ", estado=" + estado +
                '}';
    }
}

