/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.abst;

/**
 * Interface que representa un ingrediente en la pizzería.
 * Todos los tipos de ingredientes van a impementar esta interfaz para poder tener un buen manejo de los ingredientes.
 * @author Triplets
 * @version 1.0
 */
public interface Ingrediente {
    /**
     * Métodos para obtener información del ingrediente.
     */
    String getTipo();
    String getNombre();
    Double getPrecio();
    String toString();
}

