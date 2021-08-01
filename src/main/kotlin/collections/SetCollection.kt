package collections

class SetCollection {

    fun setCollection(){

        // Set definicja
        // Zbiór (ang. set) to kolekcja, która służy do przechowywania unikalnych elementów. Rozmiar seta zwiększa się
        // wraz z dodaniem kolejnego elementu.

        // SetOf
        // Ogólna uporządkowana kolekcja elementów. Metody w tym interfejsie obsługują dostęp tylko do odczytu seta.

        // MutableSetOf
        // Ogólna uporządkowana kolekcja elementów, która obsługuje dodawanie i usuwanie elementów.

        // Deklaracja mutowalnego seta.
        val mutableStringSet = mutableSetOf("element1", "element2", "element1", "element2", "element3", "element3", "element4", "element4")
        val mutableEmptyStringSet = mutableSetOf<String>()

        // Deklaracja niemutowalnego seta.
        val stringSet = setOf("element1", "element1", "element2", "element2", "element3", "element3", "element4", "element4")
        val emptyStringSet = setOf<String>()

        //**************************************************************************************************************

        // Wyświetlanie listy elementów.
        println(stringSet)

        // Wyświetlenie rozmiaru listy.
        println(emptyStringSet.size)

        //**************************************************************************************************************

        println(mutableEmptyStringSet)

        // Dodanie elementów do listy.
        mutableEmptyStringSet.add("element1")
        mutableEmptyStringSet.add("element1") //set będzie ignorował dodawanie elementu który jest w już w secie
        mutableEmptyStringSet.add("rabarbar")
        mutableEmptyStringSet.add("rabar")
        mutableEmptyStringSet.add("barbar")
        mutableEmptyStringSet.add("abarbar")
        mutableEmptyStringSet.add("bar")
        mutableEmptyStringSet.add("rbar")
        mutableEmptyStringSet.add("elem")
        mutableEmptyStringSet.add("eleme")

        println(mutableEmptyStringSet)

        // Dodanie kilku elementów do listy.
        mutableEmptyStringSet.addAll(arrayListOf("element1", "karalepa")) // tutaj też zostanie zignorowany element "element1"
        println(mutableEmptyStringSet)

        // Dodanie kilku elementów do listy od podanego indeksu.
        // Set nie posiada takiej metody?

        // Dodanie elementu przez jego przypisanie.
        mutableEmptyStringSet += "element"
        mutableEmptyStringSet += listOf("element0", "element0")
        println(mutableEmptyStringSet)

        //**************************************************************************************************************

        // Usuwanie elementu z listy na podstawie jego nazwy.
        mutableEmptyStringSet.remove("element1") // usuwa pierwszy element na liście który ma wartość "element1"
        println(mutableEmptyStringSet)

        mutableEmptyStringSet.remove("ananas") // nie usunie elementu którego nie ma w secie
        println(mutableEmptyStringSet)

        // Usuwanie elementów które są ciągem znaków "element0", "element", "elem", "ment0", "ele" itd.
        mutableEmptyStringSet.removeAll{x -> x in "element0"}
        println(mutableEmptyStringSet)

        // Usuwanie elementu mający podany index.
        // Set nie posiada takiej metody?

        // Usuwanie listy elementów o podanych wartościach.
        mutableEmptyStringSet.removeAll(setOf("rabar","bar"))
        println(mutableEmptyStringSet)

        // Usuwanie elementu o podanej nazwie przy pomocy operatora -=.
        mutableEmptyStringSet -= "barbar"
        mutableEmptyStringSet -= listOf("rbaffr", "karalepa") // usunie tylko elementy znajdujące się w liście
        println(mutableEmptyStringSet)

        // Usuwanie wszystkich elementów z listy i pozostwienie jej pustą.
        mutableEmptyStringSet.clear()
        println(mutableEmptyStringSet)
    }
}