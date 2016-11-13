# Aufgaben

## Erste Schritte

1. Öffne das Programm „Terminal“

   - Das Programm befindet sich im Ordner `/Applications/Utilities`

2. In welchem Verzeichnis befindest du dich?

     -  Im Verzeichnis des aktuellen Benutzers.

3. Welche Dateien befinden sich im aktuellen Verzeichnis?

    - Die Dateien des Benutzers

4. Wechsle ins Verzeichnis `Library`

   - Befehl: `cd Library`

5. Wie kannst du feststellen ob du dich wirklich im Verzeichnis `Library` befindest?

   - Mittels des Befehls `pwd`

6. Welche Dateien befinden sich im Verzeichnis?

   - Befehl: `ls`

## Übersetzen von Java-Programmen

1. Erstelle eine neue Datei `Parameter.java` mit folgendem Inhalt:

    ```java
    public class Parameter {
        public static void main(String[] args) {

            for(int argCount = 0; argCount < args.length; argCount++) {
                System.out.println(argCount + ". Argument: " +  args[argCount]);
            }

        }
    }
    ```

2.  Speicher die Datei im Ordner `Documents`

3. Öffne die Applikation Terminal

4. Übersetze die Datei `Parameter.java` und führe sie dann aus (**Hinweis:** Um die Datei  auszuführen solltest du als erstes ins Verzeichnis, in dem du die Datei gespeichert hast, wechseln)

5. Welche Befehle hast du in Schritt 4 verwendet?

    ```sh
    cd Documents
    javac Parameter.java
    java Parameter
    ```

6. Was passiert wenn du folgende Befehl im Terminal eingibst?

    ```bash
    # Ausgabe:
    #
    # 1. Argument: Hi
    # 2. Argument: Ho
    # 3. Argument: Huhu
    java Parameter Hi Ho Huhu

    # Ausgabe:
    #
    # 1. Argument: Hello
    # 2. Argument: World
    # 3. Argument: bla
    # 4. Argument: blubb
    java Parameter Hello World bla blubb

    # Ausgabe:
    #
    # 1. Argument: Hello World
    # 2. Argument: bla
    # 3. Argument: blubb
    java Parameter 'Hello World' bla blubb

    # Ausgabe:
    #
    # 1. Argument: Hello World
    # 2. Argument: bla
    # 3. Argument: blubb
    java Parameter "Hello World" bla blubb
    ```

7.  Was macht das Java-Programm?

    - Das Programm gibt die übergebenen Argumente aus.

8. Wozu können einfache oder doppelte Anführungszeichen bei Terminal-Befehlen verwendet werden?

    - Die Anführungszeichen können verwendet werden um zwei oder mehreren Eingaben – getrennt durch Leerzeichen – zu einem Argument zusammen zu fassen.
