package ir.k9i.kelid.Ring;

import java.util.TreeSet;

import ir.k9i.kelid.Node.Node;

public class Ring {
    private static TreeSet<Node> nodes = new TreeSet<>();

    public static void push(Node node) {
        nodes.add(node);
    }

    public static Node pull(Node node) {
        nodes.remove(node);
        return node;
    }

    public static TreeSet<Node> getAll() {
        return nodes;
    }
}
