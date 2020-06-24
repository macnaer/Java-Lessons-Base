/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.oop.intro;

/**
 *
 * @author macnaer
 */
public class Junior extends Developer {
    private String fixLevel;
    private String writeCode;
    
    public Junior(String name, String city, String position, int age, int salery, String teamName, String fixLevel, String writeCode){
        super(name, city, position, age, salery, teamName);
        this.fixLevel = fixLevel;
        this.writeCode = writeCode;
    }
    
    public void GetDeveloperInfo(){System.out.println("Name: "+this.name + "\nCity: " + this.city + "\nPostion: " 
                + this.position + "\nAge: " + this.age + "\nSalery " + this.salery + "\nFix Level "
                + this.fixLevel + "\nWrite Code " + this.writeCode);
    }
}
