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
//          Developer tom = new Developer("Tom Jones", "Rivne", "Senior Java Developer", 35, 3000, "JTeam");
//          tom.GetDeveloperInfo();
//        tom.setCity("Lviv");
//        System.out.println(tom.getCity());
        
//        Developer[] devTeam = new Developer[3];
//        for (int i = 0; i < devTeam.length; i++){
//            devTeam[i] = new Developer();
//        }
//        for (int i = 0; i < devTeam.length; i++){
//            devTeam[i].GetDeveloperInfo();
//        }
        
//        Developer stive  = new Developer("Stive", "Lviv", "Middle .NET Developer", 30, 2000);
//        stive.CompareSalary(tom);
//        System.out.println(stive.getCounter());


// Part 2

//        Junior jack = new Junior("Jack", "Rivne", "QA", 20, 400, "Starter", "Write code using stackoverflow");
//        jack.GetDeveloperInfo();

// Part 3
//        Junior jack = new Junior("Jack", "Rivne", "QA", 20, 400, "Java Dev Team" ,"Starter", "Write code using stackoverflow");
//        jack.GetDeveloperInfo();
//        System.out.println( jack.team.getTeamName());
//        jack.Drink("Coffe");

// Part 4   
        Print p = new Print(5, "Second");
        p.UsePrint();
        p.setX(true);
        p.setY(3.14);
        p.UsePrint();
    }
}
