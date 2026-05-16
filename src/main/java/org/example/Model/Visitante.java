package org.example.Model;

import jdk.jfr.DataAmount;

import java.sql.Array;
import java.util.ArrayList;

public class Visitante extends Persona {
    private int edad;
    private double estatura;
    private double saldoVirtual;
    private Ticket theTicket;
    private ArrayList<Atraccion> listaAtraccionFav;

    public Visitante(String nombre, String cedula, int edad, double estatura, double saldoVirtual){

        super(nombre, cedula);
        this.edad=edad;
        this.estatura=estatura;
        this.saldoVirtual=saldoVirtual;
        this.theTicket=null;
        listaAtraccionFav = new ArrayList<>();
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Atraccion> getListaAtraccionFav() {
        return listaAtraccionFav;
    }

    public void setListaAtraccionFav(ArrayList<Atraccion> listaAtraccionFav) {
        this.listaAtraccionFav = listaAtraccionFav;
    }

    public Ticket getTheTicket() {
        return theTicket;
    }

    public void setTheTicket(Ticket theTicket) {
        this.theTicket = theTicket;
    }

    public double getSaldoVirtual() {
        return saldoVirtual;
    }

    public void setSaldoVirtual(double saldoVirtual) {
        this.saldoVirtual = saldoVirtual;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }


    @Override
    public String toString() {
          return "Nombre: " + getNombre()+
                " | Cedula: " + getCedula()+
                " | Edad: "+ getEdad()+
                " | Estatura" + getEstatura()+
                " | Saado virtual" + getSaldoVirtual();
    }
}


