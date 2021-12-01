package packagename;

public class Node {
    private Integer data;
    private Node next;
    
    public Node (int value){ // The variable type (whether it's a int, string or an object etc...) is given to the constructor as a parameter to Node
        data = value;
    }
    
    public void setData(int value){
        data = value;
    }
    public int getData(){
        return data;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getNext(){
        return next;
    }
}
