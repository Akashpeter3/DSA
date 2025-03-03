public class Recursion {



    private static int findFactorial(int n) {
      if (n==1)return 1;
      return n*findFactorial(n-1);
      //6*findFactorial(4)   //24*5     120
      //4*findFactorial(3)   //4*6      24
      //3*findFactorial(2)   //3*2      6
      //2*findFactorial(1)  //2*1       2
      //1
        //1*2*3*4*5
    }

    public static void main(String[] args) {

        int result = findFactorial(30);
        System.out.println("final result "+result);

//        boolean isFound =
    }
}
