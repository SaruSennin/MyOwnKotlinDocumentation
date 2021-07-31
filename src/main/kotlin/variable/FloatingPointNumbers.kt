package variable

class FloatingPointNumbers {

    // LICZBY - TYP ZMIENNOPRZECINKOWE

    // Aby jawnie określić wartość typu Float, dodaj przyrostek f lub F. Jeśli taka wartość
    // zawiera więcej niż 6-7 cyfr dziesiętnych, zostanie zaokrąglona.

    // rozmiar (bity) = 32 znaczące bity = 24 bity wykładnika = 8 cyfry dziesiętne = 6-7
    val variableFloat = 2.54F
    val variableFloat2: Float = 2.54F

    // rozmiar (bity) = 64 znaczące bity = 53 bity wykładnika = 11 cyfry dziesiętne = 15-16
    val variableDouble = 1.0
    val variableDouble2: Double = 1.0
//    val variableDouble2: Double = 1 // Error: type mismatch

    // Zauważ, że w przeciwieństwie do niektórych języków, w Kotlinie nie ma niejawnych konwersji rozszerzających
    // dla liczb. Na przykład, funkcja z parametrem Double może pobierać tylko wartości Double, ale nie
    // wartości Float, Int czy inne zmienne liczbowe.

    fun printDouble(d: Double) = print(d)

    val i = 1
    val d = 1.0
    val f = 1.0f

    val resultDouble = printDouble(d)
//    val resultDouble = printDouble(i) // Error: Type mismatch
//    val resultDouble = printDouble(f) // Error: Type mismatch
}