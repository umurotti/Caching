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
public class DoublyNode extends Node {
    DoublyNode next;
    DoublyNode prev;

    public DoublyNode(Object key, Object value) {
        super(key, value);
        next = null;
        prev = null;
    }
    
    public DoublyNode() {
        super();
        next = null;
        prev = null;
    }
    
    
}
