# Aufgaben

## Programm — ZweiDreiTeilbar1

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

[Lösung](../Code/ZweiDreiTeilbar1.java)

## Programm — ZweiDreiTeilbar2

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

[Lösung](../Code/ZweiDreiTeilbar2.java)

## Wiederholungsfragen

- Wie unterscheiden sich Anweisungen (Statement, Befehl) und Ausdrücke (Expression)?

- Handelt es sich bei den folgenden Code um eine Anweisung oder einen Ausdruck? Hinweis: Strichpunkte wurden weggelassen, damit es nicht sofort ersichtlich ist wann es sich um einen Ausdruck oder Anweisung handelt.

  ```java
  System.out.println("Hi")
  1337
  true && var
  a = 10
  if (true)
  (10 + 3) * 20
  ```

- Sind folgende Ausdrücke gültig. Falls ja: Welche Wert und Type haben sie?

  ```java
  double a = 123.4;
  boolean wahr = false;
  int one = 1;

  "a" + 'b'               // Gültig:
                          // Ergebnis:
                          // Typ:

  (1 + a) != 2            // Gültig:
                          // Ergebnis:
                          // Typ:

  2 <= 3 || 2 >= 3        // Gültig:
                          // Ergebnis:
                          // Typ:

  "Bla" + (2 < 3)         // Gültig:
                          // Ergebnis:
                          // Typ:

  1341252142 % 2          // Gültig:
                          // Ergebnis:
                          // Typ:


  (wahr && true) < false  // Gültig:
                          // Ergebnis:
                          // Typ:

  // Tricky! Bitte solchen Code nie verwenden!
  (one++) + (--one) - (1) // Gültig:
                          // Ergebnis:
                          // Typ:
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

- Welchem Zweck dienen geschwungene Klammern (`{}`)? Kann man diese manchmal weglassen? Falls ja, wann?

[Lösungen](Programmkonstruktion [Lösungen 4] Abfragen.md)
