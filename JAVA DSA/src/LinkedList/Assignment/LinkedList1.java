package LinkedList.Assignment;


import java.security.spec.RSAOtherPrimeInfo;
import java.util.Stack;

public class LinkedList1
{
    private Node head;

    public LinkedList1()
    {
        this.head = null;
    }
    public void append(int x)
    {
        Node p=new Node(x);
        if (head == null)
        {
            head=p;
            return;
        }
        Node temp;
        temp=head;
        while(temp.getNext()!=null)
        {
           temp= temp.getNext();
        }
       temp.setNext(p);
    }
    public void display()
    {
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.getData());
            temp= temp.getNext();
            if(temp!=null)
            {
                System.out.print("-->");
            }

        }

        System.out.println();
    }
    public int  countNodes()
    {
        int count=0;


        if(head==null)
        {
           return 0;
        }
        Node temp=head;
        while (temp!=null)
        {
            count ++;
            temp=temp.getNext();

        }
        return count;

    }
    public int searchNodes(int x)
    {
        if (head==null)
        {
            return 0;
        }
        int pos=1;
        Node temp=head;
        while (temp!=null)
        {
            if(temp.getData()==x)
            {

                return pos;
            }
            pos++;
         temp=temp.getNext();
        }
        return -1;
    }
public void prepend(int x)
{
    Node p=new Node(x);
    if (head == null)
    {
        head=p;
        return;
    }
  p.setNext(head);
    head=p;
}


}
