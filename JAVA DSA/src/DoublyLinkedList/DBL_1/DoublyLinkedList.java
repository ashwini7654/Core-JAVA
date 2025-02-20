package DoublyLinkedList.DBL_1;

public class DoublyLinkedList
{
    private Node head;
    public DoublyLinkedList()
    {
        head=null;

    }
    public void append(int x)
    {
        Node p=new Node(x);
        if(head==null){
            head=p;
            return;
        }
        Node temp;
        temp=head;
        while (temp.getNext()!=null)
        {
            temp= temp.getNext();
        }
        temp.setNext(p);
        p.setPrev(temp);
    }
    public void printList()
    {
     if (head==null)
     {
         System.out.println("LIst is empty");
         return;
     }
     Node temp=head;
     Node q=null;
        System.out.println();
        System.out.println("Printing data in forward Direction");
        while (temp!=null)
        {
            q=temp;
            System.out.print(temp.getData() + "-->");
           temp= temp.getNext();
        }
        System.out.println();
        System.out.println("Printing data in Backward Direction");
        while (q!=null)
        {
            System.out.print(q.getData() +"-->");
            q=q.getPrev();
        }
    }


    public void prepend(int x)
    {
        System.out.println("After prepend running");
        Node p=new Node(x);
        if(head==null)
        {
            head=p;
            return;
        }
      p.setNext(head);
        head.setPrev(p);
        head=p;
    }
}
