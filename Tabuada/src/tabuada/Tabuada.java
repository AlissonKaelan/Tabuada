/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuada;
import java.util.Scanner;

/**
 *
 * @author Alisson Kaelan
 */
public class Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Insira um number: ");
        System.out.println();
        
        int num1 = in.nextInt();
        
        System.out.println("Tabuada  multiplicação: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(num1 + " x " + (i + 1 + " = " + (num1 * (i + 1))));
            
            
            
        }
            System.out.println("Tabuada subtração: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(num1 + " - " + (i + 1 + " = " + (num1 - (i + 1))));
            
        }
            System.out.println("Tabuada adição: ");
         for (int i = 0; i < 10; i++) {
            System.out.println(num1 + " + " + (i + 1 + " = " + (num1 + (i + 1))));
            
        }
         
            System.out.println("Tabuada divisão: ");
         for (int i = 0; i < 10; i++) {
            System.out.println(num1 + " % " + (i + 1 + " = " + (num1 / (i + 1))));
            
        }
        
        
    }
    
}
