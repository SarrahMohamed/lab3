/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;

/**
 *
 * @author sara
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        // TODO code application logic here
        person p=new person();
       
       Class s= ArrayList.class;
      System.out.println( s.getClassLoader());
       
         // returns the Class object associated with this class
     /*   Class cls = Class.forName("lab3.person");
       person pw=(person) cls.newInstance();
      System.out.print(pw.department);*/
      
         // returns the ClassLoader object associated with this Class.
         Class C=p.getClass();
         ClassLoader cLoader = C.getClassLoader();

         if (cLoader == null) {
            System.out.println("The default system class was used.");
         } else {
            // returns the class loader
            Class loaderClass = cLoader.getClass();

            System.out.println("Class associated with ClassLoader = " +
            loaderClass.getName());
         }
      
    }
    
}
