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

## Wiederholungsfragen

- Welche Klasse kann man zum Einlesen von Werten in Java verwenden?

- Was ist der (grobe) Unterschied zwischen einer Klasse und einem Objekt?

- Zu welchem Zweck werden eckige Klammern (`[]`) in Java verwendet?

- Was bedeutet der Begriff „Seiteneffekt“?

- Sind die folgenden Ausdrücke gültig? Falls ja, wie lautet ihr Wert und Typ? Verursachen die Ausdrücke Seiteneffekte oder nicht?

  ```java
      int forty = 40;

      True "||" False ? 1 : 2         // Gültig:
                                      // Wert:
                                      // Typ:
                                      // Seiteneffekt:

      2 + 3 < 5 ? true || false :
                  false && true       // Gültig:
                                      // Wert:
                                      // Typ:
                                      // Seiteneffekt:

      (true ? true : false) && true   // Gültig:
                                      // Wert:
                                      // Typ:
                                      // Seiteneffekt:

      forty++ - forty-- +
      (1 < 1 ? 2 : 4) + --forty       // Gültig:
                                      // Wert:
                                      // Typ:
                                      // Seiteneffekt:
      // 40 - 41 + 4 + 39 = 42


      forty = 40;

      // `forty-=40` ist das gleiche wie `forty = forty - 40`
      (forty -= 39) + 2 + forty       // Gültig:
                                      // Wert:
                                      // Typ:
                                      // Seiteneffekt:
      // 1 + 2 + 1

      1 ? 2 : 3                       // Gültig:
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

- Für welchen Begriff steht die Abkürzung `API`?

[Lösungen](Programmkonstruktion [Lösungen 15] Break:Continue.md)
