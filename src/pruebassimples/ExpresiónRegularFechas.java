/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebassimples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author alejandro
 */
public class ExpresiónRegularFechas {

    public static void main (String... args){
        String fc1 = "26/04/1986";

        Pattern pattern = Pattern.compile("^\\d{2}\\/\\d{2}\\/\\d{4}$");

        Matcher matcher1 = pattern.matcher(fc1);  
        
        System.out.println(matcher1.matches());
        
        String fl1 = "26/04/1986 10:54:23";

        Pattern pattern2 = Pattern.compile("^\\d{2}\\/\\d{2}\\/\\d{4} \\d{2}:\\d{2}:\\d{2}$");

        Matcher matcher2 = pattern2.matcher(fl1);  
        
        System.out.println(matcher2.matches());
    }
   
}
