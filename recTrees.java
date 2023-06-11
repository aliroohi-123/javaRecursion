import java.util.*;

public class recTrees {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

    }

    // PREORDER TRAVERSAL
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // INORDER TRAVERSAL
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // POST ORDER TRAVERSAL
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // LEVEL ORDER
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }
                q.add(null);
            } else {
                System.out.println(currNode.data);
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    // COUNT OF NODES
    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftnodes = countOfNodes(root.left);
        int rightnodes = countOfNodes(root.right);
        return leftnodes + rightnodes + 1;
    }

    // SUM OF NODES
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int left = sumOfNodes(root.left);
        int right = sumOfNodes(root.right);
        return left + right + root.data;
    }

    // HEIGHT OF TREE
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        int myHeight = Math.max(left, right) + 1;
        return myHeight;
    }

    // DIAMETER OF A TREE(through root node n2 time)
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = height(root.left) + height(root.right) + 1;
        return Math.max(dia3, Math.max(dia1, dia2));
    }

    // Approach 2 optimized O(n);
    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo optimizedDiameter(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = optimizedDiameter(root.left);
        TreeInfo right = optimizedDiameter(root.right);
        int myHeight = Math.max(left.ht, right.ht) + 1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;
        int mydiam = Math.max(Math.max(diam1, diam2), diam3);
        TreeInfo myinfo = new TreeInfo(myHeight, mydiam);
        return myinfo;

    }

    // SUBTREE OF A TREE
    public boolean isIdentical(Node root, Node subroot) {
        if (root == null && subroot == null) {
            return true;
        }
        if (root == null || subroot == null)
            return false;
        if (root.data == subroot.data)
            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
        return false;
    }

    public boolean isSubTree(Node root, Node subroot) {
        if (subroot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }
        return isSubTree(root.left, subroot) || isSubTree(root.right, subroot);

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        // preorder(root);
        // inorder(root);
        // postorder(root);
        // levelOrder(root);
        // System.out.println(countOfNodes(root));
        // System.out.println(sumOfNodes(root));
        // System.out.println(height(root));
        // System.out.println(diameter(root));
        System.out.println(optimizedDiameter(root).diam);
    }
}
