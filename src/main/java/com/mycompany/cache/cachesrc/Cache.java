/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cache.cachesrc;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author umur
 */
public abstract class Cache {

    HashMap<Object, Node> map;
    int maxSize;

    public Cache(int maxSize) {
        map = new HashMap<>();
        this.maxSize = maxSize;
    }

    public Cache() {
        map = new HashMap<>();
        this.maxSize = 0;
    }

    public abstract Object get(Object key);

    public abstract void put(Object key, Object value);

    public String show() {
        String out = "";
        Set<Entry<Object, Node>> hashSet = map.entrySet();
        for (Entry entry : hashSet) {

            out += "--> Key=" + entry.getKey().toString() + ", Value=" + entry.getValue().toString() + "\n";
        }
        out += "-----------------------------" + "\n";
        // Print the size of hashMap
        out += "HashMap size= " + map.size();
        return out;
    }
}
