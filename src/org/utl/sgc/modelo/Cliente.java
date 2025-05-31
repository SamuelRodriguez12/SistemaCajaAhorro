package org.utl.sgc.modelo;

public class Cliente {
    private String nombreCliente;
    private String fechaNacimiento;
    private char generoCliente;
    private int numeroHijos;
    private double ingresoMensual;
    private double creditoSolicitado;

    public Cliente(String nombreCliente, String fechaNacimiento, char generoCliente, int numeroHijos, double ingresoMensual, double creditoSolicitado){
        this.nombreCliente=nombreCliente;
        this.fechaNacimiento=fechaNacimiento;
        this.generoCliente=generoCliente;
        this.numeroHijos=numeroHijos;
        this.ingresoMensual=ingresoMensual;
        this.creditoSolicitado=creditoSolicitado;
    }
    
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getGeneroCliente() {
        return generoCliente;
    }

    public void setGeneroCliente(char generoCliente) {
        this.generoCliente = generoCliente;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public double getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(double ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public double getCreditoSolicitado() {
        return creditoSolicitado;
    }

    public void setCreditoSolicitado(double creditoSolicitado) {
        this.creditoSolicitado = creditoSolicitado;
    }
    
}
