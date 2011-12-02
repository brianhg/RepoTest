/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebassimples;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 *
 * @author Alejandro Pimentel
 */
public class PruebaBigDecimal {

    public static void main(String... args){

        MathContext mc = new MathContext(3);

        BigDecimal obj_0 = new BigDecimal(.050),
        obj_1 = new BigDecimal(40.022);
        System.out.println("obj_0 value : " + obj_0);
        System.out.println("method generated " +
            "result : " + obj_0.round(mc));

        System.out.println("obj_1 value : " + obj_1);
        System.out.println("method generated result" +
            " : " + obj_1.round(mc));

        obj_0 = new BigDecimal(0.1220);
        obj_1 = new BigDecimal(.636);

        System.out.println("\nobj_0 value : " + obj_0);
        System.out.println("method generated result" +
            " : " + obj_0.round(mc));

        System.out.println("obj_1 value : " + obj_1);
        System.out.println("method generated result" +
            " : " + obj_1.round(mc));

        obj_0 = new BigDecimal(5.0);
        obj_1 = new BigDecimal(-1.0);

        System.out.println("\nobj_0 value : " + obj_0);
        System.out.println("method generated result" +
            " : " + obj_0.round(mc));

        System.out.println("obj_1 value : " + obj_1);
        System.out.println("method generated result" +
            " : " + obj_1.round(mc));

    }
}
