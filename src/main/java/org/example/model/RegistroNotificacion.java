package org.example.model;

public class RegistroNotificacion {

  private Visitante visitante;
  private Notificacion notificacion;
  private boolean leido;


  public RegistroNotificacion(Visitante visitante, Notificacion notificacion){
    this.visitante= visitante;
    this.notificacion=notificacion;
    this.leido=false;
  }


  public Notificacion getNotificacion() {
    return notificacion;
  }

  public void setNotificacion(Notificacion notificacion) {
    this.notificacion = notificacion;
  }

  public Visitante getVisitante() {
    return visitante;
  }

  public void setVisitante(Visitante visitante) {
    this.visitante = visitante;
  }

  public boolean isLeido() {
    return leido;
  }

  public void setLeido(boolean leido) {
    this.leido = leido;
  }
}
