public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    // Inner class to represent a Node
    class Node {
      int value;
      Node nextNode;

      Node(int value){
          this.value =value;

      }
    }

    // Constructor to initialize the linked list with one node
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
      //  System.out.println("length -> "+length);
    }

//    public void printList() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.value + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }

    public void printList() {
        int count =0;
        Node temp = head;
        while (temp != null) {
//            System.out.println(count++);
//            System.out.println(head.value+ " ->");
//            System.out.println(tail.value+ " ->");
           System.out.println(temp.value);
          //  System.out.println("length "+length);

            temp = temp.nextNode;
         //   System.out.println(count++);

        }
      //  System.out.println("null");
    }


    public void append(int value){


        Node newNode = new Node(value);
        if (length==0){
            head =newNode;
            tail = newNode;
        }else {
           tail.nextNode= newNode;
           tail=newNode;
        }
        length++;
    }

    public Node  removelastNode(){

     Node temp = head;
     Node pre = head;


     if (length==0) return null;
     while (temp.nextNode!=null){
         pre = temp;
         temp = temp.nextNode;
     }
     tail=pre;
     tail.nextNode=null;
     length--;
     if (length==0){
         head=null;
         tail=null;
     }
     return  temp;

    }

    public  void prepend(int value){
        Node newNode = new Node(value);
        if (length==0){
            head =newNode;
            tail =newNode;
        }else {
            newNode.nextNode=head;
            head =newNode;
        }
        length++;
    }

    public  Node removeFirst(){

        if (length ==0)return  null;
        Node temp = head;
        head = head.nextNode;
        temp.nextNode=null;
        length--;
        if (length==0){
            tail=null;
        }
        return  temp;

    }

    public  Node get( int index){
       if (index<0||index>=length){
           return  null;
       }
       Node temp = head;
       for (int i=0;i<index;i++){
           temp= temp.nextNode;

       }
       return  temp;


    }

    public  boolean set(int index,int value){

        Node temp = get(index);
        if(temp !=null){
            temp.value=value;
            return  true;
        }
        return  false;
    }

    public boolean insert(int index, int value){

        //length =3 index =0,1,2,3
        if (index<0||index>length)return  false;

        if (index==0){
            prepend(value);
            return  true;
        } else if (index==length) {
            append(value);
            return  true;
        }else {
            Node newNode = new Node(value);
            Node temp = get(index-1);
            newNode.nextNode=temp.nextNode;
            temp.nextNode= newNode;
            length++;
                    return  true;
//            temp.nextNode=newNode;
//            temp.value=value;
//            newNode.value=value;

        }




    }

    public Node remove(int index){

        if (index ==0){
           return removeFirst();
        } else if (index==length-1) {
           return removelastNode();
        }else {

            Node prev = get(index-1);
            Node temp = prev.nextNode;
            prev.nextNode= temp.nextNode;
            temp.nextNode =null;
            length--;
            return  temp;
        }


    }

    public  void  reverse(){
        Node temp =head;
        head=tail;
        tail=temp;
        Node after = temp.nextNode;
        Node before = null;

        for (int i=0;i<length;i++){
            after= temp.nextNode;
            temp.nextNode= before;
            before=temp;
            temp=after;
        }
    }


    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.append(3);
       // myLinkedList.prepend(1);
       // System.out.println(LinkedList.Node.class);

      //  myLinkedList.set(2,10);

//        System.out.println(myLinkedList.removelastNode().value);
//        System.out.println(myLinkedList.removelastNode().value);
//        System.out.println(myLinkedList.removelastNode());

//        System.out.println(myLinkedList.removeFirst().value);
//        System.out.println(myLinkedList.removeFirst().value);
//        System.out.println(myLinkedList.removeFirst());

     //   System.out.println(myLinkedList.get(2).value+"\n");
//        myLinkedList.insert(0,4);
//        myLinkedList.insert(3,8);
//        myLinkedList.insert(6,10);

      //  myLinkedList.remove(1);
        myLinkedList.reverse();


         myLinkedList.printList();;

    }
}