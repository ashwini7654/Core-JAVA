package AdditionOf2POLY;

public class Polynomial {
    private Node head;

    public Polynomial()
    {
        this.head = null;
    }
    public void append(int coeff ,int exp)
    {
        Node p = new Node(coeff,exp);
        if(head== null)
        {
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
    }
    public void show()
    {
        Node temp=head;
        while (temp.getNext()!=null)
        {
            System.out.print(temp.getCoeff() + "X^" + temp.getExp() + "+");
            temp= temp.getNext();
        }
        System.out.println("\b");
    }
public void add(Polynomial p1,Polynomial p2)
{
    if (p1.head==null&&p2.head==null){
        System.out.println("Addition is not possible");
        return;
    }
    Node p,temp=head,q;
    Node first,second;
    first=p1.head;
    second=p2.head;
    while(first!=null&&second!=null){
        p=new Node();
        if(head==null) {
            head = p;
        }else {
            temp.setNext(p);
        }
        temp=p;

    }
}
}
