package com.zipcodewilmington.singlylinkedlist;

import javax.xml.bind.Element;
import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    class Node {
        private Element data;
        private Node next;

        public Node(Element data) {
            this.data = data;
            this.next = null;
        }

        public Element getData() {
            return data;
        }

        public void setData(Element data) {
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
    private int size;

    SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
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
