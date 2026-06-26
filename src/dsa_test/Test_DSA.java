package dsa_test;

import java.util.Arrays;
import java.util.Collections;

public class Test_DSA {




  public static void main (String args[]){
//      System.out.println("Hello i am going to learn DSA each and every topic in detail so i will take my time and i  wil" +
//              "not be hurry i promise.");
      int [] num = {5,3,8,10,4,1,11,2,7};
      //findLargestNumberInArray(num);
      //sortingNumberAscending(num);
      //sortingNumberDescending(num);
      //largestNumberIntegerCheck();

    }

    private static void largestNumberIntegerCheck() {

      int l =  1_800_000_000;
      int r = 1_900_000_000;

      int m=l+r;
        System.out.println(m);
    }

    private static void sortingNumberDescending(int[] num) {
      int temp =0;
      for (int i=0;i<num.length-1;i++){
          for (int j=i+1;j<num.length;j++){
              if (num[i]<num[j]){
                 temp = num[i];
                 num[i]=num[j];
                 num[j]=temp;
              }
          }
      }
        System.out.println(Arrays.toString(num));
    }

    private static void sortingNumberAscending(int[] num) {

      //method 1
         int [] sorted = Arrays.stream(num).sorted().toArray();
         //System.out.println(Arrays.toString(sorted));
      //method 2
        int temp = num[0];
        int [] newArray = new int[num.length];

        for (int i=0;i<newArray.length-1;i++){
           for (int j=i+1;j<newArray.length;j++){
               if (num[i]>num[j]){
                   temp = num[i];
                   num[i]= num[j];
                   num[j]= temp;
               }
           }

        }
        System.out.println(Arrays.toString(num));



    }

    public static void findLargestNumberInArray(int[] num){

      //method 1
      // int max = Arrays.stream(num).max().getAsInt();
        //System.out.println(max);

       //method 2
        int max = num[0];
        for(int i=0;i<num.length;i++){
        if (num[i]>max){
            max = num[i];
        }
        }
       // System.out.println(max);

        //method 3
//        int i=0;
//        while(i<num.length){
//            if (num[i]>max){
//              max =num[i];
//            }
//            i++;
//        }

      //  System.out.println(max);

        //method 4
//        int i=0;
//        do{
//            if (num[i]>max){
//                max =num[i];
//            }
//            i++;
//        }while(i>num.length);
//        System.out.println(max);

        //method 5

      Integer [] boxed =  Arrays.stream(num).boxed().toArray(Integer[]::new);
      int maxValue =  Collections.max(Arrays.asList(boxed));
     // System.out.println(maxValue);

        //method 6
       int maxReduce = Arrays.stream(num).reduce(0,(a,b) ->a>b? a:b);
        System.out.println(maxReduce);
    }





}
