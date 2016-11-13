# For-Schleife

- Diese Form der Schleife kommt besonders oft vor wenn eine Zählvariable benötigt wird.
- **Zählvariable**: Variable die Wert speichert der während der Schleifen-Ausführung erhöht oder dekrementiert wird.
    - **Beispiel:** Variable die (indirekt) speichert wie oft eine Schleife ausgeführt wird.
    - Bei der while-Schleife von vorher ist `number` die Zählvariable.
- Programmfluss dieser Schleife ist – vor allem am Anfang – nicht besonders intuitiv
- Kommt trotzdem sehr häufig vor

## Aufbau

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
