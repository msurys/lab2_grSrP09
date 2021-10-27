package tb.soft;

import java.util.*;

public class Kolekcje {
    public final int liczba_osob_w_danych = 10; //zmienna finalna jest równa liczbie osob w pliku csv
    HashSet<Person> hs = new HashSet<>(); //tworzenie hashsetu
    TreeSet<Person> ts = new TreeSet<>(new Comparator<Person>() { //tworzenie treeset z przeciążoną funkcją compare dostosowaną do porównywania obiektów Person
        @Override
        public int compare(Person o1, Person o2) {
            if(o1.getLastName().equals(o2.getLastName())
                    && o1.getFirstName().equals(o2.getFirstName())
                    && o1.getBirthYear()==o2.getBirthYear())
            return 0;
            else return 1;
        }
    });

    ArrayList<Person> al = new ArrayList<>(); //tworzenie ArrayList
    HashMap<String,Person> hm = new HashMap<>(); //tworzenie hassh map
    TreeMap<String,Person> tm = new TreeMap<>(); //tworzenie TreeMap

void dodawanie(Person person,String nazwisko){
    hs.add(person);
    ts.add(person);
    al.add(person);
    hm.put(person.getLastName(),person);
    tm.put(person.getLastName(),person);
    }

}
