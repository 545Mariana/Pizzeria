/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.abst;

/**
 * Interface que nos permite implementar el patron State para los estados de un pedido
 * 
 * @author Triplets
 * @version 1.0
 * @see model.estadoPedido.*
 * @see model.Pedido
 */
public interface EstadoPedido {
    /**
     * Los siguientes metodos son los que nos permiten realizar las distintas acciones a lo largo del proceso
     * de un pedido, cada metodo cambia el estado del pedido al siguiente estado correspondiente.
     */
    public void recibirPedido();
    public void prepararPedido();
    public void cocinarPedido();
    public void empaquetarPedido();
    public void entregarPedido();
    public String getEstadoNombre();
}

