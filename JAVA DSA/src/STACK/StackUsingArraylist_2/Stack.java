package STACK.StackUsingArraylist_2;


import java.util.ArrayList;
import java.util.List;

public class Stack
{
    private List<Integer> mylist;
    private int tos;

    public Stack()
    {
        mylist=new ArrayList<>();
        tos=-1;

    }
    public void push(int x)
    {
        tos++;
        mylist.add(tos,x);
    }
    public int pop()
    {
        if(tos==-1)
        {
            StackException obj=new StackException("Stack UnderFlow");
            throw obj;
        }
        int x;
        x= mylist.remove(tos);
        tos--;
        return x;
    }
    public int peek()
    {
        if (tos==-1)
        {
            StackException obj=new StackException("Stack UnderFlow");
            throw obj;
        }
        int x;
        x= mylist.get(tos);
        return x;
    }
}
