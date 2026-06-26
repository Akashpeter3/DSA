package dsa_second_learning.linkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    //Node declaration
    class Node{
        int value;
        Node next;
        //Constructor creation to pass value
        Node(int value){
            this.value =value;
        }
    }

    //constructor of class will take an argument
    public  LinkedList(int value){
        //Node creation
        Node newNode = new Node(value); //pointing newNode to the created node
        //head is pointing same like newNode is pointing
        head = newNode;
        //tail is pointing same like  newNode  is pointing
        tail = newNode;
        //length of Node is 1 in default
        length = 1;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if (length ==0){
            head = newNode;
            tail = newNode;
        }else {
           tail.next = newNode;
           tail = newNode;
        }
        length++;


    }

    public Node removeLast(){
        if(length ==0) return  null;
       Node  temp = head;
       Node  pre = head;

       while (temp.next!= null){
           pre = temp;
           temp = temp.next;
       }

       tail = pre;
       tail.next = null;
       length--;
       if(length==0){
           head = null;
           tail = null;
       }
       return  temp;

    }
public void prepend(int value){
        Node newNode = new Node(value);
        if (length==0) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head =newNode;
        }
        length++;
}

public  Node getNode(int index){
        if (index <0||index>=length)return  null;
      Node temp = head;
      for (int i=0;i<index;i++){
          temp = temp.next;
      }
      return  temp;
}

public Node removeFirst(){
      if (length ==0) return  null;
      Node temp = head;
      head = temp.next;
      temp.next = null;
      length--;

      if (length ==0){
          tail = null;
      }

       return  temp;
}

public boolean setValue(int index,int value){
        // first get the node
        //set value to the node

    Node temp =  getNode(index);
    if (temp!= null){
        temp.value = value;
        return  true;
    }
return  false;

}

public boolean insert(int index,int value){

        if (index<0||index>length) return  false;
        if (index ==0){
            prepend(value);
            return  true;
        }
        if (index ==length){
            append(value);
            return  true;
        }

        Node newNode = new Node(value);
        Node temp = getNode(index-1);
        newNode.next =  temp.next;
        temp.next = newNode;
        length++;
        return  true;


}


public Node remove(int index){
        if (index<0||index>=length) return  null;
        if (index ==0){
            return  removeFirst();
        }
        if (index>=length-1){
            return  removeLast();
        }
   Node prev = getNode(index-1);
   Node temp = prev.next;
   prev.next = temp.next;
   temp.next =null;;;
   length--;
   return  temp;

}



    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public  void getHead(){
        System.out.println("head "+head.value);
    }

    public  void getTail(){
        System.out.println("head "+tail.value);
    }

    public void getLength() {
        System.out.println("length "+length);
    }
}
