package com.example.dictionarysimple.services;

import com.example.dictionarysimple.models.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryServiceImpl {
    private static Map<Integer, Dictionary> dictionaryMap = new HashMap<>();
    static {
        dictionaryMap.put(1, new Dictionary("hello", "xin chao"));
        dictionaryMap.put(2, new Dictionary("apple", "qua tao"));
        dictionaryMap.put(3, new Dictionary("banana", "trai chuoi"));
        dictionaryMap.put(4, new Dictionary("coconut", "trai dua"));
        dictionaryMap.put(5, new Dictionary("sun", "mat troi"));
    }

    public List<Dictionary> finAll() {
        return new ArrayList<>(dictionaryMap.values());
    }
}
