/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas1;

import java.time.LocalTime;

/**
 *
 * @author juan_
 */
public class Relojito extends Thread{
    
    
    public void run(){
        while(true){
        LocalTime tiempo=LocalTime.now();
        int hora=tiempo.getHour();
        int minuto=tiempo.getMinute();
        int segundo=tiempo.getSecond();
        System.out.println("La hora es:"+hora+":"+minuto+":"+segundo);
        try{
            Thread.sleep(1000); 
        }catch(InterruptedException e){
            
        }
        
      }
    }
}
