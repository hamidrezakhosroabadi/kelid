package ir.k9i.kelid.Ring;

import java.util.ArrayList;
import java.util.Collections;

import ir.k9i.kelid.Node.Node;

// This data structure should be replaces with better one!
public class Ring {
    private static ArrayList<Node> nodes = new ArrayList<>();

    public static void push(Node node) {
        int index = Collections.binarySearch(nodes, node);
        if (index >= 0)
            return;
        nodes.add(index < 0 ? -index - 1 : index, node);
    }

    public static Node pull(Node node) {
        nodes.remove(node);
        return node;
    }

    public static Node find(int id) {
        return nodes.get(Collections.binarySearch(nodes, new Node(id, null, null)));
    }

    public static ArrayList<Node> getSpots(int id, int count) {
        ArrayList<Node> temp = new ArrayList<>();

        int index = Collections.binarySearch(nodes, new Node(id, null, null));
        index = index < 0 ? -index - 1 : index;

        for (int i = index; i < count + index; i++) {
            temp.add(nodes.get(i % nodes.size()));
        }
        return temp;
    }
}
