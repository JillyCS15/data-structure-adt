package binarytree;

public class BinaryTree {
    private BinaryTreeNode root;

    public BinaryTree(BinaryTreeNode node) {
        root = node;
    }
}

class BinaryTreeNode {
    int data;
    BinaryTreeNode leftNode;
    BinaryTreeNode rightNode;

    public BinaryTreeNode(int data) {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }

    public BinaryTreeNode() {
        this(0);
    }
}
