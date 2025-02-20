package STACK.StackUsingArraylist_2;



import java.util.Scanner;

public class UseStack {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);

        Stack s=new Stack();
        int choice,x;
        do{
            System.out.println("Select an Operation");
            System.out.println(" 1 Push \n 2 Pop \n 3 Peek \n 4 Quit ");
            System.out.println("Enter Choice");
            choice= kb.nextInt();
            switch (choice)
            {
                case 1:

                    System.out.println("Enter number to be Pushed ");
                    x = kb.nextInt();
                    s.push(x);
                    System.out.println(x + " is pushed");

                break;

                case 2:
                try
                {
                    x = s.pop();
                    System.out.println(x + " is popped");
                } catch (StackException ex)
                {
                    System.out.println(ex.getMessage());
                }
                break;
                case 3:
                    try
                    {
                        x=s.peek();
                        System.out.println("Top Element :" + x);

                    }catch (StackException ex)
                    {
                        System.out.println(ex.getMessage());
                    } break;
                case 4:
                    System.out.println("Thanku for Using App");
                    break;

                default:
                    System.out.println("Wrong choice Pleasse try again!");
            }

        }while (choice!=4);

    }
}
