package tb.soft;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists implements IColletionMethods{

    ArrayList<Person> arrayList = new ArrayList<>(10);
    LinkedList<Person> linkedList = new LinkedList<>();

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
        System.out.println("ArrayList:");
        for (Person person : arrayList)
        {
            System.out.println(person);
        }
        System.out.println("Linked List:");
        for (Person person : linkedList)
        {
            System.out.println(person);
        }
    }


}
