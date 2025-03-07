public class Queue {

    private Node first;
    private Node last;
    private  int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public Queue(int value){
        Node newNode = new  Node(value);
        first=newNode;
        last=newNode;
        length =1;
    }

    public  void enQueue(int value){

        Node newNode = new Node(value);
        if (length==0){
            first=newNode;
            last=newNode;
        }else {
            last.next = newNode;
            last = newNode;
        }
        length++;

    }

    public  Node  deQueue(){
        Node temp =first;
        if (length==0){
           return  null;
        } else if (length==1) {
           first=null;
           last =null;
        } else {
            first= first.next;
            temp.next=null;
        }
        length--;
        return  temp;
    }

//    public  void getFirst(){
//        System.out.println("First "+ first.value);
//    };
//
//    public  void getLast(){
//        System.out.println("last "+ last.value);
//    };
//    public  void getLength(){
//        System.out.println("length "+ length);
//    };

    public void printQueue(){
        Node temp=first;
        while (temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }




    public static void main(String[] args) {


        Queue queue = new Queue(1);
        queue.enQueue(2);
        queue.enQueue(3);

//        queue.getFirst();
//        queue.getLast();
//        queue.getLength();


        System.out.println(queue.deQueue().value);
        System.out.println(queue.deQueue().value);
        System.out.println(queue.deQueue().value);
        System.out.println(queue.deQueue());


        queue.printQueue();
    }
}
