package LinkedList;

public class Node
{
    int data;
    Node next;



    public int Data()
    {
        return data;
    }

    public void data(int data)
    {
        this.data = data;
    }


}
class Demo{
    public static void main(String[] args)
    {
        Node first;
        first= new Node();
        first.data(10);
        Node sec=new Node();
        sec.data(20);
        first.next=sec;
        Node third=new Node();
        third.data(30);
        sec.next=third;
        Node temp;
        temp=first;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
}
