/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author kerati
 */
import java.util.Scanner;

public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("--------- Welcome to SKE Restaurant ---------");
               System.out.println("1.) Pizza      250 Baht.");
               System.out.println("2.) Chickens   120 Baht.");
               System.out.println("3.) Coke       45  Baht.");
               System.out.println("4.) Total");
               System.out.println("5.) Exit");
               
               int choice = 0,sum1 = 0,sum2 = 0 ,sum3 = 0,sum4 = 0,q1=0,q2=0,q3=0;
               
               while(choice<=4){
               System.out.print("Enter your choice: ");
               int c = scan.nextInt();
               switch(c)
               {
                   case 1 :
                       System.out.print("Enter Quantity: ");
                        q1 = scan.nextInt();
                       System.out.print("");
                        sum1 = q1*250;
                        break;
                   case 2 :
                       System.out.print("Enter Quantity: ");
                       q2 = scan.nextInt();
                       System.out.print("");
                        sum2 = q2*120;
                       break;
                   case 3 :
                       System.out.print("Enter Quantity: ");
                        q3 = scan.nextInt();
                       System.out.print("");
                        sum3 = q3*45;
                        break;
                   case 4 :
                        sum4 = sum1+sum2+sum3;
                       
                        System.out.println("+------ Menu ------+-- Qty --+-- Price --+");
                        
                        if(q1 != 0)
                        {
                            
                        System.out.printf("| Pizza\t\t\t| \t %d |\t %d \t|%n",q1,sum1);
                        }
                        if(q2 != 0)
                        {
                            System.out.printf("| Chickens\t\t| \t %d |\t %d \t |%n",q2,sum2);
                        }
                        if(q3 != 0)
                        {
                            System.out.printf("| Coke\t\t| \t %d |\t %d \t |%n",q3,sum3);

                        }
                        if(1==1)
                        {
                            System.out.printf("+-------------------+-----------+");
                        }
                        if(1==1)
                        {
                            System.out.printf("| Total\t\t\t|\t %d \t|%n",sum4);
                        }
                        if(1==1)
                        {
                            System.out.println("+----------------------------+-----------+");
                        }
                        
                        default :
                        System.out.println("==== Thanl you ====");
                        break;
               }
           
               }                
               }
           
               
    }
    

