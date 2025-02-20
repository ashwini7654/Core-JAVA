package PriorityQueue_Person;

public class Person implements Comparable<Person>{
    private int age;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Person o) {
        return 0;
    }

}
