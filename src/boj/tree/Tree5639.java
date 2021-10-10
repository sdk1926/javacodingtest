package boj.tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tree5639 {
    public static StringBuilder sb = new StringBuilder();
    Node head = null;
    public class Node{
        Node left;
        Node right;
        int value;
        public Node(int data){
            this.value = data;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data){
        // Case1.Node가 하나도 없을 떄
        if (this.head ==null ){
            this.head = new Node(data);
            return true;
        }
        // Case2. Node가 한개이상 있을 때
        Node findNode = this.head;
        while(true) {
            // Case2-1 현재 노드의 왼쪽에 들어가야할 때
            if (findNode.value > data && findNode.left != null) {
                findNode = findNode.left;
            }
            if (findNode.value > data && findNode.left == null) {
                findNode.left = new Node(data);
                break;
            }
            // Case2-1 현재 노드의 오른쪽에 들어가야할 때
            if (findNode.value < data && findNode.right != null) {
                findNode = findNode.right;
            }
            if (findNode.value < data && findNode.right == null) {
                findNode.right = new Node(data);
                break;
            }
            if (findNode.value == data) {
                return false;
            }
        }
        return true;
    }

    public Node search(int data) {
        // Case1. Node가 하나도 없을 때
        if (this.head == null) {
            return null;
        }
        // Case. Node가 하나 이상일 떄
        Node findNode = this.head;
        while(findNode != null){
            if (findNode.value == data){
                return findNode;
            }
            if (findNode.value > data){
                findNode = findNode.left;
            }
            if (findNode.value < data) {
                findNode = findNode.right;
            }
        }
        return null;
    }


    public void postOrder(Node node){
        if (node.left != null){
            postOrder(node.left);
        }
        if (node.right != null) {
            postOrder(node.right);
        }
        System.out.println(node.value);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Tree5639 mytree = new Tree5639();
        mytree.insertNode(Integer.parseInt(br.readLine()));
        String s = "";
        while ((s = br.readLine()) != null && s.length() != 0) {
            mytree.insertNode(Integer.parseInt(s));
        }
        mytree.postOrder(mytree.head);
    }
}


