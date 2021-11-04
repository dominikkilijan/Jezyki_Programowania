package tb.soft;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets implements IColletionMethods {
    Set<Person> hashSet = new HashSet<>();
    Set<Person> treeSet = new TreeSet<>();

    @Override
    public void addPersonToCollections(Person person) {
        hashSet.add(person);
        treeSet.add(person);
    }
    @Override
    public void removePersonFromCollections(Person person) {
        hashSet.remove(person);
        treeSet.remove(person);
    }
    @Override
    public void iterateCollections() {
        System.out.println("HashSet:");
        for (Person person : hashSet)
        {
            System.out.println(person);
        }
        System.out.println("TreeSet:");
        for (Person person : treeSet)
        {
            System.out.println(person);
        }
    }
}
