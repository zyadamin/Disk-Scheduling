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
public class SSTF {
    
    
    static void calculate(int queue[],int head ){
        
        int req[]= new int[queue.length+1];
        
        req[0]=head;
        
        for(int i=0;i<queue.length;i++){
        
        req[i+1]=queue[i];
        }
        
        int cur=req[0],min=1000;
        int count=0;
        req[0]=1000;
        int c=0;
        int[] newOne= new int[req.length];
        
        for(int j=1;j<req.length+1;j++){
            min=1000;
        for(int i=1;i<req.length;i++){
         int x=Math.abs(cur-req[i]);
         if(x<min){
             min=x;
             c=i;
         }
        }
         newOne[count++]=cur;
         cur=req[c];
         req[c]=1000;
        }
        
        
       int movement=0;
       
       for(int i=1;i<newOne.length;i++){
       
       movement+=Math.abs(newOne[i-1]-newOne[i]);
       
       }
       
         System.out.print("order : ");
           for(int i=0;i<newOne.length;i++){
       
          System.out.print(newOne[i]+" ");
       
       }
       System.out.println("\ntotal head movement : "+movement);
    }
    
}
