package STACK.StackUsingArray_1.StackUsingArray_1;

public class Stack {
    private int [] arr;
    private int size;
    private int tos;

    public Stack(int size)
    {
        arr=new int[size];
        tos=-1;
        this.size = size;
    }
    public void push(int x)
    {
        if(tos==(size-1))
        {
            System.out.println("Stack is Overflow");
            return;
        }
        tos++;
        arr[tos]=x;
        return;
    }
    public int pop()
    {
        if(tos==-1)
        {
            System.out.println("Stack is Underflow");
            return -1;
        }
     int y = arr[tos];
        tos --;
         return y;

    }
    public int peek()
    {
        if(tos==-1)
        {
            System.out.println("Stack is UnderFlow");
             return -1;
        }
        int x;
        x=arr[tos];
        return x;
    }
}
