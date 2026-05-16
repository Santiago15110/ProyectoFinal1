package org.example.Model;

import java.util.ArrayList;

public class Administrador extends Persona {
    private ParqueDiversiones parque;
    private String codigoAdmin;
    private ArrayList<Operador> listaOperador;

    public Administrador(String nombre, String cedula, String codigoAdmin){
        super(nombre, cedula);
        this.codigoAdmin= codigoAdmin;
        this.parque=null;
            }

    public String getCodigoAdmin() {
        return codigoAdmin;
    }

    public void setCodigoAdmin(String codigoAdmin) {
        this.codigoAdmin = codigoAdmin;
    }

    public ParqueDiversiones getParque() {
        return parque;
    }

    public void setParque(ParqueDiversiones parque) {
        this.parque = parque;
    }

    //Gestion Operadores

    //Crud Operador

    public boolean agregarOperador(String nombre, String cedula, String codigo){

        if(parque == null ){
            return false;
        }

        Operador newOperador = new Operador(nombre, cedula, codigo);

        parque.agregarOperador(newOperador);
        return true;
    }


    //metodo para eliminar operador

    public boolean eliminarOperador(String codigoOp){

       return parque.eliminarOperador(codigoOp);
    }

    //Metodo para actualizar Operador

    public boolean editarDatosOperador(String codigo, String nombreNuevo){

        return parque.actualizarOperador(codigo, nombreNuevo);
    }


    // metodo para buscar operador

    public Operador buscarOperadorByCodigo(String codigo){

        for(Operador o: listaOperador){
            if(o.getCodigoOperador().equals(codigo)){
                return o;
            }
        }

        return null;
    }


    //Metodo para agregarZona

    public boolean agregarZona(String codigoZona, String nombre, int capacidadMax){

        if(parque == null){
            return false;
        }

        Zona zona = new Zona(codigoZona, nombre, capacidadMax);
        parque.agregarZona(zona);

        return true;
    }


    //Metodo para eliminar zona

    public boolean eliminarZona(String codigo){

        return parque.eliminarZona(codigo);
    }


    //Metodo para actualizar datos de la zona

    public boolean actualizarZona(String codigo, String nombre, int capacidadMax){

        return parque.actualizarZona(codigo);
    }





    @Override
    public String toString() {
        return "Nombre: "+ getNombre()
                +" | Cedula: " + getCedula()
                + " | Codigo de Admin" +getCodigoAdmin();
    }
}
