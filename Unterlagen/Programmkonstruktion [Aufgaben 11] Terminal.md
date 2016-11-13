# Aufgaben

## Erste Schritte

1. Öffne das Programm „Terminal“
2. In welchem Verzeichnis befindest du dich?
3. Welche Dateien befinden sich im aktuellen Verzeichnis?
4. Wechsle ins Verzeichnis `Library`
5. Wie kannst du feststellen ob du dich wirklich im Verzeichnis `Library` befindest?
6. Welche Dateien befinden sich im Verzeichnis?

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

6. Was passiert wenn du folgende Befehl im Terminal eingibst?

    ```bash
    java Parameter Hi Ho Huhu
    java Parameter Hello World bla blubb
    java Parameter 'Hello World' bla blubb
    java Parameter "Hello World" bla blubb
    ```

7.  Was macht das Java-Programm?

8. Wozu können einfache oder doppelte Anführungszeichen bei Terminal-Befehlen verwendet werden?

[Lösungen](Programmkonstruktion [Lösungen 11] Terminal.md)
