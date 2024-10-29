package com.Sankuj.JavaCorePractice.Generic;

public class KeyValuePair<K extends Number, V> {
    private K key;
    private V value;
    public KeyValuePair(K key, V value){
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

}
