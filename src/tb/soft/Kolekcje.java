package tb.soft;

import java.util.*;

public class Kolekcje{
    final int liczba_osob_w_danych = 10; //zmienna finalna jest równa liczbie osob w pliku csv

    /*
    plik csv zawiera 9 osob + jedno powtorzenie na pierwszej pozycji, pozwala to na sprawdzenie jak
    będą działały różne kolekcje dla osób o tych samych danych.
    Próba dodania 2x tego samego obiektu do kolekcji znajduje się w case 7 w PersonConsoleApp.java

     */

    HashSet<Person> hs = new HashSet<>(); //tworzenie hashsetu

    TreeSet<Person> ts = new TreeSet<>(new Comparator<Person>() { //tworzenie treeset z przeciążoną funkcją compare dostosowaną do porównywania obiektów Person
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getLastName().equals(o2.getLastName())
                && o1.getFirstName().equals(o2.getFirstName())
                && o1.getBirthYear()==o2.getBirthYear())return 0;
    else return 1;
    }
    });

    ArrayList<Person> al = new ArrayList<>(); //tworzenie ArrayList

    LinkedList<Person> ll= new LinkedList<>(); // tworzenie LinkedList

    HashMap<Person,String> hm = new HashMap<>(); //tworzenie hassh map

    TreeMap<String,Person> tm = new TreeMap<>(); //tworzenie TreeMap


    void dodawanie(Person person){//funkcja pozwalająca na dodanie obiektu do wszystkich omawianych rodzajów kolekcji
        hs.add(person);
        ts.add(person);
        al.add(person);
        ll.add(person);
        hm.put(person,person.getLastName());
        tm.put(person.getLastName(),person);
        }

    void usuwanie(Person person){//funkcja pozwala na usunięcie wybranego przez nas elementu kolekcji
        hs.remove(person);
        ts.remove(person);
        al.remove(person);
        ll.remove(person);
        hm.remove(person);
        tm.remove(person.getLastName());
    }

    void printall(){//funkcja wywołująca iteracje dla każdej z kolekcji. Następnie drukuje ona wszystkie jej elementy
        hsPrint();System.out.println("[LICZBA ELEMENTÓW HashSet: "+ hs.size()+"]\n");
        tsPrint();System.out.println("[LICZBA ELEMENTÓW TreeSet: "+ ts.size()+"]\n");
        alPrint();System.out.println("[LICZBA ELEMENTÓW ArrayList: "+al.size()+"]\n");
        llPrint();System.out.println("[LICZBA ELEMENTÓW LinkedList: "+ll.size()+"]\n");
        hmPrint();System.out.println("[LICZBA ELEMENTÓW HashMap: "+hm.size()+"]\n");
        tmPrint();System.out.println("[LICZBA ELEMENTÓW TreeMap: "+tm.size()+"]\n");
    }

    void hsPrint() {
        for (Person x: hs) {System.out.println(x.getFirstName()+" "+x.getLastName()+" "+x.getBirthYear()+" "+x.getJob());
        }
    }
    void tsPrint() {
        for (Person x: ts) {System.out.println(x.getFirstName()+" "+x.getLastName()+" "+x.getBirthYear()+" "+x.getJob());
        }
    }
    void alPrint() {
        for (Person x: al) {System.out.println(x.getFirstName()+" "+x.getLastName()+" "+x.getBirthYear()+" "+x.getJob());
        }
    }
    void llPrint() {
        for (Person x: ll) {System.out.println(x.getFirstName()+" "+x.getLastName()+" "+x.getBirthYear()+" "+x.getJob());
        }
    }
    void hmPrint() {
        for (Map.Entry<Person,String> entry : hm.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getKey().getBirthYear()+" "+entry.getKey().getJob()+"/" + entry.getValue());
        }
    }
    void tmPrint(){
        for (Map.Entry<String, Person> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue()+" "+
                    entry.getValue().getBirthYear()+" "+entry.getValue().getJob());
        }
    }
    }
