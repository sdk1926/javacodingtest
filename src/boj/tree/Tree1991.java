package boj.tree;

import java.io.*;

class Node{
    Node left;
    Node right;
    char value;
    Node(char data){
        this.value = data;
        this.left = null;
        this.right = null;
    }
}
public class Tree1991 {
    Node head;

    public void insertNode(char data, char leftData, char rightData) {
        if (head ==null) {
            head = new Node(data);
            if (leftData != '.') {
                head.left = new Node(leftData);
            }
            if (rightData != '.') {
                head.right = new Node(rightData);
            }
        } else {
            searchNode(head, data, leftData, rightData);
        }
    }

    public void searchNode(Node head, char data, char leftData, char rightData) {
        if (head == null) {
            return;
        } else if (head.value == data){
            if (leftData != '.') {
                head.left = new Node(leftData);
            }
            if (rightData != '.') {
                head.right = new Node(rightData);
            }
        } else {
            searchNode(head.left, data, leftData, rightData);
            searchNode(head.right, data, leftData, rightData);
        }
    }
    public void preOrder(Node node) {
        System.out.print(node.value);
        if (node.left != null) {
            preOrder(node.left);
        }
        if (node.right != null) {
            preOrder(node.right);
        }
    }

    public void midOrder(Node node) {
        if (node.left != null) {
            midOrder(node.left);
        }
        System.out.print(node.value);
        if (node.right != null) {
            midOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node.left != null) {
            postOrder(node.left);
        }
        if (node.right != null) {
            postOrder(node.right);
        }
        System.out.print(node.value);
    }



    public static void main(String[] args) throws Exception{
        Tree1991 tree = new Tree1991();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            char[] data;
            data = br.readLine().replaceAll(" ", "").toCharArray();
            tree.insertNode(data[0], data[1], data[2]);
        }
        tree.preOrder(tree.head);
        System.out.println();
        tree.midOrder(tree.head);
        System.out.println();
        tree.postOrder(tree.head);
    }
}
