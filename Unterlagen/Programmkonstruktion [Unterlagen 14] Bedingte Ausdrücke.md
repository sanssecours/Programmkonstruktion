# Bedingter Ausdruck

- Bedingter Ausdruck liefert je nach Wert von Bedingung unterschiedlichen Wert
- Bedingter Ausdruck hat sehr niedere Priorität (wird also erst sehr spät ausgewertet)

## Aufbau

```
boolscherAusdruck ? WertWennWahr : WertWennFalsch
```

## Beispiele

```java
2 < 3 ? true : false        // Ergebnis: true
2 < 3 ? false : true        // Ergebnis: true
false || true ? "Hi" : "Ho" // Ergebnis: "Hi"
```
