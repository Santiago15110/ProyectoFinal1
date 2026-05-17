package org.example.model;

import java.util.ArrayList;

public class Zona {
    private String nombre;
    private int capacidadMax;
    private ArrayList<Atraccion> listaAtracciones;
    private ArrayList<Operador> listaOperadores;

    public Zona (String nombre, int capacidadMax,ArrayList<Atraccion> listaAtracciones, ArrayList<Operador> listaOperadores) {
        this.nombre = nombre;
        this.capacidadMax = capacidadMax;
        this.listaAtracciones = listaAtracciones;
        this.listaOperadores = listaOperadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public ArrayList<Atraccion> getListaAtracciones() {
        return listaAtracciones;
    }

    public void setListaAtracciones(ArrayList<Atraccion> listaAtracciones) {
        this.listaAtracciones = listaAtracciones;
    }

    public ArrayList<Operador> getListaOperadores() {
        return listaOperadores;
    }

    public void setListaOperadores(ArrayList<Operador> listaOperadores) {
        this.listaOperadores = listaOperadores;
    }
}
