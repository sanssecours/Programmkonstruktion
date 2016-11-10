# Wiederholungsfragen

-  Was ist der Unterschied zwischen primitiven Datentypen und (Objekt-)Datentypen in Java?

primitive Datentypen: kleingeschrieben,
Objekt-Datentypen: Camelcase, Methoden darauf definiert

```java
        // Funktioniert:
        Integer number = 3;
        System.out.print(4 / number.floatValue()); // 1.3333334

        // Funktioniert nicht (keine Methoden bei primitiven Datentypen):
        int number = 3;
        System.out.print(4 / number.floatValue()); // 1.3333334
```

- An Hand welcher Eigenschaft der Schreibweise kann man primitive und nicht primitive Datentypen unterscheiden?

- Wie unterscheiden sich Ausdrücke und Anweisungen (Statements) voneinander?

Anweisungen: Führen etwas aus, Getrennt durch Strichpunkt
Ausdrücke: Können in Anweisungen enthalten, ergibt bestimmten **Wert**

- Welches Zeichen wird in Java zum trennen von Anweisungen verwendet?

- Welche (zwei) Zeichen werden in Java zur „Zusammenfassung“ mehrerer Statements verwendet? Wann kann man diese Zeichen auch weglassen?

Geschwungene Klammer, Weglassen bei einem oder 0 Statements

- Wie muss der Dateiname einer Klasse mit dem Namen `BlaBlaKlasse` lauten?

`BlaBlaKlasse.java`

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

    -3
    2
    -1
    0
    1
    2
    3

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

- **Name der Funktion**: maximum
- **Parameter**:
  - Anzahl: 2
  - Name(n): number1, number2
  - Type(n): int, int
- Was macht die Funktion?

Gibt die größere Zahl zurück (Maximum).

## Aufbau (Aufruf)

```
  Name(Werte für Eingabewerte) // Achtung!: - Nur Werte (Ausdrücke)
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
