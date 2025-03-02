import java.util.ArrayList;
import java.util.List;

public class Hashtable {

    private  int size=7;
    private  Node [] dataMap;

    class  Node{
        String key;
        int value;
        Node next;

        Node(String key,int value){
            this.key =key;
            this.value =value;
        }


    }


    public  Hashtable(){
        dataMap = new Node[size];
    }

    public  void  printtable(){
        for (int i=0;i< dataMap.length;i++){
            System.out.println(i+ ":");
            Node temp = dataMap[i];
            while (temp!=null){
                System.out.println("{"+temp.key+" = "+temp.value+"}");
                temp=temp.next;
            }
        }
    }

    //0-6
    private  int hash(String key){
      int hash =0;
        char[] keyChars = key.toCharArray();
        for (int i=0;i<keyChars.length;i++){
        int asciiValue = keyChars[i];
        hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public  void  set(String key,int value){
        int index = hash(key);
        Node newNode = new Node(key,value);
        if (dataMap[index]==null){
            dataMap[index] = newNode;

        }else {
            Node temp =dataMap[index];
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }

    }

    public  int get(String key){

        int index = hash(key);
        Node temp = dataMap[index];
        while (temp!=null){
            if (temp.key ==key)return temp.value;
            temp=temp.next;
        }

        return 0;

    }


    public ArrayList keys(){

        ArrayList<String> keyList = new ArrayList<>();
        for (Node node : dataMap) {
            Node temp = node;
            while (temp != null) {
                keyList.add(temp.key);
                temp = temp.next;
            }
        }

        return keyList;

    }

    public static void main(String[] args) {
        Hashtable myHashtable = new Hashtable();
        //myHashtable.printtable();
       // myHashtable.hash("Akash");

        myHashtable.set("Akash",28);
        myHashtable.set("Manu",35);
        myHashtable.set("Reshma",27);
        myHashtable.set("Arun",29);
        myHashtable.set("Ram",23);
        myHashtable.set("Meenu",21);
        myHashtable.set("Ajay",20);







        //myHashtable.printtable();


       // System.out.println("Value -> "+ myHashtable.get("Meenu"));

        System.out.println("KeyList -> "+myHashtable.keys());



    }

}
