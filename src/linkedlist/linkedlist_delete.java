package linkedlist;

public class linkedlist_delete {
    Node head;

    static void ll_insert(linkedlist_delete list, int data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    static void printList(linkedlist_delete list) {
        Node currNode = list.head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    static void deleteByKey(linkedlist_delete list, int key) {
        Node currNode = list.head;
        Node prev = null;
        // if first/head element contains key then delete itself
        if (currNode != null && currNode.data == key) {
            list.head = currNode.next;
            System.out.println(key + "found and deleted");
        }

        //key present other than head
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }
        // then currNode becomes key

        if(currNode != null){
            prev.next = currNode.next; // prev wale node ke next ko currNode ke next pr point kr denge
            System.out.println(key+"Found and deleted");
        }

        //if key is not present then
        if(currNode == null){
            System.out.println("Not found");
        }

    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        linkedlist_delete list = new linkedlist_delete();

        linkedlist_delete.ll_insert(list,1);
        linkedlist_delete.ll_insert(list,2);
        linkedlist_delete.ll_insert(list,3);
        linkedlist_delete.ll_insert(list,4);
        linkedlist_delete.ll_insert(list,5);
        linkedlist_delete.ll_insert(list,6);

        linkedlist_delete.printList(list);

        linkedlist_delete.deleteByKey(list,6);

        linkedlist_delete.printList(list);

    }
}
