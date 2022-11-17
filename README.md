# Generic-Sınıflar, çift yönlü ve dairesel linked list

- **`insert(int index, T data):`**
Verilen datayı tutan yeni bir MyNode, verilen indekse eklenir.
Sınırların dışına çıkılırsa ekrana “insert failed” basar, ekleme yapılmaz. Örneğin 3 elemanlı bir
listeye 124. eleman olarak bir veri eklenmek istenirse ekleme olmaz. 3 elemanlı durumda
sadece 1, 2, 3 ve 4 numaralı indekslere ekleme yapılabilir.
- **`reverseInsert(int index, T data):`** Verilen datayı tutan yeni bir MyNode, verilen indekse
eklenir. Burada indeks değeri tersten hesaplanır. Örneğin 3, tersten/listenin sonundan 3.
MyNode’a karşılık gelir. Sınırların dışına çıkılırsa ekrana “insert failed” basar, ekleme
yapılmaz. Örneğin 3 elemanlı bir listeye 124. eleman olarak bir veri eklenmek istenirse
ekleme olmaz. 3 elemanlı durumda sadece 1, 2, 3 ve 4 numaralı indekslere ekleme
yapılabilir.
- **`remove(int index):`** Verilen indeksteki MyNode’u siler. Bu indeks değerine sahip MyNode
yoksa, ekrana “remove failed” basar.
- **`reverseRemove(int index):`** Verilen indeksteki MyNode’u siler. Burada indeks hesaplaması
tersten yapılır. Burada indeks değeri tersten hesaplanır. Bu indeks değerine sahip MyNode
yoksa, ekrana “reverseRemove failed” basar.
- **`search(T data):`** Verilen datayı listede arar. Listede bulunuyorsa ekrana indeksini,
bulunmuyorsa “search failed” basar. Listede birden fazla aynı eleman olmadığını
düşünebilirsiniz.
- **`print(int index):`** Verilen indeksteki MyNode’un verisini ekrana basar. Bu indekse sahip bir
MyNode yoksa ekrana “print failed” basar.
- **`printAll():`** Tüm MyNodeların verisini indeks sırasında göre ekrana basar. Liste boşsa ekrana
“printAll failed” basar. Her MyNode verisi aralarda tek bir boşluk olacak şekilde basılır.
Örnek: “1 2 3 4”.
- **`reversePrintAll():`** Tüm MyNodeların verisini indeks sırasında göre ekrana basar. Burada
indeks değeri tersten hesaplanır. Liste boşsa ekrana “reversePrintAll failed” basar. Her
MyNode verisi aralarda tek bir boşluk olacak şekilde basılır.
Örnek: “1 2 3 4”.
