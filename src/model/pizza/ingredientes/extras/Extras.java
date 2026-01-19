/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.pizza.ingredientes.extras;
import model.abst.Ingrediente;

/**
 * Clase abstracta que representa un ingredeinet extra en la pizza.
 * Hereda de la interfaz Ingrediente.
 * Proporciona una implementación común para los métodos getTipo() y toString().
 * @author Triplets
 */
public abstract class Extras implements Ingrediente {
    private String tipo="extras";

    public String getTipo() {
        return tipo;
    }

    public String toString() {
        return getNombre() + "\nPrecio: " + getPrecio();
    }
}