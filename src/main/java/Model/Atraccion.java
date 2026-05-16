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
    private ArrayList<Operador> listaOperadoresAsignados;
    private ArrayList<Visitante> listaVisitantes;
    private String motivoCierre;


    public Atraccion(String id, String nombre, TipoAtraccion tipoAtraccion, int capacidadMax, double alturaMin, int edadMin, double costoAdicional, int contadorVisitantes, int tiempoEspera, EstadoAtraccion estadoAtraccion, ArrayList <Operador> listaOperadoresAsignados, ArrayList<Visitante> listaVisitantes, String motivoCierre ) {
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
        this.listaOperadoresAsignados= listaOperadoresAsignados;
        this.listaVisitantes = listaVisitantes;
        this.motivoCierre = motivoCierre;
    }

    public boolean estaDisponible () {
        return this.estadoAtraccion == EstadoAtraccion.ACTIVA;
        }

    public boolean tieneOperador () {
        for (Operador operador : listaOperadoresAsignados) {
            return true;
        } return false;
    }

    public boolean asignarOperador (Operador operador) {
        for (Operador o: listaOperadoresAsignados) {
            if (o.getDocumento().equals(operador.getDocumento())) {
                return false;
            }
        } listaOperadores.add (operador);
        return true;
    }

    public void cambiarEstado (EstadoAtraccion estadoAtraccion, String motivo) {
        this.estadoAtraccion = estadoAtraccion;
        if (estadoAtraccion == EstadoAtraccion.ACTIVA) {
            this.motivoCierre = null;
        } else {
            this.motivoCierre = motivo;
        }
    }

    public boolean registrarRevisionTecnica () {
        if (this.estadoAtraccion == EstadoAtraccion.EN_MANTENIMIENTO) {
            cambiarEstado (EstadoAtraccion.ACTIVA, null);
            contadorVisitantes = 0;
            return true;
        }
        return false;
    }

    public boolean registrarIngreso () {
        contadorVisitantes = contadorVisitantes ++;
        if (contadorVisitantes == 500) {
            cambiarEstado(EstadoAtraccion.EN_MANTENIMIENTO, "Mantenimiento preventivo");
            return false;
        }
        return true;
    }

    public boolean validarAcceso (Visitante visitante) {
        if (!estaDisponible()) {
            return false;
        }
        if (visitante.getEdad() < this.edadMin) {
            return false;
        }
        if (visitante.getEstatura() < this.alturaMin) {
            return false;
        }
        if (this.costoAdicional > 0 && visitante.getTicket() instanceof TicketGeneral) {
            if (visitante.getSaldoVirtual() < this.costoAdicional) {
                return false;
            }
        }
        return true;
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
    public ArrayList<Operador> getListaOperadoresAsignados () {
        return listaOperadoresAsignados;
    }

    public void setListaOperadoresAsiganados (ArrayList<Operador> listaOperadoresAsiganados) {
        this.listaOperadoresAsignados = listaOperadoresAsignados ;
    }

    public String getMotivoCierre() {
        return motivoCierre;
    }

    public void setMotivoCierre(String motivoCierre) {
        this.motivoCierre = motivoCierre;
    }
}






