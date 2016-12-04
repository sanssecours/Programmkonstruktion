# Datenstrukturen

Datenstrukturen dienen dazu bestimmte Information abzuspeichern um den Zugriff und die Veränderung der Information möglichst effektiv zu gestalten. Eine wichtige Datenstruktur die wir schon kennen gelernt haben sind Arrays.

## Array

- Arrays dienen dazu eine **Liste** von Werten (gleichen Typs) zu speichern.
- Alternative Namen:
  - Feld
  - Datenfeld
  - Liste (List)
- Erstellung eines neuen Arrays zum Beispiel mittels
  - `new double[3]`
  - `new double[] {1, 2, 3}`
- Die **Anzahl** der im Array gespeicherten Werte muss bei der Initialisierung angegeben werden und **kann später nicht mehr geändert werden**! Ein Array kann also weder „wachsen“ noch „schrumpfen“.
- Wichtiges Attribut (Objekt-Variable) eines Arrays: `length`
  - Gibt die Anzahl der im Array gespeicherten Elemente (also Länge, Größe des Arrays) an
  - `new double[3].length` → `3`
  - `new double[] {1,2}.length` → `2`
- Zugriff mittels Index (beginnend bei 0)
  - Beispiel: `String[] texte = new String[] { "Eins", "Zwei", "Drei" };`
    - `texte[0]` → `"Eins"`
    - `texte[1]` → `"Zwei"`
    - `texte[2]` → `"Drei"`
    - `texte[texte.length - 1]` → `"Drei"`
    - `texte[4]` → `ArrayIndexOutOfBoundsException` 😱
- Darstellung eines Arrays oft als von eckigen Klammern umschlossene und durch Beistrich getrennte Liste

    | Code                                    | Darstellung              |
    | --------------------------------------- | ------------------------ |
    | new double[3]                           | [0, 0, 0]                |
    | new double[] {1, 2, 3}                  | [1, 2, 3]                |
    | new String[] { "Eins", "Zwei", "Drei" } | ["Eins", "Zwei", "Drei"] |

    Der in „Darstellung“ angegebene Text ist übrigens gültiger Code in den Programmiersprachen Python und Ruby.

## ArrayList

- Die Datenstruktur `ArrayList` stellt eine mächtigere aber etwas langsamere Version eines Arrays dar.
- Die **Länge** einer `ArrayList` kann später noch **geändert werden**.
- Der Datentyp wird mittels spitzen Klammern angegeben. Beim Datentyp muss es sich immer ein Objekt-Datentyp handeln (Beispiele: `Integer`, `Double`, `Boolean`).
- Beispiele für Initialisierung:

  ```java
  import java.util.ArrayList; // ← Wird für `ArrayList` benötigt
  import java.util.Arrays;    // ← Wird für `Arrays.asList` benötigt

  class Test {
      public static void main(String[] args) {
          // Leere Liste von Strings; leereListe = []
          ArrayList<String> leereListe = new ArrayList<String>();
          // Der Typ zwischen den spitzen Klammern kann auch
          // weggelassen werden wenn es bei der Definition klar ist um
          // welchen Typ es sich handeln muss.         |
          // leereListe2 = []                          |
          //                                           ↓
          ArrayList<String> leereListe2 = new ArrayList<>();

          // texte = ["Eins", "Zwei", "Drei"]
          ArrayList<String> texte = new ArrayList<>(
              Arrays.asList("Eins", "Zwei", "Drei"));

          // numbers = [1337, 42]
          ArrayList<Integer> numbers = new ArrayList<>(
              Arrays.asList(1337, 42));
      }
  }
  ```
- Die Länge kann mittels der Objektmethode `size()` ermittelt werden:
  - `new ArrayList<>(Arrays.asList("Eins", "Zwei", "Drei")).size()` → `3`
  - `new ArrayList<>(Arrays.asList(1337, 42)).size()` → `2`
- Um auf ein Element der Liste zuzugreifen verwendet man statt eckigen Klammern, die Methode `get`:
  - Beispiel:

    ```java
    ArrayList<Integer> numbers = new ArrayList<>(
      Arrays.asList(1337, 42))`
    ```

    - `numbers.get(0)` → `1337`
    - `numbers.get(1)` → `42`
    - `numbers.get(numbers.size() - 1)` → `42`
    - `numbers.get(3)` → `IndexOutOfBoundsException` 😱
- Um ein Element zur Liste hinzuzufügen kann man die Methode `add` verwenden. Zum ändern von schon vorhandenen Elementen verwendet man `set`. Zum entfernen eines Elementes bietet sich `remove` an.

  ```java
  import java.util.ArrayList;
  import java.util.Arrays;

  class Test {
      public static void main(String[] args) {
          ArrayList<String> texte = new ArrayList<>(
              Arrays.asList("Eins", "Zwei", "Drei"));
          // texte = ["Eins", "Zwei", "Drei"]

          texte.add("Vier");
          // texte = ["Eins", "Zwei", "Drei", "Vier"]

          texte.add(0, "Null");
          // texte = ["Null", "Eins", "Zwei", "Drei", "Vier"]

          texte.set(3, "👻");
          // texte = ["Null", "Eins", "Zwei", "👻", "Vier"]

          texte.remove(2);
          // texte = ["Null", "Eins", "👻", "Vier"]

          System.out.println(texte);
          // Ausgabe: [Null, Eins, 👻, Vier]
      }
  }
  ```

# Dictionary

- Alternative Namen:
  - Assoziatives Array
  - Assoziatives Datenfeld
  - Hash
  - HashMap
  - Map
- Dictionaries können als „fancy“ Version eines Arrays/einer ArrayList gesehen werden.
  - Während Arrays als Index (Schlüssel, **Key**) nur Zahlen (von `0` bis Größe des Arrays - 1) zulassen, kann man bei einem Dictionary auch den Typ des Schlüssels angeben.
  - Die Elemente eines Dictionaries – also die Werte die bei einem bestimmten Schlüssel (Key, Index) stehen – werden üblicherweise als **Values** bezeichnet.
- Dictionaries werden oft als Liste von Wert-Paaren dargestellt. Schlüssel (Key) und Wert (Value) werden dabei durch einen Doppelpunkt voneinander getrennt.  Die einzelnen Paare werden durch Beistriche getrennt und von geschwungenen Klammern umschlossen.

  - Beispiele:

    ```py
    {0: "Null", 1: "Eins", 1337: "🙈"}
    ```

    - Datentyp Schlüssel (Key/Index): `Integer`
    - Datentyp Wert (Value): `String`
    - Größe (Länge/Anzahl Elemente): 3
    - Werte:
      - Key `0`: `"Null"`
      - Key `1`: `"Eins"`
      - Key `1337`: `"🙈"`
      - Key `2`: Schlüssel nicht vorhanden 😱!

    ```py
    {"Vienna": "Austria", "London": "United Kingdom"}
    ```

    - Datentyp Schlüssel (Key/Index): `String`
    - Datentyp Wert (Value): `String`
    - Größe (Länge/Anzahl Elemente): 2
    - Werte:
      - Key `"Vienna"`: `"Austria"`
      - Key `"London"`: `"United Kingdom"`
      - Key `2`: Falscher Datentyp für Schlüssel 😱!
      - Key `"London"`: Schlüssel nicht vorhanden 😱!

- Beispiele für Initialisierung:

  ```java
  HashMap<Integer, String> arrayLikeMap = new HashMap<>();
  HashMap<String, String> citiesToStates = new HashMap<>();
  ```

- Um Werte zu setzten zu verändern (oder zu setzen) kann man die Funktion `put` verwenden:

  ```java
  import java.util.HashMap; // ← Wird für `HashMap` benötigt

  class Test {
      public static void main(String[] args) {
          HashMap<Integer, String> arrayLikeMap = new HashMap<>();
          // arrayLikeMap = {}

          arrayLikeMap.put(0, "Null");
          // arrayLikeMap = {0: "Null"}
          arrayLikeMap.put(1, "Eins");
          // arrayLikeMap = {0: "Null", 1: "Eins"}
          arrayLikeMap.put(1, "🐰");
          // arrayLikeMap = {0: "Null", 1: "🐰"}

          System.out.println(arrayLikeMap);
          // Ausgabe: {0=Null, 1=🐰}
      }
  }
  ```

- Der Zugriff auf Element und die Bestimmung der Größe von Dictionaries erfolgt wie bei `ArrayList` über die Funktionen `get` und `size`.

  ```java
  import java.util.HashMap;

  class Test {
      public static void main(String[] args) {
          HashMap<String, String> cityToCountry = new HashMap<>();
          cityToCountry.put("Vienna", "Austria");
          cityToCountry.put("London", "United Kingdom");
          // cityToCountry = {"Vienna": "Austria",
          //                  "London": "United Kingdom"}

          System.out.println(cityToCountry.size());
          // Ausgabe: 2

          System.out.println(cityToCountry.get("Vienna"));
          // Ausgabe: Austria
          System.out.println(cityToCountry.get("London"));
          // Ausgabe: United Kingdom
      }
  }

  ```
