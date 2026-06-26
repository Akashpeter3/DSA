package big_o;

public class On {

    public static void main(String[] args) {
        //O(n)
        //On(10);

        //O(n_square)
        On_Square(2);
    }

    private static void On_Square(int value) {
        for (int i =0;i<value;i++){
            for (int j=0 ;j<value;j++){
                System.out.println(i+"    "+j);
            }
        }
    }


    public static void On(int value){

        for (int i =0;i<value;i++){
            System.out.println(i);
        }

        for (int j=0 ;j<value;j++){
            System.out.println(j);
        }
        //O(2n) - drop constants so should be o(n)
    }
}


