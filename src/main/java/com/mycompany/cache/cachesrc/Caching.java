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
public class Caching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DoublyList x = new DoublyList();
        x.addFirst(5, 25);
        x.addFirst(15, 35);
        x.addFirst(25, 45);
        x.addLast(80, 90);
        
        while(x.getFirst() != null) {
            System.out.println(x.getFirst());
            x.removeFirst();
        }
        LRUCache lrucache = new LRUCache(3);
		lrucache.put("as", 1);
                
		lrucache.put(10, 15);
		lrucache.put(15, 10);
		lrucache.put(10, 16);
		lrucache.put(12, 15);
		lrucache.put(18, 10);
		lrucache.put(13, 16);

		System.out.println(lrucache.get("as"));
		System.out.println(lrucache.get(10));
                System.out.println(lrucache.get(15));
                System.out.println(lrucache.show());
    }
    
}
