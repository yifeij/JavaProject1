/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project1;

/**
 *
 * @author Yifei
 * @version 1.0.0
 * @since 30/08/2014
 */
import java.util.Scanner;

public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Input
        //Create arrays of the name, quantity, price of item  
        String name[] = new String[3];
        int quantity[] = new int[3];
        double price[] = new double[3];
                
        // Prompt the user to enter the name of name
        int i;
        for (i=0; i<3; i++) {
            // Create a Scanner object
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the name, quantity, price of name 
            System.out.println("Input name of item " + (i+1) + ":");
            name[i] = input.nextLine();
            System.out.println("Input quantity of item " + (i+1) + ":");
            quantity[i] = input.nextInt();
            System.out.println("Input price of item" + (i+1) + ":");
            price[i] = input.nextDouble();
        }
        //Output
        System.out.println("Your bill:");
        System.out.printf("%-30s%-10s%-10s%-10s\n","Item","Quantity","Price","Total");
        for (i=0; i<3; i++) {
            System.out.printf("%-30s%-10d%-10.2f%-10.2f\n",name[i],quantity[i],price[i],quantity[i]*price[i]);
        }
        double subtotal = quantity[0]*price[0] + quantity[1]*price[1] + quantity[2]*price[2];
        System.out.printf("%-50s%-10.2f\n", "Subtotal",subtotal);
        double tax = 0.0625*subtotal;
        System.out.printf("%-50s%-10.2f\n","6.25% sales tax",tax);
        double total = subtotal -tax;
        System.out.printf("%-50s%-10.2f\n","Total",total);
       
    }
    
}
