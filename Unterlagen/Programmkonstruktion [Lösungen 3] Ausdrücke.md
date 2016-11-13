# Aufgaben

- Welche der folgenden Ausdrücke sind „korrekt“ (ergeben ein Wert)? Wie lautet der Wert bzw. wo liegt das Problem?

  ```java
  // Nicht korrekt: boolean - int funktioniert nicht
  true - 10

  20 / 10                           // 2
  22 / 10                           // 2 (da 22 und 10 vom Typ `int`)

  /* "Hello" + "Bla" +  2  =
       "HelloBla"    +  2  =
       "HelloBla"    + "2" =
          "HelloBla2"
   */
  "Hello" + "Bla" + 2               // "HelloBla2"

  true && false && (true || false)  // false
  true + "false"                    // "truefalse"
  "false" + true                    // "falsetrue"

  // Nicht korrekt: char speichert nur ein Zeichen
  'hi' + "ho"

  2 * 3 + 4                         // 10

  /* Annahme:
      - int zehn = 10;
      - double pi = 3.1415;
  */
  zehn + zehn                      // 20
  "zehn" + "zehn"                  // "zehnzehn"

  // Nicht korrekt: Zahl durch String ergibt keinen Sinn
  zehn / "zehn"
  zehn + " Zehen"                  // "10 Zehen"

  "Zehen Anzahl: " + zehn          // "Zehen Anzahl: 10"
  zehn / 3                         // 3
  zehn / pi                        // 3.18…
  ```
