package revisaoed1;
 
public class Node {
    private Integer data;
    private Node next;
    private Node prev; //
    
    public Node(int value){
        data = value;
    }
    public void setData(int value){
        data = value;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void setPrev(Node value){ //
        this.prev = value;
    }
    public Node getPrev(){ //
        return prev;
    }
}

