public class Fib_No_Memo {


    static int counter =0;


    static Integer[] memo = new Integer[100];

    private static int fibNocciRecursive(int n) {


        counter++;

        if (memo[n]!=null){
            return memo[n];
        }
        if (n==1||n==0){
            return  n;
        }
        memo[n] = fibNocciRecursive(n-1)+ fibNocciRecursive(n-2);
        return  memo[n];
    }

    private static int fibNocciIterative(int n) {



        int [] fibList = new int [n+1];
        fibList[0]=0;
        fibList[1]=1;

        for (int index=2;index<=n;index++){
            counter++;
            fibList[index]= fibList[index-1]+fibList[index-2];
        }
        return fibList[n];
    }

    public static void main(String[] args) {


        int n=40;
//        System.out.println("\nFib of "+n+ " = "+ fibNocciRecursive(n));
//        System.out.println("\ncounter "+n+ " = "+counter);
        System.out.println("\nFib of "+n+ " = "+ fibNocciIterative(n));
        System.out.println("\ncounter "+n+ " = "+ counter);
    }




}
