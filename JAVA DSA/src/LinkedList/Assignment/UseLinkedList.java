package LinkedList.Assignment;

public class UseLinkedList
{
    public static void main(String[] args) {
        LinkedList1 obj=new LinkedList1();
        obj.append(100);
        obj.append(20);
        obj.append(340);
        obj.append(40);
        obj.display();
       int x= obj.countNodes();
        System.out.println("Total number of nodes "+ x);
        System.out.println("Position of node "+obj.searchNodes(20));
        obj.prepend(50);

    }
}
