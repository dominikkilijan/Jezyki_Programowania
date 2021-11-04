package tb.soft;

public class Scenarios {
    Sets sets = new Sets();
    Person person1 = new Person("Jan","Kowalski");
    Person person2 = new Person("Adam","Nowak");
    Person person3 = new Person("Daniel","Zielinski");


    public Scenarios() throws PersonException {
    }


    public void addTheSameObjects() {
        sets.addPersonToCollections(person1);
        sets.addPersonToCollections(person2);
        sets.addPersonToCollections(person3);
        sets.addPersonToCollections(person1);

        sets.iterateCollections();
    }

}
