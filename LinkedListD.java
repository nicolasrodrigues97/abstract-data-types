package packagename;
 
public class LinkedListD { // Doubly linked list (makes use of "prev" and "next" from the Node class)
    private Node first;
    private Node last;
    private Integer nodeAmount;
   
    public boolean isEmpty(){
        if(first == null){
            return true;
        }
        else{
            return false;
        }
    }
	// Optional: isFull() - check for a given limit using a if/else statement
	// TBD: add insert() - inserts at front/middle/end in a crescent order
    public void InsertAtFront(int value){
        if(isEmpty() == true) {
            first = new Node(value);
            last = first;
            nodeAmount = 1;
        }
            Node aux = new Node(value);
            aux.setNext(first);
            first = aux;
            nodeAmount++;
    }
    public void InsertAtEnd(int value){
        Node newNode;
        if(isEmpty() == true){
            first = new Node(value);
            last = first;
            nodeAmount = 1;
        }
        else{
            newNode = new Node(value);
            last.setNext(newNode);
            last = newNode;
            nodeAmount++;
        }
    }
    public void removeFirst(){
        Node second;
        if(isEmpty() == true){
            System.err.println("Empty list");
        }
        else{
            second = first.getNext();
            first = second;
            nodeAmount--;
            if(isEmpty() == true){
                last = null;
            }
        }
    }
    public void removeLast(){
        Node aux;
        if (isEmpty () == true) {
            System.err.println ("Empty list");
        }
        else if (first == last) {
            first = null;
            last = null;
            nodeAmount = 0;
        }
        else {
            aux = first;
            while (aux.getNext() != last) { // Aux seeks through nodes and points to the current one
                aux = aux.getNext();
            }
            aux.setNext(null);// last is removed; aux points to last
            last = aux;
            nodeAmount--;
        }
     }
    public int search (int value){ 
        Node aux;
        aux = first;
        int end = 0;
        if(isEmpty() == true){
            System.err.println("Empty list");
        }
        else{    
            while (aux != null){
                if(aux.getData() == value){
                    end = aux.getData();
                    break;
                }
                else{
                    aux = aux.getNext();
                }
            }
        }
        return end;
    }
    public void remove (int value){ // TBD: fix some issues
        Node prev;
        Node next;
        if(isEmpty() == true){
            System.err.println("Empty list");
        }
        else{
            prev = first;
            while(prev.getData() != value){
                prev = prev.getNext();
                next = prev.getNext();
                if(next.getData() == value){
                    prev.setNext(null);
                    next.setNext(prev);
                }
            }
        }
    }
    public void show(){
        Node current;
        int value;
        if(isEmpty() == true){
            System.err.println("Empty list");
        }
        else{
            System.out.printf("Integer list:\n");
            current = first;
            while(current != null){
                value = current.getData();
                System.out.println(value);
                current = current.getNext();
            }
        }
        System.out.printf("\n");
    }
}
