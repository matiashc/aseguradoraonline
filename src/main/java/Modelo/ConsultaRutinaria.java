/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author estudiante
 */
public class ConsultaRutinaria extends Consulta {

    private String presionArterial;
    private double estaturaReal;
    private double pesoReal;
    private String diagnostico;

    public ConsultaRutinaria() {
    }

    public ConsultaRutinaria(String presionArterial, double estaturaReal, double pesoReal, String diagnostico, int id, String fecha, String sintomas) {
        super(id, fecha, sintomas);
        this.presionArterial = presionArterial;
        this.estaturaReal = estaturaReal;
        this.pesoReal = pesoReal;
        this.diagnostico = diagnostico;
    }

    public String getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(String presionArterial) {
        this.presionArterial = presionArterial;
    }

    public double getEstaturaReal() {
        return estaturaReal;
    }

    public void setEstaturaReal(double estaturaReal) {
        this.estaturaReal = estaturaReal;
    }

    public double getPesoReal() {
        return pesoReal;
    }

    public void setPesoReal(double pesoReal) {
        this.pesoReal = pesoReal;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

}
