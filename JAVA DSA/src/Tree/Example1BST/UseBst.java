package Tree.Example1BST;

public class UseBst {
    public static void main(String[] args) {
        Bst bt=new Bst();
        bt.append(2);
        bt.append(4);
        bt.append(7);
        bt.append(5);
        bt.append(9);
        bt.preorder();
    }
}
