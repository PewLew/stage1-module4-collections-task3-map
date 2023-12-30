package com.epam.mjc.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> ints = new ArrayList<>();
        for(Map.Entry<Integer, String> item : sourceMap.entrySet()){
            ints.add(item.getKey());
        }

        List<String> strings = new ArrayList<String>();
        strings = sourceMap.values().stream().toList();
        System.out.println();
        int a,b;
        for(int i = 0; i < strings.size(); i++){
            for(int j = 0; j < strings.size(); j++){
                a = ints.get(i);
                b = ints.get(j);
                if(strings.get(i).equals(strings.get(j))){
                    if(a < b){
                        map.put(strings.get(i), a);
                    }
                }

                if(!map.containsKey(strings.get(i)))
                    map.put(strings.get(i), a);

            }
        }

        return map;
    }
}
