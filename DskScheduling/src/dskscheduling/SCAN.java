/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dskscheduling;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Manar Atef
 */
public class SCAN {
    
    
  static  void Done(ArrayList<Integer>requests,int head,int start,int end){
             
             int i1=0,i2=0,movement=0;
              ArrayList<Integer>requests2=new ArrayList<Integer>();
              ArrayList<Integer>Sorted_requests=new ArrayList<Integer>();
              for(int i=0;i<requests.size();i++){
              requests2.add(requests.get(i));
              
              }
              Collections.sort(requests2);
              Sorted_requests.add(head);
               requests2.add(0, start);
               
    for(int i=0;i<requests2.size();i++){
     if(requests2.get(i)>head){
         i2=i;
         i1=i-1;
     break;}
    }
    
    for(int i=i1;i>=start;i--){
    Sorted_requests.add(requests2.get(i));
    
    }
     for(int i=i2;i<requests2.size();i++){
    Sorted_requests.add(requests2.get(i));
    
    }
    
     //calculat movement
     
       for(int i=0;i< Sorted_requests.size()-1;i++){
      
 
    movement+= Math.abs(  Sorted_requests.get(i)-Sorted_requests.get(i+1));
    
 
    }
       
       
       //print
       System.out.print("order : ");
     for(int i=0;i<=requests2.size();i++){
         
         System.out.print(Sorted_requests.get(i)+" ");
    
    }
    
      System.out.println("\n"+"total head movement : "+movement+" cylinders");
    
    
    
    
    
    }
    
    
}
