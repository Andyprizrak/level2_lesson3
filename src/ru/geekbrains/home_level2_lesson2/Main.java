package ru.geekbrains.home_level2_lesson2;

import java.util.*;

public class Main {

  public static Map<String,String> phoneBookMap = new HashMap<>();
  public static ArrayList<PhoneBook> phoneMaile = new ArrayList<>();
  public static ArrayList<String> phoneList = new ArrayList<>();
  public static ArrayList<String> mailList = new ArrayList<>();

    private static String serchPhone (String st) {
        phoneList.clear();
        if (phoneBookMap.containsKey(st)) {
            for (String indexx : phoneBookMap.get(st).split(",")) {
                String temp = String.valueOf(phoneMaile.get(Integer.parseInt(indexx)));
                phoneList.add(temp.substring(0, 12));
            }
        }
        return phoneBookMap.get(st);
    }
    private static String serchMail (String st) {
        mailList.clear();
        if (phoneBookMap.containsKey(st)) {
            for (String indexx : phoneBookMap.get(st).split(",")) {
                String temp = String.valueOf(phoneMaile.get(Integer.parseInt(indexx)));
                mailList.add(temp.substring(13));
            }
        }
            return phoneBookMap.get(st);
    }


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
        for (String keyWordMap: keyMap) System.out.println(keyWordMap + ": повторений - " + nameMap.get(keyWordMap));

// Задание № 2. Заполняем Map  где в поле ключа имя, поле знчение String.
//   В случае совпадения имени через запятую добавляется индекс  ArrayList<> phoneMaile
//   в  ArrayList<> phoneMaile  лежат объекты класса PhoneBook
//   методы поиска списка телефонов и почты serchPhone serchMail

        String phonemask = "913 977 ", mail = "mail0@mail.ru", valIndex,phone;
        int index = 0;
        phone = phonemask + "0000";

        for (String s:fname) {
            if ((phoneBookMap.containsKey(s))) {
                phoneMaile.add(new PhoneBook(phone, mail));
                phoneBookMap.put(s,phoneBookMap.get(s) + "," + index);
            } else {
                phoneMaile.add(new PhoneBook(phone, mail));
                valIndex = Integer.toString(index);
                phoneBookMap.put(s, valIndex);
            }
            index++;
            phone = phonemask + 1000 + index;
            mail = s + index + "@mail.ru";
        }
        System.out.println(serchPhone("Иванов"));
        System.out.println(serchMail("Петров"));
        System.out.println(phoneList);
        System.out.println(phoneMaile.size());
        System.out.println(phoneBookMap.size());
    }
}

