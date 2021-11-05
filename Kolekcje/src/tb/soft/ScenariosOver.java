package tb.soft;

public class ScenariosOver extends Scenarios{
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
}
