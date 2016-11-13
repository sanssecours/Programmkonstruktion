# Eingabe

- Eine Möglichkeit der Eingabe haben wir schon gesehen (Argument nach Programmnamen angeben)
  - **Eingabe vor Programmausführung**
  - Dies ist auch die am häufigst eingesetzte Variante
  - Sehr mächtig, da sie es erlaubt Befehle zu kombinieren
  - Terminal-Befehle + (Abfragen, Schleifen, Funktionen) ergeben wieder eigene Programmiersprache (Shell-Programmierung)
  - Beispiel eines Shell-Programms:

    ```bash
      if [[ 2 < 3 ]]; then
        say "2 is smaller than 3"
        # Variable `PWD` beinhaltet aktuelles Verzeichnis
        # Zugriff auf eine Variable `var` mittels $var
        say "You are currently in the directory $PWD"
      fi
    ```

- Zweite Möglichkeit: **Interaktive Eingabe**
  - Programm liest **während Progamm-Ausführung**  Eingabe von Nutzer ein
  - Einlesen in Java zum Beispiel mittels Klasse `Scanner` möglich

## Beispiel-Programm

```java
// Importiere das Package Scanner
// Wird benötigt um Scanner-Klasse verwenden zu können
import java.util.Scanner;

public class Eingabe {
    public static void main(String[] args) {
        String eingabe;
        // Erstelle neues Objekt `scanner` vom Typ/Klasse `Scanner`
        // Verwende `System.in` („Tastatur“) zum Einlesen
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eingabe (Abschluss mit ↩): ");
        // Speichere eine Zeile der Eingabe in der Variable `eingabe`
        eingabe = scanner.nextLine();
        System.out.println("Deine Eingabe war: " + eingabe);
    }
}
```
