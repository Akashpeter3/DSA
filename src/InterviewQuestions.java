import java.util.HashMap;

public class InterviewQuestions {

    public static void main(String[] args) {

        int[] arr1 ={1,3,4};
        int [] arr2 = {5,6,4};

//     boolean isMatched =   matchNumbertraditionalWay(arr1,arr2);
//        System.out.println(isMatched);

        boolean isMatched = itemInCommonHash(arr1,arr2);
        System.out.println(isMatched);
    }

    private static boolean itemInCommonHash(int[] arr1, int[] arr2) {

        //O(n)
        HashMap<Integer,Boolean> myHashMap = new HashMap<>();

        for (int i: arr1){
            myHashMap.put(i,true); //{1=true,3=true,4=true}
        }

        for (int j: arr2){
          if (myHashMap.get(j)!=null)return  true;
        }
        return  false;
    }

    private static boolean matchNumbertraditionalWay(int[] arr1, int[] arr2) {

        //o(n^2)
        for (int i : arr1){
            for (int j: arr2){
                if (i==j) return  true;
            }
        }
        return  false;
    }
}
