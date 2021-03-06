# Aufgaben

## Wiederholungsfragen

- Durch welche Eigenschaft unterscheidet sich überladene Funktionen auf jeden Fall voneinander?

- Welche Eigenschaft von überladenen Funktionen ist auf jeden Fall gleich?

- Wie lautet die Ausgabe des folgenden Codes?

  ```java
      static void overWritten(long var1) {
          System.out.println("But build to destroy");
      }

      static void overWritten(float var1) {
          System.out.println("You that never done nothin'");
      }

      static void overWritten(float var1, double var2) {
          System.out.println("You play with my world");
      }

      static String overWritten(double var1) {
          return "Like it's your little toy";
      }

      public static void main(String[] args) {
          overWritten(1.0f);
          overWritten(1);
          overWritten((float) 1.0, 2);
          overWritten(1.0);
      }
  ```

## Mehr Wiederholungsfragen

1. Arrays

    ```java
    // Definiere ein Variable vom Typ `char`-Array.
    // Die Variable soll den Namen `characters` besitzen.
    // Setze die Variable auf den Wert `null`

    // Speichere nun in der Variable `characters` ein leeres Array
    // mit der Größe/Länge 0.

    // Worin besteht der Unterschied zwischen den Werten `null`
    // und dem leeren Array mit Größe 0?

    // Speichere nun die Zeichen `'a'`, `'h'` und `'a'` in
    // dieser Reihenfolge in `characters`.

    // Schreib Code um die einzelnen Zeichen von `characters` auf
    // dem Bildschirm auszugeben.

    // Was würde passieren, wenn man den obigen Code auf characters
    // anwenden würde, wenn in der Variable der Wert `null` steht?
    ```

2. Character-Arrays und Strings

    ```java
    char[] characters;
    String text = "1234";

    // Mit welcher Methode kann man den `String` `text` in ein Array
    // vom Typ `char` umwandeln? Wo kann man nachsehen um den Namen
    // Namen der Methode herauszufinden?
    ```

   - Kann ein einzelnes Zeichen immer mit einer 16bit Zahl (`char`) dargestellt werden? Hint: Wie lautet der Zahlenwert von `💩`(0x1F4A9 = 128169)?

3. Definiere eine Funktion mit dem Namen `reverse`. Die Funktion hat ein Argument mit dem Namen `text` vom Typ `String`. Der Rückgabetyp der Funktion soll ebenfalls ein `String` sein. Welches Statement muss man auf jeden Fall im „Funktions-Körper“ einfügen, damit sich die Funktion übersetzen lässt?

4. Die Funktion `reverse` soll den String der in `text` gespeichert wird umdrehen und das Ergebnis zurückgeben. Wie gehst du vor um das zu bewerkstelligen?

[Lösungen](Programmkonstruktion [Lösungen 18] Überladene Funktionen.md)
