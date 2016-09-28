# Wiederholungsfragen

## Ausdrücke (Expressions)

- Welche zwei wichtigen Eigenschaften von einem Ausdruck kann man – sofern die Werte von den im Ausdruck vorkommenden Variablen bekannt sind – immer angeben?

  1. Wert
  2. Typ

- Welche Eigenschaft – zusätzlich zu den beiden oben angegeben Merkmalen – besitzt eine Variable auf jeden Fall?

  - Name

- Sind die folgenden Ausdrücke gültig? Falls ja welchen Wert und Typ besitzen sie?

  ```java
  'Leo' + "Cabrio"        // Gültig: Nein
                          // Wert:
                          // Typ:

  1 + 2/4                 // Gültig: Ja
                          // Wert: 1
                          // Typ: int

  1 - (int) 2/4           // Gültig: Ja
                          // Wert: 1
                          // Typ: int

  true ? "Hi" : 'H'       // Gültig: Ja
                          // Wert: "Hi"
                          // Typ: String

  true && False           // Gültig: Nein
                          // Wert:
                          // Typ:

  "Hello " + "World"      // Gültig: Ja
                          // Wert: "Hello World"
                          // Typ: String

  "Hello " - "World"      // Gültig: Nein
                          // Wert:
                          // Typ:
  ```

## Anweisungen (Statements)

- In welcher Reihenfolge werden Anweisungen vom Computer grundsätzlich ausgeführt/ausgewertet („Programmfluss“)?

- Welche zwei speziellen Kategorien von Statements erlauben es  den Programmfluss zu ändern?

  1. Schleifen
  2. Abfragen

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

  Output:

  ```
  1337
  ```

## Arrays

- Definiere ein Array mit dem Namen `animals`, dass die Werte `🦄`, `🐰` und `🙈🙉🙊🐳` speichert.

  ```java
  String[] animals = new String[] {"🦄", "🐰", "🙈🙉🙊🐳"};
  // Alternativ
  String[] animals = {"🦄", "🐰", "🙈🙉🙊🐳"};
  ```

- Schreib eine (oder mehre) Anweisungen die den Inhalt des Arrays  `animals` auf den Bildschirm ausgeben.

  ```java
  // Erster Versuch
  System.out.print(animals[0] + animals[1] + animals[2]);
  System.out.println();

  // Zweiter Versuch
  for(int number = 0; number <= 2; number++) {
      System.out.print(animals[number]);
  }
  System.out.println();

  // Dritter Versuch
  for(String animal : animals) {
      System.out.print(animal);
  }
  ```

- Mit welchem Ausdruck kannst du auf das zweite Element von `animals` zugreifen?

  ```java
  animals[1]
  ```

- Gib den Code an um das erste Element von `animals` auf den Wert `"Unicorn"` zu ändern.

  ```java
  animals[0] = "Unicorn";
  System.out.println(animals[0]);
  ```
