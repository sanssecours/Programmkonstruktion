# Literale

- Literal: Bestimmte Zeichenfolge die für bestimmten Wert steht
- Kennen wir schon als (Teil von) Ausdruck
- Beispiele: `'a'`, `10`, `"Hell"`, `1.334`, `-1234`, `true`

## Zahlen-Literale

- Bisher: `10`, `-20`, `3.1415`

### Zeichen die den Typ ändern (können)

---

**Wiederholung:**

  - Fließkommazahlen besitzen,  wenn nicht anders  angegeben, den Datentyp `double`
  - Ganzzahlen besitzen,  wenn nicht anders  angegeben, den Datentyp `int`

---

- Werden **hinter der Zahl** angefügt

- `l`, `L`: Zahl wird – nicht als `int` – sondern als **`long`** interpretiert
  - `long`: Ganzzahl mit größerem Wertebereich als `int`
  - Long-Zahlen sind (in Java) doppelt so „lang“ (doppelte Anzahl von Bits) wie `int`
  - Beispiele: `12L`, `82138728349234L`

- `f`, `F`: Zahl wird – nicht als `double` oder `int` sondern – als **`float`** interpretiert
  - `float`: Fließkommazahl mit kleinerem Wertebereich wie `double`
  - Float-Zahlen sind (in Java) halb so „lang“ (halbe Anzahl von Bits) wie Double-Zahlen
  - Beispiele: `124.234f`, `0f`, `3.14F`

- `d`, `D`: Zahl wird als **`double`** interpretiert
  - Beispiele: `98.34D`, `2D`, `32.0d`
  - benötigt man normalerweise nicht, da Literale mit „Komma“ (`.`) ohnehin als `double` interpretiert werden

### Zeichen die die Interpretation des Wertes ändern

- Werden **vor die Zahl** geschrieben

- `0b`:  Zahl wird – nicht als Dezimalzahl (Basis 10) sondern – als **Binärzahl** (Basis 2) interpretiert.
  - Beispiel: `0b101` (Dezimal: `1·2² + 0·2¹ + 1·2⁰ = 4 + 0 + 1 = 5`)

- `0`: Zahl wird als als **Oktalzahl**  interpretiert (Basis 8)
  - Das heißt `0456` und `456` sind unterschiedliche Zahlen!
  - Beispiel: `0456` (Dezimal: `4·8² + 5·2¹ + 6·2⁰ = 256 + 40 + 6 = 302`)

- `0x`: Zahl wird sondern als **Hexadezimal-Zahl** (Basis 16) interpretiert.
  - Beispiele:
    - `0x10` (Dezimal: `1·16¹ + 0·16⁰ = 16 + 0 = 16`)
    - `0x123` (Dezimal: `1·16² + 2·16¹ + 3·16⁰ = 256 + 32 + 3 = 291`)

### Wissenschaftliche Schreibweise

- Wird vor allem für besonders kleine/große Zahlen verwendet
- `e` oder `E` wird statt `10^` also „**10 hoch**“ verwendet
- Werden nach der Zahl und vor Typ-Bezeichner (`d`, `f`, `L`, …)  geschrieben
- Kombination mit anderen Zahlensystemen (`0b`, `0`, `0x`) nicht möglich
- Beispiele:
  - `20e6` (`20·10⁶ = 20 000 000` )
  - `2.0e7` (`2·10⁷ = 20 000 000`)
  - `345e-2` (`345·10⁻² = 3.45`)
  - `3e-1f` (`(1·1¹ + 1·1⁰) · 10⁻¹ = 3·10⁻¹= 0.3`)
