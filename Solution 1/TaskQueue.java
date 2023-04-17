import java.util.Scanner;


public class TaskQueue {
    public static void main(String[] args) {
        char[] oldTaskQ= {'A', 'B', 'C', 'D', 'E', 'F', 'A', 'B', 'C', 'D','A', 'B', 'C', 'A', 'B', 'A'};
        char[] newTaskQ= {'B', 'C', 'E', 'F', 'B', 'C', 'B', 'C', 'B'};
       //char[] newTaskQ= {'A', 'D', 'E', 'F', 'A', 'D', 'A', 'A', 'A'};

        int oldIndex= 7;
        int count=0;
        int newIndex=0;
        for(int i=0; i<newTaskQ.length; i++){
            if(oldTaskQ[i]==newTaskQ[i]){
                count++;
            }
        }
        if(count==0){
            char target= newTaskQ[oldIndex-1];
            for(int i=oldIndex-2; i>=0; i-- ){
                if (newTaskQ[i]==target){
                    newIndex=i;
                    break;
                }

            }
            System.out.println(newIndex+1);
        }
        else{
        newIndex= oldIndex-count;
        System.out.println("The current Index is "+newIndex);
        }
    }    
}
