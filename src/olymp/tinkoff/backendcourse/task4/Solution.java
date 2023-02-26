package olymp.tinkoff.backendcourse.task4;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static class Node {
        private final List<Node> offsprings = new ArrayList<>();
        private final int a;
        private final int number;
        private final int length;
        private Node parent;

        public Node(int a, int number, int length) {
            this.a = a;
            this.number = number;
            this.length = length;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public Node getParent() {
            return parent;
        }

        public void addOffspring(Node elem) {
            offsprings.add(elem);
        }

        public int getNumber() {
            return number;
        }

        public int getA() {
            return a;
        }

        public int findLength(int stop) {
            if (this.number == stop) {
                return 0;
            }
            return length + parent.findLength(stop);
        }
    }

    public static class Tree {
        private Node root;
        private final Map<Integer, Node> tree = new HashMap<>();

        public void setRoot(Node root) {
            this.root = root;
            tree.put(root.getNumber(), root);
        }

        public void addNode(int a, int number, int length, int parent) {
            Node node = new Node(a, number, length);
            node.setParent(tree.get(parent));
            tree.put(number, node);
            tree.get(parent).addOffspring(node);
        }

        public Node getRoot() {
            return root;
        }

        public Node getNode(int number) {
            return tree.get(number);
        }
    }

    public static class TreeFactory {
        public static Tree createTree(int n) {
            Tree tree = new Tree();
            String next = scanner.next();

            int a = Integer.parseInt(next);
            tree.setRoot(new Node(a,   1, -1));
            List<Integer> ai = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                ai.add(scanner.nextInt());
            }
            List<Integer> pi = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                pi.add(scanner.nextInt());
            }
            List<Integer> li = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                li.add(scanner.nextInt());
            }
            for (int i = 2; i < n + 1; i++) {
                tree.addNode(ai.get(i - 2), i, li.get(i - 2), pi.get(i - 2));
            }
            return tree;
        }
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        Tree tree = TreeFactory.createTree(n);
        Node noda1, noda2;
        Deque<Node> queue = new ConcurrentLinkedDeque<>();
        int k = 0;
        for (int i = 1; i < n + 1; i++) {
            k = 0;
            noda1 = tree.getNode(i);
            queue.addAll(noda1.offsprings);
            while (!queue.isEmpty()) {
                noda2 = queue.pop();
                queue.addAll(noda2.offsprings);
                if (noda2.findLength(noda1.getNumber()) <= noda2.getA()) {
                    k++;
                }
            }
            System.out.print(k + " ");
        }
        scanner.close();
    }
}