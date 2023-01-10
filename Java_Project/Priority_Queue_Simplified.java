package Java_Project;

import java.util.Arrays;

public class Priority_Queue_Simplified {

    int[] container;
    int counter = 0;

    public Priority_Queue_Simplified(int size){
        container = new int[size];
    }

    public void insert(int val){
        if (counter == 0){
            container[0] = val;
        }
        else if(counter == container.length){
            throw new StackOverflowError();
        }
        else {
            for(int i = counter -1; i >= 0; i--){
                if(i == counter -1 && val > container[i]){
                    container[i+1] = val;
                    break;
                }
                if (val < container[i]){
                    container[i+1] = container[i];
                } else if (val > container[i]){
                    container[i+1] = val;
                    break;
                }
                if(i == 0){
                    container[0] = val;
                }
            }
        }
        counter ++;
    }

    public void print(){
        int[] holder = new int[counter];
        for(int i = 0; i < counter; i++){
            holder[i] = container[i];
        }
        System.out.println(Arrays.toString(holder));
    }
}
