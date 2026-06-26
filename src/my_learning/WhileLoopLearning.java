package my_learning;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WhileLoopLearning {

    public static void main(String[] args) {
        whileLoop1();
    }
//
    private static void whileLoop1() {

        int [] numArray = {1,4,5,7};

        //1457

        //7145
        //7514
        //7541

        //[7,5,4,1]

//int [] newArray = new int[numArray.length];
        int left = 0;
        int right = numArray.length-1;

        while (left<right){
            int temp = numArray[left];
            numArray[left]= numArray[right];
            numArray[right]= temp;
            left++;
            right--;



        }
        System.out.println(Arrays.toString(numArray));

        }



    }

