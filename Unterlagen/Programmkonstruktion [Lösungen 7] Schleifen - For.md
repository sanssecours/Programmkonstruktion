# Aufgaben

## Wiederholungsfragen

- Nenne mindestens **vier verschiedene (Daten-)Typen** und gib jeweils ein Beispiel für einen Wert des gegebenen Typs.

  1.
    - Typ: `boolean`
    - Beispiel für Wert: `true`

  2.
    - Typ: `int`
    - Beispiel für Wert: `7`

  3.
    - Typ: `String`
    - Beispiel für Wert: `"Hallo"`
  4.
    - Typ: `char`
    - Beispiel für Wert: `'h'`

- Bei einer **Variablendeklaration** legt man welche zwei Eigenschaften einer Variable fest? Bei der **Variablendefinition** legt man welche zusätzliche Eigenschaft einer Variable fest? Wie sieht eine Variablendeklaration/definition in Java aus?

  - Variablendeklaration
    - Eigenschaft: Typ
    - Eigenschaft: Name
    - Beispiel: `int a;`

  - Variablendefinition
    - Eigenschaft: Wert
    - Beispiel: `int a = 7;`

- Welche der folgenden Ausdrücke ist gültig? Falls der Ausdruck gültig ist, welchen Wert und Typ hat der Ausdruck

  ```java
  int zehn = 10;
  int one = 1;

  /*
    Hinweis: `+` hat höhere Priorität (bindet stärker, wird vorher
              ausgeführt) als `<`
   */
  10 < 3 + 2              // Gültig: Ja
                          // Wert:   false
                          // Typ:    boolean

  /*
    Hinweis: `&&` bindet stärker als `||`
   */
  true || false && false  // Gültig: Ja
                          // Wert:   true
                          // Typ:    boolean

  /*
    Hinweis: `%` bindet stärker als `>`
   */
  121282340 % 10 >= 3     // Gültig: Ja
                          // Wert:   false
                          // Typ:    boolean

  (10 + false) + "Hi"     // Gültig: Nein
                          // Wert:   -
                          // Typ:    -

  12 || 3                 // Gültig: Nein
                          // Wert:   -
                          // Typ:    -

  /*
    Hinweis: `++` und `--` binden stärker als `+`

    1. Ausdruck: 10 (In zehn steht jetzt 11)
    2. Ausdruck: 11 (In zehn steht jetzt 10)
    3. Ausdruck: 9  (In zehn steht jetzt 9)
    4. Ausdruck: 2

      10 - 11 + 9 + 2 + " Zehen"
            10        + " Zehen"
                "10 Zehen"
   */
  zehn++ - zehn-- + --zehn + ++one + " Zehen" // Gültig: Ja
                                              // Wert:   "10 Zehen"
                                              // Typ:    String
  ```

- Was bedeutet der Begriff „Programmfluss“?

   Der Programmfluss beschreibt die Reihenfolge in der Statements ausgeführt werden.

- Wozu benötigt man Schleifen?

   Schleifen können verwendet werden um Anweisungen öfter ausführen (ohne diese mehrmals hinschreiben zu müssen).

- Wozu benötigt man Abfragen?

   Um auf verschiedene Bedingungen reagieren zu können und je nachdem andere Statements auszuführen.
