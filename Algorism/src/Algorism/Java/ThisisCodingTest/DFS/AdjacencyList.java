package Algorism.Java.ThisisCodingTest.DFS;

import java.util.ArrayList;
import java.util.List;

//class Node {
//    private int index;
//    private int distance;
//
//    public Node(int index, int distance) {
//        this.index = index;
//        this.distance = distance;
//    }
//
//    public void show() {
//        System.out.print("(" + this.index + "," + this.distance + ")");
//    }
//}

class Node {
    private int index;
    private List<Node> connectedNodes = new ArrayList<>();

    public Node(int index) {
        this.index = index;
    }

    public void connectNode(Node node) {
        connectedNodes.add(node);
    }

    @Override
    public String toString() {
        return "Node{" +
                "index=" + index +
                ", connectedNodes=" + connectedNodes +
                '}';
    }
}


public class AdjacencyList {

    public static ArrayList<ArrayList<Node>> graph = new ArrayList<>();

    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            graph.add(new ArrayList<Node>());
//        }
//        graph.get(0).add(new Node(1, 7));
//        graph.get(0).add(new Node(5, 5));
//        graph.get(1).add(new Node(0,7));
//        graph.get(2).add(new Node(0, 5));
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < graph.get(i).size(); j++) {
//                graph.get(i).get(j).show();
//            }
//            System.out.println();
//        }
    }
}
