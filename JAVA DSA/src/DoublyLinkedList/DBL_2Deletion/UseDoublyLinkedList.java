package DoublyLinkedList.DBL_2Deletion;

public class UseDoublyLinkedList
{
    public static void main(String[] args) {
       DoublyLinkedList obj=new DoublyLinkedList();
        obj.append(28);
        obj.append(12);
        obj.append(29);
        obj.append(33);
        obj.printList();
        obj.prepend(23);
        obj.printList();
    }
}
