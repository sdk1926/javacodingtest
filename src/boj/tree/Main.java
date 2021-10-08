package boj.tree;

import java.util.ArrayList;

public class Main {
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
    public void after(int size){
        ArrayList<Integer> visit = new ArrayList<Integer>();
        ArrayList<Node> parentBranch = new ArrayList<Node>();
        Node endLeft;
        Node root = this.head;
        Node copyRoot = this.head;
        Node rightFirst = this.head.right;
        endLeft = this.head;

        while (endLeft.left != null){
            copyRoot = endLeft;
            endLeft = endLeft.left;
            parentBranch.add(copyRoot);
        }
        while (true){
            copyRoot = (parentBranch.remove(parentBranch.size()-1));
            visit.add(copyRoot.left.value);
            if (copyRoot.right.value != rightFirst.value){
                visit.add(copyRoot.right.value);
            }
            if (copyRoot.right.value == rightFirst.value){
                break;
            }
        }


        System.out.println(visit);

    }
    public static void main(String[] args) {
        Main mytree = new Main();
        System.out.println(mytree.insertNode(50));
        System.out.println(mytree.insertNode(30));
        System.out.println(mytree.insertNode(24));
        System.out.println(mytree.insertNode(5));
        System.out.println(mytree.insertNode(28));
        System.out.println(mytree.insertNode(45));
        System.out.println(mytree.insertNode(98));
        System.out.println(mytree.insertNode(52));
        System.out.println(mytree.insertNode(60));
//        System.out.println(mytree.head.value);
//        System.out.println(mytree.head.left.value);
//        System.out.println(mytree.head.right.value);
        mytree.after(10);
    }
}


