import java.util.HashMap;
import java.util.Map;

public class Pointers {

    public static void main(String[] args) {
        int num1 = 11;
        int num2 = num1;

        num1 = 22;

      //  System.out.println("number1 "+num1);
      //  System.out.println("number2 "+num2);


        Map<String,Integer>map1 = new HashMap<>();
        Map<String,Integer>map2 = new HashMap<>();

        map1.put("Value",11);
       map2 = map1;

       map1.put("Value ",22);


        System.out.println("Map 1 "+map1);
        System.out.println("Map 2 "+map2);
    }
}
