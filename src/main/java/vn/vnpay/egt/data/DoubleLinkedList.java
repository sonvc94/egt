package vn.vnpay.egt.data;

public class DoubleLinkedList {

    Node head;

    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }


    public static void insert(DoubleLinkedList list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            new_node.prev = last;
            last.next = new_node;
        }
    }

    public void printList(){
        DoubleLinkedList.Node currNode = this.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
}
