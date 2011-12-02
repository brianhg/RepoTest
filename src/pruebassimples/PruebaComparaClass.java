/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebassimples;

/**
 *
 * @author alejandro
 */
public class PruebaComparaClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String s1 = "Alex";
        String s2 = "Paco";

        Integer i1 = 345;

        if(s1.getClass() == s2.getClass()){
            System.out.println("Son la misma instancia. s1.getClass() == s2.getClass()");
            System.out.println("hashcode s1: " + s1.getClass().hashCode());
            System.out.println("hashcode s2: " + s2.getClass().hashCode());
        }

        //Tipos no comparables.
//        if(i1.getClass() == s2.getClass()){
//            System.out.println("Son la misma instancia. s1.getClass() == s2.getClass()");
//        }

        if(s1.getClass().equals(s2.getClass())){
            System.out.println("El equals funciona. s1.getClass().equals(s2.getClass())");
        }

        if(i1.getClass().equals(s2.getClass())){
            System.out.println("El equals funciona. i1.getClass().equals(s2.getClass())");
        }
    }

}
