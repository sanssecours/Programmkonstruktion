# Aufgaben

## Wiederholungsfragen

- Durch welche Eigenschaft unterscheidet sich überladene Funktionen auf jeden Fall voneinander?

  - Durch die Anzahl und/oder der Datentyp der Parameter.

- Welche Eigenschaft von überladenen Funktionen ist auf jeden Fall gleich?

  - Der Name der Funktion.

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

  Ausgabe:

  ```
  You that never done nothin'
  But build to destroy
  You play with my world
  ```

## Mehr Wiederholungsfragen

1. Arrays

    ```java
    // Definiere ein Variable vom Typ `char`-Array.
    // Die Variable soll den Namen `characters` besitzen.
    // Setze die Variable auf den Wert `null`
    char[] characters = null;

    // Speichere nun in der Variable `characters` ein leeres Array
    // mit der Größe/Länge 0.
    characters = new char[0];

    // Worin besteht der Unterschied zwischen den Werten `null`
    // und dem leeren Array mit Größe 0?

    /*
      - `null` steht – mehr oder weniger – für “Nichts”.
      - Ein leeres Array ist eine Liste in der sich “Nichts” befindet.

         null                  new char[0]
         ====                  ===========

                                 [ ]
          ↑                       ↑
        “Nichts”     Eine Liste (von `char`) in der sich
                             “Nichts” befindet
    */

    // Speichere nun die Zeichen `'a'`, `'h'` und `'a'` in
    // dieser Reihenfolge in `characters`.
    characters = new char[]{'a', 'h', 'a'};

    // Schreib Code um die einzelnen Zeichen von `characters` auf
    // dem Bildschirm auszugeben.
    for (char ausgabe : characters) {
        System.out.print(ausgabe);
    }

    // Was würde passieren, wenn man den obigen Code auf characters
    // anwenden würde, wenn in der Variable der Wert `null` steht?

    /* Es kommt zu einer `NullPointerException`, da man über
       Listen – nicht aber über “Nichts” – iterieren kann.

       Iterieren: Die einzelnen Elemente einer Sammlung von Elementen
                  (Liste, Menge) “durchgehen”.
    */
    ```

2. Character-Arrays und Strings

    ```java
    char[] characters;
    String text = "1234";

    // Mit welcher Methode kann man den `String` `text` in ein Array
    // vom Typ `char` umwandeln? Wo kann man nachsehen um den Namen
    // Namen der Methode herauszufinden?

    // `toCharArray()` aus JAVA API docu
    characters = text.toCharArray();
    // In `characters` steht jetzt `['1', '2', '3', '4']`,
    // also eine Liste mit Länge 4.
    // An der ersten Stelle (Index 0) steht '1'
    // An der zweiten Stelle (Index 1) steht '2'
    // …
    ```

   - Kann ein einzelnes Zeichen immer mit einer 16bit Zahl (`char`) dargestellt werden? Hint: Wie lautet der Zahlenwert von `💩`(0x1F4A9 = 128169)?

     - **Antwort:** Nein, da heute soviele Zeichen definiert wurden (verschiedene Sprachen, Emoji, …), dass 2^16=65536 mögliche Zeichen nicht mehr reichen. Manche Zeichen können sogar verschieden  dargestellt werden. Das sorgt dafür, dass 16 bit nicht ausreichen. Heute verwendet man üblicherweise UTF-8 (8-32bit lang, erste 128 Zeichen gleich wie bei ASCII, häufige Zeichen (z.B. `a`, `b`, `9`) brauchen nur 8bit, weniger Häufige bis zu 32bit)

       - Beispiel für verschieden Zahlen-Kombinationen für das selbe Zeichen: `ä`, wird entweder als
         1. `LATIN SMALL LETTER A WITH DIAERESIS` (228) oder als
         2. `LATIN SMALL LETTER A` (97) + `COMBINING DIAERESIS` (776) dargestellt.

3. Definiere eine Funktion mit dem Namen `reverse`. Die Funktion hat ein Argument mit dem Namen `text` vom Typ `String`. Der Rückgabetyp der Funktion soll ebenfalls ein `String` sein. Welches Statement muss man auf jeden Fall im „Funktions-Körper“ einfügen, damit sich die Funktion übersetzen lässt?

    ```java
    public static String reverse(String text) {
      return ""; // `return` notwendig, damit Code kompiliert
    }
    ```

4. Die Funktion `reverse` soll den String der in `text` gespeichert wird umdrehen und das Ergebnis zurückgeben. Wie gehst du vor um das zu bewerkstelligen?

    ```java
    // reverse("cba") → "abc"
    public static String reverse(String text) {
        char[] characters = text.toCharArray();
        String ausgabe = "";

        for(char buchstabe : characters) {
            ausgabe = buchstabe + ausgabe;
        }

        return ausgabe;
    }
    ```
