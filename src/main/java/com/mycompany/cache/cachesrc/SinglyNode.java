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
public class SinglyNode extends Node {
    SinglyNode next;

    public SinglyNode(Object key, Object value) {
        super(key, value);
        next = null;
    }
}
