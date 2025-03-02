import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //O(n) example
      //  printItems(10);

        //O(n^2) example //time complexity
       // printSecondExample(10);


        //O(1) example
     // int value = addItems(10);
        //System.out.println(value);


    //O(log n)


        List<Integer>myList = Arrays.asList(3,23,7);

        myList.add(1);
        System.out.println(myList);



    }

    private static int addItems(int n) {

        return n+n+n;


    }

    private static void printSecondExample(int n) {

        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(i+" "+j);
            }
        }


        for (int k=0;k<n;k++){
            System.out.println(k);
        }
    }

    private static void printItems(int n) {

        for(int i=0;i<n;i++){
            System.out.println(i);
        }

        for(int j=0;j<n;j++){
            System.out.println(j);
        }
    }


}