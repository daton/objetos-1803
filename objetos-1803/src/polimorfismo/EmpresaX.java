/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author campitos
 */
public class EmpresaX {
    public static void main(String[] args) {
        Planta p1=new Planta();
        Planta p2=new Planta();
        
        Honrarios h1=new Honrarios();
        Honrarios h2=new Honrarios();
        Honrarios h3=new Honrarios();
        
        Proyecto pro1=new Proyecto();
        
    Trabajador []trabajadores={p1, p2,h1,h2,h3,pro1, new Proyecto() };
        
        for(Trabajador t:trabajadores){
            t.pagar();
        }
                
    }
}
