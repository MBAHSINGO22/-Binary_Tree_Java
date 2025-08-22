package PERTEMUAN2;

public class MainTree {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        TreeNode leftChild = new TreeNode(5);
        TreeNode rightChild = new TreeNode(15);

        root.setLeft(leftChild);
        root.setRight(rightChild);

        Tree tree = new Tree(root);

        System.out.println("Root data: " + tree.getRoot().getData());
        System.out.println("Left child data: " + tree.getRoot().getLeft().getData());
        System.out.println("Right child data: " + tree.getRoot().getRight().getData());
    }
}
