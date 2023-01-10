package Java_Project;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue);

        reverse(queue);
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue) {
        ArrayList<Integer> holder = new ArrayList<Integer>();
        while(queue.isEmpty() == false)
            holder.add(queue.remove());
        for(int i = holder.size() - 1; i >= 0; i--){
            queue.add(holder.get(i));
        }
    }
}