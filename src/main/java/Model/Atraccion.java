package Model;

import java.util.ArrayList;
import java.util.List;

public class Atraccion {
    private String id;
    private String nombre;
    private TipoAtraccion tipoAtraccion;
    private int capacidadMax;
    private double alturaMin;
    private int edadMin;
    private double costoAdicional;
    private int contadorVisitantes;
    private int tiempoEspera;
    private EstadoAtraccion estadoAtraccion;
    private int codigoOperador;
    private ArrayList<Atraccion> listaAtracciones;
    private ArrayList<Visitante> listaVisitantes;


    public Atraccion(String id, String nombre, TipoAtraccion tipoAtraccion, int capacidadMax, double alturaMin, int edadMin, double costoAdicional, int contadorVisitantes, int tiempoEspera, EstadoAtraccion estadoAtraccion, int codigoOperador, ArrayList<Atraccion> listaAtracciones, ArrayList<Visitante> listaVisitantes) {
        this.id = id;
        this.nombre = nombre;
        this.tipoAtraccion = tipoAtraccion;
        this.capacidadMax = capacidadMax;
        this.alturaMin = alturaMin;
        this.edadMin = edadMin;
        this.costoAdicional = costoAdicional;
        this.contadorVisitantes = contadorVisitantes;
        this.tiempoEspera = tiempoEspera;
        this.estadoAtraccion = estadoAtraccion;
        this.codigoOperador = codigoOperador;
        this.listaAtracciones = listaAtracciones;
        this.listaVisitantes = listaVisitantes;
    }

    public double getAlturaMin() {
        return alturaMin;
    }

    public void setAlturaMin(double alturaMin) {
        this.alturaMin = alturaMin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoAtraccion getTipoAtraccion() {
        return tipoAtraccion;
    }

    public void setTipoAtraccion(TipoAtraccion tipoAtraccion) {
        this.tipoAtraccion = tipoAtraccion;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public int getContadorVisitantes() {
        return contadorVisitantes;
    }

    public void setContadorVisitantes(int contadorVisitantes) {
        this.contadorVisitantes = contadorVisitantes;
    }

    public double getCostoAdicional() {
        return costoAdicional;
    }

    public void setCostoAdicional(double costoAdicional) {
        this.costoAdicional = costoAdicional;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public EstadoAtraccion getEstadoAtraccion() {
        return estadoAtraccion;
    }

    public void setEstadoAtraccion(EstadoAtraccion estadoAtraccion) {
        this.estadoAtraccion = estadoAtraccion;
    }

    public int getCodigoOperador() {
        return codigoOperador;
    }

    public void setCodigoOperador(int codigoOperador) {
        this.codigoOperador = codigoOperador;
    }

    public ArrayList<Atraccion> getListaAtracciones() {
        return listaAtracciones;
    }

    public void setListaAtracciones(ArrayList<Atraccion> listaAtracciones) {
        this.listaAtracciones = listaAtracciones;
    }
}






