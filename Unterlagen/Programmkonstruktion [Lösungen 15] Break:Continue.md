# Aufgaben

## Übung

Wie lautet die Ausgabe des folgenden Programmcodes?

```java
int number = 10;
while(number >= 5) {
    System.out.println(number--);
    if (number > 7) continue;
    break;
}
System.out.println("Done");
```

Ausgabe:

```
10
9
8
Done
```

## Wiederholungsfragen

- Welche Klasse kann man zum Einlesen von Werten in Java verwenden?

  - `Scanner`

- Was ist der (grobe) Unterschied zwischen einer Klasse und einem Objekt?

  - Klasse:  Schablone  (z.B. Auto)
  - Objekt: Konkrete Instanz (z.B. VW Golf; silber; Nummerntafel “xyz 123”)

- Zu welchem Zweck werden eckige Klammern (`[]`) in Java verwendet?

   - Für Arrays

- Was bedeutet der Begriff „Seiteneffekt“?

  - Seiteneffekt:
      - Es gibt einen gewissen Zustand (von Variablen-Werten)
      - Durch Berechnungen ergibt sich eine Zustandsänderung (z.B. `variable++`),
      - Diese Zustandsänderung kann zu unterschiedlichen Ergebnissen  führen, wenn man ein gewisses Codestück mehrmals ausführt.

- Sind die folgenden Ausdrücke gültig? Falls ja, wie lautet ihr Wert und Typ? Verursachen die Ausdrücke Seiteneffekte oder nicht?

  ```java
      int forty = 40;

      True "||" False ? 1 : 2         // Gültig:        Nein
                                      // Wert:
                                      // Typ:
                                      // Seiteneffekt:

      2 + 3 < 5 ? true || false :
                  false && true       // Gültig:        Ja
                                      // Wert:          false
                                      // Typ:           boolean
                                      // Seiteneffekt:  Nein

      (true ? true : false) && true   // Gültig:        Ja
                                      // Wert:          true
                                      // Typ:           boolean
                                      // Seiteneffekt:  Nein

      forty++ - forty-- +
      (1 < 1 ? 2 : 4) + --forty       // Gültig:        Ja
                                      // Wert:          42
                                      // Typ:           int
                                      // Seiteneffekt:  Ja
      // 40 - 41 + 4 + 39 = 42


      forty = 40;

      // `forty-=40` ist das gleiche wie `forty = forty - 40`
      (forty -= 39) + 2 + forty       // Gültig:        Ja
                                      // Wert:          4
                                      // Typ:           int
                                      // Seiteneffekt:  Ja
      // 1 + 2 + 1

      1 ? 2 : 3                       // Gültig:        Nein
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
  # Index:   0   1 2 3
  ```

  Ausgabe:

  ```
  1337
  ```

- Für welchen Begriff steht die Abkürzung `API`?

   - Application Programming Interface
