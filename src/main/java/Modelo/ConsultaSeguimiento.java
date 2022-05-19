/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author estudiante
 */
public class ConsultaSeguimiento extends Consulta {

    private String estadoDiagnostico;

    public ConsultaSeguimiento() {
    }

    public ConsultaSeguimiento(String estadoDiagnostico, int id, String fecha, String sintomas) {
        super(id, fecha, sintomas);
        this.estadoDiagnostico = estadoDiagnostico;
    }

    public String getEstadoDiagnostico() {
        return estadoDiagnostico;
    }

    public void setEstadoDiagnostico(String estadoDiagnostico) {
        this.estadoDiagnostico = estadoDiagnostico;
    }

}
