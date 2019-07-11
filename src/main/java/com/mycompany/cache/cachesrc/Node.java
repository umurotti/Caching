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
public abstract class Node {
    Object value;
    Object key;
    
    public Node( Object key, Object value ) {
        this.key = key;
        this.value = value;
    }
    
    public Node() {
        this.key = null;
        this.value = null;
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + ", key=" + key + '}';
    }
    
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getKey() {
        return key;
    }
    
}
