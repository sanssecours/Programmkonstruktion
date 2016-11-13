# Ausdrücke (Expressions)

- Können zu Wert ausgewertet werden (wenn Werte von Variablen in Expression) bekannt
- Ausdrücke können aus

  - Werten (`"Hello"`, `2`, `'a'`, `10`, `20.3`)
  - Operatoren (`+`, `-`, `*`, `/`, …)
  - Klammern
  - Funktionsaufrufen (mit Rückgabetyp, also kein `void`)
  - Casts                              (noch nicht besprochen)
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
