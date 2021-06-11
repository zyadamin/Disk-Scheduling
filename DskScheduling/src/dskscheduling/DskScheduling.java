/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dskscheduling;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author zyad
 */
public class DskScheduling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> requests= new ArrayList<>();
        int bandwidth;
        Scanner input= new Scanner(System.in);
        
        System.out.println("enter bandwidth");
        bandwidth= input.nextInt();
        
        int queue[]= new int[bandwidth];
        
        int num;
        
        for(int i=0;i<bandwidth;i++){
        num=input.nextInt();
        queue[i]=num;
        requests.add(num);
        
        }
        
        System.out.println("enter start");
        int start=input.nextInt();
        
        
       System.out.println("enter end");
        int end=input.nextInt();

        
        
        
      System.out.print("Enter the initial position : ");
        int initialPosition = input.nextInt();

                //Look Algorithm
        Look l1 = new Look();
        l1.look(queue , bandwidth , initialPosition);

        //C-look Algorithm
        CLook l2 = new CLook();
        l2.cLook(queue , bandwidth , initialPosition);


        
       NewOptimizedAlgorithm.newOptimizedAlgorithm(queue, bandwidth);
  
        

        
        FCFS.calculate(queue,initialPosition);
        
        SSTF.calculate(queue,initialPosition);




SCAN.Done(requests, initialPosition, start, end);

C_SCAN.Done(requests, initialPosition, start, end);

    }
    
}
/*

53 98 183 37 122 14 124 65 67
*/