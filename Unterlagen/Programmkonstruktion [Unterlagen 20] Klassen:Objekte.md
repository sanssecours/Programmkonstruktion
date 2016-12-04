# Klassen/Objekte

Bisher haben wir schon einige Beispiele für Klassen/Objekte kennen gelernt. So handelt es sich zum Beispiel bei den folgenden Typen um Klassen/Objekte:

- `Integer`
- `String`
- `Double`
- `Boolean`
- `Scanner`
- `Math`
- `System`
- …

Wie man sehen kann beginnen die Namen von Objekte/Klassen mit einem großen Buchstaben. Diese Konvention lässt den Programmierer schnell zwischen

- primitiven Datentypen (nur Kleinbuchstaben — z.B.: `int`, `double`),
- Variablen/Funktionen (erstes Wort kleingeschrieben, weitere beginnen mit Großbuchstaben — z.B. `nextPlayer` , `scanner`, `possibleMoves`)
- Konstanten (nur Großbuchstaben — z.B. `PI`, `MAXIMUM_VALUE`) und
- Objekten/Klassen unterscheiden.

Wir wollen nun sehen wie sich Klassen und Objekte voneinander unterscheiden.

## Klassen

Klassen stellen eine **Schablone** (für Objekte) dar. Sie legen fest welche Eigenschaften Objekte besitzen. Es ist auch möglich, dass eine Klasse ohne dazugehörige Objekte existiert. Ein Beispiel dafür ist die Klasse `Math`. Umgekehrt werden Objekte immer an Hand der Beschreibung der Klasse erstellt (**instanziert**). Es ist also in Java nicht möglich, dass ein Objekt ohne eine dazugehörige Klasse existiert.

Wir widmen uns nun als erstes Beispiel einer vereinfachten Version der Klasse `Math`:

```java
class Math {
    // Keyword `final`:
    //  - Es handelt sich um eine Konstante
    //  - Der Wert kann später nicht mehr verändert werden
    //
    // Keyword `static`:
    //  - Es handelt sich um eine Klassen-Variable
    //  - Ohne `static` wäre `PI` eine Objekt-Variable
    final static double PI = 3.14159;

    static double abs(double number) {
        return number < 0 ? -number : number;
    }
}
```

Wie wir sehen sorgt das Schlüsselwort (Keyword) `static` dafür, dass es sich bei Variablen um **Klassenvariablen** und bei Funktionen um **Klassenmethoden** (Klassenfunktionen) handelt. Wir können jetzt auch erkennen, dass wir bisher praktisch immer Klassenmethoden programmiert haben.

### Verwendung von Klassen

Klassenmethoden und Klassenvariablen kann man verwenden indem man

1. den **Namen der Klasse** schreibt,
2. einen **Punkt** einfügt und
3. dann wie sonst auch den **Namen der Variable** oder den **Namen der Funktion** gefolgt von **Klammern und Argumenten**

schreibt.

Der folgende Code  zeigt Beispiele für die Verwendung der Klassenvariable `PI` und der Klassenmethode `abs`:

```java
System.out.println(Math.PI);  // gibt 3.14159 auf dem Bildschirm aus
double piPlusOne = 1 + Math.PI;  // speichert 4.14159 in `piPlusOne`

Math.abs(-2.4); // berechnet den Absolutwert von -2.4
                // und verwirft das Ergebnis
System.out.println(Math.abs(5.4)); // Gibt 5.4 auf dem Bildschirm aus
```

Um eine selbst erstellte Klasse zu verwenden kann man diese am Anfang von der Datei der Hauptklasse einfügen. Den Code der Klasse und das aktuelle Beispiel kann man also folglich wie folgt in einer Datei namens `Test.java` zusammenführen:

```java
class Math {
    final static double PI = 3.14159;

    static double abs(double number) {
      return number < 0 ? -number : number;
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        double piPlusOne = 1.0 + Math.PI;
        Math.abs(-2.4);
        System.out.println(Math.abs(5.4));
    }
}
```

## Objekte

Nachdem wir im vorhergehenden Abschnitt ein Beispiel für eine Klasse gesehen haben wenden wir uns nun Objekten zu. Objekte stellen **Instanzen** von Klassen dar. Üblicherweise gibt es zu einer Klasse mehre Objekte (die den Typ der Klasse besitzen). Hier ein paar Beispiele:

- Klasse `String`
  - Objekte: Ein bestimmter String
  - Beispiele für Objekte vom Typ `String`:
    - `"Hello World"`
    - `"Hi 🦄"`
    - `new String("Hello World")`
    - `new String()` (entspricht dem leeren String also `""`)
- Klasse `Double`
  - Objekte: Eine bestimmte Zahl vom Typ `Double`
  - Beispiele für Objekte vom Typ `Double`:
    - `new Double(5)`
    - `new Double(-1337.5)`
    - `new Double(10e1)`
- Klasse `Scanner`
  - Objekt: Eine bestimmte Scanner für einen gewisse Eingabe (z.B. Standard-Input, Datei, …)
  - Beispiele für Objekte vom Typ `Scanner`:
    - `new Scanner(System.in)`
    - `new Scanner(new File("test.txt"))`

Wie wir sehen kann man ein neues Objekt von einer bestimmten Klasse also erstellen indem man `new` verwendet und dann den Klassen-Namen schreibt. Danach folgen Klammern und  je nach der Definition der Klasse eine gewisse Anzahl von Argumenten.

Im Endeffekt sorgt der Aufruf von `new Klasse(…)` dafür, dass in der Klasse eine spezielle Methode aufgerufen wird. Diese Methode, die als **Konstruktor** der Klasse bezeichnet wird, hat den gleichen Namen wie die Klasse.  Vor dem Konstruktor steht **kein Rückgabetyp** (auch nicht `void`). Je nach der Anzahl der Argumente under deren Typen werden bei `new Klasse(…)` unterschiedliche Konstruktoren aufgerufen.

Hier ein paar Beispiele für Konstruktoren, die bei der Erstellung von neuen Objekten aufgerufen werden:

- `new String()`:

  ```java
  String() {
      // Code
  }
  ```

- `new Double(5.0)`

  ```java
  Double(double number) {
      // Code
  }
  ```

- `new Scanner(System.in)`

  ```java
  Scanner(InputStream source) {
      // Code
  }
  ```

- `new Scanner(new File("test.txt"))`

  ```java
  Scanner(File source) {
      // Code
  }
  ```

Schreibt man in einer Klasse keinen Konstruktor, dann erzeugt Java von Haus aus einen leeren Konstruktor, also einen Konstruktor der Form `Klasse()`. Das sorgt dafür, dass wir aus der obigen vereinfachten Klasse `Math` mittels `Math.new()` ein neues Objekt erstellen können:

```java
mathObject = new Math();
```

Auch mittels dem Objekt `mathObject` können wir auf die Klassenvariablen und Klassenmethoden zugreifen. Statt des Klassennamens verwenden wir nun den Namen des Objekts. Das Ergebnis ist dabei **das gleiche** als wie wenn wir direkt mittel des Klassennamens zugreifen:

```java
mathObject = new Math();

// gibt 3.14159 auf dem Bildschirm aus
System.out.println(Math.PI);
// gibt 3.14159 auf dem Bildschirm aus
System.out.println(mathObject.PI);

// speichert 4.14159 in `piPlusOne`
double piPlusOne = 1 + mathObject.PI;

mathObject.abs(-2.4); // berechnet den Absolutwert von -2.4
                      // und verwirft das Ergebnis

// Gibt 5.4 auf dem Bildschirm aus
System.out.println(mathObject.abs(5.4));
```

Wie wir oben sehen macht es bei manchen Klassen nicht wirklich Sinn Objekte von der Klasse zu erstellen. Das trifft immer dann zu wenn die Klasse nur Klassenfunktionen und Klassenvariablen beinhaltet. Diese Variablen/Funktionen haben – wie wir schon oben gesehen haben – genau den gleichen Wert/das gleiche Verhalten für die Klasse und alle Objekte der Klasse.

Ein Beispiel für eine Klasse die nur Klassenvariablen und Klassenfunktionen enthält ist die Standard-Java-Klasse `Math`. Die Erstellung eines Objekts solcher Klassen macht wenig Sinn. Deswegen wurde das auch von den Designern der Java API verhindert. Versuchen wir ein Objekt der Standard-Java-Klasse `Math` zu erstellen:

```java
public class Test {
    public static void main(String[] args) {
        Math mathObject = new Math();
    }
}
```

und übersetzen dann den enstehen Code, erhalten wir folgende Fehlermeldung:

```
Test.java:3: error: Math() has private access in Math
        Math mathObject = new Math();
                          ^
1 error
```

. Diese Fehler zeigt an, dass der Konstruktor der Klasse wie folgt definiert wurde:

```java
private Math() {}
```

Das Schlüsselwort `private` gibt die Sichtbarkeit der Methode vor und bedeutet, dass der Konstruktor nur in der Klasse selbst aufgerufen werden kann. Neben `private` gibt es noch die Schlüsselworte `protected` und `public` um die Sichtbarkeit festzulegen. Bei `public` ist der Zugriff überall möglich, das Schlüsselwort `protected` ist von den Zugriffsmöglichkeiten zwischen `public` und `private` [einzuordnen](http://stackoverflow.com/questions/215497/in-java-difference-between-default-public-protected-and-private).

Wir wollen uns nun endlich Klassen zuwenden bei der die Erstellung von Objekten auch Sinn ergibt. Die Erstellung von Objekten macht dann Sinn, wenn eine Klasse Objekt-Variablen und Objekt-Methoden enthält. Objekt-Variablen speichern im Gegensatz zu Klassenvariablen unterschiedliche Werte, je nachdem zu welchem Objekt sie gehören. Definieren wir zum Beispiel eine Klasse `Car`:

```java
class Car {
    // Objekt-Variablen, da das Keyword static nicht verwendet wurde
    String color;
    int weight;

    // Konstruktor
    Car() {
        color = "blue";
        weight = 2000;
    }

    // Konstruktor
    Car(String color, int weight) {
        // Das Keyword `this` bezieht sich auf die Werte der Klasse.
        // `this.color` ist also die in der dritten Zeile deklarierte
        // Variable (und nicht die Variable `color`, die als Argument
        // an diese Funktion übergeben wurde).
        this.color = color;
        this.weight = weight;
    }
}
```

dann haben die Objekte der Klasse – also einzelne Autos – unterschiedliche Gewichte und Farben. Einzelne Objekte der Klasse werden wieder mittels des Keywords `new` erstellt/instanziert:

```java
Car lightningMcQueen = new Car("red", 1200);
Car docHudson = new Car();
Car sallyCarrera = new Car("light blue", 1000);
```

Wie wir sehen unterscheiden sie die oben erstellten Autos – Objekte vom Typ `Car` – durch die Werte der Variablen `color` und `weight`:

| Variable (Attribut)       | Wert            |
| ------------------------- | --------------- |
| `lightningMcQueen.color`  | `"red"`         |
| `lightningMcQueen.weight` | `1200`          |
| `docHudson.color`         | `"blue"`        |
| `docHudson.weight`        | `2000`          |
| `sallyCarrera.color`      | `"light blue"`  |
| `sallyCarrera.weight`     | `1000`          |
| `Car.color`               | nicht definiert |
| `Car.weight`              | nicht definiert |

. Da es keine Klassenvariable `Car.weight` und `Car.weight` gibt kann man auf diese auch nicht zugreifen!

Zum Schluss wollen wir uns Objekt-Methoden zuwenden. Wie bei Objekt-Variablen definiert man Objekt-Methoden einfach indem man das Keyword `static` vor der Definition weg lässt. Wir wollen nun eine Klasse (`RepeatableString`) erstellen die es uns erlaubt einen bestimmten String öfters zu wiederholen. Der String soll dabei direkt als Objekt-Variable gespeichert werden. Wir beginnen also wie folgt:

```java
class RepeatableString {
    // Objekt-Variable, da das Schlüsselwort static
    // nicht verwendet wurde
    String text;
}
```

Um die Variable `text` auf einen Wert zu setzten definieren wir einen Konstruktor der einen String als Argument erwartet:

```java
class RepeatableString {

    String text;

    RepeatableString(String content) {
        // Wir könnten hier auch `this.text = content;` schreiben.
        // Das Keyword `this` wird hier allerdings nicht benötigt, da
        // es klar ist, dass `text` sich hier auf die Variable in der
        // dritten Zeile bezieht.
        text = content;
    }
}
```

. Jetzt benötigen wir noch eine Objektmethode um den im Objekt gespeicherten Text öfter zu wiederholen. Wir entscheiden uns dieser Methode den Namen `repeat` zu geben.

```java
class RepeatableString {

    String text;

    RepeatableString(String content) {
        text = content;
    }

    String repeat(int times) {
        String repeatedText = "";
        for (int count = 0; count < times; count++) {
            // Statt `text` könnten wir auch `this.text` schreiben
            // Bei `text` handelt es sich um eine Objekt-Variable
            repeatedText += text;
        }
        return repeatedText;
    }

}
```

Um die Klasse zu verwenden erstellen wir als erstes wieder Objekte vom Typ `RepeatableString` mittels des Keywords `new`. Diese Objekte verwenden wir dann um den Text

```
-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
Now I have a machine gun.
Ho Ho Ho
-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
```

auf dem Bildschirm auszugeben. Dazu schreiben wir folgenden Code:

```java
RepeatableString ho = new RepeatableString("Ho ");
// Hier erstellen wir einen temporären `RepeatableString` mittels
// `new RepeatableString("-*")`. Von diesem temporären Objekt rufen
// wir dann die Methode `repeat` auf um einen String zu bekommen der
// 20 mal hintereinander den Text `-*` beinhaltet.
String line = new RepeatableString("-*").repeat(20);

System.out.println(line);
System.out.println("Now I have a machine gun.\n" + ho.repeat(3));
System.out.println(line);
```

. Das fertige Programm, dass den obigen Text auf dem Bildschirm ausgibt sieht wie folgt aus:

```java
class RepeatableString {

    String text;

    RepeatableString(String content) {
        text = content;
    }

    String repeat(int times) {
        String repeatedText = "";
        for (int count = 0; count < times; count++) {
            repeatedText += text;
        }
        return repeatedText;
    }
}

class Test {
    public static void main(String[] args) {
        RepeatableString ho = new RepeatableString("Ho ");
        String line = new RepeatableString("-*").repeat(20);

        System.out.println(line);
        System.out.println("Now I have a machine gun.\n" + ho.repeat(3));
        System.out.println(line);
    }
}
```

.
