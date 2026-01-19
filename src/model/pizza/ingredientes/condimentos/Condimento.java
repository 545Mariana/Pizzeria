/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.pizza.ingredientes.condimentos;
import model.abst.Ingrediente;

/**
 * Clase abstracta que representa un condimento en la pizza.
 * Hereda de la interfaz Ingrediente.
 * Proporciona una implementación común para los métodos getTipo() y toString().
 * @author Triplets
 */
public abstract class Condimento implements Ingrediente {
    private String tipo="condimento";

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return getNombre() + "\nPrecio: " + getPrecio();
    }
}
