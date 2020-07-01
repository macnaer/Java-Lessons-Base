/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07.thred;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macnaer
 */
public class Thred {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Example 1 start
//        CustumThred ct1 = new CustumThred();
//        CustumThred ct2 = new CustumThred();
//        ct1.start();
//        ct2.start();
          // Example 1 end
          
          // Example 2 start 
          MyThred mt1 = new MyThred();
          mt1.start();
         
          Scanner scanner = new Scanner(System.in);
          scanner.nextLine();
          mt1.StopThread();
          System.out.println("Main thred");
          // Example 2 end
        
          
    }
    
}


class MyThred extends Thread{
    private volatile boolean running = true;
    private int counter = 0;
    @Override
    public void run(){
        while(running){     
             try {
                Thread.sleep(100);
                System.out.println("MyThred => " + counter++);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void StopThread(){
        this.running = false;
    }
}


class CustumThred extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10000; i++){
            try {
                Thread.sleep(100);
                System.out.println("CustumThred => " + i);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
