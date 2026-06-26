package dsa_second_learning.linkedList;

public class Main {
    public static void main(String[] args) {
        //wow this is amazinggggggggggggg
         LinkedList linkedList = new LinkedList(5);

//        linkedList.getHead();
//        linkedList.getTail();
//        linkedList.getLength();
//
        linkedList.append(6);
        linkedList.append(7);
        linkedList.prepend(1);

//        System.out.println(linkedList.removeLast().value);
//        System.out.println(linkedList.removeLast().value);
//        System.out.println(linkedList.removeLast().value);
      //  System.out.println(linkedList.removeLast());
        //before removing first number
       // System.out.println(" before removing first number");
        //linkedList.printList();
        int index =3;
     //   System.out.println(" value at index  "+index+" is  "+linkedList.getNode(index).value);
//   linkedList.setValue(2,9);
//   linkedList.printList();

        linkedList.insert(2,2);
        linkedList.printList();
        System.out.println("After removing... ");
        linkedList.remove(4);
        linkedList.printList();


//        System.out.println("After removing first number from linked list value "+linkedList.removeFirst().value);
//        System.out.println("After removing first number from linked list value "+linkedList.removeFirst().value);
//        System.out.println("After removing first number from linked list value "+linkedList.removeFirst().value);
//        System.out.println("After removing first number from linked list value "+linkedList.removeFirst().value);
//        System.out.println("After removing first nu mber from linked list value "+linkedList.removeFirst());

        //after removing first number ;
        //linkedList.removeFirst();

        //System.out.println(linkedList);


        //linkedList.



    }
}
