package dskscheduling;

import java.util.ArrayList;
import java.util.Arrays;

public class NewOptimizedAlgorithm {

static public void newOptimizedAlgorithm(int[] requests , int numberOfIORequests){

    
  int req[]= new int [numberOfIORequests];     
  for(int i=0;i<numberOfIORequests;i++){
  
  req[i]= requests[i];
  }
        Arrays.sort(req);

        int totalHeadMovements = 0;
        int initialPosition = 0 ;
        ArrayList<Integer> sequence = new ArrayList<>();

        for (int i = 0; i < numberOfIORequests ; i++) {
            totalHeadMovements += req[i] - initialPosition;
            initialPosition = req[i];
            sequence.add(initialPosition);
        }

        System.out.print("Number OF total head movements in Look Algorithm : ");
        System.out.println(totalHeadMovements);
        System.out.println("Sequence of head movements starting from initial position :");
        for (int i = 0; i < numberOfIORequests ; i++) {
            System.out.print(sequence.get(i) + " ");

        }
        System.out.println();



    }
}
