import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
//        List<Integer> newList = new ArrayList<>(Arrays.asList(1,5,8,9,3));
//
//        Integer removeValue = newList.remove(2);
//        System.out.println(removeValue);


        //String open = openBox();

      int sum =  sumRecursion(10);
        System.out.println(sum);

    }

    private static int sumRecursion(int value) {
        if (value==1) return 1;

        return value+sumRecursion(value-1);


    }


    private static String openBox() {

        System.out.println("Heelo Akash!");
        return  openBox();
    }
}
