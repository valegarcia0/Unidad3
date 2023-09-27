/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner practica  = new Scanner(System.in);
     
        System.out.println("Ingresa numero");
        int num=practica.nextInt();
        if (num%2==0){
            System.out.println("El numero ingresado es par");
        }
        else {
            System.out.println("El numero ingresado es impar");
        }
        practica.close();
        
   

    }
    
}
