/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner  Scanner = new Scanner(System.in );
        System.out.println("Introduce el numero ");
     
        int lista = Scanner.nextInt(),num=0,num1=1, sum=1;
        for (int a=1; a<=lista ; a++){
            System.out.println("La serie es " +num);
            
            sum=num+num1;
            num=num1;
            num1=sum;
            
            
        }
        

               
                
                
                
                
    }
}
