# Wiederholungsfragen

- Nenne mindestens **vier verschiedene (Daten-)Typen** und gib jeweils ein Beispiel für einen Wert des gegebenen Typs.

  1.
    - Typ:
    - Beispiel für Wert:

  2.
    - Typ:
    - Beispiel für Wert:

  3.
    - Typ:
    - Beispiel für Wert:
  4.
    - Typ:
    - Beispiel für Wert:

- Bei einer **Variablendeklaration** legt man welche zwei Eigenschaften einer Variable fest? Bei der **Variablendefinition** legt man welche zusätzliche Eigenschaft einer Variable fest? Wie sieht eine Variablendeklaration/definition in Java aus?

  - Variablendeklaration
    - Eigenschaft:
    - Eigenschaft:
    - Beispiel:

  - Variablendefinition
    - Eigenschaft:
    - Beispiel:

- Welche der folgenden Ausdrücke ist gültig? Falls der Ausdruck gültig ist, welchen Wert und Typ hat der Ausdruck

```java
    int zehn = 10;
    int one = 1;

    /* Hinweis: `+` hat höhere Priorität (bindet stärker, wird vorher
     *           ausgeführt) als `<`
     */
    10 < 3 + 2              // Gültig:
                            // Wert:
                            // Typ:

    /* Hinweis: `&&` bindet stärker als `||` */
    true || false && false  // Gültig:
                            // Wert:
                            // Typ:

    /* Hinweis: `%` bindet stärker als `>` */
    121282340 % 10 >= 3     // Gültig:
                            // Wert:
                            // Typ:

    (10 + false) + "Hi"     // Gültig:
                            // Wert:
                            // Typ:

    12 || 3                 // Gültig:
                            // Wert:
                            // Typ:

    /* Hinweis: `++` und `--` binden stärker als `+` */
    zehn++ - zehn-- + --zehn + ++one + " Zehen" // Gültig:
                                                // Wert:
                                                // Typ:
```

- Was bedeutet der Begriff „Programmfluss“?

- Wozu benötigt man Schleifen?

- Wozu benötigt man Abfragen?

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
- Einziger Unterscheid: Code in Schleifenkörper wird auf jeden Fall einmal ausgeführt.

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
    } while (boolscherAusdruck) // In den Klammern steht irgendein
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
    for (Initialisierung; boolscherAusdruck; Schritt) {
        // Code der ausgeführt wird solange `boolscher Ausdruck `true` ist
    }
```

In While-Schleife umgewandelt:

```java
    Initialisierung;
    while (boolscherAusdruck) {
        // Code der ausgeführt wird solange `boolscher Ausdruck `true` ist
        Schritt;
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

# Funktionen (Methoden)

- Dienen dazu Code in kleinere überschaubare Einheiten zu kapseln
- Ähnlich wie mathematische Funktionen
  - mehrere Eingabeparameter (kann sich auch um 0 Eingabeparameter handeln)
  - ein Wert wird zurückgegeben (wenn man nichts zurückgeben will einfach `void` verwenden)
- Java-Funktionen sind aber „mächtiger“ als mathematische Funktionen
  - können auch **Seiteneffekte** haben (gleiche Eingabewerte können zu unterschiedlichem Ergebnis/Ausgabe führen)
  - Mathematische Funktionen haben keine Seiteneffekte: gleiche Eingabe führt immer zu gleicher Ausgabe (egal wie oft, wann man Funktion verwendet)

## Aufbau (Definition)

```java
    KeyWords RückgabeTyp Name (Eingabeparameter) {
        // Implementierung der Funktion
    }
```

- **Keywords:** mehrere durch Leerzeichen getrennte Schlüsselwörter (optional)
- **Rückgabetyp:** Typ des Wertes der von der Funktion „retuniert“ wird
- **Name**: Name der Funktion
- **Eingabeparameter**:
  - Paare von Typ und Name (der Variable) durch Leerzeichen getrennt:
    - Beispiel: `String[] args` (Typ: `String[]`, Name: `args`)
  - Bei mehreren Eingabeparametern: Trennung durch Beistrich
    - Beispiel: `(int var1, String var2, double huhu)`

---
### Keywords (Schlüsselwörter)

- Schlüsselwörter mit bestimmter Bedeutung
- Können nicht direkt als Variablennamen verwendet werden
- Wir kennen schon einige Schlüsselwörter:
  - Typen: `String`, `boolean`, `float`, `int`, …
  - Abfragen: `if`, `else`, `switch`, …
  - Schleifen: `for`, `while`
- Bei Funktionskopf können natürlich nur passende Schlüsselwörter verwendet werden:
  - Sichtbarkeit: `private`, `protected`, `public`
  - Klassenmethode (statt Objektmethode): `static`
  - Andere Schlüsselwörter: `final`,…
---

### Beispiele

```java
    public static void main (String[] arguments) {
        // Code
    }
```

- `public` und `static` sind Keywords (`void` und `String`  auch)
  - `public`: Gibt „Sichtbarkeit“ der Funktion an
  - `static`: Es handelt sich um eine Klassenmethode (im Gegensatz zu einer Objektmethode)
- **Name der Funktion**: `main`
- Die Funktion hat **einen Parameter** `arguments` vom Typ `String[]` (Array („Liste“) von String)
- **Rückgabetyp**: `void`

```java
    static int quad (int number) {
      return number * number;
    }
```

- **Name der Funktion**: `quad`
- Die Funktion hat **einen Parameter** `number` vom Typ `int`
- **Rückgabetyp**: `int`
- `return`: Gibt an, dass der rechts stehende Wert als Ergebnis der Funktion zurückgegeben wird. Es kann auch mehrere Vorkommnisse von `return` in einem Programm geben. Nach `return` springt Programmausführung zur Stelle von Funktionsaufruf zurück.

### Übung

```java
    static int maximum (int number1, int number2) {
        if (number1 >= number2) {
          return number1;
        }
        return number2;
    }
```

- **Name der Funktion**:
- **Parameter**:
  - Anzahl:
  - Name(n):
  - Type(n):
- Was macht die Funktion?

## Aufbau (Aufruf)

```
  Name(Werte für Eingabewete) // Achtung!: - Nur Werte (Ausdrücke)
                              //           - Typen sind schon von
                              //             Funktionsdefinition bekannt
```

### Beispiele

```java
  // Aufruf der Methode `println` des Attributes `out` der Klasse System
  // Ausgabe: 1
  System.out.println(1)

  // Aufruf der Methode `abs` der Klasse `Math`
  // Berechnet den Absolutwert einer Zahl
  // Ergebnis (des Ausdrucks): ?
  Math.abs(-10)

  // Aufruf der vorher definierten Funktion `quad`
  // Ergebnis (des Ausdrucks): ?
  quad(20)

  // Verwendung der Funktion `maximum`
  int a = 0;
  int b = -5
  // Ausgabe: ?
  System.out.println("Maximum von " + a + " und " + b " = " + maximum(a, b))
```

## Übung

Zeit die Aufgaben von Beispielblatt 1 anzusehen!
