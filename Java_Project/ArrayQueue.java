package Java_Project;

import java.util.Arrays;

public class ArrayQueue {

    private int[] holder;
    private int first = 0;
    private int last = 0;
    private int total_items = 0;

    public ArrayQueue(int size){
        holder = new int[size];
    }

    public void enqueue(int val){
        if (total_items == holder.length){
            throw  new IllegalStateException();
        }
        holder[(last + holder.length) % holder.length] = val;
        last += 1;
        total_items += 1;
    }

    public int dequeue(){
        if(holder[first] == 0){
            throw new IllegalStateException();
        }
        int item = holder[first];
        holder[first] = 0;
        first = (first + 1) % holder.length;
        total_items --;
        return item;
    }

    public int peek(){
        return holder[first];
    }

    public boolean isEmpty(){
        if(first == last){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(last == 5){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString(){
        return Arrays.toString(holder);
    }
}
