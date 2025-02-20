package Graph.adjlist_1;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Edge>[] edgeList;

    public Graph(int size) {
       edgeList=new ArrayList[size];
       for(int i=0; i<size; i++){
           edgeList[i]=new ArrayList<>();
       }
    }
    
}
