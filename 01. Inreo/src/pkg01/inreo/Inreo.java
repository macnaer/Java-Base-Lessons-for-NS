/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.inreo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author macnaer
 */
public class Inreo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader  buffered = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Hello World!");
//        System.out.println("Hello World!");
//        JOptionPane.showMessageDialog(null, "Hello World!");
//        System.out.print("What's your name? ");
//        String name = buffered.readLine();
//        System.out.print("How old are you? ");
//        int age = Integer.parseInt(buffered.readLine());
//        System.out.println("Name:  " + name + "\nAge: " + age);
        
//        int a = 0, b = 0;
//        System.out.print("Enter first number ");
//        a = Integer.parseInt(buffered.readLine());
//        System.out.print("Enter second number ");
//        b = Integer.parseInt(buffered.readLine());
//        
//        if (a > b){
//            System.out.println("a > b");
//        }
//        else if (a < b){
//            System.out.println("a < b");
//        }
//        else{
//            System.out.println("a = b");
//        }
//        int days = 0;
//        System.out.print("Enter day ");
//        days = Integer.parseInt(buffered.readLine());
//        
//        switch(days){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            default:
//                System.out.println("Wrong input data");
//        }
//        int SIZE = 10;
//        int[] arr = new int[SIZE];
//        
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = (int)(Math.random() * 50 +1);
//        }
//        
//        for (int i = 0; i < arr.length; i++){
//            System.out.println("arr [" + i + "] = " + arr[i]);
//        }

        int row = 5;
        int col = 4;
        int [][] arr = new int[row][col];
        
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                arr[i][j] = (int)(Math.random() * 50 +1);
            }
        }
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
