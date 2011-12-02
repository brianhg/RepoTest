/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebassimples;

import java.util.Locale;

/**
 * Prueba simple de un Locale
 *
 * @author alejandro
 */
public class CrearLocale {

    public static void main(String... args){
        String code1 = "es_MX";
        String code2 = "es";

        System.out.println(crearLocale(code1));
        System.out.println(crearLocale(code2));
    }

    public static Locale crearLocale(String code){
        String[] result = code.split("_");
        
        if(result.length > 1){
            return new Locale(result[0],result[1]);
        }

        return new Locale(result[0]);
    }
}
