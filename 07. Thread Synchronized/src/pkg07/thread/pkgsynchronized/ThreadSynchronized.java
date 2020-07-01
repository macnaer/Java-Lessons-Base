/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07.thread.pkgsynchronized;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macnaer
 */
public class ThreadSynchronized {

    /**
     * @param args the command line arguments
     */
    
    private int counter; 
    
    public synchronized void Increment(){
        counter++;
    }
    
    public static void main(String[] args) {
        ThreadSynchronized ts = new ThreadSynchronized();
        ts.Work();
        System.out.println("Main thred");
    }
    
    public void Work(){
        Thread thred1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++){
                    //counter++;
//                    counter = counter + 1;
                    Increment();
                }
            }
        });
        
        Thread thred2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++){
                   //  counter++;
//                       counter = counter + 1;
                    Increment();
                }
            }
        });
        
        thred1.start();
        thred2.start();
        
        try {
            thred1.join();
            thred2.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
       
        
        System.out.println("Counter -> " + counter);
    }
    
}
