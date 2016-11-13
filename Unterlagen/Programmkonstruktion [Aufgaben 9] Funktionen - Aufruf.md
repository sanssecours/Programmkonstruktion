# Aufgaben

## Wiederholungsfragen

-  Was ist der Unterschied zwischen primitiven Datentypen und Objekt-Datentypen in Java?

- An Hand welcher Eigenschaft der Schreibweise kann man primitive und nicht primitive Datentypen unterscheiden?

- Wie unterscheiden sich Ausdrücke und Anweisungen (Statements) voneinander?

- Welches Zeichen wird in Java zum trennen von Anweisungen verwendet?

- Welche (zwei) Zeichen werden in Java zur „Zusammenfassung“ mehrerer Statements verwendet? Wann kann man diese Zeichen auch weglassen?

- Wie muss der Dateiname einer Klasse mit dem Namen `BlaBlaKlasse` lauten?

-  Wie lautet die Ausgabe von folgendem Code?

    ```java
    public static void main(String[] args) {
        int number = -3;

        for(;number < 4; number++) {
            if (number % 2 == 0) {
                // `Math.abs` bestimmt Absolutwert (positiven Wert)
                // einer Zahl
                //
                // Beispiele: Math.abs(-23)  = 23
                //            Math.abs(2)    = 2
                //            Math.abs(-321) = 321
                System.out.println(Math.abs(number));
            } else {
                System.out.println(number);
            }
        }
    }
    ```

- Welche der folgenden Ausdrücke ist gültig. Falls der Ausdruck gültig ist, welchen Wert und Typ hat er?

  ```java
  /* ASCII Encoding:

      'A' = 65
      'H' = 72
      'a' = 97
      'c' = 99
  */

  1 * 2 / 3 > 0 + 5 // Gültig:
                    // Wert:
                    // Typ:

  10 || 12          // Gültig:
                    // Wert:
                    // Typ:

  /*
    Achtung: Zeichen werden vom Computer als Zahlen gespeichert.
             Nur bei `String` werden diese Zahlen als Zeichen
             dargestellt.

        (Im Endeffekt rechnet ein Computer immer mit Zahlen!)
   */
  'H' + 'a'         // Gültig:
                    // Wert:
                    // Typ:

  'A' + 3 + "Zehn"  // Gültig:
                    // Wert:
                    // Typ:

  /*
    Kann man diesen Ausdruck auch auswerten wenn der Wert von `number`
    nicht bekannt ist?
   */
  number <= 100 || number > 100  // Gültig:
                                 // Wert:
                                 // Typ:

  "1 2" || "3"       // Gültig:
                     // Wert:
                     // Typ:

  Math.abs(-20) + 'c' // Gültig:
                      // Wert:
                      // Typ:
  ```

- Welchen **Typ** muss die Bedingung – der Ausdruck zwischen `(` und `)`– sowohl bei Abfragen als auch Schleifen besitzen?

- Welche drei Eigenschaften einer Funktion muss man auf jeden Fall beim Kopf der Funktionsdefinition angeben?

- Der Programmfluss bestimmt welche Anweisungen nach welcher Reihenfolge ausgeführt werden. Nach welcher Reihenfolge werden Statements normalerweise ausgeführt. Welche zwei Konstrukte gibt es, die den Programmfluss ändern können?

- Was versteht man unter dem Begriff „Debuggen“?

[Lösungen](Programmkonstruktion [Lösungen 9] Funktionen - Aufruf.md)
