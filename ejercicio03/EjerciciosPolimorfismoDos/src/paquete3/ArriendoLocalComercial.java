/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Arriendo;
import paquete2.Propietario;

/**
 *
 * @author reroes
 */
public class ArriendoLocalComercial extends Arriendo {

    protected double valorAdicionalFijo;
    protected Propietario nombre;

    public ArriendoLocalComercial(Propietario arrendatarios,double cuotaB) {
        super(arrendatarios, cuotaB);
    }
/*  
    @Override
    public void establecerNombreArrendatario(Propietario nombre) {
        nombre = arrendatarios.obtenerNombre().toUpperCase()
    }*/

    public void establecerValorAdicionalFijo(double x) {
        valorAdicionalFijo = x;
    }

    @Override
    public void establecerArriendoMensual() {
        arriendoMensual = obtenerCuotaBase() + obtenerValorAdicionalFijo();
    }

    public double obtenerValorAdicionalFijo() {
        return valorAdicionalFijo;
    }

    @Override
    public String toString() {
        String cadena = String.format("Arriendo de Local Comercial\n"
                + "%s\n"
                + "Cuota base: %.2f\n"
                + "Valor adicional fijo: %.2f\n"
                + "Arriendo Total: %.2f\n",
                obtenerNombreArrendatario(),
                obtenerCuotaBase(),
                obtenerValorAdicionalFijo(),
                obtenerArriendoMensual());

        return cadena;
    }
}
