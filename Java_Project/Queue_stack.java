package Java_Project;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;


public class Queue_stack {

    private Stack<Integer> container_one = new Stack<>();
    private Stack<Integer> container_two = new Stack<>();
    
    public void enqueue(int val){
        container_one.push(val);
    }

    public int dequeue(){
        if (is_empty()){
            throw new IllegalStateException();
        }

        mov_stack1_to_stack2();
        return container_two.pop();
    }

    public int peek(){
        if (is_empty()){
            throw new IllegalStateException();
        }

        mov_stack1_to_stack2();
        return container_two.peek();
    }



    public boolean is_empty(){
        if(container_one.empty() && container_two.empty()){
            return true;
        } else {
            return false;
        }
    }
    
    private void mov_stack1_to_stack2(){
        if(container_two.empty()){
            while (!container_one.empty()){
                container_two.push(container_one.pop());
            }
        }
    }
}

