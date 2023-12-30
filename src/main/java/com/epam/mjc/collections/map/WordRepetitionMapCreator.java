package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        sentence = sentence.toLowerCase();
        StringTokenizer tok = new StringTokenizer(sentence, " ,.");
        while(tok.hasMoreTokens()){
            String key = tok.nextToken();
            if(!map.containsKey(key)){
                map.put(key, 1);
            }
            else
                map.put(key, map.get(key)+1);
        }
        return map;
    }
}
