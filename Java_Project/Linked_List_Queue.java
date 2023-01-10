package Java_Project;

public class Linked_List_Queue {

    static class Node{
        public int value;
        public Node next;

        public Node(int val, Node nxt){
            value = val;
            next = nxt;
        }
    }

    static class Linked_List {
        public Node first = null;
        public Node last = null;
        public int counter = 0;


        public void enqueue(int val){
            Node new_node = new Node(val, null);
            if (first == null){
                first = new_node;
                last = first;
                counter ++;
            } 
            else {
                new_node.next = last;
                last = new_node;
                counter ++;
            }
        }


        public int dequeue(){
            if (first == null){
                throw new IllegalStateException();
            }

            Node holder = last;
            if (first == last){
                first = last = null;
                counter --;
                return holder.value;
            }
            while (holder.next != first){
                holder = holder.next;
            }
            first = holder;
            int val = first.next.value;
            first.next = null;
            counter --;
            return val;
        }


        public int peek(){
            if (first == null){
                throw new IllegalStateException();
            }
            return first.value;
        }

        public int size(){
            return counter;
        }

        public boolean is_empty(){
            if (counter == 0){
                return true;
            } else {
                return false;
            }
        }


    }
}
