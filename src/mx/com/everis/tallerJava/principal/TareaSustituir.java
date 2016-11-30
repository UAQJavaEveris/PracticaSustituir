/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.everis.tallerJava.principal;

/**
 *
 * @author Abel
 */
public class TareaSustituir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreCompleto="Gustavo Sanchez Estrada";
        
        String [] nombreArray=nombreCompleto.split(" ");
        
        String nombreConNumeros="";
        
        for (int i=0;i<nombreArray.length;i++){
            nombreConNumeros=nombreConNumeros+nombreArray[i]+"7";
        }
        System.out.println(nombreConNumeros);
    }
    
}
