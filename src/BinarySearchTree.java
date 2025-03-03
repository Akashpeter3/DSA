public class BinarySearchTree {


   private Node root;

    class Node{

        int value;
        Node left;
        Node right;


      private   Node(int value){
            this.value=value;
        }
    }


    public boolean insert(int value){
        Node newNode = new Node(value);
        if(root==null){
            root =newNode;
            return  true;
        }
        Node temp = root;
        while (true){
            if (newNode.value==temp.value)return false;
            if(newNode.value< temp.value){
                if (temp.left ==null){
                    temp.left =newNode;
                    return  true;
                }
                temp=temp.left;

            }else {
                if (temp.right==null){
                    temp.right=newNode;
                    return true;
                }
                temp=temp.right;
            }
        }
    }


public boolean contains(int value){
        Node temp =root;
        while (temp!=null){
            if (value<temp.value){
                temp =temp.left;
            }else if (value> temp.value){
                temp=temp.right;
            } else {
                return  true;
            }
        }
        return false;
}


//recursion example

    private  boolean rContains(Node currntNode,int value){

        if (currntNode==null) return  false;

        if (currntNode.value == value) return  true;

        if (value<currntNode.value){
            return  rContains(currntNode.left,value);
        }else {
            return  rContains(currntNode.right,value);
        }

    }


    private  Node rInsert(Node currentNode,int value){
        if (currentNode ==null)return new Node(value);

        if (value<currentNode.value){
            currentNode.left = rInsert(currentNode.left,value);
        } else if (value>currentNode.value) {
            currentNode.right =rInsert(currentNode.right,value);

        }
        return  currentNode;




    }

    private Node deleteNode(Node currentNode,int value){


        if (currentNode == null) return null;

        if (value<currentNode.value){
            currentNode.left = deleteNode(currentNode.left,value);
        }else if(value>currentNode.value){
            currentNode.right = deleteNode(currentNode.right,value);
        }else {
            if (currentNode.left==null && currentNode.right==null){
                return  null;
            } else if (currentNode.left==null) {
                currentNode =currentNode.right;

            } else if (currentNode.right==null) {
                currentNode =currentNode.left;
            }else {

                int subtreeMin = minimumValue(currentNode.right);
                currentNode.value =subtreeMin;
                currentNode.right = deleteNode(currentNode.right,subtreeMin);

            }
        }
        return  currentNode;

    }

    public int minimumValue(Node currentNode) {

        while (currentNode.left!=null){
            currentNode=currentNode.left;
        }
        return currentNode.value;
    }





    public  boolean rContains(int value){
        return  rContains(root,value);
    }

    public  void rInsert(int value){
        if (root==null){
                root = new Node(value);
        }
          rInsert(root,value);
    }

    public void deleteNode(int value){

         deleteNode(root,value);

    }




    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.rInsert(2);
        myBST.rInsert(1);
        myBST.rInsert(3);
//        myBST.rInsert(18);
//        myBST.rInsert(27);
//        myBST.rInsert(52);
//        myBST.rInsert(82);

//
//        System.out.println(myBST.minimumValue(myBST.root));
//        System.out.println(myBST.minimumValue(myBST.root.right));



//        myBST.insert(18);
//        myBST.insert(52);
//        myBST.insert(82);


//        System.out.println("\nBST contains 21 : ");
//        System.out.println(myBST.rContains(76));
//
//
//        System.out.println("\nBST contains 17 : ");
//        System.out.println(myBST.rContains(17));

        System.out.println("\nRoot: "+myBST.root.value);
        System.out.println("\nRoot->left "+myBST.root.left.value);
        System.out.println("\nRoot->right "+myBST.root.right.value);

        myBST.deleteNode(2);

        System.out.println("\nRoot: "+myBST.root.value);
        System.out.println("\nRoot->left "+myBST.root.left.value);
        System.out.println("\nRoot->right "+myBST.root.right);


//        myBST.insert(27);
//
//       // System.out.println(myBST.root.left.right.value);
//        System.out.println(myBST.contains(21));

       // System.out.println("Root =  "+myBST.root);
    }

}
