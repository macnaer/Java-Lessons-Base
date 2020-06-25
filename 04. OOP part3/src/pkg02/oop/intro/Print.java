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
public class Print<T1, T2> {
    private T1 x;
    private T2 y;
    
    public Print(T1 x, T2 y){
        this.x = x;
        this.y = y;
    }
    
    public void UsePrint(){
        System.out.println("X = " + this.x + "\nY = " + this.y);
    }
    
    public void setX(T1 newX){
        this.x = newX;
    }
    
    public void setY(T2 newY){
        this.y = newY;
    }
}
