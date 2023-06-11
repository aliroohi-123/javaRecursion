import java.util.Scanner;
public class tree {
    static Node createtree(){
        Scanner sc =new Scanner(System.in);
        
        System.out.println("enter data");
        int data =sc.nextInt();
        Node root = new Node(data);
        if(data ==-1){
          return null;
        }
        
          System.out.println("enter left data "+data);
          root.left =createtree();
          System.out.println("enter right data "+data);
          root.right =createtree();
        
        return root;
      }
    public static void main(String[] args) {
      Node root=  createtree();
      System.out.println(root.data+" ");
        
    }
}

class Node {
	Node left, right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}
