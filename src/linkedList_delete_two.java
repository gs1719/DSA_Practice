public class linkedList_delete_two {
    Node head;


    static void ll_insert(linkedList_delete_two list, int data) {
        Node newNode = new Node(data);

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

    public static void printList(linkedList_delete_two list) {
        Node curNode = list.head;

        while (curNode != null) {
            System.out.println(curNode.data + " ");
            curNode = curNode.next;
        }
    }

    static void deleteAtPosition(linkedList_delete_two list, int index) {
        Node currNode = list.head;
        Node prev = null;

        //if index is 0, then head itself to be deleted
        if (index == 0 && currNode != null) {
            list.head = currNode.next;
        }

        int counter = 1;

        while (currNode != null) {
            if (counter == index) {
                prev.next = currNode.next;
                System.out.println(index + "position element deleted");
                break;
            } else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        if (currNode == null) {
            System.out.println(index + "Not found");
        }
    }

    public static void main(String[] args) {
        linkedList_delete_two list = new linkedList_delete_two();
        linkedList_delete_two.ll_insert(list, 1);
        linkedList_delete_two.ll_insert(list, 2);
        linkedList_delete_two.ll_insert(list, 3);
        linkedList_delete_two.ll_insert(list, 4);
        linkedList_delete_two.ll_insert(list, 5);
        linkedList_delete_two.ll_insert(list, 6);

        linkedList_delete_two.printList(list);

        linkedList_delete_two.deleteAtPosition(list, 3);
        linkedList_delete_two.printList(list);
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
