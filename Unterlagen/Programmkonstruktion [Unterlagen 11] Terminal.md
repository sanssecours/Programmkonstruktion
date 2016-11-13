# Terminal

- Früher hatten Computer keine grafische Benutzeroberfläche
- Programme wurden per Kommandozeile (Terminal) bedient
- Eingabe von **Befehlen** (Kommandos) rein mittels Keyboard (keine Maus, keine Touch-Bedienung)
- Heute ist das Terminal ein ganz normales Programm am Rechner
  - OS X: Terminal, iTerm
  - Windows: Kommandoeingabe
  - Linux: Gnome Terminal,  Konsole, …
- Benutzergruppe heutzutage:
  - Power-User
  - Entwickler
  - Hacker
  - System-Administratoren

## Allgemeiner Aufbau von Terminal-Befehlen

- Als erstes kommt der Name des Befehls
- Danach folgen mehrere Argumente/Parameter (es kann auch sein, dass ein Befehl keine Argument benötigt)
- Befehl und Parameter werden durch Leerzeichen getrennt
- Analogie: Aufbau ähnlich wie Aufruf von Java-Funktionen
  - Name der Funktion + Mehrere Parameter
  - Bei Java Funktionen werden – im Gegensatz zu Terminal-Befehlen – Beistriche zur Trennung der Parameter verwendet

```
nameDesBefehls argument1 argument2 argument3 …
```

## Beispiele

- Zum Ausführen einfach einzelne Zeile in `Terminal` einfügen und Return drücken
- Synonyme:
  - Folder = Verzeichnis = Directory = Ordner
  - Befehl = Kommando
- Abkürzungen:
  - pwd: **p**rint **w**orking **d**irectory
  - cd: **c**hange **d**irectory
  - ls: **l**i**s**t

```sh
say Hi # Computer gibt das Worte „Hi“ über Lautsprecher/Kopfhörer aus
pwd    # Zeigt an in welchem Verzeichnis man sich gerade befindet
ls     # Zeigt die Dateien im aktuellen Verzeichnis an
cd     # Wechselt ins „Home“-Verzeichnis
cd Pictures # Geht in das Verzeichnis `Pictures` im aktuellen Ordner
javac Test.java # Kompiliert die Java-Datei `Test.java`
                # Ergebnis (wenn es keine Fehler gibt): `Test.class`
java Test # Führt das Programm `Test.class` aus
```
