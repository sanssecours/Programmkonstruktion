# Variablen

Welche Eigenschaften hat eine Variable

- Name (aussagekräftig!)
- Datentyp
   - Text (`String`)
- Wert z.B. `"Hello World"`

Beispiele:

```java
String        // Datentyp
a             // Name
=
"Hello World" // Wert
;

String a = "Hello World"; // Gleich wie oben

String a;                 // Deklaration
a = "Hello World";        // Wert-Zuweisung
                          // Gleich wie oben
```

## Datentyp

### String

Text, eine Folge von Buchstaben, Zum Definieren `""` verwenden

### Character, char

Beispiel:

```java
char buchstabe1 = 'x';
char buchstabe2 = 'xa';   // Geht nicht, da kein einzelner Buchstabe
String buchstaben = "xa"; // So geht es
```

### Integer, int

- Ganzzahl
- Beispiel: `1`
- Unterschied zwischen `int` und `Integer`:
  - `int` (primitiver Datentyp, kleiner Anfangsbuchstabe)
  - `Integer` (Klasse (Objekt), kann „mehr” = Methoden darauf definiert)

```java
int zahl1 = 15;
zahl1. … // geht nicht

Integer zahl2 = 15;
zahl2.toHexString() // wandle die Zahl in die
                    // Hexadezimalzahl-Darstellung um ("F")
```

### Float, float, Double, double

- Unterschied zwischen `float`, `Float` und `double`, `Double` ist der Datenbereich (`Double`-, `double`-Zahlen sind genauer)
- `float`, `double` (Primitive Datentypen)
- `Float`, `Double` (Klassen)

```java
double zahl3 = 2.3;
```

### Boolean, boolean

- Mögliche Werte: `true`, `false`

# Aufgabe

1. Definiere eine Ganzzahl-Variable mit Name `ganzzahl`
2. Definiere eine Fließkomma-Variable fliesskomma mit Wert `12.34`
3. Definiere eine neue Fließkomma-Variable `ergebnis` ohne Wert
4. Speichere in ergebnis die Summe von `fliesskomma` und `ganzzahl`
5. Gib `ergebnis` auf Bildschirm aus

```java
// 1.
int ganzzahl;
// 2.
float fliesskomma = 12.34; //geht nicht wegen Genauigkeit
double fliesskomma = 12.34;
// 3.
float ergebnis;
// 4.
ergebnis = fliesskomma + ganzzahl;
// 5.
System.out.println(ergebnis);
```
