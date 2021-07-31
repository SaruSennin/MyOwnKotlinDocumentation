package collections

class ListCollection {

    fun list(){

        // MutableListOf
        // Ogólna uporządkowana kolekcja elementów. Metody w tym interfejsie obsługują dostęp tylko do odczytu do listy;
        // Dostęp do odczytu/zapisu jest obsługiwany przez interfejs MutableList.

        // ListOf
        // Ogólna uporządkowana kolekcja elementów, która obsługuje dodawanie i usuwanie elementów.

        // deklaracja listy mutowlanej
        val mutableStringList = mutableListOf("element1", "element1", "element2", "element2", "element3", "element3", "element4", "element4")
        val mutableEmptyStringList = mutableListOf<String>()

        // deklaracja listy nie mutowalnej
        val stringList = listOf("element1", "element1", "element2", "element2", "element3", "element3", "element4", "element4")
        val emptyStringList = listOf<String>()

        // Dodanie elementów do listy
        mutableEmptyStringList.add("element1")
        mutableEmptyStringList.add("element1")

        // wyświetlanie listy elementów
        println(mutableEmptyStringList)

        // Dodanie kilku elementów do listy
        mutableEmptyStringList.addAll(arrayListOf("rabarbar", "karalepa"))

        // Dodanie kilku elementów do listy od podanego indeksu
        mutableEmptyStringList.addAll(0, setOf("banan", "mango"))

        println(mutableEmptyStringList)

        println(emptyStringList.size)
    }




}