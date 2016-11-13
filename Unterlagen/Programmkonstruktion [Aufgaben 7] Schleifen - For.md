# Aufgaben

## Programm — QuadNumbers

Ein Programm soll die Quadratzahlen zwischen zwei Werten `untereGrenze` und `obereGrenze` ausgeben. Zu diesem Zweck soll eine for-Schleife verwendet werden.

Beispiel-Ausgabe (unterGrenze = 10, obereGrenze = 15):

    Quadrat von 10: 100
    Quadrat von 11: 121
    Quadrat von 12: 144
    Quadrat von 13: 169
    Quadrat von 14: 196
    Quadrat von 15: 225

Beispiel-Ausgabe (untereGrenze = 10, obereGrenze = 9): keine Ausgabe!

[Lösung](../Code/QuadNumbers.java)

## Programm — UnevenSum

Ein Programm soll die Summe aller ungeraden Zahlen zwischen den Variablen `low` und `high` ermitteln und ausgeben. Verwende dafür eine Schleife deiner Wahl.

Beispiel-Ausgabe (low = 3, high = 10):

    Summe der ungeraden Zahlen [3, 10]: 24

Beispiel-Ausgabe (low = 123, high = 456):

    Summe der ungeraden Zahlen [123, 456]: 48263

[Lösung](../Code/UnevenSum.java)

## Wiederholungsfragen

- Nenne mindestens **vier verschiedene (Daten-)Typen** und gib jeweils ein Beispiel für einen Wert des gegebenen Typs.

- Bei einer **Variablendeklaration** legt man welche zwei Eigenschaften einer Variable fest? Bei der **Variablendefinition** legt man welche zusätzliche Eigenschaft einer Variable fest? Wie sieht eine Variablendeklaration/definition in Java aus?

- Welche der folgenden Ausdrücke ist gültig? Falls der Ausdruck gültig ist, welchen Wert und Typ hat der Ausdruck

  ```java
  int zehn = 10;
  int one = 1;

  /*
    Hinweis: `+` hat höhere Priorität (bindet stärker, wird vorher
              ausgeführt) als `<`
   */
  10 < 3 + 2              // Gültig:
                          // Wert:
                          // Typ:

  /*
    Hinweis: `&&` bindet stärker als `||`
   */
  true || false && false  // Gültig:
                          // Wert:
                          // Typ:

  /*
    Hinweis: `%` bindet stärker als `>`
   */
  121282340 % 10 >= 3     // Gültig:
                          // Wert:
                          // Typ:

  (10 + false) + "Hi"     // Gültig:
                          // Wert:
                          // Typ:

  12 || 3                 // Gültig:
                          // Wert:
                          // Typ:

  /*
    Hinweis: `++` und `--` binden stärker als `+`
   */
  zehn++ - zehn-- + --zehn + ++one + " Zehen" // Gültig:
                                              // Wert:
                                              // Typ:
  ```

- Was bedeutet der Begriff „Programmfluss“?

- Wozu benötigt man Schleifen?

- Wozu benötigt man Abfragen?

[Lösungen](Programmkonstruktion [Lösungen 7] Schleifen - For.md)
