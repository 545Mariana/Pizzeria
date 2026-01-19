/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Usuario
 */

import model.Cliente;
import model.Pedido;

public class testEstado {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(0);
        Pedido pedido = new Pedido(cliente);
        pedido.recibirPedido();
    }
}

