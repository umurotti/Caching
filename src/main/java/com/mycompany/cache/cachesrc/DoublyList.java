/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cache.cachesrc;

/**
 *
 * @author umur
 */
public class DoublyList extends List{
    
    public DoublyList() {
        super();
    }
    


    @Override
    public Node getFirst() {
        return head;
    }

    @Override
    public Node getLast() {
        return tail;
    }

    @Override
    public boolean removeFirst() {
        if(head == null) {
            return false;
        }
        if(((DoublyNode) head).next == null) {
            head = null;
            tail = null;
        } else {
            head = ((DoublyNode) head).next;
            ((DoublyNode) head).prev = null;
        }
        return true;
    }

    @Override
    public boolean removeLast() {
        if(tail == null) {
            return false;
        }
        if(((DoublyNode) tail).prev == null) {
            tail = null;
            head = null;
        } else {
            tail = ((DoublyNode) tail).prev;
            ((DoublyNode) tail).next = null;
        }
        return true;
    }

    @Override
    public boolean addFirst(Object key, Object value) {
        if (head == null) {
            head = new DoublyNode(key, value);
            tail = head;
        } else {
            DoublyNode toAdd = new DoublyNode(key, value);
            toAdd.next = (DoublyNode) head;
            ((DoublyNode) head).prev = toAdd;
            head = toAdd;
        }
        return true;
    }
    
    public boolean addFirst(DoublyNode dbNode) {
        if(dbNode.next != null)
            dbNode.next = null;
        if(dbNode.prev != null)
            dbNode.prev = null;
        
        if (head == null) {
            head = dbNode;
            tail = head;
        } else {
            dbNode.next = (DoublyNode) head;
            ((DoublyNode) head).prev = dbNode;
            head = dbNode;
        }
        return true;
    }

    @Override
    public boolean addLast(Object key, Object value) {
        if (head == null) {
            head = new DoublyNode(key, value);
            tail = head;
        } else {
            DoublyNode toAdd = new DoublyNode(key, value);
            toAdd.prev = (DoublyNode) tail;
            ((DoublyNode) tail).next = toAdd;
            tail = toAdd;
        }
        return true;
    }
        
    public boolean addLast(DoublyNode dbNode) {
        if(dbNode.next != null)
            dbNode.next = null;
        if(dbNode.prev != null)
            dbNode.prev = null;
        
        if (head == null) {
            head = dbNode;
            tail = head;
        } else {
            dbNode.prev = (DoublyNode) tail;
            ((DoublyNode) tail).next = dbNode;
            tail = dbNode;
        }
        return true;
    }
    
    public void removeNode( DoublyNode dn ) {
        if (dn.prev != null) {
            dn.prev.next = dn.next;
        } else {
            head = dn.next;
        }

        if (dn.next != null) {
            dn.next.prev = dn.prev;
        } else {
            tail = dn.prev;
        }
    }
}
