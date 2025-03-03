import java.util.ArrayList;
import java.util.List;

public class Heap {

public List<Integer>heap;


   public  Heap(){
    heap =new ArrayList<>();
   }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    private  int leftChild(int index){
       return 2*index+1;
    }

    private  int rightChild(int index){
       return 2*index+2;
    }

    private  int parent(int index){
       return (index-1)/2;
    }

    private void  swap(int index1,int index2){
       int temp =heap.get(index1);
       heap.set(index1,heap.get(index2));
       heap.set(index2,temp);

    }

    private void sinkDown(int index) {

       int maxIndex = index;
       while (true){
           int leftChildIndex = leftChild(index);
           int rightChildIndex =rightChild(index);

           if (leftChildIndex<heap.size()&&heap.get(leftChildIndex)>heap.get(maxIndex)){
               maxIndex = leftChildIndex;
           }
           if (rightChildIndex<heap.size()&&heap.get(rightChildIndex)>heap.get(maxIndex)){
               maxIndex =rightChildIndex;
           }

           if (maxIndex!=index){
               swap(index,maxIndex);
               index=maxIndex;
           }else {
               return;
           }
       }

    }

    public  void insert(int value){

       heap.add(value);
       int current =  heap.size()-1;
       while (current>0&&heap.get(current)>heap.get(parent(current))){
           swap(current,parent(current));
           current =parent(current);

       }

    }



    public  Integer  remove(int value){

       if (heap.isEmpty()){
           return null;
       }
       if (heap.size()==1){
         return heap.removeFirst();
       }
       else {
           int maxValue = heap.getFirst();
           heap.set(0,heap.removeLast());
           sinkDown(0);
           return maxValue;

       }

    }



    public static void main(String[] args) {

      Heap myHeap = new Heap();
      myHeap.insert(95);
      myHeap.insert(75);
      myHeap.insert(80);
      myHeap.insert(55);
      myHeap.insert(60);
      myHeap.insert(50);
      myHeap.insert(65);

      System.out.println(myHeap.getHeap());
//
//      myHeap.insert(100);
//
//        System.out.println(myHeap.getHeap());
//
//      myHeap.insert(75);
//        System.out.println(myHeap.getHeap());

        myHeap.remove(95);
        System.out.println(myHeap.getHeap());
        myHeap.remove(80);
        System.out.println(myHeap.getHeap());





    }
}
