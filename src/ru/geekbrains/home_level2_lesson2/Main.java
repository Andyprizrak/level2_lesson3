package ru.geekbrains.home_level2_lesson2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String [] fname = {"Иванов", "Петров", "Иванов","Абакумов","Барин",
                          "Варин","Лапин","Сара","Иванов","Веселкин",
                          "Петров", "Сплинн","Цой", "Семенов","Смит",
                          "Сидоров","Гейтс","Смит", "Бэйтс", "Ривз"};

        Map<String,Integer> nameMap = new HashMap<>();
        for (String s:fname) {
            if(nameMap.containsKey(s)){
                nameMap.put(s,nameMap.get(s)+1);
            } else nameMap.put(s,0);
        }

        Set<String> keyMap = nameMap.keySet();
        for (String keyWordMap: keyMap) System.out.println(keyWordMap + " : " + nameMap.get(keyWordMap));

        System.out.println(nameMap.size());


        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.addAll(Arrays.asList(fname));
        System.out.println(wordsList.size());


    }

}

