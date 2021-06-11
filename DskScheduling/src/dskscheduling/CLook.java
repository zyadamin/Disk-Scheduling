package dskscheduling;

import java.util.ArrayList;
import java.util.Arrays;

public class CLook {

    public void cLook(int[] requests , int numberOfIORequests , int initialPosition){

        int [] modifiedRequests = new int[numberOfIORequests+1];
        //copying the content of the original array and adding the initial position
        for (int i = 0; i < numberOfIORequests+1 ; i++) {
            if (i != numberOfIORequests)
                modifiedRequests[i] = requests[i];
            else
                modifiedRequests[i] = initialPosition;
        }
        Arrays.sort(modifiedRequests);
        int indexOfInitialPosition = Arrays.binarySearch(modifiedRequests , initialPosition);
        // this direction shows us which direction we will go first to minimize the total head movement
        int direction;
        if (modifiedRequests[indexOfInitialPosition] - modifiedRequests[indexOfInitialPosition-1]
                <= modifiedRequests[indexOfInitialPosition+1] - modifiedRequests[indexOfInitialPosition]){
            direction = 0;
        }else {
            direction = numberOfIORequests;
        }

        ArrayList<Integer> sequence = new ArrayList<>();
        int headMovements = 0 ;
        int start = indexOfInitialPosition;
        // the algorithm itself
        for (int i = 0; i < numberOfIORequests ; i++) {
            if (direction == 0){
                // this if & else is for indicating whether we've reached the final request in the first direction or not
                if (start != 0 && start <= indexOfInitialPosition){
                    headMovements += modifiedRequests[start] - modifiedRequests[start-1];
                    sequence.add(modifiedRequests[--start]);
                }else {
                    // this if & else for a specific test case for this algorithm
                    if (start == 0) {
                        headMovements += modifiedRequests[numberOfIORequests] - modifiedRequests[start];
                        sequence.add(modifiedRequests[numberOfIORequests]);
                        start = numberOfIORequests;
                    }else {
                        headMovements += modifiedRequests[start] - modifiedRequests[start - 1];
                        sequence.add(modifiedRequests[--start]);
                    }
                }
            }else if (direction == numberOfIORequests){
                // this if & else is for indicating whether we've reached the final request in the first direction or not
                if (start != numberOfIORequests && start >= indexOfInitialPosition){
                    headMovements += modifiedRequests[start+1] - modifiedRequests[start];
                    sequence.add(modifiedRequests[++start]);
                }else {
                    // this if & else for a specific test case for this algorithm
                    if (start == numberOfIORequests) {
                        headMovements += modifiedRequests[start] - modifiedRequests[0];
                        sequence.add(modifiedRequests[0]);
                        start = 0;
                    }else {
                        headMovements += modifiedRequests[start + 1] - modifiedRequests[start];
                        sequence.add(modifiedRequests[++start]);
                    }
                }
            }
        }
        System.out.print("Number OF total head movements in C-Look Algorithm : ");
        System.out.println(headMovements);
        System.out.println("Sequence of head movements starting from initial position :");
        for (int i = 0; i < numberOfIORequests ; i++) {
            System.out.print(sequence.get(i) + " ");

        }
        System.out.println();



    }


}
