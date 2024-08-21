package OOP_ENCAPSULATION;

public class Person
{
    private String name;
    private int age;

    public void setPerson( String n,int a){
        name=n;
        age=a;
    }
    public void showPerson(){
        System.out.println("Person name is" + name);
        System.out.println("person age is"+ age);
    }
}
