# Aufgabe

## Aufgabe 2.1

1. Definiere eine Ganzzahl-Variable mit Name `ganzzahl`
2. Speichere den Wert `42` in `ganzzahl`.
3. Definiere eine Fließkomma-Variable fliesskomma mit Wert `12.34`
4. Definiere eine neue Fließkomma-Variable (Datentyp `double`) `ergebnis` ohne Wert
5. Speichere in ergebnis die Summe von `fliesskomma` und `ganzzahl`
6. Gib `ergebnis` auf dem Bildschirm aus

```java
// 1.
int ganzzahl;
// 2.
ganzzahl = 42;
// 3.
double fliesskomma = 12.34; // float funktioniert nicht wegen Genauigkeit
// 4.
double ergebnis;
// 5.
ergebnis = fliesskomma + ganzzahl;
// 6.
System.out.println(ergebnis);
```

## Aufgabe 2.2

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
      // ↓ Hier fehlt die Angabe des Datentyps (int)
          a = 20;
          System.out.print(a);
      }
  }
  ```

- Mit welcher Methode gibt man Werte aus?

  ```java
  System.out.println()
  ```

- Für welchen “Typ” steht `void`?

  - Der Typ `void` steht für „nichts“.

- Wie definiert man einen einzeiligen Kommentar?

  ```java
  // Einzeiliger Kommentar
  ```

- Wie definiert man einen mehrzeiligen Kommentar?

  ```java
  /* Mehrzeiliger
     Kommentar */
  ```

- Welchen Zweck haben Kommentare?

  - Dienen dazu bestimmte Stellen im Programm zu erklären.

- Ändern Kommentare etwas am Programmverhalten?

  - Nein
