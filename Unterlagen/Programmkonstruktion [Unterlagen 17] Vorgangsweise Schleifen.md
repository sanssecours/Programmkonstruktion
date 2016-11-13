# Schleifen

- Dienen zum mehrfachen Ausführen von ähnlichem Code
- Auch wenn es viele verschiedene Möglichkeiten gibt wie man den Code für eine Schleife aufbauen kann, bietet sich meist ein ähnliches Muster an.
- Bevor man mit dem Schreiben der Schleife beginnt, sollte man sich Gedanken über folgende Punkte machen:

  1. Wie sieht ein **einzelner Schritt** aus? Das kann man grob in zwei Teile trennen. Wir nennen die hier mal **Berechnung** und **Aktualisierung**.

     1. **Berechnung:** Was muss in einem einzelnen Schritt getan werden um dem Ergebnis näher zu kommen? Grundsätzlich muss es sich hier nicht um eine reine Berechnung handeln. Zum Beispiel kann hier auch etwas ausgegeben werden oder Ähnliches.
     2. **Aktualisierung:** Wie muss ich Variablen verändern, damit diese für den nächsten Schritt die richtigen Werte annehmen?

  2. Wie lange sollen die Schritte ausgeführt werden? Wie lautet also die **Bedingung**, die angibt wie lange Berechnung und Aktualisierung durchgeführt werden?

# Beispiele

- Bei den folgenden Beispielen verwenden wir immer eine while-Schleife. Grundsätzlich lässt sich das oben festgesetzte Muster aber genauso auf do-While und for-Schleifen umsetzen. Wie wir ja schon wissen, kann man die Schleifen durch ein wenig Code-Veränderung austauschen.

Hier mal das grundsätzliche Muster:

```java
while ( /* Bedingung */ ) {

    /* Berechnung */

    /* Aktualisierung */

}
```

## Quersumme

Die Summe der einzelnen Ziffern einer Zahl soll berechnet werden.

**Beispiel:** Quersumme von 1234  = 10 (4 + 3 + 2 + 1)

1. Schritt
   1. **Berechnung:**
      1. Eine einzelne Ziffer bestimmen
      2. Ziffer zur Quersumme hinzuzählen
   2. **Aktualisierung**
      1. Vorher berechnete Ziffer aus Zahl entfernen
2. **Bedingung:** Der Schritt wird durchgeführt solange es noch zumindest eine Ziffer gibt, die größer wie 0 ist. Das ist dann der Fall wenn die Zahl, von der wir die Quersumme bestimmen wollen, noch größer wie 0 ist.

### Code

1. Muster einsetzen

    ```java
    while ( /* Bedingung */ ) {

        /* Berechnung */

        /* Aktualisierung */

    }
    ```

2. Muster anpassen

    ```java
    while ( /* Bedingung: Solange Zahl größer wie Null */ ) {

        /* Berechnung: 1. Einzelne Ziffer bestimmen
                       2. Ziffer zur Quersumme hinzuzählen */


        /* Aktualisierung: Vorher berechnete Ziffer aus Zahl entfernen */

    }
    ```

3. Code einfügen

    ```java
    int zahl = 1234;
    int querSumme = 0;
    int ziffer;

    while ( zahl > 0 /* Bedingung: Solange Zahl größer wie Null */ ) {

        /* Berechnung: 1. Einzelne Ziffer bestimmen
                       2. Ziffer zur Quersumme hinzuzählen */
        ziffer = zahl % 10;
        querSumme += ziffer;

        /* Aktualisierung: Vorher berechnete Ziffer aus Zahl entfernen */
        zahl /= 10;
    }
    ```

## Fakultät

Die Fakultät einer Zahl soll berechnet werden.

**Beispiel:** Fakultät von 6 = 720 (6 * 5 * 4 * 3 * 2)

1. Schritt
   1. **Berechnung:**
      1. Aktuellen Wert von Zahl nehmen und mit Ergebnis aus vorhergehendem Schritt multiplizieren
   2. **Aktualisierung**
      1. Zahl um 1 verkleinern
2. **Bedingung:** Der Schritt wird durchgeführt solange die Zahl größer wie 1 ist. Alternativ funktioniert auch `>= 1`, da eine Multiplikation mit 1 nichts am Ergebnis ändert (`6 * 5 * 4 * 3 * 2 = 6 * 5 * 4 * 3 * 2 * 1 = 720`)

### Code

1. Muster einsetzen

    ```java
    while ( /* Bedingung */ ) {

        /* Berechnung */

        /* Aktualisierung */

    }
    ```

2. Muster anpassen

    ```java
    while ( /* Bedingung: Solange Zahl > 1 */ ) {

        /* Berechnung: Aktuelle Zahl nehmen und mit Ergebnis aus
                       vorhergehendem Schritt multiplizieren */

        /* Aktualisierung: Zahl um 1 verkleinern */

    }
    ```

3. Code einfügen

    ```java
    short zahl = 6;
    long fakultät = 1;

    while ( zahl > 1 /* Bedingung: Solange Zahl > 1 */ ) {

        /* Berechnung: Aktuelle Zahl nehmen und mit Ergebnis aus
                       vorhergehendem Schritt multiplizieren */
        fakultät *= zahl;
        /* Aktualisierung: Zahl um 1 verkleinern */
        zahl--;
    }
    ```
