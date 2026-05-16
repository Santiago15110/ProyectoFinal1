package org.example.Model;

public class Operador extends Persona {
    private String codigoOperador;
    private boolean activo;
    private Zona zonaAsignada;

    public Operador(String nombre, String cedula, String codigoOperador){
        super(nombre, cedula);
        this.codigoOperador=codigoOperador;
        this.zonaAsignada=null;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getCodigoOperador() {
        return codigoOperador;
    }

    public void setCodigoOperador(String codigoOperador) {
        this.codigoOperador = codigoOperador;
    }

    public Zona getZonaAsignada() {
        return zonaAsignada;
    }

    public void setZonaAsignada(Zona zonaAsignada) {
        this.zonaAsignada = zonaAsignada;
    }
}
