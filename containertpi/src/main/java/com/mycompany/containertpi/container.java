/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.containertpi;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author crist
 */
public class container {
    List<Package> contents;

    public container() {
        contents = new LinkedList<Package>();
    }

    public boolean add(Package b) {
        return !contents.contains(b) && contents.add(b);
    }

    public boolean remove(Package b) {
        return contents.remove(b);
    }

    public double getVolume() {
        int sum = 0;
        for (Package b : contents) {
            sum += b.getVolume();
        }
        return sum;
    }

    public int size() {
        return contents.size();
    }

    public void clear() {
        contents.clear();
    }

    public boolean contains(Package b) {
        return contents.contains(b);
    
}
}