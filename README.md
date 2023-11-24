# M03 A7b Classes Abstractes i Interfícies

## Animals

Aquest és un petit programa Java que demostra com ordenar una llista d'objectes de la classe `Animal` segons el seu pes, de major a menor.

## Com funciona?

El programa consta d'una classe principal `Tester` que conté el mètode `main`. En aquest mètode, s'inicialitzen diversos objectes de la classe `Animal` i les seves subclasses com:

- `Animal` (abstracta)
  - `Aeri` (abstracta)
    - `Aliga` (implements Ovipar, Habitat)
  - `Aquatic` (abstracta)
    - `Dofi` (implements Ovipar, Habitat)
  - `Terrestre` (abstracta)
    - `Lleona` (implements Ovipar, Habitat)

```java
Arrays.sort(arrayAnimals);