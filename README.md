Kolekcje

Prerobiłem repozytorium startowe w sposob pozwalający na szybkie sprawdzenie 6 zadanych tablic
Po uruchomieniu programu mamy możliwość wyboru w menu, w którym dodałem 4 następujące opcje:

1. Wpisanie danych podanej osoby do wszystkich kolekcji (case2)
2. Wczytaj dane z pliku dane.csv (case7)
3. Wypisz wszystkie dane z wszystkich kolekcji (case8)
4. Usuwanie danych osoby z wszystkich kolekcji (case9)

Większość wprowadzoncyh przeze mnie zmian została uwzględniona w nowej klasie Kolekcje,
w której znajdują się wszystkie mapy,sety i arrays.Dodałem również do folderu src plik dane.csv, który pozwala na wczytanie
wielu osób na raz. Występuje w nim jedno powtórzenie na pozycji pierwszej, jako sprawdzenie czy dana kolekcja przyjmie osobę 
z tymi samymi danymi parę razy.

Podczas moich testów bazowałem na pliku dane.csv i wpisywanych przeze mnie danych
w celu sprawdzenia jak zachowują się dane tablice.
Reagowały w poprawny dla nich sposób, dla dodawania i usuwania osob, iteracje przez wszystkie elementy
(wypisanie).

Przedefiniowanie metod equals() oraz hashCode() umożliwiło porównywanie elementów co uniemożliwia dodoanie do niektórych
kolekcji dodania tej samej osoby 2 razy, a bez tych zmian program nie usuwał poprawnie elementów z listy.
