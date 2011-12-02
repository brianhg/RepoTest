/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Aqui ya cumplí con la prueba de github
 */

package pruebassimples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author alejandro
 */
public class ExpresiónRegularMensaje {

    public static void main (String... args){
        formaMinimaCodigoMensaje();
    }

    public static void inicioMensaje() {
        String codSimple = "menu.";

        Pattern pattern = Pattern.compile("^[menu\\.]");

//        Matcher matcher1 = pattern.matcher(code1);
    }

    public static void paramMensaje(){
        String mensaje1 = "El catálogo {0} no está personalizado para su idioma:";
        String mensaje2 = "Configuración Multi Idioma";

        Pattern pattern = Pattern.compile("(\\{\\d\\})+");
        Matcher matcher1 = pattern.matcher(mensaje1);
        Matcher matcher2 = pattern.matcher(mensaje2);

        System.out.println(matcher1.find());
        System.out.println(matcher2.find());
    }

    public static void formaMinimaCodigoMensaje() {
        String code1 = "contexto.codigo1";
        String code2 = "contexto.codigo1.subcodigo";
        String code3 = "estenopasa";
        String code4 = "estetampoco.";
        String code5 = "";
        String code6 = "..tampoco";
        String code7 = ".tampoco";
        String code8 = "tampoco.debería.ss....f";
        String code9 = "tampoco..";
        String code10 = ".b.c";
        String code11 = "b.b";
        String code12 = "bb.c.dksdh.disu";

//        Pattern pattern = Pattern.compile(".+\\..+");
        Pattern pattern = Pattern.compile("^[^.]+\\.[^.]+");

        Matcher matcher1 = pattern.matcher(code1);
        Matcher matcher2 = pattern.matcher(code2);
        Matcher matcher3 = pattern.matcher(code3);
        Matcher matcher4 = pattern.matcher(code4);
        Matcher matcher5 = pattern.matcher(code5);
        Matcher matcher6 = pattern.matcher(code6);
        Matcher matcher7 = pattern.matcher(code7);
        Matcher matcher8 = pattern.matcher(code8);
        Matcher matcher9 = pattern.matcher(code9);
        Matcher matcher10 = pattern.matcher(code10);
        Matcher matcher11 = pattern.matcher(code11);
        Matcher matcher12 = pattern.matcher(code12);

        System.out.println(matcher1.find());
        System.out.println(matcher2.find());
        System.out.println(matcher3.find());
        System.out.println(matcher4.find());
        System.out.println(matcher5.find());
        System.out.println(matcher6.find());
        System.out.println(matcher7.find());
        System.out.println(matcher8.find());
        System.out.println(matcher9.find());
        System.out.println(matcher10.find());
        System.out.println(matcher11.find());
        System.out.println(pattern.matcher(code12).find());
    }

}
