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
public abstract class List {
    Node head;
    Node tail;

    public List() {
        this.head = null;
        this.tail = null;
    }
    
//    public List(Node head, Node tail) {
//        this.head = head;
//        this.tail = tail;
//    }
    
    
    
    public abstract boolean addFirst(Object key, Object value);
    public abstract boolean addLast(Object key, Object value);
    public abstract Node getFirst();
    public abstract Node getLast();
    public abstract boolean removeFirst();
    public abstract boolean removeLast();
    
}
