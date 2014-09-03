/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project1;

/**
 *
 * @author Yifei
 * @serial 1.0.0
 * @since 30/08/2014
 */
import java.util.Calendar;
import java.util.Scanner;

public class Assignment2 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Your job is to type the sentence \"I type very "
                + "quickly\" as fast as you can.");
        System.out.println("When you are ready, press enter, type the sentence, "
                + "and press enter again.");
        System.out.println("Now press enter...");
        Scanner input = new Scanner(System.in);
        String enter = input.nextLine();
        if (enter.equals("")){
            Calendar start = Calendar.getInstance();
            String typing = input.nextLine();
            if (typing.equals("I type very quickly")) {
                Calendar end = Calendar.getInstance();
                long time = end.getTimeInMillis()- start.getTimeInMillis()   ;
                System.out.println(time);
            } else {
                System.out.println("Input is incorrect");
            }
        }
    }
    
}
