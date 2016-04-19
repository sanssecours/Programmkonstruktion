# Wiederholungsfragen

- Durch welche Eigenschaft unterscheidet sich überladene Funktionen auf jeden Fall voneinander?

Durch die Anzahl und/oder der Datentyp der Parameter.

- Welche Eigenschaft von überladenen Funktionen ist auf jeden Fall gleich?

Der Name der Funktion.

- Wie lautet die Ausgabe des folgenden Codes?

```java
    static void overWritten(long var1) {
        System.out.println("But build to destroy");
    }

    static void overWritten(float var1) {
        System.out.println("You that never done nothin'");
    }

    static void overWritten(float var1, double var2) {
        System.out.println("You play with my world");
    }

    static String overWritten(double var1) {
        return "Like it's your little toy";
    }

    public static void main(String[] args) {
        overWritten(1.0f);
        overWritten(1);
        overWritten((float) 1.0, 2);
        overWritten(1.0);
    }
```

**Lösung:**

```
You that never done nothin'
But build to destroy
You play with my world
```
