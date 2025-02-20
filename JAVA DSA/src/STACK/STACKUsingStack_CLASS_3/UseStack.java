package STACK.STACKUsingStack_CLASS_3;
//code  number=7
import STACK.StackUsingArray_1.StackUsingArray_2Adv.StackException;
//yaha par hm dusare package se StackException le rahe uske liye likha gaya code ya phir khud ke package mai Stack Exception class banno

import java.util.Stack;
import java.util.Scanner;
public class UseStack
//Stack is perdefined class h toh agar hmlog Stack classs use kr rahe toh Apnaa class ka name stack nhi rakege
{
    public static void main(String[] args)
    {
        Stack<Integer> mystack=new Stack<>();
        int choice,x;
        Scanner kb =new Scanner(System.in);



        do {


            System.out.println("Select the Operation");
            System.out.println(" 1:PUSH \n 2:POP \n 3:PEEK \n 4:QUIT");
            System.out.println("Enter the Choice");
            choice = kb.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to be pushed");
                    x = kb.nextInt();
                    mystack.push(x);//yaha pr list intarah v kamm kreta h stack class isliye polmorphic behevior hai
                    break;
                case 2:
                    try {
                        x = mystack.pop();
                        System.out.println(x + " is poped");
                    } catch (StackException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 3:
                    try {
                        x = mystack.peek();
                        System.out.println(x + " is top element");
                    } catch (StackException ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Thanku for using app ");
                    break;
                default:
                    System.out.println("Wrong choice enter TRY AGAIN!");

            }
        }
         while (choice!=4);
    }


}
