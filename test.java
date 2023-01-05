package array_queue;
public class test {

    public static void main(String[] args){
        Queue_stack queue = new Queue_stack();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.is_empty());

    }
}
