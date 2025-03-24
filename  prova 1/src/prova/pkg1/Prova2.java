/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova.pkg1;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Prova2 {


    /**
     * @param args the command line arguments
     */
    
    

    public static void main(String[] args) 
    {
        // TODO code application logic here
       Scanner teclado = new Scanner (System.in);
     System.out.println("Digite um numero: ");
    int numero = teclado.nextInt();
    
    while (numero <= 999999999)
    {
        System.out.println("numero e: "+numero--);
    }
}
}
    
        
