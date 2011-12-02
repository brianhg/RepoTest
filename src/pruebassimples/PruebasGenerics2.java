package pruebassimples;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro Pimentel
 */
public class PruebasGenerics2 {

    public static void main(String... args) {
        new PruebasGenerics2();
    }

    public PruebasGenerics2() {
        List<Entidad2> listaE2 = new ArrayList<Entidad2>();
        IGenLista gl1 = new GenLista();
        IEntidad e1a = new Entidad1();
        Entidad2 e2a = new Entidad2();

        gl1.get().add(e1a);
        gl1.set(listaE2);
    }

    interface IEntidad {
        
    }

    class Entidad1 implements IEntidad {

    }

    class Entidad2 implements IEntidad {

    }

    interface IGenLista<E extends IEntidad> {
        List<E> get();

        void set(List<E> lista);
    }

    class GenLista implements IGenLista<IEntidad> {

        public List<IEntidad> lista;

        public List<IEntidad> get() {
            return lista;
        }

        public void set(List<IEntidad> lista) {
            this.lista = lista;
        }

    }
}
