package classess;

import java.util.HashMap;

public class Main{
    public static void main(String[] args) {



        Cookie cookie1 = new Cookie("green");
        Cookie cookie2 = new Cookie("Red");

        cookie1.setColor("Yellow");
        cookie2.setColor("Orange");
        System.out.println(cookie1.getColor());
        System.out.println(cookie2.getColor());


        // create three empty HashMaps
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashMap<String, Integer> map3 = new HashMap<>();

        map1.put("Akash",27);
        map2 = map1;
        map1 =map3;
        map3.put("Arun",89);
//        map1.entrySet().stream().forEach((a,b)
//                ->{
//            System.out.println(a.g);}
//                }
//        );

    }
}