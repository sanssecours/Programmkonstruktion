# Aufgaben

## Wiederholungsfragen

- Welche zwei allgemeine Arten zum Einlesen von Benutzereingaben kennst du? Wodurch unterscheiden sich diese?

- In Java-Code können drei verschiedene Arten von Klammern vorkommen: `{}`, `[]`, `()`? Nenne zu jeder der drei Möglichkeiten zumindest ein Einsatzgebiet wofür die jeweiligen Klammern verwendet werden.

- Warum definiert man eigene Funktionen?

- Eine Methode hat folgenden Funktionskopf:

  ```java
  int doSomething(float eins, int[] zahlen)
  ```

  1. Wie lautet der Name der Funktion?

  2. Wieviele Argumente besitzt die Funktion?

  3. Welchen Typ und Namen haben die Argumente?

  4. Wie lautet der Rückgabetyp der Funktion?

  5. Wie lautet der Code um die Funktion aufzurufen? Dabei wollen wir für `eins` den Wert `14.23` einsetzen. Für `zahlen` soll die Werte eines Arrays mit dem Namen `numbers` verwendet werden.

- Was kann man in einem Array speichern?

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

# Mehr Wiederholungsfragen \o/

-  Was gibt folgender Code am Bildschirm aus?

  ```java
  String[] winners = {"Robert De Niro" , "Marlon Brando", "Ben Kingsley"};
  String[] films = {"Gandhi" , "Raging Bull", "The Godfather"};

  System.out.println("1972: " + winners[1] + " (" + films[2] + ")");
  System.out.println("1980: " + winners[0] + " (" + films[1] + ")");
  System.out.println("1982: " + winners[2] + " (" + films[0] + ")");
  ```

-  Welche 3 (bis 4) Arten von Schleifen kennst du?

- Welche der folgenden Ausdrücke ist gültig? Falls der Ausdruck gültig ist, wie lautet sein Wert und welchen Typ hat er?

  ```java
      true ^ true & true     // Gültig:
                             // Wert:
                             // Datentyp:

      1 + (1 * 31 * 23) % 1  // Gültig:
                             // Wert:
                             // Datentyp:

      20 + 1++ -2            // Gültig:
                             // Wert:
                             // Datentyp:

      64 >>> 3 == 8          // Gültig:
                             // Wert:
                             // Datentyp:

      'a' + "B"              // Gültig:
                             // Wert:
                             // Datentyp:

      'a' + 'b'              // Gültig:
                             // Wert:
                             // Datentyp:
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

- Welche der folgenden Aufrufe von `repeat` sind gültig? Falls der Aufruf nicht gültig ist wo liegt der Fehler?

   ```java

      int number = 3;
      char character = 'A';
      String text = "Ho";

      repeat('H', 20);              // Gültig:
                                    // Fehler:

      repeat("HuHu"; 3);            // Gültig:
                                    // Fehler:

      repeat("2", 20);              // Gültig:
                                    // Fehler:

      repeat("Eins", 2, 3);         // Gültig:
                                    // Fehler:

      repeat(2, "Zwei");            // Gültig:
                                    // Fehler:

      repeat(text, number) + " ," + // Gültig:
      "now I have a machine gun";   // Fehler:

      repeat(n, var);               // Gültig:
                                    // Fehler:

      repeat(text, character);      // Gültig:
                                    // Fehler:
   ```

- Nachdem wir den Fehler in `repeat` ausgebessert haben, wie lautet die **Ausgabe** von folgendem Code?

  ```java
  text = repeat("-", 30);
  System.out.println(repeat("A", 2));
  repeat("B", 2);
  ```

[Lösungen](Programmkonstruktion [Lösungen 16] Switch:Case.md)
