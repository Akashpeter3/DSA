package csa_notes;

public class FindMinimum {

    public static void main(String[] args) {
        int[] my_array = {7, 12, 9, 4, 11};
        //consider first element as minimum element
        //check first element is smaller than rest of element or not
        //if any other new small element found that will be the new  minimum element

        int min = my_array[0];

        for(int i=0;i<my_array.length;i++){
            if (my_array[i]<min){
                min =my_array[i];
                System.out.println("min value  "+ min + " with index "+i);
            }
        }

        System.out.println("final min value identified "+ min);


    }
}
