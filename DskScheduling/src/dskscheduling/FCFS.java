/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dskscheduling;

/**
 *
 * @author zyad
 */
 public class FCFS {
    
   static void calculate(int queue[],int head){
    
       int movement=0;
       
       movement+=Math.abs(head-queue[0]);
       
       for(int i=1;i<queue.length;i++){
       
       movement+=Math.abs(queue[i-1]-queue[i]);
       
       }
       
         System.out.print("order : ");
         System.out.print(head+" ");
         
           for(int i=0;i<queue.length;i++){
       
          System.out.print(queue[i]+" ");
       
       }
       System.out.println("\ntotal head movement : "+movement);
    }
       
    
}
