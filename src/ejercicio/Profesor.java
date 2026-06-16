/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 */
import java.time.LocalDate;
import java.util.ArrayList;

//Comentario para el ejercicio 5 como revision inicial del examen

public class Profesor {

    private String nombre;
    private LocalDate fechaNacimiento;
    private String instituto;
    private ArrayList<Modulo> modulosImpartidos;

    public Profesor(String nombre, LocalDate fechaNacimiento, String instituto) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.instituto = instituto;
        this.modulosImpartidos = new ArrayList<>();
    }

    public void anadirModulo(Modulo modulo) {
        modulosImpartidos.add(modulo);
    }

    public String concederEntrevista() {
        return "Mis alumnos han trabajado duro para llegar hasta aqu�.";
    }

    @Override
    public String toString() {
        return "Profesor{"
                + "nombre='" + nombre + '\''
                + ", fechaNacimiento=" + fechaNacimiento
                + ", instituto='" + instituto + '\''
                + ", modulosImpartidos=" + modulosImpartidos
                + '}';
    }
}
