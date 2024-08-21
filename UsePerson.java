package OOP_ENCAPSULATION;

import java.util.Scanner;

public class UsePerson
{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("enter your name:");
        String n=kb.nextLine();
        System.out.println("enter your age:");
        int a=kb.nextInt();
Person p=new Person();
p.showPerson();
    }
}
