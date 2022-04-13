package com.zipcodewilmington.singlylinkedlist;

import javax.xml.bind.Element;
import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList{

    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }

    private Node head;
    private Node tail;


    SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(int data) {
        Node current = head;
        if (head == null) {
            head = new Node(data);
            return;
        }
        while(current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void remove(int index) {
        Node current = head;
        int count = 1;
        if (head == null) return;
        if (index == 0) {
            head = head.next;
            return;
        }
        while (current.next != null) {
            if (count == index) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
            count++;
         }
    }

    public boolean contains(int data) {
        Node current = head;
        if (head != null) {
            if(head.data == data) {
                return true;
            }
        }
        while (current.next != null) {
            if (current.next.data == data) {
                return true;
            }
                current = current.next;
        }
        return false;
    }

    public int find(int data) {
        Node current = head;
        int index = 0;
        while (current.next != null) {
            if (current.data == data) {
                return index;
            } else index++;
            current = current.next;
        }
        return -1;
    }

    public int size() {
        Node current = head;
        int size = 0;
        if (head == null) {
            return 0;
        } else size = 1;
        while (current.next != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public int get(int index) {
        Node current = head;
        int count = 0;
        if (head == null) return (Integer) null;
        if (index == 0) {
            return head.data;
        }
        while (current.next != null) {
            if (count == index) {
                return current.data;
            }
            current = current.next;
            count++;
        }
        return (Integer) null;
    }


    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }


}
