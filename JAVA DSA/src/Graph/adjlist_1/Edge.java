package Graph.adjlist_1;

public class Edge {
    private int source;
    private int dist;
    private int weight;

    public Edge(int dist, int source, int weight) {
        this.dist = dist;
        this.source = source;
        this.weight = weight;
    }

    public Edge() {
    }

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
