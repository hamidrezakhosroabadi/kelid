package ir.k9i.kelid.Node;

public class Node implements Comparable<Node> {
    public int id;
    public String name;
    public String url;

    public Node(int id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

    @Override
    public int compareTo(Node node) {
        return this.id - node.id;
    }
}
