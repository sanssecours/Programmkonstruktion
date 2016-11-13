# Aufgaben

## Wiederholungsfragen

- Wie unterscheiden sich Anweisungen (Statement, Befehl) und Ausdrücke (Expression)?

  - Ausdruck (Expression):
     - hat einen bestimmten Wert und Typ
     - Beispiele:
       - `3`
       - `3 + y`
     - Können Teil eines anderen Ausdrucks/einer Anweisung sein

  - Anweisung (Statement, Befehl):
    - Geben Schritte vor, die der Computer ausführen soll
    - Beispiele:
      - `x = 3;`,
      - `if (true) { System.out.printf("Hello World") };`

- Handelt es sich bei den folgenden Code um eine Anweisung oder einen Ausdruck? Hinweis: Strichpunkte wurden weggelassen, damit es nicht sofort ersichtlich ist wann es sich um einen Ausdruck oder Anweisung handelt.

  ```java
  System.out.println("Hi")  // Anweisung
  1337                      // Ausdruck
  true && var               // Ausdruck
  a = 10                    // Anweisung
  if (true)                 // Anweisung
  (10 + 3) * 20             // Ausdruck
  ```

- Sind folgende Ausdrücke gültig. Falls ja: Welche Wert und Type haben sie?

  ```java
  double a = 123.4;
  boolean wahr = false;
  int one = 1;

  "a" + 'b'               // Gültig:   Ja
                          // Ergebnis: "ab"
                          // Typ:      String


  /*
    (1 + 123.4) != 2
       124.4     != 2
               true
  */
  (1 + a) != 2            // Gültig:   Ja
                          // Ergebnis: true
                          // Typ:      boolean

  2 <= 3 || 2 >= 3        // Gültig:   Ja
                          // Ergebnis: true
                          // Typ:      boolean

  /*
    "Bla" + (2 < 3)
    "Bla" +  true
    "Bla" + "true"
      "Blatrue"
  */
  "Bla" + (2 < 3)         // Gültig:   Ja
                          // Ergebnis: "Blatrue"
                          // Typ:      "String"

  1341252142 % 2          // Gültig:   Ja
                          // Ergebnis: 0
                          // Typ:      int


  /*
    (wahr && true)  < false
    (false && true) < false
        false       < false
               Error!
   */
  (wahr && true) < false  // Gültig:   Nein
                          // Ergebnis: -
                          // Typ:      -

  // Tricky! Bitte solchen Code nie verwenden!

  /*
    (one++) + (--one) - (1)
       1    + (--one) - (1)
       1    +    1    - (1)
                1
  */
  (one++) + (--one) - (1) // Gültig:   Ja
                          // Ergebnis: 1
                          // Typ:      int
  ```

- Was gibt folgender Code auf dem Bildschirm aus?

  ```java
          int bla = 1000;
          int var1 = 20;

          if (var1 < 20 || bla < 30) {
              System.out.println("var1 ist kleiner wie 20");
          } else if (var1 < 19) {
              System.out.println("var1 ist kleiner wie 20");
          }
  ```

  - Nichts!

- Welchem Zweck dienen geschwungene Klammern (`{}`)? Kann man diese manchmal weglassen? Falls ja, wann?

   - Geschwungene Klammern dienen dazu Statements zusammen zu fassen.
   - Sie könne (bei Abfragen und [Schleifen](Programmkonstruktion [Unterlagen 5] Schleifen.md)) weggelassen werden wenn man nur ein einzelnes Statement in dem Zweig der Schleife (oder dem Körper der Schleife) verwendet.
