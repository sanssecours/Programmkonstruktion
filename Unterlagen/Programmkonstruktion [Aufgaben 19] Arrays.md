# Aufgaben

## Wiederholungsfragen

### Ausdrücke (Expressions)

- Welche zwei wichtigen Eigenschaften von einem Ausdruck kann man – sofern die Werte von den im Ausdruck vorkommenden Variablen bekannt sind – immer angeben?

- Welche Eigenschaft – zusätzlich zu den beiden oben angegeben Merkmalen – besitzt eine Variable auf jeden Fall?

- Sind die folgenden Ausdrücke gültig? Falls ja welchen Wert und Typ besitzen sie?

  ```java
  'Leo' + "Cabrio"        // Gültig:
                          // Wert:
                          // Typ:

  1 + 2/4                 // Gültig:
                          // Wert:
                          // Typ:

  1 - (int) 2/4           // Gültig:
                          // Wert:
                          // Typ:

  true ? "Hi" : 'H'       // Gültig:
                          // Wert:
                          // Typ:

  true && False           // Gültig:
                          // Wert:
                          // Typ:

  "Hello " + "World"      // Gültig:
                          // Wert:
                          // Typ:

  "Hello " - "World"      // Gültig:
                          // Wert:
                          // Typ:
  ```

### Anweisungen (Statements)

- In welcher Reihenfolge werden Anweisungen vom Computer grundsätzlich ausgeführt/ausgewertet („Programmfluss“)?

- Welche zwei speziellen Kategorien von Statements erlauben es  den Programmfluss zu ändern?

- Welchen Output liefert das folgende Progamm?

  ```java
  public class Test {

      public static void main(String[] args) {

          for (int repetition = 1; repetition <= 1; repetition++) {
              System.out.print("1");
          }

          for (int number = 2; number > 0; number -= 1) {
              if (number * -1 > 0) {
                  System.out.print("1");
              } else {
                  System.out.print("3");
              }
          }

          if (true || false || true && false) {
              int hi = 0;
              while (hi > 0) {
                  System.out.print(5);
                  hi--;
              }
              System.out.print(7);
          } else {
              System.out.print(8);
          }
      }
  }
  ```

## Arrays

- Definiere ein Array mit dem Namen `animals`, dass die Werte `🦄`, `🐰` und `🙈🙉🙊🐳` speichert.

- Schreib eine (oder mehre) Anweisungen die den Inhalt des Arrays  `animals` auf den Bildschirm ausgeben.

- Mit welchem Ausdruck kannst du auf das zweite Element von `animals` zugreifen?

- Gib den Code an um das erste Element von `animals` auf den Wert `"Unicorn"` zu ändern.

[Lösungen](Programmkonstruktion [Lösungen 19] Arrays.md)
