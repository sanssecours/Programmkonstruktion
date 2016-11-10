# Wiederholungsfragen

- Welche 3 (oder mehr) Eigenschaften besitzt einer Variable?

  - Datentyp (z.B. `String`, `Integer`, `float`, `double`)
  - Wert (z.B. `1`, `33`, `"schwarz"`, `1.13`)
  - Name (z.B. `zahl`, `var`, `maximum`, `counter`)

- Wie deklariert man eine Variable? (Wie definiert man eine Variable ohne ihr einen Wert zu geben?)

  ```java
  // Datentyp Name
  int ergebnis;
  ```

- Wie verändert/setzt man den Wert einer Variable (allgemein)?

  ```java
  ergebnis = 3;
  ```

- Welche (Daten-)Typen haben die folgenden Werte?

  ```java
  1       // int
  true    // boolean
  20.3    // double
  -30.3   // double
  'a'     // char
  "a"     // String
  ```

- Welches Problem gibt es im folgenden Programm?

  ```java
  public class Tmp {
      public static void main(String[] args) {
          a = 20; // Datentyp fehlt
          System.out.print(a);
      }
  }
  ```

- Mit welcher Methode gibt man Werte aus?

  ```java
  System.out.println()
  ```

- Für welchen “Typ” steht `void`?

  - Steht für „gar nichts“

- Wie definiert man einen einzeiligen Kommentar?

  ```java
  // einzeiliger Kommentar
  ```

- Wie definiert man einen mehrzeiligen Kommentar?

  ```java
  /* mehrzeiliger
     Kommentar */
  ```

- Welchen Zweck haben Kommentare?

  - Um bestimmte Stellen im Programm zu erklären.

- Ändern Kommentare etwas am Programmverhalten?

  - Nein

# Ausdrücke (Expressions)

- Können zu Wert ausgewertet werden (wenn Werte von Variablen in Expression) bekannt
- Ausdrücke können aus
  - Werten (`"Hello"`, `2`, `'a'`, `10`, `20.3`)
  - Operatoren (`+`, `-`, `*`, `/`, …)
  - Klammern
  - Funktionsaufrufen (mit Rückgabetyp, also kein `void`)
    // kennen wir noch nicht so gut
  - Casts…                              (noch nicht besprochen)
  - …
  bestehen.
- Können Teil einer Anweisung (Statements) sein

  ```java
  System.out.println("Hi"); // Das Ganze ist Anweisung/Statement (Befehl)
                            // "Hi" ist Ausdruck (Expression)
  ```

## Beispiele:

```java
12                  // 12
30 * 2              // 60
variable / 10       // Abhängig von Wert von `variable`
Math.abs(-2)        // Math.abs ist Funktion die Absolutwert zurückliefert
                    // hier: 2
Math.abs(-2) + 20   // 18
var1 * 2            // Abhängig von Wert von `var1`
true || false       // `||` steht für logische „Oder“; true
true && false       // `&&` steht für logische „Und“; false
2 < 3               // true
2 == 3              // `==` vergleicht auf Gleichheit
                    // nicht mit `=` (Zuweisung) verwechseln
"Hello " + "World"  // "Hello World"

/* Annahme: int x = 1; */
// ++ (Increment um 1), -- (Decrement um 1)

System.out.println(x++);  // 1
System.out.println(x);    // 2

System.out.println(++x);  // 3
System.out.println(x);    // 3

System.out.println(x--);  // 3
System.out.println(x);    // 2
```

---

**Anmerkung:** `+` bei Strings

Ausdruck von Form

    string + wert

oder

    wert + string

Hier wird `wert` automatisch in String umgewandelt.

Beispiele:

```java
"Hi " + 12 // "Hi 12"
12 + "Hi"  // "12Hi"
```

---

## Übung

- Welche der folgenden Ausdrücke sind „korrekt“ (ergeben ein Wert)? Wie lautet der Wert bzw. wo liegt das Problem?

  ```java
  true - 10                         // Nein:
                                    // Boolean - int funktioniert nicht

  20 / 10                           // 2
  22 / 10                           // 2 (weil 22 und 10 vom Typ `int`)

  "Hello" + "Bla" + 2
  //   "HelloBla" + 2
  // = "HelloBla" + "2"
  // = "HelloBla2"

  true && false && (true || false)  // false
  true + "false"                    // "truefalse"
  "false" + true                    // "falsetrue"
  'hi' + "ho"                       // Nein: char speichert
                                    // nur ein Zeichen

  2 * 3 + 4                         // 10

  /* Annahme:
      - int zehn = 10;
      - double pi = 3.1415;
  */
  zehn + zehn                      // 20
  "zehn" + "zehn"                  // "zehnzehn"
  zehn / "zehn"                    // Nein: Zahl durch String
                                   // macht keinen Sinn
  zehn + " Zehen"                  // "10 Zehen"
  "Zehen Anzahl: " + zehn          // "Zehen Anzahl: 10"
  zehn / 3                         // 3
  zehn / pi                        // 3.18…
  ```

# Bedingte Anweisungen (`if`)

- Bisher:
  - Anweisungen werden einfach der Reihe nach durchgeführt
  - Keine Möglichkeit unterschiedlich auf bestimmten Unterschied zu reagieren
- Abhilfe: `if`-Statement

## Aufbau

```java
if (/*boolscher Ausdruck*/) {
   // Anweisungen die ausgeführt werden wenn boolscher Ausdruck `true` ergibt
}
```

Optional auch `else`-Zweig möglich:

```java
if (/* boolscher Ausdruck */) {
   // Anweisungen die ausgeführt werden wenn boolscher Ausdruck `true` ergibt
} else {
  // Anweisungen die ausgeführt werden wenn boolscher Ausdruck `false` ergibt
}
```

Reagieren auf mehr als zwei Möglichkeiten:

```java
if (boolscherAusdruck1) {
  // Anweisungen die ausgeführt werden wenn boolscherAusdruck1 `true` ergibt
} else if (boolscherAusdruck2) {
  // Anweisungen die ausgeführt werden wenn boolscherAusdruck1 `false`
  // und boolscherAusdruck2 `true` ergibt
} else {
  // Anweisungen die ausgeführt werden wenn boolscherAusdruck1 und
  // boolscherAusdruck2 `false` sind
}


if (boolscherAusdruck1) {
  // Anweisungen die ausgeführt werden wenn boolscherAusdruck1 `true` ergibt
}
else {
  if (boolscherAusdruck2) {
    // Anweisungen die ausgeführt werden wenn boolscherAusdruck1 `false`
    // und boolscherAusdruck2 `true` ergibt
  } else {
    // Anweisungen die ausgeführt werden wenn boolscherAusdruck1 und
    // boolscherAusdruck2 `false` sind
  }
}
```

## Beispiele

```java
int zahl = 2
// Operator `%` = Modulo (Rest von ganzzahliger Division)
// Beispiele:
//  10 % 4 = 2
//  8 % 3 = 2
//  20 % 5 = 0
if (zahl % 2 == 0) {
    System.out.println("Zahl ist gerade.");
} else {
    System.out.println("Zahl ist ungerade.");
}
```

Ausgabe: Zahl ist gerade

```java
int zahl = 100;
if (zahl < 10) {
    System.out.println("Zahl ist kleiner wie 10.");
} else if (zahl < 100){
    System.out.println("Zahl ist kleiner wie 100.");
} else {
    System.out.println("Zahl ist größer gleich wie 100.")
}
```

Ausgabe: Zahl ist größer gleich wie 100.

Alternative Schreibweise des Programms von oben:

```java
int zahl = 100;
if (zahl < 10) {
    System.out.println("Zahl ist kleiner wie 10.");
} else {
    if (zahl < 100){
        System.out.println("Zahl ist kleiner wie 100.");
    } else {
        System.out.println("Zahl ist größer gleich wie 100.")
    }
}
```

Genau der gleiche Code! Einzelne Anweisungen sind Sonderfall!

Code 1:

```java
if (2 < 3) {
  System.out.println("2 kleiner wie 3");
}
```

Code 2:

```java
if (2 < 3) System.out.println("2 kleiner wie 3");
```

„Code 1“ und „Code 2“ sind äquivalent

## Übung

### 1. Beispiel (ZweiDreiTeilbar1)

Schreib ein Programm, dass ausgibt ob eine Zahl ganzzahlig durch 2, durch 3 oder durch keine der beiden Zahlen teilbar ist.

Beispiel-Ausgaben:

- Zahl = 20

```
  Zahl ist durch 2 teilbar.
```

- Zahl = 6

```
  Zahl ist durch 2 teilbar.
  Zahl ist durch 3 teilbar.
```

- Zahl = 5

```
  Zahl ist weder durch 2 noch durch 3 teilbar.
```


**Hinweis:**

```java
  == // Vergleich auf Gleichheit
  != // „ungleich“
```

### 2. Beispiel (ZweiDreiTeilbar2)

Verändere das Programm so, dass sich folgende Ausgabe ergibt:

- Zahl = 20

  ```
  Zahl ist durch 2 teilbar.
  ```

- Zahl = 6

  ```
  Zahl ist durch 2 und 3 teilbar.
  ```

- Zahl = 5

  ```
  Zahl ist weder durch 2 noch durch 3 teilbar.
  ```
