package collections

class ListCollection {

    fun printingImmutableLists(immutableLists: List<String>){
        println("Zawartość listy niemutowalnej")
        println(immutableLists)
    }

    fun listKotlin(){

        // Lista definicja
        // Lista (ang. list) podobnie jak tablica, grupuje elementy. Jej główną przewagą nad tablicą jest to, że
        // programista nie musi się przejmować rozmiarem listy, jest ona automatycznie powiększana wraz z dodawaniem
        // nowych elementów. Listy z definicji są kolekcjami dla których kolejność elementów jest istotna,
        // mogą przechowywać ten sam obiekt po kilka razy.

        // ListOf
        // Ogólna uporządkowana kolekcja elementów. Metody w tym interfejsie obsługują dostęp tylko do odczytu listy.

        // MutableListOf
        // Ogólna uporządkowana kolekcja elementów, która obsługuje dodawanie i usuwanie elementów.

        // Deklaracja listy mutowlanej.
        val mutableStringList = mutableListOf("element1", "element1", "element2", "element2", "element3", "element3", "element4", "element4")
        val mutableEmptyStringList = mutableListOf<String>()

        // Deklaracja listy nie mutowalnej.
        val stringList = listOf("element1", "element1", "element2", "element2", "element3", "element3", "element4", "element4")
        val emptyStringList = listOf<String>()

        //**************************************************************************************************************



        // Wyświetlanie listy elementów.
        println(stringList)

        // Wyświetlenie rozmiaru listy.
        println(emptyStringList.size)

        //**************************************************************************************************************

        println(mutableEmptyStringList)

        // Dodanie elementów do listy.
        mutableEmptyStringList.add("element1")
        mutableEmptyStringList.add("rabarbar")
        mutableEmptyStringList.add("rabar")
        mutableEmptyStringList.add("barbar")
        mutableEmptyStringList.add("abarbar")
        mutableEmptyStringList.add("bar")
        mutableEmptyStringList.add("rbar")

        println(mutableEmptyStringList)

        // Dodanie kilku elementów do listy.
        mutableEmptyStringList.addAll(arrayListOf("element1", "karalepa"))
        println(mutableEmptyStringList)

        // Dodanie kilku elementów do listy od podanego indeksu.
        mutableEmptyStringList.addAll(0, setOf("banan", "mango"))
        println(mutableEmptyStringList)

        // Dodanie elementu przez jego przypisanie.
        mutableEmptyStringList += "element"
        mutableEmptyStringList += listOf("element0", "element0")
        println(mutableEmptyStringList)

        //**************************************************************************************************************

        // Usuwanie elementu z listy na podstawie jego nazwy.
        mutableEmptyStringList.remove("element1") // usuwa pierwszy element na liście który ma wartość "element1"
        println(mutableEmptyStringList)

        mutableEmptyStringList.remove("ananas") // nie usunie elementu którego nie ma na liście
        println(mutableEmptyStringList)

        // Usuwanie elementów które są ciągem znaków "element0", "element", "elem", "ment0", "ele" itd.
        mutableEmptyStringList.removeAll{x -> x in "element0"}
        println(mutableEmptyStringList)

        // Usuwanie wszystkich elementów które nie pasują do wzorca.
        mutableEmptyStringList.retainAll{ x -> x in "rabarbar"}
        println(mutableEmptyStringList)

        // Usuwanie elementu mający podany index.
        mutableEmptyStringList.removeAt(1)
        println(mutableEmptyStringList)

        // Usuwanie listy elementów o podanych wartościach.
        mutableEmptyStringList.removeAll(setOf("rabarbar","bar"))
        println(mutableEmptyStringList)

        // Usuwanie elementu o podanej nazwie przy pomocy operatora -=.
        mutableEmptyStringList -= "barbar"
        mutableEmptyStringList -= listOf("rbaffr", "karalepa") // usunie tylko elementy znajdujące się w liście
        println(mutableEmptyStringList)

        // Usuwanie wszystkich elementów z listy i pozostwienie jej pustą.
        mutableStringList.clear()
        println(mutableStringList)
    }
}
