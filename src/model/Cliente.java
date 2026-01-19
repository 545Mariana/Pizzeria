/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Esta clase nos permite tener el registro de los clientes que usan el sistema.
 * Cada cliente tiene un id unico.
 * @author Triplets
 */
public class Cliente {
    private int idCliente;

    public Cliente(int idCliente){
        this.idCliente = idCliente;
    }

    public int getIdCliente(){
        return idCliente;
    }

    public String toString(){
        return "Cliente: " + idCliente;
    }

}
