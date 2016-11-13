# Aufgaben

## Wiederholungsfragen

-  Was ist der Unterschied zwischen primitiven Datentypen und Objekt-Datentypen in Java?

   - primitive Datentypen: keine Methoden
   - Objekt-Datentypen: Methoden darauf definiert (Zugriff mittel `object.methode()`)

    ```java
    // Funktioniert:
    Integer number = 3;
    System.out.print(4 / number.floatValue()); // 1.3333334

    // Funktioniert nicht (keine Methoden bei primitiven Datentypen):
    int number = 3;
    System.out.print(4 / number.floatValue()); // 1.3333334
    ```

- An Hand welcher Eigenschaft der Schreibweise kann man primitive und nicht primitive Datentypen unterscheiden?

   - primitive Datentypen: kleingeschrieben
   - Objekt-Datentypen: CamelCase

- Wie unterscheiden sich Ausdrücke und Anweisungen (Statements) voneinander?

   - Anweisungen: Führen etwas aus, Getrennt durch Strichpunkt
   - Ausdrücke: Können in Anweisungen enthalten, ergibt bestimmten **Wert**

- Welches Zeichen wird in Java zum trennen von Anweisungen verwendet?

   - Der Strichpunkt: `;`

- Welche (zwei) Zeichen werden in Java zur „Zusammenfassung“ mehrerer Statements verwendet? Wann kann man diese Zeichen auch weglassen?

   - Geschwungene Klammern: `{}`
   - Weglassen bei einem oder 0 Statements

- Wie muss der Dateiname einer Klasse mit dem Namen `BlaBlaKlasse` lauten?

   - `BlaBlaKlasse.java`

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

  - Ausgabe:

    ```
    -3
    2
    -1
    0
    1
    2
    3
    ```

- Welche der folgenden Ausdrücke ist gültig. Falls der Ausdruck gültig ist, welchen Wert und Typ hat er?

  ```java
  /* ASCII Encoding:

      'A' = 65
      'H' = 72
      'a' = 97
      'c' = 99
  */

  /*
    1 * 2 / 3 > 0 + 5
      2 / 3   >   5
        0     >   5
            false
   */
  1 * 2 / 3 > 0 + 5 // Gültig: Ja
                    // Wert:   false
                    // Typ:    int

  10 || 12          // Gültig: Nein
                    // Wert:   -
                    // Typ:    -

  /*
    Achtung: Zeichen werden vom Computer als Zahlen gespeichert.
             Nur bei `String` werden diese Zahlen als Zeichen
             dargestellt.

        (Im Endeffekt rechnet ein Computer immer mit Zahlen!)
   */
  'H' + 'a'         // Gültig: Ja
                    // Wert:   169
                    // Typ:    char

  /*
    'A' + 3 + "Zehn"
    65  + 3 + "Zehn"
        68  + "Zehn"
        "68Zehn"
   */
  'A' + 3 + "Zehn"  // Gültig: Ja
                    // Wert:   "68Zehn"
                    // Typ:    String

  /*
    Kann man diesen Ausdruck auch auswerten wenn der Wert von `number`
    nicht bekannt ist?
   */
  number <= 100 || number > 100  // Gültig: Ja
                                 // Wert:   true
                                 // Typ:    boolean

  "1 2" || "3"       // Gültig: Nein
                     // Wert:   -
                     // Typ:    -

  Math.abs(-20) + 'c' // Gültig: Ja
                      // Wert:   119
                      // Typ:    int
  ```

- Welchen **Typ** muss die Bedingung – der Ausdruck zwischen `(` und `)`– sowohl bei Abfragen als auch Schleifen besitzen?

  - `boolean`

- Welche drei Eigenschaften einer Funktion muss man auf jeden Fall beim Kopf der Funktionsdefinition angeben?

  - Rückgabetyp
  - Name
  - (Eingabe-)Parameter

- Der Programmfluss bestimmt welche Anweisungen nach welcher Reihenfolge ausgeführt werden. Nach welcher Reihenfolge werden Statements normalerweise ausgeführt. Welche zwei Konstrukte gibt es, die den Programmfluss ändern können?

  1. Abfragen
  2. Schleifen

- Was versteht man unter dem Begriff „Debuggen“?

  - Unter „Debuggen“ versteht man das Entfernen von Bugs (Fehlern) in einem Programm.
