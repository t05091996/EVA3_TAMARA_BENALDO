/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epe3java;

import java.io.Serializable;

/**
 *
 * @author tamara benaldo
 */
//la clase implementa serializable para que sea capaz de componerse y descomponerse 
//al guardarlo como objeto en el archivo temporal
public class Reservas implements Serializable {

    private String Medico;
    private String Paciente;
    private String Especialidad;
    private String Disponibilidad;

    public Reservas() {
    }

    public Reservas(String Medico, String Paciente, String Especialidad, String Disponibilidad) {
        this.Medico = Medico;
        this.Paciente = Paciente;
        this.Especialidad = Especialidad;
        this.Disponibilidad = Disponibilidad;
    }

    public String getMedico() {
        return Medico;
    }

    public void setMedico(String Medico) {
        this.Medico = Medico;
    }

    public String getPaciente() {
        return Paciente;
    }

    public void setPaciente(String Paciente) {
        this.Paciente = Paciente;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(String Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del Médico: ").append(Medico);
        sb.append("\nPaciente: ").append(Paciente);
        sb.append("\nEspecialidad: ").append(Especialidad);
        sb.append("\nHora Asignada: ").append(Disponibilidad);
        return sb.toString();
    }

}
