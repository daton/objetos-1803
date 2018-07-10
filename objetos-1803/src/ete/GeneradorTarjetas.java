/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;

import java.util.ArrayList;

/**
 *
 * @author juan_
 */
public class GeneradorTarjetas {
    private ArrayList<Cliente> clientes;
    
    
    public GeneradorTarjetas(){
        clientes=new ArrayList<>();
        Tarjeta t1=new Tarjeta(1234,"Banamex",32000);
        Cliente c1=new Cliente("Juan", t1);
        clientes.add(c1);
        clientes.add(new Cliente("Ana", new Tarjeta(5678,"HSBC",17500)));
        clientes.add(new Cliente("Pedro", new Tarjeta(8765,"Scotia",19600))); 
       clientes.add(new Cliente("Irma", new Tarjeta(4321,"Bancomer",48000)));
    
    } 
    

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}
