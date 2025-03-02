public class DoublyLinkedList {

    private  Node head;
    private Node tail;
    private  int length;

    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value=value;
        }

    }

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }

    public  void  printList(){
        Node temp =head;
        while (temp!=null){
            System.out.println(temp.value);
            temp= temp.next;
        }




    }

    public void append(int value){

        Node newNode = new Node(value);
        if (length==0){
            head =newNode;
            tail=newNode;

        }else{
            tail.next= newNode;
            newNode.prev=tail;
            tail=newNode;

        }
        length++;

    }

    public  Node removeLast(){

        if (length==0)return  null;
         Node temp = tail;
        if (length==1){
            head=null;
            tail=null;
        }else {

            tail = tail.prev;
            tail.next = null;
            temp.prev = null;

        }
        length--;
        return temp;

    }

    public void prepend(int value){

        Node newNode = new Node(value);
        if (length==0){
            head= newNode;
            tail=newNode;
        }else {
            newNode.next =head;
            head.prev=newNode;
            head=newNode;
        }
        length++;
    }

    public Node removeFirst(){

        Node temp =head;
        if (length==0)return  null;
        else if (length==1) {
            head=null;
            tail=null;
        }else {
            head =head.next;
            head.prev =null;
            temp.next=null;
        }

        length--;

        return temp;


    }

    public Node get(int index){
        //index =2

        if(index<0||index>=length){
            return null;
        }else {
            Node temp = head;
            if (index<length/2){
            for (int i=0;i<index;i++){
                temp=temp.next;
            }
            }else {
                temp=tail;
                for (int i=length-1;i>index;i--){
                    temp =temp.prev;
                }
            }
            return  temp;
        }



    }


    public  boolean set(int index ,int value){

        Node temp = get(index);
        if (temp!=null){
            temp.value=value;
            return  true;
        }
        return  false;
    }

    public boolean insert(int index,int value){

        if (index<0||index>length)return  false;
        if (index==0){
            prepend(value);
            return  true;
        }else if (index==length){
            append(value);
            return true;
        }
        else {

            Node newNode = new Node(value);
            Node before = get(index-1);
            Node after = before.next;

            newNode.prev=before;
            newNode.next=after;
            before.next=newNode;
            after.prev =newNode;
            length++;
            return true;

        }
    }

    public Node  remove(int index){

        if (index<0||index>=length)return  null;
        if (index==0) return  removeFirst();
        if (index==length-1) return  removeLast();

        Node temp = get(index);
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.next=null;
            temp.prev =null;

        length--;
        return  temp;
    }


//    public void getHead(){
//        System.out.println("head -> "+head.value);
//    }
//
//    public void getTail(){
//        System.out.println("head -> "+tail.value);
//    }
//
//    public void getLength(){
//        System.out.println("length  -> "+length);
//    }


    public static void main(String[] args) {

        DoublyLinkedList myLinkedList = new DoublyLinkedList(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(9);


//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast());

       // myLinkedList.prepend(1);

//        System.out.println(myLinkedList.removeFirst().value); ;
//        System.out.println( myLinkedList.removeFirst().value);
//        System.out.println(myLinkedList.removeFirst().value);
//        System.out.println(myLinkedList.removeFirst());

//        System.out.println(myLinkedList.get(0).value);
//        System.out.println(myLinkedList.get(1).value+"\n");

     //   myLinkedList.set(1,9);


        myLinkedList.remove(3);
       // myLinkedList.insert(2,9);

        myLinkedList.printList();

    }
}
