# Funktionen (Methoden)

- Dienen dazu Code in kleinere überschaubare Einheiten zu kapseln
- Ähnlich wie mathematische Funktionen
  - mehrere Eingabeparameter (kann sich auch um 0 Eingabeparameter handeln)
  - ein Wert wird zurückgegeben (wenn man nichts zurückgeben will einfach `void` verwenden)
- Java-Funktionen sind aber „mächtiger“ als mathematische Funktionen
  - können auch **Seiteneffekte** haben (gleiche Eingabewerte können zu unterschiedlichem Ergebnis/Ausgabe führen)
  - Mathematische Funktionen haben keine Seiteneffekte: gleiche Eingabe führt immer zu gleicher Ausgabe (egal wie oft, wann man Funktion verwendet)

## Aufbau (Definition)

```java
KeyWords RückgabeTyp Name (Eingabeparameter) {
    // Implementierung der Funktion
}
```

- **Keywords:** mehrere durch Leerzeichen getrennte Schlüsselwörter (optional)
- **Rückgabetyp:** Typ des Wertes der von der Funktion „retuniert“ wird
- **Name**: Name der Funktion
- **Eingabeparameter**:
  - Paare von Typ und Name (der Variable) durch Leerzeichen getrennt:
    - Beispiel: `String[] args` (Typ: `String[]`, Name: `args`)
  - Bei mehreren Eingabeparametern: Trennung durch Beistrich
    - Beispiel: `(int var1, String var2, double huhu)`

---

## Keywords (Schlüsselwörter)

- Schlüsselwörter mit bestimmter Bedeutung
- Können nicht direkt als Variablennamen verwendet werden
- Wir kennen schon einige Schlüsselwörter:
  - Typen: `String`, `boolean`, `float`, `int`, …
  - Abfragen: `if`, `else`, `switch`, …
  - Schleifen: `for`, `while`
- Bei Funktionskopf können natürlich nur passende Schlüsselwörter verwendet werden:
  - Sichtbarkeit: `private`, `protected`, `public`
  - Klassenmethode (statt Objektmethode): `static`
  - Andere Schlüsselwörter: `final`,…

---

## Beispiele

```java
public static void main (String[] arguments) {
    // Code
}
```

- `public` und `static` sind Keywords (`void` und `String`  auch)
  - `public`: Gibt „Sichtbarkeit“ der Funktion an
  - `static`: Es handelt sich um eine Klassenmethode (im Gegensatz zu einer Objektmethode)
- **Name der Funktion**: `main`
- Die Funktion hat **einen Parameter** `arguments` vom Typ `String[]` (Array („Liste“) von String)
- **Rückgabetyp**: `void`

```java
static int quad (int number) {
    return number * number;
}
```

- **Name der Funktion**: `quad`
- Die Funktion hat **einen Parameter** `number` vom Typ `int`
- **Rückgabetyp**: `int`
- `return`: Gibt an, dass der rechts stehende Wert als Ergebnis der Funktion zurückgegeben wird. Es kann auch mehrere Vorkommnisse von `return` in einem Programm geben. Nach `return` springt Programmausführung zur Stelle von Funktionsaufruf zurück.
