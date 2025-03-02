import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample {

    public static void main(String[] args) {

        List<Integer> numArray = Arrays.asList(1,9,2,8,8,4,7,2,8,7,4,5);

        Map<Integer, Long> numMap = numArray.stream().collect(Collectors.groupingBy(num -> num, Collectors.counting()));

        System.out.println(numMap);

        numMap.entrySet()
                .stream()
                .filter(num ->num.getValue()>1)


//                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
               .forEach(System.out::println);


    }
}
