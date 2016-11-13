# Aufgaben

## Wiederholungsfragen

- Welche zwei allgemeine Arten zum Einlesen von Benutzereingaben kennst du? Wodurch unterscheiden sich diese?

  1. Interaktive Eingabe
  2. Übergabe der Parameter bei Programmaufruf: z.B. `java Programm par1 par2`

- In Java-Code können drei verschiedene Arten von Klammern vorkommen: `{}`, `[]`, `()`? Nenne zu jeder der drei Möglichkeiten zumindest ein Einsatzgebiet wofür die jeweiligen Klammern verwendet werden.

  1. `{}`: Zum Zusammenfassen mehrere Statements
  2. `[]`: Arrays
  3. `()`: Bedingung bei Schleifen/Abfragen

- Warum definiert man eigene Funktionen?

  - Um Programme zu vereinfachen — man kann sich auf Funktionsweise von einzelner Funktion konzentrieren
  - Um gleichen/ähnlichen Code nicht mehrfach schreiben zu müssen

- Eine Methode hat folgenden Funktionskopf:

  ```java
  int doSomething(float eins, int[] zahlen)
  ```

  1. Wie lautet der Name der Funktion?

      - `doSomething`

  2. Wieviele Argumente besitzt die Funktion?

      - `2`

  3. Welchen Typ und Namen haben die Argumente?

      - Typ von 1. Argument: `float`
      - Name von 1. Argument: `eins`

      - Typ von 2. Argument: `int[]`  (Liste von `int`-Werten/Ganzzahlen)
      - Name von 2. Argument: `zahlen`

  4. Wie lautet der Rückgabetyp der Funktion?

      - `int`

  5. Wie lautet der Code um die Funktion aufzurufen? Dabei wollen wir für `eins` den Wert `14.23` einsetzen. Für `zahlen` soll die Werte eines Arrays mit dem Namen `numbers` verwendet werden.

      ```java
      doSomething(14.23, numbers)
      ```

- Was kann man in einem Array speichern?

    - Mehrere Werte von einem Typen

- Ein Array kann man beispielsweise wie  folgt deklarieren und initialisieren:

  ```java
  float numbers[] = {12, 34, 56 , 7};
  /*
    numbers[0] = 12
    numbers[1] = 34
    numbers[2] = 56
    numbers[3] = 7
    numbers.length = 4
  */
  ```

   - Wie lautet die Ausgabe des folgenden Programmcodes?

  ```java
  String script[] = {"😱 Ahh", "💩 HiHi", "👻 Buh"};
  System.out.println("A play consisting of " + script.length +
                     " lines");
  System.out.print(script[2] + "\n" + script[0] + "\n" +
                   script[1]);
  ```

   Ausgabe:

   ```
   A play consisting of 3 lines
   👻 Buh
   😱 Ahh
   💩 HiHi
   ```

# Mehr Wiederholungsfragen \o/

-  Was gibt folgender Code am Bildschirm aus?

  ```java
  String[] winners = {"Robert De Niro" , "Marlon Brando", "Ben Kingsley"};
  String[] films = {"Gandhi" , "Raging Bull", "The Godfather"};

  System.out.println("1972: " + winners[1] + " (" + films[2] + ")");
  System.out.println("1980: " + winners[0] + " (" + films[1] + ")");
  System.out.println("1982: " + winners[2] + " (" + films[0] + ")");
  ```

  Ausgabe:

  ```
  1972: Marlon Brando (The Godfather)
  1980: Robert De Niro (Raging Bull)
  1982: Ben Kingsley (Gandhi)
  ```

-  Welche 3 (bis 4) Arten von Schleifen kennst du?

   1. for-Schleife
   2. while-Schleife
   3. do-while-Schleife
   4. for-each-Schleife

- Welche der folgenden Ausdrücke ist gültig? Falls der Ausdruck gültig ist, wie lautet sein Wert und welchen Typ hat er?

  ```java
      true ^ true & true     // Gültig:   Ja
                             // Wert:     false
                             // Datentyp: boolean

      1 + (1 * 31 * 23) % 1  // Gültig:   Ja
                             // Wert:     1
                             // Datentyp: int

      20 + 1++ -2            // Gültig:   Nein (++ bei Konstante nicht möglich)
                             // Wert:
                             // Datentyp:

      64 >>> 3 == 8          // Gültig:   Ja
                             // Wert:     true
                             // Datentyp: boolean

      'a' + "B"              // Gültig:   Ja
                             // Wert:     "aB"
                             // Datentyp: String

      'a' + 'b'              // Gültig:   Ja
                             // Wert:     195
                             // Datentyp: int
  ```

- Der folgende Code beinhaltet einen Fehler:

   ```java
   /* Create a string that repeats the characters in text for the number
      of times specified in the variable times.

      Examples:

           repeat("Bla", 2)        → "BlaBla"
           repeat("Repeater", 3)   → "RepeaterRepeaterRepeater"
           repeat("Hu", 0)         → ""
           repeat("Aaa", -10)      → ""
   */
   static String repeat(final String text, final int times) {
       String output = "";
       for (int repetitions = times; repetitions >= 1; repetitions--) {
           output += text;
       }
       return text;
   }
   ```

   Wie muss man den Code ändern, damit er das in dem Kommentar spezifiziere Verhalten aufweist?

   ```java
   static String repeat(final String text, final int times) {
       String output = "";
       for (int repetitions = times; repetitions >= 1; repetitions--) {
           output += text;
       }
       return output;
   }
   ```

- Welche der folgenden Aufrufe von `repeat` sind gültig? Falls der Aufruf nicht gültig ist wo liegt der Fehler?

   ```java

      int number = 3;
      char character = 'A';
      String text = "Ho";

      repeat('H', 20);              // Gültig: Nein
                                    // Fehler: 1. Argument muss String sein

      repeat("HuHu"; 3);            // Gültig: Nein
                                    // Fehler: Strichpunkt statt Beistrich

      repeat("2", 20);              // Gültig: Ja
                                    // Fehler:

      repeat("Eins", 2, 3);         // Gültig: Nein
                                    // Fehler: Zusätzliches 3. Argument

      repeat(2, "Zwei");            // Gültig: Nein
                                    // Fehler: Falsche Typen

      repeat(text, number) + " ," + // Gültig: Ja
      "now I have a machine gun";   // Fehler:

      repeat(n, var);               // Gültig: Nein
                                    // Fehler: `n` und `var` nicht definiert

      repeat(text, character);      // Gültig: Nein
                                    // Fehler: character ist kein `int`
   ```

- Nachdem wir den Fehler in `repeat` ausgebessert haben, wie lautet die **Ausgabe** von folgendem Code?

  ```java
  text = repeat("-", 30);
  System.out.println(repeat("A", 2));
  repeat("B", 2);
  ```

  Ausgabe:

  ```
  AA
  ```
