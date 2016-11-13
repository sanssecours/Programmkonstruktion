# Break/Continue

- Zusätzliche Keywords für Schleifen: `continue` und `break`
- `continue`: Programmausführung springt zu Anfang von Schleife
- `break`: Programmausführung geht zur Anweisung außerhalb der Schleife
- Meist wird vom **Einsatz beider Konstrukte abgeraten**, da sie die Komplexität des Programmflusses einer Schleife deutlich erhöhen!
- In der Praxis wird `break` manchmal verwendet. `continue` kommt praktisch nie zum Einsatz.

## Beispiele

```java
do {
    System.out.println(1);
    break;
    System.out.println(2);
} while (true);
System.out.println(3);
```

Ausgabe:
```
1
3
```

---

```java
for (int number = 1; number <= 10; number++) {
    if (number % 2 == 0) {
        continue;
    }
    System.out.println(number);
}
```

Ausgabe:
```
1
3
5
7
9
```

---

```java
for (int number = 1; number <= 10; number++) {
    if (number % 2 == 0) {
        break;
    }
    System.out.println(number);
}
```


```
1
```
