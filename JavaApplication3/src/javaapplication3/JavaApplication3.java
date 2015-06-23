/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import javax.swing.JOptionPane;

/**
 *
 * @author laoratorio
 */

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      /*  JOptionPane.showMessageDialog(null, "Hola "// Solo muestra un mensaje en pantalla, si quieres recibir del usuario usa lo siguiente
          // LLama primero las entradas y de ultimo llama el showMessage, hay que ser validación de que si la entrada es null no llame a showMessage
        + JOptionPane.showInputDialog("Di tu nombre") 
        +" mucho gusto");*/
        
        //La validación sería:
        
        String valor = JOptionPane.showInputDialog("Di tu nombre");
        
        if (valor != null) {
         JOptionPane.showMessageDialog(null, "Hola "
          + valor   
          +" mucho gusto"
         
         );
            
        }//Fin del if
    }
    
}
