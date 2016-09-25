# Korrektur

- Primitiver Boolean-Datentyp verwendet Keyword `boolean` nicht `bool`!

# Wiederholungsfragen

- Wie unterscheiden sich Anweisungen (Statement, Befehl) und Ausdrücke (Expression)?

Ausdruck ergibt Wert. Kann Teil einer Anweisung sein

- Handelt es sich bei den folgenden Code um eine Anweisung oder einen Ausdruck? Hinweis: Strichpunkte wurden weggelassen, damit es nicht sofort ersichtlich ist wann es sich um einen Ausdruck oder Anweisung handelt.

```java
        System.out.println("Hi")  // Anweisung
        1337                      // Ausdruck Typ: int
        true && var               // Ausdruck Typ: boolean
        a = 10                    // Anweisung
        if (true)                 // Anweisung
        (10 + 3) * 20             // Ausdruck Typ: int
```

- Sind folgende Ausdrücke gültig. Falls ja: Welche Wert und Type haben sie?

```java
    double a = 123.4;
    boolean wahr = false;
    int one = 1;

    "a" + 'b'               // Gültig:   Ja
                            // Ergebnis: "ab"
                            // Typ:      String

    (1 + a) != 2            // Gültig:   Ja
                            // Ergebnis: false
                            // Typ:      boolean

    2 <= 3 || 2 >= 3        // Gültig:   Ja
                            // Ergebnis: true
                            // Typ:      boolean

    "Bla" + (2 < 3)         // Gültig:    Ja
                            // Ergebnis:  "Blatrue"      Nicht "Bla(2<3)"
                            // Typ:       String

    1341252142 % 2          // Gültig:    Ja
                            // Ergebnis:  0
                            // Typ:       int

    (wahr && true) < false  // Gültig:    Nein
                            // Ergebnis:  -
                            // Typ:       -

    // Tricky! Bitte solchen Code nie verwenden!
    (one++) + (--one) - (1) // Gültig:   Ja
                            // Ergebnis:      Nicht 5 (3 + 3 - 1)
                            // Typ:      int
    // 1. Erster Teilausdruck: 1
    // 2. In `one` steht jetzt 2  „one++ ähnlich one = one + 1“
    // 3. Zweiter Ausdruck:    1
    // 4. In `one` steht jetzt 1
    // 5. Ergebnis:   1 + 1 - 1 = 1

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

Ausgabe: Gar nichts

- Welchem Zweck dienen geschwungene Klammern (`{}`)? Kann man diese manchmal weglassen? Falls ja, wann?

- Dienen zum „zusammenfassen“ von mehreren Anweisungen
- Weglassen kann man sie wenn man eine/gar keine Anweisung hat

# Schleifen (Loops)

- Dienen wie `if`-Abfragen der Kontrolle des Programmflusses.
- Der Programmfluss gibt Auskunft darüber welche Anweisung als nächstes ausgeführt wird.
- Zu Erinnerung: `if` dient zur „Verzweigung“ des Programmflusses.

```java
    if (boolscher Ausdruck) {
        // erster Zweig: Anweisungen die ausgeführt werden falls
        //               boolscher Ausdruck `true` ist
    } else {
        // zweiter Zweig: Anweisungen die ausgeführt werden falls
        //                boolscher Ausdruck `false` ist
        // `else` ist optional! `if` ohne `else` möglich.
        // Umgekehrt – `else` ohne `if` – ist das nicht der Fall!
    }
```

- Schleifen dienen dazu Code mehrfach auszuführen. Dabei kann es auch vorkommen, dass der Code in einer Schleife gar nicht (also 0 mal) ausgeführt wird.
- Grundsätzlich gibt es in Java 3 verschiedene Arten von Schleifen:
    - **While-Schleife**: `while() {}`
    - **Do-While-Schleife**: `do {} while;`
    - **for-Schleife**: `for(;;) {}`
- Jede der vorigen Arten kann durch ein wenig Änderung am Code in einer der anderen Arten umgewandelt werden.

## While-Schleife

### Aufbau

```java
    while (boolscherAusdruck) {
        // Code der ausgeführt wird solange `boolscher Ausdruck `true` ist
    }
```

### Beispiel

```java
    int number = 10;

    /*
      Schleifenkopf:   `while ()`
      Schleifenkörper: Alles zwischen geschwungenen Klammern: `{ .. }`

    */
    while (number > 0) {
        System.out.println(number + " kleine Jägermeister");
        number = number - 1; // Geht genauso: number--;
    }
```

Ausgabe:

    10 kleine Jägermeister
    9 kleine Jägermeister
    8 kleine Jägermeister
    7 kleine Jägermeister
    6 kleine Jägermeister
    5 kleine Jägermeister
    4 kleine Jägermeister
    3 kleine Jägermeister
    2 kleine Jägermeister
    1 kleine Jägermeister

### Übung

#### JaegerMeister

Wie kann man den obigen Code ändern, damit die letzte Zeile grammatisch korrekt ist, also „1 kleiner Jägermeister“ ausgegeben wird?

#### SiebenUndZwanzigWhile

Ein Programm soll die durch 7 oder 20 teilbaren Zahlen von 0 bis zu einer vorgegeben Grenze (Variable `obereGrenze`) ausgeben.

Beispiel-Ausgabe (`obereGrenze = 21`):

    0
    7
    14
    20
    21

## Do-While Schleife

- Ähnlich wie While-Schleife
- Einziger Unterschied: Code in Schleifenkörper wird auf jeden Fall einmal ausgeführt.

### Aufbau

```java
    do {
        // Code der zumindest einmal ausgeführt wird. Danach wird der Code
        // ausgeführt solange `boolscher Ausdruck `true` ist
    } (boolscherAusdruck);
```

### Beispiel

```java
    do {
        System.out.println("Hi");
    } while (false);
```

Ausgabe:

    Hi

### Übung

Wie kann man die folgende allgemeine Form einer Do-While-Schleife in eine While-Schleife umwandeln?

```java
    do {
        Statement 1; // Beliebiges Statement 1
        Statement 2; // Beliebiges Statement 2
        …
        Statement n; // Beliebiges Statement n
    } while (boolscher Ausdruck) // In den Klammern steht irgendein
                                 // beliebiger boolscher Ausdruck
```

## For-Schleife

- Diese Form der Schleife kommt besonders oft vor wenn eine Zählvariable benötigt wird.
- **Zählvariable**: Variable die Wert speichert der während der Schleifen-Ausführung erhöht oder dekrementiert wird.
    - **Beispiel:** Variable die (indirekt) speichert wie oft eine Schleife ausgeführt wird.
    - Bei der while-Schleife von vorher ist `number` die Zählvariable.
- Programmfluss dieser Schleife ist – vor allem am Anfang – nicht besonders intuitiv
- Kommt trotzdem sehr häufig vor

### Aufbau

```java
    // Initialisierung wird genau am Anfang einmal ausgeführt
    // Ausdruck wird jeweils nach dem Code im Schleifenkörper ausgeführt
    for (Initialisierung; boolscher Ausdruck; Ausdruck) {
        // Code der ausgeführt wird solange `boolscher Ausdruck `true` ist
    }
```

In While-Schleife umgewandelt:

```java
    Initialisierung;
    while (boolscher Ausdruck) {
        // Code der ausgeführt wird solange `boolscher Ausdruck `true` ist
        Ausdruck;
    }
```

### Beispiele

```java
    for (int number = 10; number > 0; number--) {
        System.out.println(number + " kleine Jägermeister");
    }
```

Ausgabe:

    10 kleine Jägermeister
    9 kleine Jägermeister
    8 kleine Jägermeister
    7 kleine Jägermeister
    6 kleine Jägermeister
    5 kleine Jägermeister
    4 kleine Jägermeister
    3 kleine Jägermeister
    2 kleine Jägermeister
    1 kleine Jägermeister

Die Teile zwischen den Strichpunkten können auch weggelassen werden:

```java
    // Endlos-Schleife: Gibt unendlich oft „Hi“ aus.
    // Wenn boolscher Ausdruck nicht vorhanden, dann wird automatisch
    // `true` angenommen!
    for(;;) {
        System.out.println("Hi");
    }
```

Ausgabe:

    Hi
    Hi
    …

Code von vorher nur ein wenig anders angeschrieben:

```java
    int number = 10;
    for (; number > 0; number--) {
        System.out.println(number + " kleine Jägermeister");
    }
```

Ausgabe:

    10 kleine Jägermeister
    9 kleine Jägermeister
    8 kleine Jägermeister
    7 kleine Jägermeister
    6 kleine Jägermeister
    5 kleine Jägermeister
    4 kleine Jägermeister
    3 kleine Jägermeister
    2 kleine Jägermeister
    1 kleine Jägermeister

### Übung

#### QuadNumbers

Ein Programm soll die Quadratzahlen zwischen zwei Werten `untereGrenze` und `obereGrenze` ausgeben. Zu diesem Zweck soll eine for-Schleife verwendet werden.

Beispiel-Ausgabe (unterGrenze = 10, obereGrenze = 15):

    Quadrat von 10: 100
    Quadrat von 11: 121
    Quadrat von 12: 144
    Quadrat von 13: 169
    Quadrat von 14: 196
    Quadrat von 15: 225

Beispiel-Ausgabe (untereGrenze = 10, obereGrenze = 9):

#### UnevenSum

Ein Programm soll die Summe aller ungeraden Zahlen zwischen den Variablen `low` und `high` ermitteln und ausgeben. Verwende dafür eine Schleife deiner Wahl.

Beispiel-Ausgabe (low = 3, high = 10)

    Summe der ungeraden Zahlen [3, 10]: 24

Beispiel-Ausgabe (low = 123, high = 456)

    Summe der ungeraden Zahlen [123, 456]: 48263
