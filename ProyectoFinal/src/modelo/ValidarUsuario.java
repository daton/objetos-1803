/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author juan_
 */
public class ValidarUsuario {
    
    
    public static void autenticar(Usuario u)
            throws UsuarioNoVaidoException{
if(!(u.getLogin().equals("juan")&&u.getPassword().equals("1234")))
    throw new UsuarioNoVaidoException();
    }
            
}
