/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.io.*;
public class PersistenciaUsuario {
    
   //Primero guardamos
    public static void guardar(Cliente c)throws Exception{
      //Paso 1 generar el archivo donde se va a guardar
      //nuestro serializado
      File file=new File("/home/campitos/Documents/archivaldo.yomero");
      
     //Paso 2 es indicar que lo vamos a generar para escribir en el
      
     FileOutputStream fos=new FileOutputStream(file);
    //Escribir un obejo en el
    
    ObjectOutputStream oos=new ObjectOutputStream(fos);
     oos.writeObject(c);
     oos.close();
    }
    
}
