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
public class LRUCache extends Cache {
    DoublyList dbList;
    
    public LRUCache() {
        super();
        dbList = new DoublyList();
    }
    
    public LRUCache( int maxSize ) {
        super(maxSize);
        dbList = new DoublyList();
    }

    @Override
    public Object get(Object key) {
        if(map.containsKey(key)) {
            Node out = map.get(key);
            dbList.removeNode(((DoublyNode) out));
            dbList.addFirst((DoublyNode) out);
            return out.getValue();
        } else {
            return null;
        }
    }

    @Override
    public void put(Object key, Object value) {
        if(map.containsKey(key)) {
            Node tmp = map.get(key);
            tmp.setValue(value);
            dbList.removeNode((DoublyNode) tmp);
            dbList.addFirst((DoublyNode) tmp);
        } else {
            Node toAdd = new DoublyNode(key, value);
            if(map.size() >= maxSize) {
                map.remove(dbList.getLast().getKey());
                dbList.removeLast();
            }
            dbList.addFirst((DoublyNode) toAdd);
            map.put(key, toAdd);
        }
    }
    
}
