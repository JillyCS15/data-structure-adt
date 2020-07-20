package binarytree;

public class BinarySearchTree {
    private BinaryTreeNode root;

    public BinarySearchTree() {
        this(null);
    }

    public BinarySearchTree(BinaryTreeNode node) {
        root = node;
    }

    public BinaryTreeNode findMin() {
        return findMinHelper(root);
    }

    public BinaryTreeNode findMinHelper(BinaryTreeNode node) {
        if (node.leftNode == null) return node;
        else return findMinHelper(node.leftNode);
    }

    public BinaryTreeNode findMax() {
        return findMaxHelper(root);
    }

    public BinaryTreeNode findMaxHelper(BinaryTreeNode node) {
        if (node.rightNode == null) return node;
        else return findMaxHelper(node.rightNode);
    }
}
