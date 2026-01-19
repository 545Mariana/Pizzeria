/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.abst;

/**
 *  Interface que nos permite implementar el patron Observer para notificar cambios en los pedidos lo cual nos ayuda a controlar la interfaz de usuario.
 * @author Triplets
 */
public interface Subject {
    /**
     * MEtodos necesarios para registrar, eliminar y notificar a los observadores.
     * @param o
     */
    void registerObservers(Observador o);
    void removeObservers(Observador o);
    void notifyObservers(String mensaje);
    
}
