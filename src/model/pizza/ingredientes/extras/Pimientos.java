/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.pizza.ingredientes.extras;


/**
 * Ingrediente Concreto de Extras. Es creado a traves de ExtrasFabrica.
 * @author Triplets
 */
public class Pimientos extends Extras{
    private final String nombre;
    private final Double precio;

    public Pimientos() {
        this.nombre = "Pimientos";
        this.precio = 17.0;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Double getPrecio() {
        return precio;
    }
    
}