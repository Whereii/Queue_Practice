package Java_Project;

import java.util.Arrays;

public class Queue_Reverser {
    
    private int[] holder;
    private int place;

    Queue_Reverser(int[] queue, int position){
        holder = queue;
        place = position;
    }

    public int[] reverse(){
        int first = 0;
        int last = place;

        if (place > holder.length || holder.length == 0){
            throw new IllegalStateException();
        }

        while (first != last){
            int temp = holder[last];
            holder[last] = holder[first];
            holder[first] = temp;
            first++;
            last--;
        }

        return holder;
    }

    public String toString() {
        return Arrays.toString(holder);
    }

}
