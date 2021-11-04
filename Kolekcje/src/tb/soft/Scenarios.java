package tb.soft;

public class Scenarios{
    public Scenarios() throws Exception {
        this.sets = new Sets();
        this.lists = new Lists();
        this.person1 = new Person("Jan", "Nowak");
        person1.setJob(PersonJob.STUDENT);
        this.person2 = new Person("Adam", "Nowak");
        person1.setJob(PersonJob.GUEST);
        this.person3 = new Person("Damian", "Kowalski");
        person1.setJob(PersonJob.DIRECTOR);
        this.person4 = new Person("Adam", "Nowak");
        person1.setJob(PersonJob.GUEST);
        this.person5 = new Person("Adam", "Lewandowski");
        person1.setJob(PersonJob.MANAGER);
    }
        Sets sets;
        Lists lists;
        Person person1;
        Person person2;
        Person person3;
        Person person4;
        Person person5;

    public void workingOnSets() {
        System.out.println("Dodajemy pięć osób: Jana Nowaka, Adama Nowaka, Damiana Kowalskiego, " +
                "Adama Nowaka (taki sam element), Adama Lewandowskiego i ponownie Jana Nowaka \n");
        sets.addPersonToCollections(person1);
        sets.addPersonToCollections(person2);
        sets.addPersonToCollections(person3);
        sets.addPersonToCollections(person4);
        sets.addPersonToCollections(person5);
        sets.addPersonToCollections(person1);
        sets.iterateCollections();
        System.out.println("W HashSet nie ma zdefiniowanech metod equals() oraz hashCode() więc Adam Nowak " +
                            "pojawia się podwójnie");
        System.out.println("W TreeSet kolejność wyznaczana jest po imieniu, a potem nazwisku\n\n");
        System.out.println("Usuwamy Adama Lewandowskiego");
        sets.removePersonFromCollections(person5);
        sets.iterateCollections();
    }
    public void workingOnLists() {
        System.out.println("Dodajemy cztery osoby: Jana Nowaka, Adama Nowaka, " +
                "Adama Nowaka (taki sam element), Adama Lewandowskiego i ponownie Jana Nowaka \n");
        lists.addPersonToCollections(person1);
        lists.addPersonToCollections(person2);
        lists.addPersonToCollections(person4);
        lists.addPersonToCollections(person5);
        lists.addPersonToCollections(person1);
        lists.iterateCollections();
        System.out.println("Za pomocą metody set() dodajemy Damiana Kowalskiego na drugą pozycję (zamiast Adama Nowaka)");
        lists.setPersonToCollections(1,person3);
        lists.iterateCollections();
        System.out.println("Usuwamy z listy pierwszego Jana Nowaka");
        lists.removePersonFromCollections(person1);
        lists.iterateCollections();
        System.out.println("Sprawdzamy rozmiary obu list");
        lists.checkSize();

    }
    public void workingOnMaps() {

    }

}
