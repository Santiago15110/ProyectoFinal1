package org.example.model;

import java.time.LocalDate;

public class Notificacion {

    private String codigo;
    private String mensaje;
    private LocalDate fecha;
    private TipoAtraccion tipoAtraccion;


    public Notificacion(String mensaje, String codigo, LocalDate fecha, TipoAtraccion tipoAtraccion) {
        this.mensaje = mensaje;
        this.codigo = codigo;
        this.fecha = fecha;
        this.tipoAtraccion = tipoAtraccion;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoAtraccion getTipoAtraccion() {
        return tipoAtraccion;
    }

    public void setTipoAtraccion(TipoAtraccion tipoAtraccion) {
        this.tipoAtraccion = tipoAtraccion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
