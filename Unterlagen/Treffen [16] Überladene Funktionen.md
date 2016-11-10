# Überladene Funktionen

Überladene Funktionen (Methoden) sind Funktionen mit gleichem Namen. Sie unterscheiden sich durch **die Anzahl und/oder die Typen der Argumente**. Ein bekanntes Beispiel dafür ist `Math.abs`:

```java
public static int abs(int a)
public static long abs(long a)
public static float abs(float a)
public static double abs(double a)
```

Alle diese Funktionen haben den selben Namen. Es handelt sich also um überladene Funktionen. Nur der Typ des Arguments unterscheidet sich. Je nach dem Typ des Wertes den wir übergeben wird eine andere Version von `Math.abs` aufgerufen.

```java
int zahl1 = 42;
long zahl2 = 42;
float zahl3 = 42;

Math.abs(42);    // ruft `public static int abs(int a)` auf
Math.abs(zahl1); // ruft `public static int abs(int a)` auf
Math.abs(zahl2); // ruft `public static long abs(long a)` auf
Math.abs(zahl3); // ruft `public static float abs(float a)` auf
Math.abs(42.0);  // ruft `public static double abs(double a)` auf
```

Überladene Funktionen können sich nicht nur durch den Typ der  Argumente, sondern auch durch die Anzahl der Argumente unterscheiden. Als Beispiel implementieren wir hier mal eigene Funktionen zum addieren von Zahlen. Wir nennen die Funktionen `add`. `add` soll nicht nur zwei Zahlen sondern auch drei Zahlen addieren können.

**Hinweis:** Das Beispiel dient nur zur Veranschaulichung! Besonders sinnvoll ist es in der Praxis nicht!

Wir wollen folgende Funktionen verwenden.

```java
static long add(long number1, long number2)
static int add(int number1, int number2)
static long add(long number1, long number2, long number3)
static double add(long number1, double number2, long number3)
```

Dazu definieren wir als erstes die Funktionen:

```java
    static long add(long number1, long number2) {
        return number1 + number2;
    }

    static int add(int number1, int number2) {
        return number1 + number2;
    }

    static long add(long number1, long number2, long number3) {
        return add(number1, number2) + number3;
    }

    static double add(long number1, double number2, long number3) {
        return number1 + number2 + number3;
    }
```

Die Funktionen können wir jetzt in `main` verwenden:

```java
    public static void main(String[] args) {
        long number1 = 1;
        long number2 = 2;
        long number3 = 3;

        // Verwendet `add(long number1, long number2)`
        System.out.println(number1 + " + " + number2 + " = " +
                           add(number1, number2));

        // Default-Typ für ganze Zahlen ist `int`. Deshalb verwendet der
        // folgende Code `add(int number1, int number2)`.
        System.out.println(1 + " + " + 2 + " = " + add(1, 2));

        // Verwendet `add(long number1, long number2, long number3)`
        System.out.println(number1 + " + " + number2 + " + " +
                           number3 + " = " + add(number1, number2, number3));

        // Verwendet `add(long number1, double number2, long number3)`
        System.out.println(number1 + " + " + 2.0 + " + " +
                           number3 + " = " + add(number1, 2.0, number3));
    }
```

Wie wir oben sehen, werden je nach dem Typ und der Anzahl der Argumente die verschiedenen Versionen der Funktion `add` aufgerufen. Der Aufruf der Funktion

```java
add(1.0, 2.0, 3);
```

in `main` würde aktuell zu einem Fehler führen, da die Funktion `add(double number1, double number2, int number3)` nicht existiert. Der Aufruf von

```java
add(1, 2, 3);
```

würde hingegen problemlos funktionieren. Hier würde einfach die Funktion `add(long number1, long number2, long number3)` verwendet werden, obwohl alle Argumente die der Funktion übergeben wurden den Typ `int` besitzen. Die Variablen vom Typ `int` werden hier einfach in den Typ `long` umgewandelt. Da die Funktion `add(long number1, long number2, long number3)` den Rückgabe-Typ `long` besitzt funktioniert die Zuweisung

```java
int ergebnis = add(1, 2, 3);
```

auf eine `int`-Variable nicht. Der „größere” Typ (`long`) kann nicht automatisch in den kleineren Typ `int` umgewandelt werden. Wenn wir den Typ der Variable auf `long` umändern funktioniert es:

```java
long ergebnis = add(1, 2, 3);
```

Wir sehen, dass es bei der Verwendung von überladenen Funktionen zu unvorhergesehenen Verhalten kommen kann.

Hier noch mal das ganze Beispiel von vorher zum Ausprobieren:

```java
public class Addition {

    static long add(long number1, long number2) {
        return number1 + number2;
    }

    static int add(int number1, int number2) {
        return number1 + number2;
    }

    static long add(long number1, long number2, long number3) {
        return add(number1, number2) + number3;
    }

    static double add(long number1, double number2, long number3) {
        return number1 + number2 + number3;
    }

    public static void main(String[] args) {
        long number1 = 1;
        long number2 = 2;
        long number3 = 3;

        // Verwendet `add(long number1, long number2)`
        System.out.println(number1 + " + " + number2 + " = " +
                           add(number1, number2));

        // Default-Typ für ganze Zahlen ist `int`. Deshalb verwendet der
        // folgende Code `add(int number1, int number2)`.
        System.out.println(1 + " + " + 2 + " = " + add(1, 2));

        // Verwendet `add(long number1, long number2, long number3)`
        System.out.println(number1 + " + " + number2 + " + " +
                           number3 + " = " + add(number1, number2, number3));

        // Verwendet `add(long number1, double number2, long number3)`
        System.out.println(number1 + " + " + 2.0 + " + " +
                           number3 + " = " + add(number1, 2.0, number3));

    }
}
```
