package tb.soft;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps{
    Map<Person, Integer> hashMap = new HashMap<>();
    Map<Person, Integer> treeMap = new TreeMap<>();


    public void addPersonToCollections(Person person, Integer integer) {
       hashMap.put(person, integer);
       treeMap.put(person, integer);

    }

    public void removePersonFromCollections(Person person) {
        hashMap.remove(person);
        treeMap.remove(person);

    }
    public void printMaps() {
        System.out.println("HashMap:");
        System.out.println(hashMap);
        System.out.println();
        System.out.println("TreeMap:");
        System.out.println(treeMap);
        System.out.println();
    }

    }
