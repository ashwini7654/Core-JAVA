package LinkedList.LinkList_1;

public class LinkList
{
    private Node1 head;

    public LinkList()
    {
        this.head = null;
    }
    public void append(int x)
    {
        Node1 p=new Node1(x);
        if (head == null)
        {
            head=p;
            return;
        }
        Node1 temp;
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
        Node1 temp=head;
        while(temp!=null)
        {
            System.out.print(temp.getData() + "->");
            temp= temp.getNext();;
        }


    }

}
