/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06.lambda.files;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author macnaer
 */

//interface Executable{
//        void execute();
//    }
//    
//class Runner{
//    public void run(Executable e){
//       e.execute();
//    }
//}
public class LambdaFiles {
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        Runner  runner = new Runner();
//        runner.run(() -> System.out.println("Run"));

//        String str = "This is a test string";
        String path = "src\\pkg06\\lambda\\files\\text.txt";
        
//        try(FileOutputStream file = new FileOutputStream("src\\pkg06\\lambda\\files\\text.txt")){
//            byte[] tmp = str.getBytes();
//            file.write(tmp, 0, tmp.length);
//            file.close();
//            System.out.println("Success");
//        }
//        catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }

//        try(FileInputStream file = new FileInputStream(path)){
//            System.out.println("Bytes size = " + file.available());
//            int i = -1;  
//            while((i= file.read()) != -1){
//                 System.out.print((char)i); 
//            }
//            System.out.println("");
//           
//            file.close();
//        }catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }
//        byte[] buf = { 72, 101, 108,108,111 };  
//        ByteArrayInputStream bs = new ByteArrayInputStream(buf);
//        System.out.println("buf = "+buf);
//        int k = 0;  
//        while ((k = bs.read()) != -1) {  
//          //Conversion of a byte into character  
//          char ch = (char) k;  
//          System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
//        }  
    }
}
