package tb.soft;

public class Scenarios{
    public Scenarios() throws Exception {
        this.sets = new Sets();
        this.person1 = new Person("Jan", "Nowak");
        this.person2 = new Person("Adam", "Nowak");
        this.person3 = new Person("Damian", "Kowalski");
        this.person4 = new Person("Adam", "Nowak");
        this.person5 = new Person("Adam", "Lewandowski");
    }
        Sets sets;
        Person person1;
        Person person2;
        Person person3;
        Person person4;
        Person person5;

    public void addTheSameObjects() {
        System.out.println("Dodajemy pięć osób: Jana Nowaka, Adama Nowaka, Damiana Kowalskiego, " +
                "Adama Nowaka (taki sam element), Adama Lewandowskiego i ponownie Jana Nowaka ");
        sets.addPersonToCollections(person1);
        sets.addPersonToCollections(person2);
        sets.addPersonToCollections(person3);
        sets.addPersonToCollections(person4);
        sets.addPersonToCollections(person5);
        sets.addPersonToCollections(person1);
        sets.iterateCollections();
        System.out.println("W HashSet nie ma zdefiniowanech metod equals() oraz hashCode() więc Adam Nowak " +
                "pojawia się podwójnie");
        System.out.println("W TreeSet kolejność wyznaczana jest po imieniu, a potem nazwisku");

    }

}
