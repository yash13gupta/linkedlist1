package linkedlist;

public class ll {

    public static class Node {
        char data;
        Node link;
        Node(char data){
        this.data = data;
        }
        public static int count(Node x){
            int start = 0;
            Node temp = x;
            while(temp!=null){
            temp = temp.link;
            start++;

            }
            return start;
        }
        public static void Display(Node x){
        Node temp = x;
        while(temp!=null){
        System.out.print(temp.data);
        temp = temp.link;


        }
        
    }
    
    public static void main(String[] args) {
        Node x = new Node('y');
        Node y = new Node('a');
        Node z = new Node('s');
        Node g = new Node('h');
        x.link = y;
        y.link = z;
        z.link = g;
       
        
     System.out.println(count(x));
     Display(x);
    } 

    }
}

