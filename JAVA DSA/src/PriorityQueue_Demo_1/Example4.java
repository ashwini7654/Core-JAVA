package PriorityQueue_Demo_1;

import java.util.PriorityQueue;

public class Example4 {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("Ashwini");
        pq.add("Khushi");
        pq.add("Bharti");
        pq.add("Anumiti");
        pq.add("Rini");
        for(String x:pq){
            System.out.println(x);
        }
    }
}
