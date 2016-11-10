# Wiederholungsfragen

- Welche Klasse kann man zum Einlesen von Werten in Java verwenden?

  Scanner

- Was ist der (grobe) Unterschied zwischen einer Klasse und einem Objekt?

  Klasse:  Schablone  (z.B. Auto)
  Objekt: Konkrete Instanz (z.B. VW Golf; silber; Nummerntafel “xyz 123”)

- Zu welchem Zweck werden eckige Klammern (`[]`) in Java verwendet?

  Für Arrays

- Was bedeutet der Begriff „Seiteneffekt“?

  Seiteneffekt: Es gibt gewissen Zustand; durch Berechnungen ergibt sich Zustandsänderung, diese kann zu unterschiedlichen Ergebnissen führen

- Sind die folgenden Ausdrücke gültig? Falls ja, wie lautet ihr Wert und Typ? Verursachen die Ausdrücke Seiteneffekte oder nicht?

```java
    int forty = 40;

    True "||" False ? 1 : 2         // Gültig: Nein
                                    // Wert:
                                    // Typ:
                                    // Seiteneffekt:

    2 + 3 < 5 ? true || false :
                false && true       // Gültig: Ja
                                    // Wert: false
                                    // Typ: boolean
                                    // Seiteneffekt: Nein

    (true ? true : false) && true   // Gültig: Ja
                                    // Wert: true
                                    // Typ: boolean
                                    // Seiteneffekt: Nein

    forty++ - forty-- +
    (1 < 1 ? 2 : 4) + --forty       // Gültig: Ja
                                    // Wert: 42
                                    // Typ: int
                                    // Seiteneffekt: Ja
    // 40 - 41 + 4 + 39 = 42


    forty = 40;

    // `forty-=40` ist das gleiche wie `forty = forty - 40`
    (forty -= 39) + 2 + forty       // Gültig: Ja
                                    // Wert: 4
                                    // Typ: int
                                    // Seiteneffekt: Ja
    // 1 + 2 + 1

    1 ? 2 : 3                       // Gültig: Nein
                                    // Wert:
                                    // Typ:
                                    // Seiteneffekt:
```

- Was gibt das folgende Programm aus

```java
public class Tmp {
    public static void main(String[] args) {
        System.out.println(args[1] + args[3] + args[3] + args[2]);
    }
}
```

wenn wir es wie folgt aufrufen?

```bash
java Tmp '1 4' 1 7 3
#          0   1 2 3
```

Ausgabe:

```
1337
```

- Für welchen Begriff steht die Abkürzung `API`?

  Application Programming Interface

# Switch/Case

- Alternative Möglichkeit um auf verschiedene Bedingungen reagieren zu können (Abfrage)
- Übliche Version von `switch/case` (mit `break`) kann immer durch `if/else` ersetzt werden
- **Achtung:** Wenn man `break` vergisst, kann das unvorhergesehene Auswirkungen haben. Programmausführung geht dann einfach zur nächsten `case`-Anweisung!
- Persönliche Empfehlung: Nicht verwenden

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
