import java.util.Arrays;

public final class Sorting {

    public static void main(String[] args) {


      //  int [] array = {3,1,4,2};
        //bubbleSort(array);
        //selectionSort(array);
        //insertionSort(array);

//        int[] arr1 = {1,3,7,8};
//        int[] arr2 = {2,4,5,6};
        //mergeSortHelper(arr1,arr2);

      //  System.out.println(Arrays.toString(array));
      //  int [] arr = mergeSort(array);
      //  System.out.println(Arrays.toString(arr));


        int[] array ={4,6,1,7,3,2,5};
        quickSort(array);
        System.out.println(Arrays.toString(array));

    }

    private static void quickSort(int[] array) {
        quickSortHelper(array,0,array.length-1);
    }

    private static void quickSortHelper(int []array, int left, int right ) {

if(left<right) {
    int pivotIndex = pivot(array, left, right);
    quickSortHelper(array, left, pivotIndex - 1);
    quickSortHelper(array, pivotIndex + 1, right);
}
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex) {

        int swapIndex = pivotIndex;
        for (int i=pivotIndex+1; i<=endIndex;i++){
            if (array[i]<array[pivotIndex]){
                swapIndex++;
                swapNumbers(array,swapIndex,i);

            }
        }
        swapNumbers(array,pivotIndex,swapIndex);
        return  swapIndex;
    }

    private static void swapNumbers(int[] array, int firstIndex, int secondIndex) {

        int temp = array[firstIndex];
        array[firstIndex] =array[secondIndex];
        array[secondIndex]= temp;
    }

    private static int[] mergeSort(int[] array) {

        int length = array.length;

        if (length==1)return array;

        int midIndex = length/2;

        int[] left = mergeSort(Arrays.copyOfRange(array,0,midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array,midIndex,length));

        return merge(left,right);
    }

    private static int [] merge(int[] arr1, int[] arr2) {

        int length1 =arr1.length;
        int length2 = arr2.length;

        int [] combinedArray = new int [length1+length2];

        int combIndex =0;
        int i=0;
        int j=0;

        while (i<length1&&j<length2) {
            if (arr1[i] < arr2[j]) {
                combinedArray[combIndex] = arr1[i];
                combIndex++;
                i++;
            } else {
                combinedArray[combIndex] = arr2[j];
                combIndex++;
                j++;
            }
        }
            while (i<length1){
                combinedArray[combIndex]= arr1[i];
                combIndex++;
                i++;
            }
            while (j<length2){
                combinedArray[combIndex] =arr2[j];
                combIndex++;
                j++;
            }

            return combinedArray;



    }

    private static void insertionSort(int[] array) {

        int length = array.length;

        for (int i=1;i<length;i++){

            int temp = array[i];
            int j=i-1;
            while (j>-1&&temp<array[j]){
               array[j+1]= array[j];
               array[j]=temp;
               j--;
            }

        }

        System.out.println(Arrays.toString(array));
    }

    private static void selectionSort(int[] array) {

        int length = array.length;

        for (int i=0;i<array.length;i++){
            int minIndex = i;
            for (int j=i+1;j<array.length;j++){
                if (array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            if (i!=minIndex){
                int temp = array[i];
                array[i]= array[minIndex];
                array[minIndex]= temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {

        int length = array.length;

        for (int i=length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if (array[j]>array[j+1]){
                    int temp= array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
