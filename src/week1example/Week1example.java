/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week1example;

import java.util.Scanner;


public class Week1example {

  
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner sc = new Scanner(System.in);
  
  System.out.println("hi?");
  String name=sc.next();
           
       //stp2 for split char and store in array
  char[] reverse = new char[name.length()];
  for(int i=0; i<name.length(); i++)
         {
            
             
                reverse[i]=name.charAt(i);
            
       
       }
       
       //step3 for reverse 
       for(int i= reverse.length-1; i>=0;i--)
       {
       
       System.out.print(reverse[i]);
       
       }
           
   
   
   
    
  
    }
    
}
