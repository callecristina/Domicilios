package com.domicilios;

/**
 *
 * @author yooooo
 */
public class Vehiculo {
    protected String marca;
    protected String placa;
    
    public String asignarVehiculo(Persona persona, Vehiculo vehiculo){
        String p;
        p = vehiculo.placa;
        String nombre=persona.nombre;
        var vehiculoasignado=("el vehiculo con placa"+ p + "es asignado a " + nombre );
        return vehiculoasignado;
        
    }
    
}
