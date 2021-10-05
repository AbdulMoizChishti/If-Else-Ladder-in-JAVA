/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelseladder;

/**
 *
 * @author Abdul Moiz Chishti
 */
import java.util.Scanner;
public class IfElseLadder {
    public static void main(String[] args) {
     Scanner obj=new Scanner(System.in);
        System.out.print("Enter Your Salary:");
    int sal=obj.nextInt();
if (sal >=25000 && sal<=35000){
    System.out.println("Your designation is Research Assistant");
}
else if (sal >=36000 && sal<=50000){
    System.out.println("Your designation is Junior Lecturer");        
       }
else if (sal >=51000 && sal<=65000){
    System.out.println("Your designation is Lecturer");        
}
    else if (sal >=66000 && sal<=80000){
    System.out.println("Your designation is Assistant Professor");        
   
}
    }
}
