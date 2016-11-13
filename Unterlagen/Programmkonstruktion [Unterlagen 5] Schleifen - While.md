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
