package tb.soft;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists implements IColletionMethods{

    ArrayList<Person> arrayList = new ArrayList<Person>(10);
    LinkedList<Person> linkedList = new LinkedList<Person>();

    @Override
    public void addPersonToCollections(Person person) {
        arrayList.add(person);
        linkedList.add(person);
    }
    @Override
    public void removePersonFromCollections(Person person) {
        arrayList.remove(person);
        linkedList.remove(person);
    }
    @Override
    public void iterateCollections() {
        System.out.println("HashSet:");
        for (Person integer : arrayList)
        {
            System.out.println(integer);
        }
        System.out.println("TreeSet:");
        for (Person integer : linkedList)
        {
            System.out.println(integer);
        }
    }


}
