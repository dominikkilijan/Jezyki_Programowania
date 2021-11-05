package tb.soft;

public class Scenarios{
    public Scenarios() throws Exception {
        this.sets = new Sets();
        this.lists = new Lists();
        this.maps = new Maps();
        this.person1 = new Person("Jan", "Nowak");
        person1.setBirthYear(2001);
        this.person2 = new Person("Adam", "Nowak");
        person2.setBirthYear(1954);
        this.person3 = new Person("Damian", "Kowalski");
        person3.setBirthYear(1973);
        this.person4 = new Person("Adam", "Nowak");
        person4.setBirthYear(1954);
        this.person5 = new Person("Adam", "Lewandowski");
        person5.setBirthYear(2013);
    }
        Sets sets;
        Lists lists;
        Maps maps;
        Person person1;
        Person person2;
        Person person3;
        Person person4;
        Person person5;

    public void workingOnSets() {
        System.out.println("Dodajemy pięć osób: Jana Nowaka, Adama Nowaka, Damiana Kowalskiego, " +
                "Adama Nowaka (taki sam element) i Adama Lewandowskiego \n");
        sets.addPersonToCollections(person1);
        sets.addPersonToCollections(person2);
        sets.addPersonToCollections(person3);
        sets.addPersonToCollections(person4);
        sets.addPersonToCollections(person5);
        sets.iterateCollections();
        System.out.println("W HashSet nie ma zdefiniowanech metod equals() oraz hashCode() więc Adam Nowak " +
                            "pojawia się podwójnie");
        System.out.println("W TreeSet kolejność wyznaczana jest po imieniu, a potem nazwisku");
        System.out.println("Jest to zdefiniowane w metodzie compareTo i dzięki temu w treeSet już od początku " +
                "odrzucany zostaje podwójny Adam Nowak\n\n");
        System.out.println("Usuwamy Adama Lewandowskiego");
        sets.removePersonFromCollections(person5);
        sets.iterateCollections();
    }
    public void workingOnLists() {
        System.out.println("Dodajemy cztery osoby: Jana Nowaka, Adama Nowaka, " +
                "Adama Nowaka (taki sam element) i Adama Lewandowskiego \n");
        lists.addPersonToCollections(person1);
        lists.addPersonToCollections(person2);
        lists.addPersonToCollections(person4);
        lists.addPersonToCollections(person5);
        lists.iterateCollections();
        System.out.println("Za pomocą metody set() dodajemy Damiana Kowalskiego na drugą pozycję (zamiast Adama Nowaka)");
        lists.setPersonToCollections(1,person3);
        lists.iterateCollections();
        System.out.println("Usuwamy z listy Jana Nowaka");
        lists.removePersonFromCollections(person1);
        lists.iterateCollections();
        System.out.println("Sprawdzamy rozmiary obu list");
        lists.checkSize();

    }
    public void workingOnMaps() {
        System.out.println("Dodajemy pięć osób: Jana Nowaka, Adama Nowaka, Damiana Kowalskiego, " +
                "Adama Nowaka (taki sam element) i Adama Lewandowskiego \n");
        maps.addPersonToCollections(person1,person1.getBirthYear());
        maps.addPersonToCollections(person2,person2.getBirthYear());
        maps.addPersonToCollections(person3,person3.getBirthYear());
        maps.addPersonToCollections(person4,person4.getBirthYear());
        maps.addPersonToCollections(person5,person5.getBirthYear());
        maps.printMaps();
        System.out.println("TreeMap tak samo jak TreeSet uporządkowane jest rosnąco według imienia i nazwiska\n");
        System.out.println("Sprawdzamy rok urodzenia Adama Lewandowskiego: "+ maps.hashMap.get(person5));
        System.out.println("Usuwamy z map Damiana Kowalskiego");
        maps.removePersonFromCollections(person3);
        System.out.println("Sprawdzamy czy w mapach znajduje się Damian: " + maps.treeMap.containsKey(person3));
    }

}
