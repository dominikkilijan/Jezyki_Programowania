package tb.soft;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists implements IColletionMethods{

    List<Person> arrayList = new ArrayList<>(5);
    List<Person> linkedList = new LinkedList<>();

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
        System.out.println();
        System.out.println("Linked List:");
        for (Person person : linkedList)
        {
            System.out.println(person);
        }
        System.out.println();
    }
    public void setPersonToCollections(int index, Person person) {
        arrayList.set(index, person);
        linkedList.set(index, person);
    }
    public void checkSize() {
        System.out.println("Array List:");
        System.out.println(arrayList.size());
        System.out.println("Linked List:");
        System.out.println(linkedList.size());
        System.out.println("\n");
    }


}
