package Java_Project;
import java.util.ArrayList;
import java.util.Arrays;

public class Priority_Queue {
    int[] container;
    int counter = 0;

    public Priority_Queue(int size){
        container = new int[size];
    }

    public void insert(int val){
        if (counter == container.length){
            throw new StackOverflowError();
        }
        int container_prev = 0;
        int container_next = 0;
        if (counter == 0){
            container[0] = val;
            counter ++;
        } else {
            for(int i = 0; i < counter; i++){
                if(container[i] > val){
                    for(int j = i; j < counter; j++){
                        if(j == i){
                            container_next = container[j + 1];
                            container[j + 1] = container[j];
                            container[j] = val;
                        } else {
                            container_prev = container_next;
                            container_next = container[j + 1];
                            container[j + 1] = container_prev;
                        }
                    }
                    break;
                } else {
                    container[counter] = val;
                }
            }
            counter ++;
        }
    }

    public void print(){
        int[] holder = new int[counter];
        for(int i = 0; i < counter; i++){
            holder[i] = container[i];
        }
        System.out.println(Arrays.toString(holder));
    }
}
