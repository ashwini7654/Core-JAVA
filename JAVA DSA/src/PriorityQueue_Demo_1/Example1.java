package PriorityQueue_Demo_1;

import java.util.PriorityQueue;

public class Example1 {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(11);
        pq.add(25);
        pq.add(4);
        pq.add(18);

        for(int x:pq){
            System.out.println(x);
        }
    }
}
