package STACK.StackUsingArray_1.StackUsingArray_3Adv;



public class Stack3
{
    private int[] arr;
    private int tos;
    private int size;

    public Stack3(int size) {
        this.size= size;
        arr=new int[size];
        tos=-1;
    }
    public void push(int x)
    {
        if(tos==size-1){
            StackException obj=new StackException("STACK OVERFLOW");
            throw obj;
        }
        tos++;
        arr[tos]=x;
        return;
    }
    public int pop()
    {
        if(tos==-1)
        {
            StackException obj=new StackException("Stack Underflow");
            throw obj;
        }
        int x;
        x=arr[tos];
        tos--;
        return x;
    }
    public int peek()
    {
        if(tos==-1)
        {
            StackException obj=new StackException("Stack Underflow");
            throw obj;
        }
        int x;
        x=arr[tos];
        return x;
    }
}
