class Node {
    int val;
    Node left, right;

    Node(int val) { this.val = val; }
    Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Question4 {
    public static boolean dfsSearch(Node root, int target) {
        if (root == null) return false;
        if (root.val == target) return true;
        return dfsSearch(root.left, target) || dfsSearch(root.right, target);
    }

    public static void main(String[] args) {
        // 建構樹狀結構
        Node root = new Node(5,
            new Node(3, new Node(2), new Node(4)),
            new Node(8, null, new Node(7))
        );

        if (dfsSearch(root, 7)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        // 預期輸出: Found
    }
}