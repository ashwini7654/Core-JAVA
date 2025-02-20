package PriorityQueue_Demo_1;

import java.util.PriorityQueue;

public class Example5 {
    public static void main(String[] args) {
        PriorityQueue<StringBuffer> pq=new PriorityQueue<>();
        pq.add(new StringBuffer("Ashwini"));
        pq.add(new StringBuffer("Khushi"));
        pq.add(new StringBuffer("Bharti"));
        pq.add(new StringBuffer("Anumiti"));
        pq.add(new StringBuffer("Rini"));

        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }

    }
}
