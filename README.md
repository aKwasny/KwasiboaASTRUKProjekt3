# KwasiboaASTRUKProjekt3

Temat: 3- cie zadanie Rekurencja - Wektor zbudowany na drzewie
Opublikowane przez: dr inż. Maciej Stodolski
Data publikacji: 18.10.2015 19:15
Witam,

Chciałbym aby na najblizsych dwóch zajęciach przypomnieli sobie Państwo rekurencję.

Zrobimy strukturę drzewiastą.
Drzewo będzie zawierać indeks oraz wartość.

Class Tree {
private:
Class Node { 
Class Item { private: double value; int index; }
Class Node *left,, *right;
} *root;
public:
void Insert(int i, double v);
double Get(int i) // domyślnie 0 jak nie ma elementu
void Test() { Test(root); }
void Test(Class Node *r) { if r == 0 return; 
Test(r->left); 
// tu drukujemy zawartośc; np 
cout << '\n indeks= " << r->index << " war=" << r->value;
Test(r->right);
}

}

Czyli drzewo ma element (indeks, wartość)
Ma dwa wskażniki (lewo, prawo)
Jeżeli będziemy wstawiać elementy tak, że na lewo będzie mniejszy a na prawo większy to prawdopodobnie funkcja test będzie drukować drzewo w kolejnosci wystąpienia w nim 

indeksów (po kolei)
Bardzo proszę aby funkcje Insert i Get były rekurencyjne.
Mogą zawierać metody Inser(class Node *e) i Getclass( Node *e) i te metody muszą być rekurencyjne.
Optymalnie wykonana funkcja Insert lub Get będzie się składać z kilku linii (może nawet 3-ech)
Na bazie wykonanego drzewa proszę o zrobienie klasy wektor (w klasie wektor możliwe będzie przypisanie w[5] = 4.5
lub double el = w[5]
W ostateczności to mogą być metody Wstaw(double v, int index) i Wez(index).
Jako metodę testującą widziałbym wczytywanie par indeks liczba z pliku.
Po wczytaniu drukujemy posortowane drzewo jak i drukujemy jego strukturę (czyli trzeba by dodawać głębokość na wydruku).
Pozdrawiam

Maciej

PS. Termin wykonania do 31.10.2014 do 23.59

Pozdrawiam

Maciej



Temat: 3 - cie zadanie, uzupełnienie informacji
Opublikowane przez: dr inż. Maciej Stodolski
Data publikacji: 22.10.2015 11:02
Odpowiadam na pytania zadawane podczas zajęć:

1. Klasy musza być autorskie a nie biblioteczne
2. Wstawianie, wyszukiwanie/pobieranie - REKRENCYJNIE !!!!
3. Drzewo budujemy względem indeksu
4. Pobieranie indeksu, którego nie ma, to nie błąd tylko ma zwrócić wartość ZERO (double)
5. To ma się zachowywac jak taki wektor v[5] = 5.0 czy double a = v[3]
- czyli próba wstawienia pod indeks, który już istnieje powinna podmienić wartość stowarzyszoną z tym indeksem w drzewie
6. Nie wymagam przeciazania operatorow, wystarczy wywoływanie metod Vector v; v.Add(5,5.0);
- double a = v.Get(3);
7. W ramach metody testującej pobieramy z pliku pary liczb oddzielone spacją
- najpierw indeks, potem wartosc
8. Metodą drukującą którą przedstawiłem w uprzednim ogłoszeniu uzyskamy wartości w drzewie posortowane według indeksu
9. Do wydrukowania struktury trzeba dodać do metody drukuj parametr - GLĘBOKOŚC.
Metoda ta przy wołaniu samej siebie będzie wywoływac z wartością powiększoną o 1
D|zięki temu będziemy wiedzieli jak głeboko w drzewie jestesmy.
Można dodawać równiez informację czy weszliśmu tu z lewej, prawej lub z korzenia


Pozdrawiam

Maciej
