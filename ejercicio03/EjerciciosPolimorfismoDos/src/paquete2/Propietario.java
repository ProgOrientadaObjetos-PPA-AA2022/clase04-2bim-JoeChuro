/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author SALA I
 */
public class Propietario {
    private String nombre;
    private String apellido;
    private int edad;
    
    public Propietario(String n, String a, int e){
    nombre = n;
    apellido = a;
    edad = e;
    }
    
    public void establecerNombre(String n){
    nombre = n;
    }
    public void establecerApellido(String a){
    apellido = a;
    }
    public void establecerEdad(int e){
    edad = e;
    }
    public String obtenerNombre(){
    return nombre;
    }
    public String obtenerApellido(){
    return apellido;
    }
    public int obtenerEdad(){
    return edad;
    }
    public String toString(){
    String cadena = String.format("Nombre: %s\n"
            + "Apellido: %s\n"
            + "Edad: %d", nombre, apellido, edad);
    return cadena;
    }
}
