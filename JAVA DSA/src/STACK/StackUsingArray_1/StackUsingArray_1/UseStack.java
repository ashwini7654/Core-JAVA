package STACK.StackUsingArray_1.StackUsingArray_1;

import java.util.Scanner;

public class UseStack {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("enter the size of Stack");
        int size=kb.nextInt();
        Stack s= new Stack(size);

        for(int i=0; i<size;i++)
        {
            System.out.println("Enter the element to Push");
            int x= kb.nextInt();
            s.push(x);
            System.out.println(x+" is pushed what is next");
        }

        System.out.println("Top element of Stack " + s.peek());

        for (int i=0;i<size;i++)
        {
            int x=s.pop();
            System.out.println("Popped element " + x);

        }
    }
}
