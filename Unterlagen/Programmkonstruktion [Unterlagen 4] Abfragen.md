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
