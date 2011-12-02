/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebassimples;

import java.text.MessageFormat;

/**
 *
 * @author Alejandro Pimentel
 */
public class PruebaMessageFormat {
    
    public static void main(String... args){
        String pattern = "El campo ''{0}'' en la fila {1} es requerido.";
        MessageFormat mf = new MessageFormat(pattern);
        
        Object[] argsToUse = {"campo  1","campo2"};
        
        String r = mf.format(argsToUse);
        
        System.out.println(r);
    }
    
}
