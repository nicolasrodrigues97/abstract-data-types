package packagename;

public class Stack {
    private Node top;
    public boolean isEmpty(){
        if(top != null){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        return false; // If the stack implementation requires a limit, declare "nodeAmount", create a if/else statement and check if it equals said limit
    }
    public int getTop(){
        return top.getData();
    }
    public void push(int data){
        Node newNode = new Node(data);
        newNode.setNext(top); // The "next" of the new node is whatever is at the top
        top = newNode;
    }
    public int pop(){
        Node aux = top;
        int value;
        top = top.getNext();
        value = aux.getData();
        return value;
    }
}

