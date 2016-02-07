package com.hello;
import java.util.ArrayList;
import java.util.Collections;
 
public class CopyElementsOfArrayListToArrayListExample {
 
  public static void main(String[] args) {
     
    //create first ArrayList object
    ArrayList arrayList1 = new ArrayList();
   
    //Add elements to ArrayList
    arrayList1.add("1");
    arrayList1.add("2");
    arrayList1.add("3");
   
    //create another ArrayList object
    int size = arrayList1.size();
    ArrayList arrayList2 = new ArrayList(10);
    for(Object list: arrayList1){
    	arrayList2.add(list);
    }
    //Add elements to Arraylist
    
    /*
      To copy elements of one Java ArrayList to another use,
      static void copy(List dstList, List sourceList) method of Collections class.
     
      This method copies all elements of source list to destination list. After copy
      index of the elements in both source and destination lists would be identical.
     
      The destination list must be long enough to hold all copied elements. If it is
      longer than that, the rest of the destination list's elments would remain
      unaffected.      
    */
   
    System.out.println("Before copy, Second ArrayList Contains : " + arrayList2);
   
    //copy all elements of ArrayList to another ArrayList using copy
    //method of Collections class
    Collections.copy(arrayList2,arrayList1);
    
    
   
    /*
      Please note that, If destination ArrayList object is not long
      enough to hold all elements of source ArrayList,
      it throws IndexOutOfBoundsException.
    */
 
    System.out.println("After copy, Second ArrayList Contains : " + arrayList2);  
  }
}