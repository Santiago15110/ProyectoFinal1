package org.example.model;

import java.time.LocalDate;

public class Notificacion {

    private String codigo;
    private String mensaje;
    private LocalDate fecha;
    private TipoNoti tipoNoti;


    public Notificacion(String mensaje, String codigo, LocalDate fecha, TipoNoti tipoNoti) {
        this.mensaje = mensaje;
        this.codigo = codigo;
        this.fecha = fecha;
        this.tipoNoti = tipoNoti;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public TipoNoti getTipoNoti() {
        return tipoNoti;
    }

    public void setTipoNoti(TipoNoti tipoNoti) {
        this.tipoNoti = tipoNoti;
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
