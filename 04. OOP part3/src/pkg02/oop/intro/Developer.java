/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.oop.intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author macnaer
 */
abstract public class Developer{
    protected String name;
    protected String city;
    protected String position;
    protected int age;
    protected int salery;
    protected String[] skills = new String[5];
    private static int counter = 0;
    public Team team;
    
    public Developer(String name, String city, String position, int age, int salery, String teamName){
        this.name = name;
        this.city = city;
        this.position = position;
        this.age = age;
        this.salery = salery;
        this.counter++;
        this.team = new Team(teamName);
    }
    
    public Developer() throws IOException{
      BufferedReader buffered=new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Name: ");
      this.name=buffered.readLine();              
      System.out.print("City: ");
      this.city=buffered.readLine();             
      System.out.print("Position: ");
      this.position=buffered.readLine();            
      System.out.print("Salery: ");
      this.salery= Integer.parseInt(buffered.readLine());
      System.out.print("Age: ");
      this.age= Integer.parseInt(buffered.readLine());
    }
    
    public void GetDeveloperInfo(){
        System.out.println("Name: "+this.name + "\nCity: " + this.city + "\nPostion: " 
                + this.position + "\nAge: " + this.age + "\nSalery " + this.salery );
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getCity(){
        return this.city;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public String getPosition(){
        return this.position;
    }
    
    public void setPosition(String position){
        this.position = position;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getSalary(){
        return this.salery;
    }
    
    public void setSalery(int salary){
        this.salery = salary;
    }
    
    public void CompareSalary(Developer dev){
        if (this.salery > dev.getSalary()){
            System.out.println(this.name + " has higher salary then " + dev.getName());
        }else if (this.salery < dev.getSalary()){
            System.out.println(dev.getName() + " has higher salary then " + this.name );
        }else{
            System.out.println("Their salary is match");
        }
    }
    
    public int getCounter(){
        return this.counter;
    }
    
    class Team{
        private String teamName;
        
        public Team(String newTeam){
            this.teamName = newTeam;
        }
        public void setTeam(String teamName){
            this.teamName = teamName;
        }
        public String getTeamName(){
            return this.teamName;
        }
    }
}
