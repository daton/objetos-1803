/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads2;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Aplicacion implements Runnable{
    public static void main(String[] args) {
        Runnable r=new Aplicacion();
        Thread t1=new Thread(r);
        t1.start();
    }
    public void run(){
  while(true){
      LocalTime time=LocalTime.now();
      int hora=time.getHour();
      int minuto=time.getMinute();
      int segundo=time.getSecond();
      System.out.println(hora+":"+minuto+":"+segundo);
      try {
          Thread.sleep(1000);
      } catch (InterruptedException ex) {
    
      }
  }
    }
}
