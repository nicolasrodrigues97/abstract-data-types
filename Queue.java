package packagename;

public class Queue {
    private Node first;
    private Node last;
    
    public boolean isEmpty(){
        if(first == null){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){ // If a limit is required, declare "nodeAmount" and check if it equals said limit with a if/else statement
        return false;
    }
    public int head(){
        return first.getData();
    }
    public void enQueue(int value){
        Node newNode = new Node(value);
        if(isEmpty() == true){
            first = newNode; // Same thing as a linked list
            last = newNode;
            // If a limit has been implemented, nodeAmount++;
        }
        else{
            last.setNext(newNode); // Inserts at the end of the list
            last = newNode; // Last now points to the new node
        }
    }
    public int deQueue(){
        Node aux = first;
        first = first.getNext(); // Removes the first of the list
        if(isEmpty() == true){
            last = null; // If there's nothing in the queue, the last receives null
        }
        int ret = aux.getData();
        return ret; // Returns the removed data
    }
    
}
