package linkedlist;

import java.util.ArrayList;

public class gfg_ll_1 {
    //print the middle of the linked list
    Node head;

    static void inserll(gfg_ll_1 list,int data){
        Node newNode = new Node(data);

        if(list.head == null){
            list.head = newNode;
        }
        else{
            Node last = list.head;
            while(last.next !=null){
                last = last.next;
            }
            last.next = newNode;
        }
    }

    static void printLL(gfg_ll_1 list){
        Node currNode = list.head;
        while(currNode!=null){
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    static void printMiddle(gfg_ll_1 list){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Node currHead = list.head;
        while(currHead!=null){
            arrayList.add(currHead.data);
            currHead = currHead.next;
        }

        int length = arrayList.size();
        System.out.println(arrayList.get(length/2));
    }

    static void printMiddleType2(gfg_ll_1 list){
        int count=0;
        Node currHead = list.head;
        while(currHead!=null){
            count++;
            currHead = currHead.next;
        }
        int length = count/2;
        int p=0;
        currHead = list.head;
        while(p++<length){
            currHead = currHead.next;
        }
        System.out.println(currHead.data);
    }

    static void printMiddleType3(gfg_ll_1 list){
        int counter=1;
        Node mid = list.head;
        Node head = list.head;
        while(head!=null){
            if(counter%2==0){
                mid = mid.next;
            }
            head = head.next;
            counter++;
        }
        System.out.println(mid.data);
    }

    static void printMiddleType4(gfg_ll_1 list){
        Node fast = list.head;
        Node slow = list.head;

        while (fast != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        gfg_ll_1 list = new gfg_ll_1();
        gfg_ll_1.inserll(list,1);
        gfg_ll_1.inserll(list,2);
        gfg_ll_1.inserll(list,3);
        gfg_ll_1.inserll(list,4);
        gfg_ll_1.inserll(list,5);
        gfg_ll_1.inserll(list,6);

        gfg_ll_1.printLL(list);
//        gfg_ll_1.printMiddle(list);
//        gfg_ll_1.printMiddleType2(list);
//        gfg_ll_1.printMiddleType3(list);
        gfg_ll_1.printMiddleType4(list);
    }


    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
}
