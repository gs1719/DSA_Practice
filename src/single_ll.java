public class single_ll {
    Node head;

    static void insert(single_ll list, int data) {
        Node newNode = new Node(data);
        //if list is empty
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

    static void printList(single_ll list) {
        Node currNode = list.head;

        while (currNode != null) {
            System.out.println(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public static void main(String[] args){
        single_ll list = new single_ll();

        single_ll.insert(list,1);
        single_ll.insert(list,2);
        single_ll.insert(list,3);
        single_ll.insert(list,4);
        single_ll.insert(list,5);
        single_ll.insert(list,6);

        single_ll.printList(list);
    }

}
