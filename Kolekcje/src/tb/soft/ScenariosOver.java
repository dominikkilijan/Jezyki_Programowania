package tb.soft;

public class ScenariosOver{
    public ScenariosOver() throws Exception {
        this.sets = new Sets();
        this.lists = new Lists();
        this.maps = new Maps();
        this.person1 = new PersonOver("Jan", "Nowak");
        person1.setBirthYear(2001);
        this.person2 = new PersonOver("Adam", "Nowak");
        person2.setBirthYear(1954);
        this.person3 = new PersonOver("Damian", "Kowalski");
        person3.setBirthYear(1973);
        this.person4 = new PersonOver("Adam", "Nowak");
        person4.setBirthYear(1954);
        this.person5 = new PersonOver("Adam", "Lewandowski");
        person5.setBirthYear(2013);
    }
    Sets sets;
    Lists lists;
    Maps maps;
    PersonOver person1;
    PersonOver person2;
    PersonOver person3;
    PersonOver person4;
    PersonOver person5;

    public void workingOnSets() {
        System.out.println("Dodajemy pięć osób: Jana Nowaka, Adama Nowaka, Damiana Kowalskiego, " +
                "Adama Nowaka (taki sam element), Adama Lewandowskiego i ponownie Jana Nowaka \n");
        sets.addPersonToCollections(person1);
        sets.addPersonToCollections(person2);
        sets.addPersonToCollections(person3);
        sets.addPersonToCollections(person4);
        sets.addPersonToCollections(person5);
        sets.addPersonToCollections(person1);
        sets.addPersonToCollections(person1);
        sets.iterateCollections();
        System.out.println("hashSet() i equals() są zdefinowane więc Adam Nowak nie wyświetla się drugi raz.");
        System.out.println("W TreeSet kolejność wyznaczana jest po imieniu, a potem nazwisku\n\n");
        System.out.println("Usuwamy Adama Lewandowskiego");
        sets.removePersonFromCollections(person5);
        sets.iterateCollections();
    }
    public void workingOnMaps() {
        System.out.println("Dodajemy pięć osób: Jana Nowaka, Adama Nowaka, Damiana Kowalskiego, " +
                "Adama Nowaka (taki sam element), Adama Lewandowskiego i ponownie Jana Nowaka \n");
        maps.addPersonToCollections(person1,person1.getBirthYear());
        maps.addPersonToCollections(person2,person2.getBirthYear());
        maps.addPersonToCollections(person3,person3.getBirthYear());
        maps.addPersonToCollections(person4,person4.getBirthYear());
        maps.addPersonToCollections(person5,person5.getBirthYear());
        maps.addPersonToCollections(person1,person1.getBirthYear());
        maps.printMaps();
        System.out.println("hashSet() i equals() są zdefinowane więc Adam Nowak nie wyświetla się drugi raz.");
        System.out.println("Sprawdzamy rok urodzenia Adama Lewandowskiego: "+ maps.hashMap.get(person5));
        System.out.println("Usuwamy z map Damiana Kowalskiego");
        maps.removePersonFromCollections(person3);
        System.out.println("Sprawdzamy czy w mapach znajduje się Damian: " + maps.treeMap.containsKey(person3));
    }
}
