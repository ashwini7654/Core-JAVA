package PriorityQueue_Demo_1;

import java.util.PriorityQueue;

public class Example2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(11);
        pq.add(25);
        pq.add(4);
        pq.add(18);

        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
// o/p sorted aayega kyu ki min heap upr hoga toh wahi delete hoga phir v heapify ho kr phir min heap bnnega agai again yahi hoga jab tak queue khali na ho jaye
    }
}
