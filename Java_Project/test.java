package Java_Project;

public class test {

    public static void main(String[] args){
       Priority_Queue_Simplified queue = new Priority_Queue_Simplified(5);
        queue.insert(5);
        queue.insert(6);
        queue.insert(2);
        queue.insert(1);
        queue.insert(4);

        queue.print();
    }
}
