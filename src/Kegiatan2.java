import org.w3c.dom.Node;

import java.util.*;
public class Kegiatan2 {
        private Node head;
        private class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
            } else if (data < head.data) {
                newNode.next = head;
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null && data > current.next.data) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
        }

        public void printList() {
            System.out.println("setelah : ");
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    public void sort(){ //menggurutkan
        Node current = head;
        Node nextNode = null;
        int temp; //variable untuk menyimpan nilai

        if (head == null){ //mengurutkan elemen elemen
            return;
        } else {
            while (current != null){ //menngurutkan secara menaik
                nextNode = current.next;
                while (nextNode != null){
                    if (current.data > nextNode.data){ //membandingkan
                        temp = current.data;
                        current.data = nextNode.data;
                        nextNode.data = temp;
                    }
                    nextNode = nextNode.next;
                }
                current = current.next;
            }
        }
    }


    public static void main(String[] args) {
            Kegiatan2 list = new Kegiatan2();
            list.add(8);
            list.add(7);
            list.add(1);
            list.add(4);
            list.add(6);
            list.add(2);
            list.add(3);
            System.out.print("Sebelum :" );
            list.printList();
        }
    }

