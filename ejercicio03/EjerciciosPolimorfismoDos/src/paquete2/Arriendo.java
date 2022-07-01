/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public abstract class Arriendo {
    
    protected Propietario arrendatarios;
    protected double arriendoMensual;
    protected double cuotaBase;
    
    public Arriendo(Propietario nombre, double cuotaB){
        // nombreArrendatario = nombre;
        establecerNombreArrendatario(nombre);
        cuotaBase = cuotaB;
    }
    
    public void establecerNombreArrendatario(Propietario nombre){
        arrendatarios = nombre;
    }
    
    public void establecerCuotaBase(double x){
        cuotaBase = x;
    }
    
    public abstract void establecerArriendoMensual();
    
    public Propietario obtenerNombreArrendatario(){
        return arrendatarios;
    }
    
    public double obtenerCuotaBase(){
        return cuotaBase;
    }
    
    public double obtenerArriendoMensual(){
        return arriendoMensual;
    }
    
    
}
