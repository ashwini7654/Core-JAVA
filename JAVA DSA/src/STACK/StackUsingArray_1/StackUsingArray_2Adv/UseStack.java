package STACK.StackUsingArray_1.StackUsingArray_2Adv;

import java.util.Scanner;

public class UseStack {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter the size of Stack");
        int size = kb.nextInt();
        Stack2 s = new Stack2(size);
        try {
            for (int i = 0; i < size+10; i++) //yaha pr size ko plus 10 bs check krne ke liye rakhe tahki stack overflow ho pta chle
            {
                System.out.println("Enter the element to Push");
                int x = kb.nextInt();
                s.push(x);
                System.out.println(x + " is pushed what is next");
            }

        } catch (StackException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Top element of Stack " + s.peek());
        try {
            for (int i = 0; i < size+10; i++)
            {
                int x = s.pop();
                System.out.println("Popped element " + x);

            }
        }catch (StackException ex){
            System.out.println(ex.getMessage());
        }
    }
}