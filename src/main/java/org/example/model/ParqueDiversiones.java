    package org.example.model;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;


public class ParqueDiversiones {
    private String nombre;
    private int capacidadMax;
    private ArrayList<Zona> listaZonas;
    private ArrayList<Atraccion> listaAtracciones;
    private ArrayList<Visitante> listaVisitantes;
    private ArrayList<Administrador> listaAdministrador;
    private ArrayList<Operador> listaOperador;
    private ArrayList<TicketGeneral> listTicketGeneral;
    private ArrayList<TicketFamiliar> listTicketFamiliar;
    private ArrayList<TicketFast> listTicketFast;

    //contadores para generar codigo autamoticamente

    private int contadorAdmin= 0;
    private int contadorOperador= 0;
    private int contadorZonas = 0;
    private int contadorNotificacion = 0;

    public ParqueDiversiones(String nombre, int capacidadMax) {
        this.nombre=nombre;
        this.capacidadMax=capacidadMax;
        listaZonas = new ArrayList<>();
        listaVisitantes = new ArrayList<>();
        listaAdministrador = new ArrayList<>();
        listaOperador = new ArrayList<>();
        listTicketGeneral = new ArrayList<>();
        listTicketFamiliar = new ArrayList<>();
        listTicketFast = new ArrayList<>();
        listaAtracciones = new ArrayList<>();

    }

    //Metodos para generar codigo

    public String generarCodigoNotificacion(){

     contadorNotificacion++;

     return "N-" + contadorNotificacion;
    }

    //Metodo para generar  codigo Admin

    public String generarCodigoAdmin(){
        contadorAdmin++;
        return "A-" + contadorAdmin;
    }

    public String generarCodigoZona(){

        contadorZonas++;
        return "Z-"+contadorZonas;
    }





    //Crud Visitante

    //Metodo para agregar Visitante


    public boolean agregarVisitante(String nombre, String cedula, int edad, double estatura, double saldoVirtual){

        Visitante newVisitante = new Visitante(nombre, cedula, edad, estatura, saldoVirtual);

        for(Visitante v: listaVisitantes){
            if(v.getCedula().equals(cedula)){
                return false;
            }
        }

        if(listaVisitantes == null){
            return false;
        }

        listaVisitantes.add(newVisitante);
        return true;
    }


    //Eliminar Visitante

    public boolean eliminarVisitante(String cedula){

        Visitante visitante = buscarVisitanteByCedula(cedula);

        if(visitante != null){
            listaVisitantes.remove(visitante);
            return true;
        }


        return false;
    }

    // metodo para actualizar visitante

    public boolean actualizarVisitante(String cedula, String nombre, int edad, double estatura){

        Visitante visitante = buscarVisitanteByCedula(cedula);

        if(visitante != null){

            visitante.setNombre(nombre);
            visitante.setEdad(edad);
            visitante.setEstatura(estatura);
            return true;

        }

        return false;


    }

  // metodo para mostrar visitante    determinar si es aplicable en java fx
    public String mostrarVisitante(String cedula){

        Visitante visitante = buscarVisitanteByCedula(cedula);

        if(visitante != null){
            return visitante.toString();
        }

        return "Visitante no encontrado";
    }


    //Metodo para mostrar lista de visitantes    determinar si es aplicable en java fx
    public String mostrarListaVisitantes(){

        String lista = "";

        for(Visitante v: listaVisitantes){

            lista += "Nombre: " + v.getNombre()+
                    " | Cedula: " + v.getCedula()+
                    " | Edad: "+ v.getEdad()+
                    " | Estatura" + v.getEstatura()+
                    " | Saado virtual" + v.getSaldoVirtual() + "\n";

        }

        return lista;
    }


    //Metodo para busccar un visitante por cedula


    public Visitante buscarVisitanteByCedula(String cedula){

        for(Visitante v: listaVisitantes){
            if(v.getCedula().equals(cedula)){
                return v;
            }
        }

        return null;
    }




    // Crud Administrador


    //metodo para agregar administrador

    public boolean agregarAdmin(String nombre, String cedula, String codigoAdmin){

        Administrador newAdmin= new Administrador(nombre, cedula, codigoAdmin);

        for(Administrador a: listaAdministrador){
            if(a.getCedula().equals(cedula)){
                return false;

            }
        }

        listaAdministrador.add(newAdmin);
        return true;
    }


    public boolean eliminarAdmin(String codigo){

        Administrador admin = buscarAdminByCodigo(codigo);

        if(admin != null){
            listaAdministrador.remove(admin);
            return true;
        }

        return false;
    }


    //Metodo para actualizar admin.             pendiente si cedula se cambia o no""""

    public boolean actualizarAdmin(String codigo, String nombre, String cedula){

        Administrador admin = buscarAdminByCodigo(codigo);

        if(admin != null){
            admin.setNombre(nombre);
            admin.setCedula(cedula);
            return true;
        }

        return false;


    }


        //metodo para mostrar admin

    public String mostrarAdmin(String codigo){

        Administrador admin = buscarAdminByCodigo(codigo);

        if(admin != null){
            return admin.toString();
        }

        return "Administrador no encontrado";

    }


    //metodo para mostrar lista de admins

    public String mostrarListaAdmin(){

        String lista = "";

        for(Administrador a: listaAdministrador){

            lista += "Nombre: "+ a.getNombre()
                    +" | Cedula: " + a.getCedula()
                    + " | Codigo de Admin" + a.getCodigoAdmin();
        }

        return lista;
    }

        //metodo de buscar admin

    public Administrador buscarAdminByCodigo(String codigo){


        for(Administrador a: listaAdministrador){
            if(a.getCodigoAdmin().equals(codigo)){
                 return a;
            }
        }

        return null;
    }


//Metodo para agregarOperador para el admin


   public boolean agregarOperador(Operador operador){

        if(operador == null){
            return false;
        }

        for(Operador op: listaOperador){
            if(op.getCodigoOperador().equals(operador.getCodigoOperador())){
                return false;
            }

        }


        listaOperador.add(operador);
        return true;
   }


    public boolean eliminarOperador(String codigo){

        Operador operador = buscarOperadorByCodigo(codigo);

        if(operador != null){
            listaOperador.remove(operador);
            return true;
        }

        return false;
    }


    public boolean actualizarOperador(String codigo, String nombreNuevo){

        Operador operador = buscarOperadorByCodigo(codigo);

        if(operador != null){
            operador.setNombre(nombreNuevo);
            return true;
        }

        return false;
    }



    public Operador buscarOperadorByCodigo(String codigo){

        for(Operador o: listaOperador){
            if(o.getCodigoOperador().equals(codigo)){
                return o;
            }
        }

        return null;
    }

    //Metodo de compra de ticket general

    public boolean comprarTicketGeneral(String cedula, String codigo, LocalDate fecha, double precio){

        Visitante visitante = buscarVisitanteByCedula(cedula);

        if(visitante != null){
            Ticket newTicket = new Ticket(codigo, fecha, precio);

            visitante.setTheTicket(newTicket);
            return true;

        }

        return false;
    }


    //Metodo para crear, relacionar y guardar ticket familiar


    public boolean comprarTicketFamiliar(String cedula, String codigo, LocalDate fecha, double precio, double descuento){

        Visitante visitante = buscarVisitanteByCedula(cedula);

        if(visitante != null){
            Ticket newTicket = new Ticket(codigo, fecha, precio, descuento);

            visitante.setTheTicket(newTicket);
            return true;
        }

        return false;
    }



    //Metodo para crear, relacionar y guardar ticket Fast

    public boolean comprarTicketFast(String cedula, String codigo, LocalDate fecha, double  precio, int prioridadCola){

        Visitante visitante = buscarVisitanteByCedula(cedula);

        if(visitante != null){

            Ticket newTicket = new Ticket(codigo, fecha, precio, prioridadCola);

            visitante.setTheTicket(newTicket);
            return true;
        }

        return false;

    }


    public boolean agregarZona(Zona zona ){

        if(zona == null){
            return false;
        }

        for(Zona z: listaZonas){
            if(z.getCodigoZona().equals(zona.getCodigoZona()));
        }

        listaZonas.add(zona);
        return true;


    }

    //Metodo para eliminar zona

    public boolean eliminarZona(String codigo){

        Zona zona = buscarZonaByCodigo(codigo);

            if(zona != null){
                listaZonas.remove(zona);
                return true;
            }

            return false;
    }


    //metodo para actualizarZona

    public boolean actualizarZona(String codigo, String nombre, int capacidadMax){

        Zona zona = buscarZonaByCodigo(codigo);

        if(zona != null){
            zona.setNombre(nombre);
            zona.setCapacidadMax(capacidadMax);
            return true;
        }

        return false;
    }


    //Metodo para buscar Zona por codigo

    public Zona buscarZonaByCodigo(String codigoZona){

        for(Zona z: listaZonas){
            if(z.getCodigoZona().equals(codigoZona)){
                return z;
            }
        }

        return null;
    }


    public boolean agregarAtraccion(String codigoZona, String codigoAtraccion, String nombre, TipoAtraccion tipoAtraccion, int capacidadMax, double alturaMin, int edadMin, double costoAdicional, int tiempoEspera, EstadoAtraccion estadoAtraccion){

        Zona zona = buscarZonaByCodigo(codigoZona);


        if(zona != null){
            Atraccion newAtraccion = new Atraccion(codigoAtraccion, nombre, tipoAtraccion, capacidadMax, alturaMin, edadMin, costoAdicional, tiempoEspera, estadoAtraccion);


            return zona.agregarAtraccion(newAtraccion);
        }

        return false;
    }


    public boolean eliminarAtraccion(String codigo, String codigoAtraccion){


        Zona zona = buscarZonaByCodigo(codigo);

        if(zona != null){
            zona.eliminarAtraccion(codigoAtraccion);
        }
            return false;

    }


    public boolean actualizarAtraccion(String codigoZona, String codigoAtraccion, String nuevoNombre, TipoAtraccion nuevoTipoAtraccion, int nuevaCapacidad, double nuevaAlturaMin, int nuevaEdadMin, double nuevoCostoAdicional, int nuevoTiempoEspera){

        Zona zona = buscarZonaByCodigo(codigo);

        if(zona!=  null){
            zona.actualizarAtraccion(codigoAtraccion);
            return true;
        }

        return false;

    }


    //Metodo para activar la alarma


    public boolean activarAlarma(){


        for(Zona z: listaZonas){
            for(Atraccion a: z.getListaAtracciones()){
                if(a.getTipoAtraccion() == TipoAtraccion.ACUATICA || a.getTipoAtraccion() == TipoAtraccion.MECANICA){
                    a.cambiarEstado(EstadoAtraccion.CERRADA, "Se cerró por el clima");
                }
            }
        }


        if(listaVisitantes.isEmpty()){
            return false;
        }

            Notificacion notificacion = new Notificacion("Tormenta eléctrica fuerte, atracciones mecánicas y acuaticas cerradas hasta nuevo aviso", generarCodigoNotificacion(), LocalDate.now(), TipoNoti.CLIMA);

            for(Visitante v: listaVisitantes){
                if(v.getTheTicket() != null){
                    v.recibirNotificacion(notificacion);

                }
            }



        return true;

    }





















    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<TicketFast> getListTicketFast() {
        return listTicketFast;
    }

    public void setListTicketFast(ArrayList<TicketFast> listTicketFast) {
        this.listTicketFast = listTicketFast;
    }

    public ArrayList<TicketFamiliar> getListTicketFamiliar() {
        return listTicketFamiliar;
    }

    public void setListTicketFamiliar(ArrayList<TicketFamiliar> listTicketFamiliar) {
        this.listTicketFamiliar = listTicketFamiliar;
    }

    public ArrayList<TicketGeneral> getListTicketGeneral() {
        return listTicketGeneral;
    }

    public void setListTicketGeneral(ArrayList<TicketGeneral> listTicketGeneral) {
        this.listTicketGeneral = listTicketGeneral;
    }

    public ArrayList<Operador> getListaOperador() {
        return listaOperador;
    }

    public void setListaOperador(ArrayList<Operador> listaOperador) {
        this.listaOperador = listaOperador;
    }

    public ArrayList<Administrador> getListaAdministrador() {
        return listaAdministrador;
    }

    public void setListaAdministrador(ArrayList<Administrador> listaAdministrador) {
        this.listaAdministrador = listaAdministrador;
    }

    public ArrayList<Visitante> getListaVisitantes() {
        return listaVisitantes;
    }

    public void setListaVisitantes(ArrayList<Visitante> listaVisitantes) {
        this.listaVisitantes = listaVisitantes;
    }

    public ArrayList<Zona> getListaZonas() {
        return listaZonas;
    }

    public void setListaZonas(ArrayList<Zona> listaZonas) {
        this.listaZonas = listaZonas;
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
}
