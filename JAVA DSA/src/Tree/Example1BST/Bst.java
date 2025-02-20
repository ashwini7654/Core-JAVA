package Tree.Example1BST;

import java.util.Stack;

public class Bst
{
    Node root;

    public Bst(Node root)
    {
        this.root = null;
    }
    public Bst() {
    }


    public void append(int x){
        Node p= new Node( x);
        if(root==null){
            root=p;
            return;
        }
        Node temp,prev;
        temp=root;
        while(temp!=null) {
            prev = temp;
            if (x > temp.getData())
            {
                temp = temp.getRight();
            } else
            {
                temp = temp.getLeft();
            }
            if(prev.getData()<x)
            {
                prev.setRight(p);
            }
            else
                prev.setLeft(p);
        }
    }
    public void preorder()
    {
     if (root==null)
     {
         System.out.println("Tree is empty");
         return;
     }
     Stack<Node> st=new Stack<>();
     Node temp=root;
     st.push(temp);
     while (st.isEmpty()==false){
         temp=st.pop();
         while(temp!=null){
             System.out.println(temp.getData());
             if(temp.getRight()!=null){
                 st.push(temp.getRight());
             }
             temp=temp.getLeft();
         }
     }
    }
}
