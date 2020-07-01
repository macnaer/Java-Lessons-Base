/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.jcf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author macnaer
 */
public class JCF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        List<Integer> arrayList = new ArrayList<Integer>();
        
//        for (int i = 0; i < 10; i++){
//            arrayList.add(i);
//        }
//        for (int i = 0; i < arrayList.size(); i++){
//            System.out.print(arrayList.get(i) + " ");
//        }
//        System.out.println(" ");
//        
//        arrayList.add(4, 100500);
//        
//        for (int i = 0; i < arrayList.size(); i++){
//            System.out.print(arrayList.get(i) + " ");
//        }
//        System.out.println(" ");
//        
//        arrayList.remove(3);
//        for (int i = 0; i < arrayList.size(); i++){
//            System.out.print(arrayList.get(i) + " ");
//        }
//        System.out.println(" ");
//        List<Integer> linkedList = new LinkedList<>();
        
//        for (int i = 0; i < 10; i++){
//            linkedList.add(i);
//        }
//        for (int i = 0; i < linkedList.size(); i++){
//            System.out.print(linkedList.get(i) + " ");
//        }
//        System.out.println(" ");
//        
//        linkedList.add(4, 100500);
//        
//        for (int i = 0; i < linkedList.size(); i++){
//            System.out.print(linkedList.get(i) + " ");
//        }
//        System.out.println(" ");
//        
//        linkedList.remove(3);
//        for (int i = 0; i < linkedList.size(); i++){
//            System.out.print(linkedList.get(i) + " ");
//        }
//        System.out.println(" ");
//        System.err.println("=======CompareAddToBackTime==========");
//        CompareAddToBackTime(arrayList);
//        CompareAddToBackTime(linkedList);
//        System.err.println("=======CompareAddToPopTime==========");
//        CompareAddToPopTime(arrayList);
//        CompareAddToPopTime(linkedList);
//        
//        System.err.println("=======ComparePrintTime==========");
//        ComparePrintTime(arrayList);
//        ComparePrintTime(linkedList);
//        
//    }
//    
//    public static void CompareAddToBackTime(List<Integer> list){
//        long start = System.currentTimeMillis();
//        for(int i =0; i < 1000000; i++){
//            list.add(i);
//        }
//        long finish = System.currentTimeMillis();
//        System.out.println(finish - start);
//    }
//    public static void CompareAddToPopTime(List<Integer> list){
//        long start = System.currentTimeMillis();
//        for(int i =0; i < 100000; i++){
//            list.add(0,i);
//        }
//        long finish = System.currentTimeMillis();
//        System.out.println(finish - start);
//    }
//    
//      public static void ComparePrintTime(List<Integer> list){
//        for(int i =0; i < 100000; i++){
//            list.add(i);
//        }
//        
//        long start = System.currentTimeMillis();
//        for(int i =0; i < 100000; i++){
//            list.get(i);
//        }
//        long finish = System.currentTimeMillis();
//        System.out.println(finish - start);
//   }
        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");
        String first = states.get(4);
        System.out.println(first);
        
        for(Map.Entry<Integer, String> item : states.entrySet()){
         
           System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }
        
        states.remove(2);
        
        for(Map.Entry<Integer, String> item : states.entrySet()){
         
           System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }
        
    }
}
