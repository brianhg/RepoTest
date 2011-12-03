/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebassimples;

/**
 * Algunas pruebas sobre strings
 *
 * @author alejandro
 */
public class StringTests {

    public static void main (String... args){
        String codigo = "catalogos.genericos.consulta.total";
        String nombreEntidad = "1_112";
        String códigoEntidadCampo = "1_112.descripción";

        String contexto = codigo.substring(0, codigo.indexOf('.'));
        System.out.println(contexto);

        String codigoMensaje = codigo.substring(codigo.indexOf('.')+1, codigo.length());
        System.out.println(codigoMensaje);

        String claveCatálogo = nombreEntidad.substring(nombreEntidad.indexOf('_')+1);
        System.out.println(claveCatálogo);

        String nombreCampo = códigoEntidadCampo.substring(códigoEntidadCampo.indexOf('.')+1);
        System.out.println(nombreCampo);

        String nullString = null;
        System.out.println(nullString + null);
    }
}
