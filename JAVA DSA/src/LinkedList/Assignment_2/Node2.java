package LinkedList.Assignment_2;



public class Node2
{
        private int data;
        private LinkedList.Assignment.Node next;

        public Node2(int data)
        {
            this.data = data;
            this.next=null;
        }

        public int getData()
        {
            return data;
        }

        public void setData(int data)
        {
            this.data = data;
        }

        public LinkedList.Assignment.Node getNext()
        {
            return next;
        }

        public void setNext(LinkedList.Assignment.Node next)
        {
            this.next = next;
        }
    }

