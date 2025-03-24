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
public class Prova1 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
       
        Scanner PompeuViado = new Scanner (System.in);
        System.out.println("Digite um numero de viadice do Pompeu: ");
        int numero = PompeuViado.nextInt () ;
        for (int i = 0; i  <= numero; i++)   
    {
        System.out.println("O numero de viadice e: " + i);
    }
    }
}
    
        
