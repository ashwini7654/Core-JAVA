package LinkedList.Assignment_2;

import LinkedList.Assignment.Node;

public class LinkedList2
{

        private Node head;

    public LinkedList2()
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


        }
        public void insert(int x)
        {
           Node temp;
           temp=head;
           if (temp.getData()>x)
           {

           }

        }


    }
