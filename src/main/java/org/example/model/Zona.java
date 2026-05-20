package org.example.model;

import java.util.ArrayList;

public class Zona {
    private String nombre;
    private int capacidadMax;
    private ArrayList<Atraccion> listaAtracciones;
    private ArrayList<Operador> listaOperadores;
    private String codigoZona;

    public Zona (String nombre, int capacidadMax,String codigoZona) {
        this.nombre = nombre;
        this.capacidadMax = capacidadMax;
        this.listaAtracciones = new ArrayList<>();
        this.listaOperadores = new ArrayList<>();
        this.codigoZona = codigoZona;
    }

    public Atraccion buscarAtraccionByCodigo (String codigoAtraccion) {

        for (Atraccion a: listaAtracciones) {
            if (a.getCodigoAtraccion().equals(codigoAtraccion)) {
                return a;
            }
        }
        return null;
    }

    //Metodo para agregar atraccion

    public boolean agregarAtraccion (Atraccion atraccion) {

        if (atraccion == null) {
            return false;
        }
        listaAtracciones.add(atraccion);

        return true;
    }

    public boolean eliminarAtraccion (String codigoAtraccion) {

        Atraccion atraccion = buscarAtraccionByCodigo(codigoAtraccion);

        if(atraccion!=null) {

            listaAtracciones.remove(atraccion);
            return true;
        }
        return false;
    }

    public boolean agregarOperador (Operador operador) {
        for (Operador o : listaOperadores) {
            if (o.getCedula().equals(operador.getCedula())) {
                return false;
            }
        }
        listaOperadores.add(operador);
        return true;
    }

    public int calcularVisitantesActuales () {
        int total = 0;
        for (Atraccion a : listaAtracciones) {
            total = total + a.getContadorVisitantes();
        }
        return total;
    }
    public boolean estaDisponible () {
        if (calcularVisitantesActuales() < capacidadMax) {
            return true;
        }
        return false;
    }
    public boolean validarAcceso (Visitante visitante) {
        if (estaDisponible()) {
            return true;
        }
        return false;
    }

    public String generarReporte () {
        return "Zona: " + nombre +
                "\nCapacidad Maxina: " +capacidadMax +
                "\nVisitantes actuales: " +calcularVisitantesActuales() +
                "\nAtracciones disponibles: " +listaAtracciones.size();
    }


    public String getNombre() { return nombre; }

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

    public String getCodigoZona() { return codigoZona; }

    public void setCodigoZona(String codigoZona) { this.codigoZona = codigoZona; }
}
