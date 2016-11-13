# Switch/Case

- Alternative Möglichkeit um auf verschiedene Bedingungen reagieren zu können (Abfrage)
- Übliche Version von `switch/case` (mit `break`) kann immer durch `if/else` ersetzt werden
- **Achtung:** Wenn man `break` vergisst, kann das unvorhergesehene Auswirkungen haben. Programmausführung geht dann einfach zur nächsten `case`-Anweisung!
- Persönliche Empfehlung: Nicht/Nur in bestimmten Fällen verwenden

## Aufbau

```java
switch (Ausdruck) {
    case Wert1:
        // Code der ausgeführt wird wenn `Ausdruck` den Wert `Wert1` hat
        break;
    case Wert2:
        // Code der ausgeführt wird wenn `Ausdruck` den Wert `Wert2` hat
        break;
    case Wert3:
        …

    default:
        // Code der ausgeführt wird wenn `Ausdruck` keiner der
        // vorhergehenden Werte besitzt

        break; // `break` hier eigentlich nicht nötig, da letzte
               // Möglichkeit in `switch-case`
}
```

## Beispiele

```java
int number = 3;
switch (number) {
    case 1:
        System.out.println("Der Wert von number ist 1.");
        break;
    case 3:
        System.out.println("Der Wert von number ist 3.");
        break;
    default:
        System.out.println("Der Wert von number ist weder 1 noch 3.");
        break;
}
```

Ausgabe:

```
Der Wert von number ist 3.
```

---

```java
int number = 3;
switch (number) {
    case 1:
        System.out.println("Der Wert von number ist 1.");
        break;
    case 3:
        System.out.println("Der Wert von number ist 3.");
        // ← Kein `break`! Programmfluss geht deswegen den gewohnten
        // Gang von links nach rechts und oben nach unten.
        // Dementsprechend wird `default` als nächstes ausgeführt.
    default:
        System.out.println("Der Wert von number ist weder 1 noch 3.");
}
```

Ausgabe:

```
Der Wert von number ist 3.
Der Wert von number ist weder 1 noch 3.
```
