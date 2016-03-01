# Wiederholungsfragen

- Welche zwei allgemeine Arten zum Einlesen von Benutzereingaben kennst du? Wodurch unterscheiden sich diese?

- In Java-Code können drei verschiedene Arten von Klammern vorkommen: `{}`, `[]`, `()`? Nenne zu jeder der drei Möglichkeiten zumindest ein Einsatzgebiet wofür die jeweiligen Klammern verwendet werden.

  1. `{}`:
  2. `[]`:
  3. `()`:

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

   Ausgabe:

   ```
   ?
   ```
