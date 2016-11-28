# Arrays

Arrays (Listen) dienen dazu mehrere Werte vom **gleichen Typ** zu speichern. Ein Array kann zum Beispiel Daten vom Typ

  - `String`
  - `int`
  - `Integer`
  - `float`
  - `Float`
  - …

speichern.

## Erstellen von Arrays

Um eine  Variable für eine Liste zu **deklarieren** schreibt man den Typ den die Werte in der Liste speichern soll und fügt dann eckige Klammern dazu:

    typ[] variablenname;

Hier ein paar Beispiele:

```java
int[] intZahlen;       // Liste von (int)-Zahlen
Double[] doubleZahlen; // Liste von (Double)-Zahlen
String[] texte;        // Liste von Zeichenketten
float[] floatZahlen;   // Liste von (float)-Zahlen
```

Bei der Deklaration wird (wie wir ja schon wissen) der Wert der Variable  noch nicht festgelegt. Der Code

```java
public class Test {
    public static void main(String[] args) {
        int zahl;
        System.out.println(zahl);
    }
}
```

lässt sich z.B. nicht übersetzen, da `zahl` noch nicht definiert wurde. Genauso wenig lässt sich der Code:

```java
public class Test {
    public static void main(String[] args) {
        int[] zahlen;
        System.out.println(zahlen);
    }
}
```

übersetzen, da hier die Liste `zahlen` noch nicht definiert wurde. Es gibt mehrere Möglichkeiten die Werte und Größe eines Arrays zu definieren.

Die einfachste Art ist den Wert auf `null` zu setzten. Der Wert `null` steht mehr oder weniger für „Nichts“.  Ein Array, dass den Wert `null` hat speichert keine Werte!

---

**Anmerkung:** Grundsätzlich kann man den speziellen Wert `null` für alle Variablen verwenden die Referenz-Typen speichern.  Referenz-Typen sind die mit den Großbuchstaben am Anfang (und Arrays)! Beispiele für Referenz-Typen sind also:

   - Integer
   - Float
   - Double
   - Scanner
   - …

Folgendes Programm lässt sich also ohne Probleme übersetzen und ausführen:

```java
public class Test {
    public static void main(String[] args) {
        String text = null;
        Integer zahl = null;
        System.out.println(text);
        System.out.println(zahl);
    }
}
```

und gibt zweimal `null` auf dem Bildschirm aus:

```
null
null
```

---

Da der Wert `null` für gar nichts steht ist das definieren, z.B. von einer Liste von Zahlen, mittels

```java
int[] zahlen = null;
```

meist nicht sehr hilfreich. Wie können wir also eine Liste mit einer bestimmten Anzahl von Elementen erstellen? Dazu können wir die Liste mittels:

    new typ[anzahlElemente]

definieren. Um zum Beispiel eine Liste mit 3 Elementen vom Typ `int` zu erstellen können wir folgenden Befehl verwenden:

```
new int[3];
```

Bei dieser Schreibweise geben wir **nur die Anzahl der Elemente** vor, aber nicht deren Werte. Als Wert wird ein mehr oder weniger sinnvoller Default-Wert verwendet. Bei Zahlen ist das `0`, bei boolschen Werten `false` und bei Referenz-Typen (die mit dem großen Anfangsbuchstaben;  z.B. `String` oder `Double`) `null`.

Wollen wir nun ausgeben wie die Liste die durch `new int[3]` entsteht aussieht würden wir das wahrscheinlich als erstes so probieren:

```
System.out.println(new int[3]);
```

Statt aber wie erwartet eine Liste mit 3 Werten, die alle `0` sind auszugeben:

```
[0, 0, 0]
```

 bekommen wir Folgendes zu Gesicht:

```
[I@7f31245a
```

Das ist nicht gerade hilfreich! Um (eindimensionale) Listen vernünftig auszugeben kann man die Funktion `Arrays.toString(array)` verwenden. Diese wandelte das übergebene Array in einen String um, der dann ausgegeben werden kann. Den String kann man dann z.B. in einer Variable speichern und ausgeben:

```java
int[] zahlen = new int[3];
String arrayAlsZeichenkette = Arrays.toString(zahlen);
System.out.println(arrayAlsZeichenkette);
```

Das Ganze kann man auch noch ein wenig länger:

```java
int[] zahlen;
String arrayAlsZeichenkette;
zahlen = new int[3];
arrayAlsZeichenkette = Arrays.toString(zahlen);
System.out.println(arrayAlsZeichenkette);
```

oder auch (ohne Zwischen-Variablen) kürzer schreiben:

```java
System.out.println(Arrays.toString(new int[3]));
```

Die Ausgabe des Codes ist auf jeden Fall die selbe:

```
[0, 0, 0]
```

Hier mal ein Beispielprogramm mit Definitionen von Arrays verschiedener Typen:

```java
import java.util.Arrays; // Brauchen wir für Arrays.toString

public class Test {
    public static void main(String[] args) {
        // Deklaration und Definition in Einem
        double[] fuenfMalNull = new double[5];

        // Deklaration und Definition extra
        String[] zweiStrings;                   // Deklaration
        zweiStrings = new String[2];            // Definition

        // Deklaration und Definition in Einem
        boolean[] dreiBools = new boolean[3];

        // fuenfMalNull = [0, 0, 0, 0, 0]
        // 0 ist Default-Wert für primitive Zahlen-Typen (int, long, float,
        // double) – Primitive Typen: Kleinbuchstabe am Anfang
        System.out.println(Arrays.toString(fuenfMalNull));

        // new Double[3] = [null, null, null]
        // null weil Double ein Referenz-Typ ist (Großbuchstabe am Anfang!)
        System.out.println(Arrays.toString(new Double[3]));

        // zweiStrings = [null, null]
        // null weil String ein Referenz-Typ ist (Großbuchstabe am Anfang!)
        System.out.println(Arrays.toString(zweiStrings));

        // dreiBools = [false, false, false]
        // false ist default-Wert für boolean-Arrays
        System.out.println(Arrays.toString(dreiBools));
    }
}
```

Und hier die Ausgabe dazu:

```
[0.0, 0.0, 0.0, 0.0, 0.0]
[null, null, null]
[null, null]
[false, false, false]
```

Bisher haben wir also gelernt wie man ein

1. Eine Variable die eine Array (Liste) von einem bestimmten Type speichen soll deklamiert.
   - Beispiele:
     - `int[] array`
     - `String[] text`
2. Wie man  „Nichts“ in einem Array (also einer Array-Variable) speichert.
   - Beispiele:
      - `array = null`
      - `text = null`
      - `double[] arr = null`
3. Wie man Array von einer bestimmten Größe (=Anzahl von Elementen=Länge) definiert:
   - Beispiele:
     - `new double[3]`:
        - Array mit 3 Elementen (Länge 3) vom Typ double
        - Jedes Element speichert den Default-Wert `0`
        - Das Array hat keinen (Variablen-)Namen
     - `text = new String[2]`:
         - Array mit 2 Elementen (Länge 2) vom Typ `String`
         - Jedes Element speichert den Default-Wert `null`
         - Das Array hat den Namen `text`
     - `Double[] arr = new Double[4]`
       - Array mit 4 Elementen (Länge 4) vom Typ `Double`
       - Jedes Element speichert den Default-Wert `null`
       - Das Array hat den Namen `arr`

Neben der Möglichkeit ein Array von einer bestimmten Länge (=Größe) mit Default-Werten zu definieren, gibt es auch die Möglichkeit mit einer Definition die einzelnen Werte die einem Array gespeichert werden festzulegen. Damit legt man implizit auch die Größe (Länge) des Arrays fest, da die ja durch die Anzahl der Element gegeben ist. Das allgemeine Muster dafür sieht so aus:

```
new typ[] {wert1, wert2, …, letzterWert}
```

In den eckigen Klammern steht hier keine Zahl, da durch die Anzahl der Element in den geschwungenen Klammern schon festgelegt wird wie groß (lang) die Liste sein muss.

Um zum Beispiel eine neue Liste mit 3 Strings `"eins"`, `"zwei"` und `"drei"` zu definieren kann man folgendes schreiben:

```java
new String[] {"eins", "zwei", "drei"}
```

Mit dazugehöriger Variable(n-Deklaration) sieht das dann zum Beispiel so aus:

```java
String[] texte = new String[] {"eins", "zwei", "drei"};
```

Das `new String[]` kann man – wenn man Deklaration und Definition in einem erledigt (so wie in obiger Code-Zeile) – auch weglassen:

```java
String[] texte = {"eins", "zwei", "drei"};
```

Ansonsten funktioniert das aber (leider) nicht. Der folgende Code kann also **nicht** übersetzt werden:

```java
String[] texte;
texte = {"eins", "zwei", "drei"};
```

Mit der ersten Variante funktioniert es (immer):

```java
String[] texte;
texte = new String[]{"eins", "zwei", "drei"};
```

Hier mal ein Beispiel-Programm, dass die Schreibweise zum Definieren von einzelnen Array-Werten zeigt:

```java
import java.util.Arrays; // Brauchen wir für Arrays.toString

public class Test {
    public static void main(String[] args) {
        int[] primes = new int[] {2, 3, 5, 7, 11};

        double[] einsZweiDrei;
        einsZweiDrei = new double[] {1, 2, 3};

        Boolean[] booleans = new Boolean[] {false, true};

        System.out.println(Arrays.toString(primes));
        System.out.println(Arrays.toString(einsZweiDrei));
        System.out.println(Arrays.toString(booleans));

        System.out.println(
            Arrays.toString(new String[]{"eins", "zwei", "drei"}));
    }
}
```

Und hier die Ausgabe dazu:

```
[2, 3, 5, 7, 11]
[1.0, 2.0, 3.0]
[false, true]
[eins, zwei, drei]
```


# Lesen und Schreiben von Array-Werten

Im vorigen Abschnitt haben wir gesehen wie wir ein Array von einem bestimmten Typen erstellen und am Bildschirm ausgeben können. Nun wollen wir uns damit beschäftigen wie wir auf einzelne Element des Arrays zugreifen können. Dazu betrachten wir folgendes Array von Strings:

```java
String[] array = new String[] {"eins", "zwei", "drei", "vier"}
```

Wir sehen, dass das Array vier String-Werte speichert. Wieviele Element ein Array speichert können wir durch die Variable `length`, die jedes definierte – also nicht mit `null` initialisierte – Array speichert, feststellen. Für das obige Array steht in `array.length` die Zahl 4. Hierzu wieder ein kleines Beispiel-Programm:

```java
public class Test {
    public static void main(String[] args) {
        int[] primes = new int[] {2, 3, 5, 7, 11};        // 5 Elemente
        Boolean[] booleans = new Boolean[] {false, true}; // 2 Elemente

        System.out.println(primes.length);
        System.out.println(booleans.length);
        System.out.println(new String[]{"eins", "zwei", "drei"}.length);
    }
}
```

Die Ausgabe dazu:

```
5
2
3
```

Um auf einzelne Elemente des Arrays zuzugreifen schreibt man die Stelle (Index) auf die man zugreifen will in eckigen Klammern nach dem Namen des Arrays. Das Muster dafür sieh also so aus:

```
arrayName[index]
```

Dabei greift man mittels `arrayName[0]` auf die erste Stelle des Arrays, mit `arrayName[1]` auf die zweite und mit `arrayName[arrayName.length-1]` auf die letzte Stelle des Arrays zu.  Für unser `array` sieht das so aus:

```
array = ["eins",   "zwei",     "drei",    "vier"]
           ↑          ↑           ↑         ↑
        array[0]   array[1]   array[2]   array[3]
                                               ↑
           array.length = 4 ⇒ array.length-1 = 3
```

Mit diesen Wissen können wir uns eigene Version von `Arrays.toString` (für Arrays eines bestimmten Typs) schreiben.  Dazu iterieren wir über die möglichen Indizes (`0` bis `length-1`) und geben den jeweiligen Wert am Index zu einem String hinzu. Statt `,` verwenden wir ein Leerzeichen zur Trennung. Eine Version der Funktion für den Typ `int` sieht dann zum Beispiel so aus:

```java
public static String toString(int[] zahlen) {
    String output = "[ ";
    for (int stelle = 0; stelle < zahlen.length; stelle++) {
        // Gib aktuelle Zahl und Leerzeichen zum Trennen der Zahlen zum
        // String hinzu
        output += zahlen[stelle] + " ";
    }
    output += "]";
    return output;
}
```

Für ein Array vom Typ `String`  würde sich an der Implementierung (bis auf den Eingabeparameter — `String`-Array statt `int`-Array) praktisch gar nichts ändern:

```java
public static String toString(String[] zahlen) { // <- String-Arrays
    String output = "[ ";
    for (int stelle = 0; stelle < zahlen.length; stelle++) {
        output += zahlen[stelle] + " ";
    }
    output += "]";
    return output;
}
```

Hier eine Beispiel-Verwendung der (überladenen) Funktionen toString:

```java
    public static void main(String[] args) {
        int[] primes = new int[] {2, 3, 5, 7, 11};
        String[] array = new String[] {"eins", "zwei", "drei", "vier"};
        System.out.println(toString(primes));
        System.out.println(toString(array));
    }
```

und die entsprechende Ausgabe:

```
[ 2 3 5 7 11 ]
[ eins zwei drei vier ]
```

Mittels der Klammern kann man nicht nur lesend, sondern auch schreibend auf ein bestimmtes Element des Arrays zugreifen. Dazu schreibt man – wie auch sonst bei Variablen – das zu ändernde Element auf die linke Seite und den neuen Wert auf die rechte Seite. Um also zum Beispiel den 3. Wert von `array` auf den Text `"Letztes Element"`  zu ändern kann man folgendes schreiben:

```java
array[3] = "Letztes Element"
```

Dazu ein kleines Beispielprogramm:

```java
import java.util.Arrays; // Brauchen wir für Arrays.toString

public class Test {
    public static void main(String[] args) {
        String[] array = new String[] {"eins", "zwei", "drei", "vier"};
        System.out.println(Arrays.toString(array));
        array[3] = "Letztes Element";
        System.out.println(Arrays.toString(array));
    }
}
```

und die entsprechende Ausgabe:

```
[eins, zwei, drei, vier]
[eins, zwei, drei, Letztes Element]
```

Mit diesem Wissen wollen wir nun ein neue Funktion schreiben, die alle Elemente eines `int`-Arrays mit einem vorgegeben Wert überschreibt. Wir nennen die Funktion `fill`. Der Funktion wird ein int-Array (`int[] array`) und der Wert der an jede Stelle des Arrays geschrieben werden soll übergeben (`int wert`) wird. Die Funktion sieht dann zum Beispiel so aus:

```java
static void fill(int[] array, int wert) {
    for(int index = 0; index < array.length; index++) {
        array[index] = wert;
    }
}
```

Im folgenden Code verwenden wir die Funktion:

```java
public static void main(String[] args) {
    int[] zahlen = new int[] {3, 2, 1, -5};
    System.out.println(Arrays.toString(zahlen));
    fill(zahlen, 10);
    System.out.println(Arrays.toString(zahlen));
}
```

und erhalten die Ausgabe:

```
[3, 2, 1, -5]
[10, 10, 10, 10]
```

Zum Schluss noch ein kleines Beispiel zum Verändern und lesen von einzelnen Array-Werten.

```java
import java.util.Arrays; // Brauchen wir für Arrays.toString

public class Test {
    public static void main(String[] args) {
        int[] zahlen = new int[] {3, 2, 1, -5}; // zahlen.length = 4

        int zahl = zahlen[1];     // In zahl steht jetzt 2
        System.out.println(zahl);
        zahlen[1] = 0;            // In zahlen steht jetzt [3, 0, 1, -5]
        System.out.println(Arrays.toString(zahlen));
        zahlen[zahlen.length-2] = 42; // In zahlen steht jetzt [3, 0, 42, -5]
        System.out.println(Arrays.toString(zahlen));
        // In Zahl steht immer noch 2, da der Wert von zahl nach der ersten
        // Zuweisung nicht mehr geändert wurde
        // Kein `zahl = … `
        System.out.println(zahl);
    }
}
```

Und die entsprechende Ausgabe dazu:

```
2
[3, 0, 1, -5]
[3, 0, 42, -5]
2
```

# Mehrdimensionale Arrays

Neben einer Liste in der man direkt an den Stellen Werte eines bestimmten Typen speichert (z.B. `new int[] {1,2,3}`,  `new String[] {"Hi", "Ho"}` ) gibt es auch die Möglichkeit eine Liste zu erstellen in der man dann Listen eines bestimmten Typs speichert. Beispiele:

```java
int[][] zahlen2D = new int[][] {new int[]{1, 2, 3}, new int[]{3, 4}};
// zahlen2D = [[1, 2, 3], [3, 4]]
String[][] texte2D = new String[][] {new String[]{"Hi", "Ho"},
                                     new String[]{"Bla"}};
// texte2D = [["Hi", "Ho"], ["Bla"]]
```

Man kann  die obigen Arrays zum Beispiel auch auch erstellen in der man eindimensionale Arrays erstellt und diese dann einsetzt:

```java
int[] zahlen1 = new int[] {1, 2, 3};
int[] zahlen2 = new int[] {3, 4};
// Erstelle Liste mit 2 Plätzen für Elemente vom Typ int[]
// Ein Element der Liste zahlen2D hat den Typ int[]
int[][] zahlen2D = new int[2][];
zahlen[0] = zahlen1;
zahlen[1] = zahlen2;

// Variable        | Typ
// ——————————————————————————
// zahlen2D        | int[][]
// zahlen2D[0]     | int[]
// zahlen2D[1]     | int[]
// zahlen2D[0][0]  | int
// zahlen2D[0][1]  | int
// …


// Wir können auch die einzelnen Werte in Variablen speichern und diese
// einsetzen.
String text1 = "Hi";
String text2 = "Ho";
String[] strings1 = new String[] {text1, text2};
String[] strings2 = new String[] {"Bla"};
String[][] texte2D = new String[][] {strings1, strings2};
```

Das Ganze kann man beliebig fortsetzen also zum Beispiel

  - Listen definieren
  - die Listen enthalten, die dann wiederum
  - Listen von „einfachen“ Werten (`Double`, `int`, `String`)

enthalten. Das sieht dann zum Beispiel so aus:

```java
int[] zahlen1 = new int[] {1, 2, 3};
int[] zahlen2 = new int[] {3, 4};
int[] zahlen3 = new int[] {5, 6, 7, 8};

// zahlen2D1 = [[0, 0, 0],  [0, 0, 0]]
int[][] zahlen2D = new int [2][3];
int[][][] dreiD = new int[][][] { new int[][] {zahlen1, zahlen2, zahlen3},
                                  zahlen2D };

// dreiD =
// [
//   [[1, 2, 3], [3, 4], [5, 6, 7, 8]], ← dreiD[0]
//   [[0, 0, 0],  [0, 0, 0]]            ← dreiD[1]
// ]
```

Mehrdimensionale Arrays sehen zwar komplex aus kochen im Endeffekt aber auch nur mit Wasser. Der Zugriff erfolgt genau wie bei eindimensionalen Arrays mittels Klammern und Angabe des Index. Dazu ein paar Beispiele:

```java
int[][] zweiD = dreiD[0];
// zweiD = [[1, 2, 3], [3, 4], [5, 6, 7, 8]]
// zweiD.length = 3
int[] einD = dreiD[0][1];
// einD = [3, 4]
// einD.length = 2
int zahl = dreiD[0][1][0];
// zahl = 3

// dreiD[1] vor Zuweisung: [[0, 0, 0],  [0, 0, 0]] — dreiD[1].length = 2
dreiD[1] = new int[][] {new int[] {-1, -2, -3}};
// dreiD[1] nach Zuweisung: [[-1, -2, -3]]         — dreiD[1].length = 1

// dreiD[0][0] vor Zuweisung: [1, 2, 3]
dreiD[0][0] = new int[1]; // new int[1] = [0]
// dreiD[0][0] nach Zuweisung: [0]

// neues dreiD nach Zuweisungen
// [ [[0], [3, 4], [5, 6, 7, 8]],
//   [[-1, -2, -3]]
// ]
```


