# Aufgabe 1

## 2. Warum ist der aus den Variablen erzeugte String nicht gleich der oben vorgegebenen Zeile mit Literalen?

> vorgegebenen Zeile mit Literalen?
> Variablen wurden vorher umgewandelt

Variable speichern nur einen Wert. Das Format in dem die Zahl ursprünglich angegeben wurde (Literal) nicht mitgespeichert. Ansonsten müssten „gleiche“ Zahlen anders gespeichert werden.

Beispiel:

```java
double zahl1 = 42;     // 42.0
double zahl2 = '*';    // 42.0
double zahl3 = 420e-1; // 42.0
```

Ausgabe von Werten in anderem Format z.B. mit `System.out.printf`:

```java
// 2 Stellen vor dem Komma
// 3 Stellen nach dem Komma
// Scientific Notation
System.out.printf("%2.3e\n", zahl1);  // Ausgabe: 4.200e+01

// 2 Stellen vor dem Komma
// 1 Stelle nach dem Komma
// Ausgabe einer Floating Point Number
System.out.printf("%2.1f\n", zahl1);  // Ausgabe: 42.0

// Fülle Stellen vor Komma mit Nullen auf
// 5 Stellen vor dem Komma
// 0 Stellen nach dem Komma
// Ausgabe einer Floating Point Number
System.out.printf("%05.0f\n", zahl1); // Ausgabe: 00042
```

## 5. Wie viel Speicher belegt ein Wert eines elementaren Typs mindestens (je nach Typ)?

> float +/-1,4E-45....+/-3,4E+38,

Wie kommt man hier auf den kleinsten beziehungsweise größten Wert?

- Vorzeichen: 1bit
- Mantisse: 22bit
- Exponent: 8bit (`-128`…`127`)

z.B. Maximaler Wert:

```python
# http://stackoverflow.com/questions/4610999
# 1.MaxMantisse * Basis^(MaxExponent)
# 1.111111111111111111111 * 2^127
# ≅ 2*2^127
2*2**127 == 340282366920938463463374607431768211456
```

# Aufgabe 3

## 4. Sind verschiedene Arten von Schleifen gegeneinander austauschbar? Wenn ja, wie?

- Beispiel: `do-while` → `while`

  ```java
  do {
      Statement 1; // Beliebiges Statement 1
      Statement 2; // Beliebiges Statement 2
      …
      Statement n; // Beliebiges Statement n
  } while (boolscherAusdruck) // In den Klammern steht irgendein
                              // beliebiger boolscher Ausdruck
  ```

  ```java
  Statement 1; // Beliebiges Statement 1
  Statement 2; // Beliebiges Statement 2
  …
  Statement n; // Beliebiges Statement n
  while (boolscherAusdruck) {
      Statement 1; // Beliebiges Statement 1
      Statement 2; // Beliebiges Statement 2
      …
      Statement n; // Beliebiges Statement n
  }
  ```

- Beispiel: `for` → `while`

  ```java
  for(Initialisierung; Bedingung; NachSchleifenDurchlauf) {
    Statements
  }
  ```

  ```java
  Initialisierung;
  while(Bedingung) {
    Statements;
    NachSchleifenDurchlauf;
  }
  ```

# Aufgabe 4

# 3. Ist es immer möglich, bedingte Anweisungen und Ausdrücke durch Schleifen zu ersetzen?

Ja.  Schleifen können auch als kompliziertes `if`-Statement verwendet werden.

Beispiel:

```java
if (Bedingung) {
  Statements;
}
```

kann durch

```java
int done = false;
while(Bedingung && !done) {
  Statements;
  done = true;
}
```

ersetzt werden.

# 4. Warum ist 'simpler' wahrscheinlich kürzer als 'longish', obwohl zur Laufzeit mehr berechnet wird?

Die Laufzeit (Rechenaufwand) von Programmen hängt nicht unbedingt mit deren Länge zusammen.

Beispiel für kurzen Code mit unendlich-langer Laufzeit:

```java
while(true);
```
