/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebassimples;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

/**
 *
 * @author alejandro
 */
public class SimpleCompileTest {

    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
        String fileToCompile = "MyClass.java";
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int compilationResult = compiler.run(null, null, null, fileToCompile);
        if (compilationResult == 0) {
            System.out.println("Compilation is successful");
        } else {
            System.out.println("Compilation Failed");
        }

        File outputDir = new File("MyClass");
        URL[] urls = new URL[]{outputDir.toURL()};
        URLClassLoader ucl = new URLClassLoader(urls);
        Class clazz = ucl.loadClass("MyClass");
    }
}


