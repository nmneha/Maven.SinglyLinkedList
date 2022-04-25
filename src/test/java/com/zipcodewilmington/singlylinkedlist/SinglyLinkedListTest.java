package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addTest() {
        SinglyLinkedList singly = new SinglyLinkedList();
        singly.add(5);
        singly.add(15);
        singly.add(20);
        Assert.assertTrue(singly.contains(5));
        Assert.assertTrue(singly.contains(15));
        Assert.assertTrue(singly.contains(20));
        singly.printSingely();
    }

    @Test
    public void removeTest() {
        SinglyLinkedList singly = new SinglyLinkedList();
        singly.add(5);
        singly.add(15);
        singly.add(20);
        Assert.assertTrue(singly.contains(15));
        singly.remove(1);
        Assert.assertTrue(singly.contains(5));
        Assert.assertFalse(singly.contains(15));
    }

    @Test
    public void contains() {
        SinglyLinkedList singly = new SinglyLinkedList();
        singly.add(15);
        Assert.assertEquals(true, singly.contains(15));
    }

    @Test
    public void find() {
        SinglyLinkedList singly = new SinglyLinkedList();
        singly.add(5);
        singly.add(15);
        singly.add(20);
        int index = singly.find(15);
        Assert.assertEquals(1, index);

    }

    @Test
    public void size() {
        SinglyLinkedList singly = new SinglyLinkedList();
        singly.add(5);
        singly.add(15);
        singly.add(20);
        int size = singly.size();
        Assert.assertEquals(3, size);
    }

    @Test
    public void get() {
        SinglyLinkedList<Integer> singly = new SinglyLinkedList<>();
        singly.add(5);
        singly.add(15);
        singly.add(20);
        int data = singly.get(1);
        Assert.assertEquals(15, data);
    }

    @Test
    public void copyShallow() {
        SinglyLinkedList<Integer> singly = new SinglyLinkedList<>();
        singly.add(5);
        singly.add(15);
        singly.add(20);
        SinglyLinkedList<Integer> copy = singly.copyShallow(singly);
        int data = copy.get(1);
        copy.printSingely();
        Assert.assertEquals(15, data);
    }

    @Test
    public void copyDeep() {
        SinglyLinkedList<Integer> singly = new SinglyLinkedList<>();
        singly.add(5);
        singly.add(15);
        singly.add(20);
        SinglyLinkedList<Integer> copy = singly.copyDeep();
        int data = copy.get(1);
        copy.printSingely();
        Assert.assertEquals(15, data);
    }




}
