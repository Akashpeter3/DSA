package csa_notes;

import java.util.Arrays;

public class FibonacciSeries {
    public static void main(String[] args) {
        // if n=4 , then it will be 0,1,2,3
        //initially 0,1
        //then sum 0+1= 1 , so next number is the sum of two preceding numbers  which is 0,1,1
        // final result , 0,1,1,2
        //inde 0,1,2,3  and , n=4 result = 0,1,1,2
        //how to write equation now
        //equation f(n) =  f(n-1)+f(n-2)
        //5  , 0,1,1,2,3   0,1,2,3,4
        //  1,(n-4),(n-3),(n-2)
        //0+1 ->1
        //1+1 ->2
        //1+2 ->3
//        n     : 0  1  2  3  4  5  6
//        F(n)  : 0  1  1  2  3  5  8
          //f(2) = f(1)+f(0) =1+0 =1
         //f(3) =  f(2)+f(1) =1+1 =2
         //f(4) = f(3)+f(2) = 2+1 =3

        //f(10) = f(10-1)+f(10-2) = f(9)+f(8)= f(n-1)+f(n-2) =

       // System.out.println(withoutMemo(19));
        int n=5;
        //int [] memo = new int [n+1];
        //System.out.println(withMemo(n, memo));
       int [] numArray = usingForLoop();
        System.out.println(Arrays.toString(numArray));


    }

    private static int[] usingForLoop() {

        int n = -1;
        if (n<0) return new int [0];
        //declared an empty array
        int [] num = new int [n+1]; //[0,0]

        num[0]= 0;
        if (n == 0) {
        return num; //[0,0]
        }

        num[1] = 1;


//        if (n<=1) {
//            return n;
//        }


        //0,1,0,0,0,0
        //i start from index 2
        // value should be preceding sum of two  value 0+1 =1;

        for (int i= 2;i<num.length;i++){
            num[i] = num[i-1]+num[i-2];
            //ex if  i= 2, 0+1 =1 , //0,1,1,0,0,0
        }

      return  num;
    }

    private static int withMemo(int n, int[] memo) {
      //memo[] =[0,0,0,0,0,0]
       //stores the computed value for reusing;
        if (n<=1){
            return n;
        }
        if (memo[n]!=0){
            return memo[n];
        }

       return memo[n] = withMemo( n-1,memo)+ withMemo(n-2,memo);

    }

    private static int withoutMemo(int n) {
        if (n<=1){
            return  n;
        }else {
            return withoutMemo(n-1)+(n-2);
        }
    }
}
