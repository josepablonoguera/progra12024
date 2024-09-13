/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ARRAYS;

import java.io.IOException;
import java.util.Date;

/**
 *
 * @author ucr
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        int vector [] = new int[10];  
//        
//        int vec2 [] = {1,2,3,4,5,6,7,8};      
        
        
        Object matriz [][] = {
            {1,2,new String("hola mundo")},
            {4,"5",6},
            {7,8,new Aula("aula 4")}
        }; 
         
        for (int i = 0; i < matriz.length; i++) { // filas
            for (int j = 0; j < matriz[0].length; j++) { //columnas
                if ( j!=matriz[0].length-1) {
                       
                    System.out.print(matriz[i][j] + ",");
                }else{
                     if (matriz[i][j].getClass().getSimpleName().equalsIgnoreCase("Aula")) {
                        System.out.print(((Aula)matriz[i][j]).toString());
                    }else{
                    System.out.print(matriz[i][j]);
                    }
                }
            }
            System.out.println("");
        }
        
       
//        for (int i = 0; i < vector.length; i++) {
//            vector[i] = System.in.read();
//            if (vector[i] == 10) {
//                i = vector.length;
//            }
//        }
//        
//        for (int j = 0; j < vector.length; j++) {
//            System.out.println((char)vector[j]);
//        }
//       

    }
    
}

class Aula{
  String id;

    public Aula(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aula{id=").append(id);
        sb.append('}');
        return sb.toString();
    }
  
    
   

}
