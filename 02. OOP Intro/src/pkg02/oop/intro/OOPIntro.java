/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.oop.intro;

import java.io.IOException;

/**
 *
 * @author macnaer
 */
public class OOPIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        Developer tom = new Developer("Tom Jones", "Rivne", "Senior Java Developer", 35, 3000);
//        tom.GetDeveloperInfo();
//        tom.setCity("Lviv");
//        System.out.println(tom.getCity());
        
        Developer[] devTeam = new Developer[3];
        for (int i = 0; i < devTeam.length; i++){
            devTeam[i] = new Developer();
        }
        for (int i = 0; i < devTeam.length; i++){
            devTeam[i].GetDeveloperInfo();
        }
        
    }
    
}
