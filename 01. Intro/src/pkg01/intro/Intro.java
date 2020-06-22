/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author macnaer
 */
public class Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
    //System.out.print("Hello World!");
    //System.out.println("Hello World!");
    //JOptionPane.showMessageDialog(null, "Hello World");
//    System.out.println("Enter number => ");
//    int a = Integer.parseInt(buffered.readLine());
//    System.out.println("Result = " + a);
    
//    System.out.print("Enter first number => ");
//    int number1 = Integer.parseInt(buffered.readLine());
//    System.out.print("Enter second number => ");
//    int number2 = Integer.parseInt(buffered.readLine());
    
//    double result = (double)number1 / number2;
//    System.out.println("Result = " + result);
    
//    if (number1 < number2){
//        System.out.println("number1 < number2");
//    }else if(number1 > number2){
//        System.out.println("number1 > number2");
//    }else{
//        System.out.println("number1 = number2");
//    }

//    String number1, number2;
//    number1 = JOptionPane.showInputDialog(null, "Enter first number ", JOptionPane.QUESTION_MESSAGE);
//    number2 = JOptionPane.showInputDialog(null, "Enter second number ", JOptionPane.QUESTION_MESSAGE);
//    int num1 = Integer.parseInt(number1);
//    int num2 = Integer.parseInt(number2);
//    
//    if (num1 < num2){
//        JOptionPane.showMessageDialog(null, "number1 < number2");
//    }else if(num1 > num2){
//        JOptionPane.showMessageDialog(null, "number1 > number2");
//    }else{
//        JOptionPane.showMessageDialog(null, "number1 = number2");
//    }

//    int[] arr = new int[10];
//    for (int i = 0; i < arr.length; i++){
//        arr[i] = (int)(Math.random() * 50 + 1);
//    }
//    
//    for (int i = 0; i < arr.length; i++){
//        System.out.println(arr[i]);
//    }
    
    int row = 5;
    int col = 5;
    int[][] arr = new int[row][col];
    
    for(int i = 0; i < row; i++){
        for(int j = 0; j < col; j++){
            arr[i][j] = (int)(Math.random() * 50 + 1);
        }
    }
    
    for(int i = 0; i < row; i++){
        for(int j = 0; j < col; j++){
            System.out.print(arr[i][j] + "\t"); 
        }
        System.out.println();
    }
  }
}
