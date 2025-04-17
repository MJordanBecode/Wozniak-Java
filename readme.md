# 🚀 Java - Guide Complet pour Débutants 🚀

![Java Logo](https://upload.wikimedia.org/wikipedia/fr/thumb/2/2e/Java_Logo.svg/131px-Java_Logo.svg.png)

## 📋 Table des matières
1. [🎯 Introduction à Java](#introduction-à-java)
2. [⚙️ Installation et configuration](#installation-et-configuration)
3. [✨ Premier programme Java](#premier-programme-java)
4. [💾 Types de données et variables](#types-de-données-et-variables)
5. [🧮 Opérateurs](#opérateurs)
6. [🔄 Structures de contrôle](#structures-de-contrôle)
7. [📊 Tableaux](#tableaux)
8. [🛠️ Méthodes](#méthodes)
9. [🧩 Programmation Orientée Objet](#programmation-orientée-objet)
10. [🗂️ Collections](#collections)
11. [⚠️ Gestion des exceptions](#gestion-des-exceptions)
12. [📥📤 Entrées/Sorties](#entrées-sorties)
13. [λ Programmation fonctionnelle](#programmation-fonctionnelle)
14. [🧵 Multithreading](#multithreading)
15. [🖥️ Interfaces graphiques (GUI)](#interfaces-graphiques-gui)
16. [🗄️ Connexion à une base de données](#connexion-à-une-base-de-données)
17. [🌟 Bonnes pratiques](#bonnes-pratiques)
18. [📚 Ressources pour aller plus loin](#ressources-pour-aller-plus-loin)

## 🎯 Introduction à Java

### Qu'est-ce que Java? 🤔

Java est un langage de programmation orienté objet, créé en 1995 par **James Gosling** et son équipe chez Sun Microsystems (maintenant propriété d'Oracle). Son slogan emblématique est **"Write Once, Run Anywhere"** (Écrire une fois, exécuter partout), reflétant sa portabilité exceptionnelle.

> *"Java est à C++ ce que le nucléaire est à l'électricité dynamique - pas tout à fait aussi portable, mais infiniment plus puissant."* - C.S. Lewis (adapté)

### ✨ Caractéristiques principales

- **☕ Orienté objet**: Tout en Java est un objet (sauf les types primitifs)
- **🌍 Indépendant de la plateforme**: Grâce à la JVM (Java Virtual Machine)
- **🔒 Sécurisé**: Exécution dans un "bac à sable" contrôlé
- **💪 Robuste**: Typage fort et vérification des erreurs à la compilation
- **🧵 Multi-threading**: Support natif pour la programmation concurrente
- **⚡ Performant**: Compilé en bytecode, optimisé à l'exécution

### 🏗️ Architecture Java

```
┌───────────────────────────────┐
│ JDK (Java Development Kit)    │
│  ┌────────────────────────┐   │
│  │ JRE (Java Runtime Env) │   │
│  │   ┌─────────────────┐  │   │
│  │   │ JVM (Java VM)   │  │   │
│  │   └─────────────────┘  │   │
│  └────────────────────────┘   │
└───────────────────────────────┘
```

- **🔍 JVM (Java Virtual Machine)**: 
  - Interprète et exécute le bytecode Java
  - Abstraction entre votre code et le matériel
  - Gère la mémoire et le garbage collection

- **📦 JRE (Java Runtime Environment)**: 
  - JVM + bibliothèques standards
  - Nécessaire pour exécuter des applications Java
  - Ne contient pas les outils de développement

- **🛠️ JDK (Java Development Kit)**: 
  - JRE + compilateur + outils de développement
  - Nécessaire pour développer des applications Java
  - Inclut javac, jar, javadoc, etc.

### 🔄 Cycle de développement Java

1. **📝 Écriture** du code source (.java)
2. **🔨 Compilation** en bytecode (.class) via `javac`
3. **▶️ Exécution** par la JVM via `java`

![Cycle de développement Java](https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/Workflow_de_Java.svg/440px-Workflow_de_Java.svg.png)

## ⚙️ Installation et configuration

### 🔽 Installation du JDK

#### Étapes d'installation:

1. **Téléchargez** le JDK depuis l'une de ces sources:
   - ☕ [Oracle JDK (officiel)](https://www.oracle.com/java/technologies/javase-downloads.html)
   - 🐧 [OpenJDK (open source)](https://openjdk.java.net/)
   - ☕ [Amazon Corretto](https://aws.amazon.com/corretto/)
   - 🔆 [Azul Zulu](https://www.azul.com/downloads/zulu-community/)

2. **🖱️ Exécutez** l'installateur et suivez les instructions

3. **✅ Vérifiez** l'installation en ouvrant un terminal:
```bash
java -version
javac -version
```

### 🔧 Configuration des variables d'environnement

#### 🪟 Sous Windows

1. Cliquez droit sur **Ce PC** ou **Ordinateur** → **Propriétés** → **Paramètres système avancés** → **Variables d'environnement**

2. Créez une nouvelle **variable système**:
   - Nom: `JAVA_HOME`
   - Valeur: `C:\Program Files\Java\jdk-xx.x.x` (chemin d'installation)

3. Modifiez la variable **Path** et ajoutez:
   - `%JAVA_HOME%\bin`

![Configuration Windows](https://docs.oracle.com/javase/tutorial/figures/essential/environment-variables.gif)

#### 🐧 Sous Linux

Ajoutez à votre fichier `.bashrc` ou `.zshrc`:

```bash
# Configuration Java
export JAVA_HOME=/usr/lib/jvm/votre-jdk
export PATH=$JAVA_HOME/bin:$PATH
```

Puis exécutez:
```bash
source ~/.bashrc
```

#### 🍏 Sous macOS

Ajoutez à votre fichier `.bash_profile` ou `.zshrc`:

```bash
# Configuration Java
export JAVA_HOME=$(/usr/libexec/java_home)
export PATH=$JAVA_HOME/bin:$PATH
```

Puis exécutez:
```bash
source ~/.zshrc
```

### 🖥️ Installation d'un IDE

Pour développer efficacement en Java, un bon IDE (Environnement de Développement Intégré) est essentiel:

| IDE | Logo | Avantages | Inconvénients |
|-----|------|-----------|---------------|
| **IntelliJ IDEA** | 🟠 | Le plus puissant, auto-complétion inégalée, refactoring avancé | Version complète payante, consomme beaucoup de ressources |
| **Eclipse** | 🔵 | Gratuit, très modulaire, grande communauté | Interface parfois complexe, peut être lent |
| **NetBeans** | ⚪ | Gratuit, tout-en-un, adapté aux débutants | Moins de plugins, un peu plus lourd |
| **VS Code** | 🟣 | Léger, extensions Java de qualité | Pas un IDE Java complet nativement |

👉 **Recommandation pour débutants**: Commencez avec **IntelliJ IDEA Community Edition** (gratuit) ou **VS Code** avec les extensions Java.

## ✨ Premier programme Java

### 📁 Structure d'un programme Java

```java
/**
 * Ceci est un commentaire Javadoc
 * Il sert à la documentation du code
 * @author VotreNom
 */
public class MonPremierProgramme {
    // La méthode main est le point d'entrée de tout programme Java
    public static void main(String[] args) {
        // Affiche un message dans la console
        System.out.println("😄 Bonjour, monde!");
        
        // Déclaration et affichage d'une variable
        String message = "Je découvre Java!";
        System.out.println(message);
    }
}
```

#### 🔍 Explications détaillées:

- `public class MonPremierProgramme`: Déclaration de la classe
  - `public`: Accessible depuis n'importe où
  - Le nom du fichier doit être `MonPremierProgramme.java`

- `public static void main(String[] args)`: Méthode principale
  - `public`: Accessible depuis n'importe où
  - `static`: Appartient à la classe, pas à une instance
  - `void`: Ne retourne aucune valeur
  - `main`: Nom obligatoire de la méthode principale
  - `String[] args`: Tableau de paramètres en ligne de commande

- `System.out.println()`: Affiche du texte dans la console
  - `System`: Classe système
  - `out`: Flux de sortie standard
  - `println`: Affiche avec retour à la ligne

### 🔄 Compilation et exécution

#### En ligne de commande:

```bash
# Compilation: création du fichier .class
javac MonPremierProgramme.java

# Exécution: lancement du programme
java MonPremierProgramme
```

![Compilation et exécution](https://media.geeksforgeeks.org/wp-content/uploads/20190711094055/Compilation-and-interpretation-in-Java.jpg)

#### Avec un IDE:
- **IntelliJ IDEA**: Cliquez sur le bouton ▶️ vert
- **Eclipse**: Cliquez sur le bouton ▶️ vert dans la barre d'outils
- **VS Code**: Cliquez sur ▶️ "Run Java"

### 📝 Conventions de nommage

Un bon nommage est essentiel pour un code lisible et maintenable:

| Type | Convention | Exemple | 
|------|------------|---------|
| **Classes** | PascalCase | `MaClasse`, `Utilisateur` |
| **Méthodes** | camelCase | `calculerSomme()`, `getNom()` |
| **Variables** | camelCase | `monAge`, `nombreUtilisateurs` |
| **Constantes** | SNAKE_CASE_MAJUSCULE | `PI`, `MAX_UTILISATEURS` |
| **Packages** | minuscules.minuscules | `com.monentreprise.projet` |

> ⚠️ **Important**: En Java, les noms sont sensibles à la casse. `MonVariable` et `monVariable` sont différents!

## 💾 Types de données et variables

### 🔢 Types primitifs

Java dispose de 8 types primitifs intégrés:

| Type | Taille | Plage | Exemple | Utilisation |
|------|--------|-------|---------|-------------|
| `byte` | 8 bits | -128 à 127 | `byte b = 100;` | Économie de mémoire |
| `short` | 16 bits | -32,768 à 32,767 | `short s = 20000;` | Petits entiers |
| `int` | 32 bits | -2^31 à 2^31-1 | `int i = 42;` | Entiers (usage général) |
| `long` | 64 bits | -2^63 à 2^63-1 | `long l = 9876543210L;` | Grands entiers |
| `float` | 32 bits | ±1.4E-45 à ±3.4E+38 | `float f = 3.14f;` | Décimaux (précision simple) |
| `double` | 64 bits | ±4.9E-324 à ±1.7E+308 | `double d = 3.14159;` | Décimaux (précision double) |
| `char` | 16 bits | 0 à 65,535 | `char c = 'A';` | Caractère Unicode |
| `boolean` | 1 bit | true/false | `boolean b = true;` | Valeurs logiques |

![Types primitifs en Java](https://www.startertutorials.com/corejava/wp-content/uploads/2014/10/primitive-data-types.jpg)

```java
// Exemples d'utilisation des types primitifs
byte petitNombre = 127;
short nombreMoyen = 32000;
int nombreEntier = 2147483647;
long grandNombre = 9223372036854775807L; // 'L' obligatoire pour les littéraux long

float nombreDecimal = 3.14f;  // 'f' obligatoire pour les littéraux float
double nombrePrecis = 3.141592653589793;

char caractere = 'A';
char unicode = '\u0041';  // 'A' en Unicode
char emoji = '😄';        // Les emojis sont supportés

boolean vrai = true;
boolean faux = false;
```

#### 🔍 Valeurs littérales spéciales

```java
// Notation binaire (préfixe 0b, depuis Java 7)
int binaire = 0b1010;  // 10 en décimal

// Notation octale (préfixe 0)
int octal = 012;       // 10 en décimal

// Notation hexadécimale (préfixe 0x)
int hexa = 0xA;        // 10 en décimal

// Séparateur _ pour améliorer la lisibilité (depuis Java 7)
long grandNombreLisible = 1_000_000_000L;
double pi = 3.141_592_653_589;
```

### 📦 Déclaration de variables

```java
// Déclaration simple
int age;

// Déclaration avec initialisation
int taille = 180;

// Déclaration de plusieurs variables du même type
int x, y, z;
int largeur = 10, hauteur = 20;

// Constantes (final)
final double PI = 3.14159;
final int TAILLE_MAX = 100;

// Variables var (inférence de type, depuis Java 10)
var message = "Bonjour";  // Inféré comme String
var nombre = 42;          // Inféré comme int
var liste = new ArrayList<String>();  // Type inféré
```

> 💡 **Conseils**:
> - Utilisez des noms de variables descriptifs
> - Initialisez toujours vos variables avant de les utiliser
> - Utilisez `final` pour les constantes (valeurs qui ne changent pas)

### 🔄 Conversion de types (casting)

```java
// 1. Conversion implicite (élargissement, sûre)
byte petitNombre = 10;
int grandNombre = petitNombre;  // OK: byte -> int

// 2. Conversion explicite (rétrécissement, risqué)
int grand = 128;
byte petit = (byte)grand;  // Attention: 128 devient -128 (dépassement)

// 3. Conversion avec les wrappers
String str = "123";
int nombre = Integer.parseInt(str);
String texte = Integer.toString(nombre);

// 4. Conversion entre types numériques et String
double valeur = 3.14;
String texteValeur = String.valueOf(valeur);  // "3.14"
double retour = Double.parseDouble(texteValeur);  // 3.14
```

![Hiérarchie des conversions](https://www.startertutorials.com/corejava/wp-content/uploads/2014/10/type-casting.jpg)

### 🔡 Type référence: String

Les chaînes de caractères sont des objets en Java:

```java
// Création de chaînes
String message = "Bonjour";  // Façon préférée
String nom = new String("Jean");  // Explicite mais non optimal

// Concaténation
String salutation = message + " " + nom + "!";  // "Bonjour Jean!"

// Concaténation avec StringBuilder (plus efficace pour plusieurs opérations)
StringBuilder builder = new StringBuilder();
builder.append("Bonjour ");
builder.append("à ");
builder.append("tous!");
String resultat = builder.toString();  // "Bonjour à tous!"
```

#### 🛠️ Méthodes utiles pour les String

```java
String texte = "Bonjour le monde!";

// Propriétés basiques
int longueur = texte.length();  // 17
char premier = texte.charAt(0);  // 'B'
boolean estVide = texte.isEmpty();  // false

// Recherche
boolean contient = texte.contains("monde");  // true
int position = texte.indexOf("le");  // 8
int derniere = texte.lastIndexOf("o");  // 11

// Extraction
String partie = texte.substring(8, 10);  // "le"
String[] mots = texte.split(" ");  // ["Bonjour", "le", "monde!"]

// Transformation
String majuscules = texte.toUpperCase();  // "BONJOUR LE MONDE!"
String minuscules = texte.toLowerCase();  // "bonjour le monde!"
String remplace = texte.replace("monde", "Java");  // "Bonjour le Java!"
String sansBlancs = texte.trim();  // Enlève les espaces début/fin

// Comparaison
boolean egal = texte.equals("bonjour le monde!");  // false
boolean egalIgnoreCase = texte.equalsIgnoreCase("bonjour le monde!");  // true
```

> ⚠️ **Important**: Les chaînes sont immuables en Java! Quand vous "modifiez" une chaîne, vous créez en fait une nouvelle chaîne.

### 🧰 Wrapper Classes (Classes enveloppes)

Pour chaque type primitif, Java fournit une classe enveloppe:

| Type primitif | Classe enveloppe | Exemple d'utilisation |
|---------------|------------------|----------------------|
| `byte` | `Byte` | `Byte b = Byte.valueOf((byte)127);` |
| `short` | `Short` | `Short s = Short.valueOf((short)100);` |
| `int` | `Integer` | `Integer i = Integer.valueOf(42);` |
| `long` | `Long` | `Long l = Long.valueOf(9876543210L);` |
| `float` | `Float` | `Float f = Float.valueOf(3.14f);` |
| `double` | `Double` | `Double d = Double.valueOf(3.14159);` |
| `char` | `Character` | `Character c = Character.valueOf('A');` |
| `boolean` | `Boolean` | `Boolean b = Boolean.valueOf(true);` |

```java
// Autoboxing: conversion automatique de primitif vers wrapper
int nombre = 42;
Integer objetNombre = nombre;  // Autoboxing

// Unboxing: conversion automatique de wrapper vers primitif
Double objetPi = 3.14159;
double pi = objetPi;  // Unboxing

// Méthodes utiles des wrappers
int min = Integer.MIN_VALUE;  // -2147483648
int max = Integer.MAX_VALUE;  // 2147483647
int valeur = Integer.parseInt("123");  // String -> int
String binaire = Integer.toBinaryString(10);  // "1010"
```

## 🧮 Opérateurs

### ➕ Opérateurs arithmétiques

```java
int a = 10;
int b = 3;

int addition = a + b;      // 13
int soustraction = a - b;  // 7
int multiplication = a * b; // 30
int division = a / b;      // 3 (division entière)
int modulo = a % b;        // 1 (reste de division)

// Attention aux divisions entières vs flottantes
double resultat1 = 10 / 3;      // 3.0 (division entière)
double resultat2 = 10.0 / 3.0;  // 3.333... (division flottante)

// Incrémentation et décrémentation
int c = 5;
c++;    // Post-incrémentation: utilise c puis ajoute 1 (c = 6)
++c;    // Pré-incrémentation: ajoute 1 puis utilise c (c = 7)
c--;    // Post-décrémentation: utilise c puis soustrait 1 (c = 6)
--c;    // Pré-décrémentation: soustrait 1 puis utilise c (c = 5)

// Exemple de différence pré/post
int x = 5;
int y = x++;  // y = 5, x = 6
int z = ++x;  // z = 7, x = 7
```

![Incrémentation et décrémentation](https://media.geeksforgeeks.org/wp-content/uploads/20230706121731/Increment-and-Decrement-Operators-768.png)

### 📝 Opérateurs d'affectation

```java
int x = 10;  // Affectation simple

// Opérateurs composés
x += 5;  // x = x + 5 (x devient 15)
x -= 3;  // x = x - 3 (x devient 12)
x *= 2;  // x = x * 2 (x devient 24)
x /= 4;  // x = x / 4 (x devient 6)
x %= 4;  // x = x % 4 (x devient 2)

// Autres opérateurs composés
int bits = 5;  // 101 en binaire
bits &= 3;    // bits = bits & 3 = 1
bits |= 6;    // bits = bits | 6 = 7
bits ^= 2;    // bits = bits ^ 2 = 5
bits <<= 1;   // bits = bits << 1 = 10
bits >>= 2;   // bits = bits >> 2 = 2
```

### 🔍 Opérateurs de comparaison

```java
int a = 10;
int b = 20;

boolean egal = (a == b);          // false
boolean different = (a != b);     // true
boolean inferieur = (a < b);      // true
boolean superieur = (a > b);      // false
boolean infEgal = (a <= b);       // true
boolean supEgal = (a >= b);       // false

// ⚠️ Attention à la comparaison d'objets!
String str1 = "Hello";
String str2 = new String("Hello");

boolean compareReference = (str1 == str2);  // false, compare les références
boolean compareContenu = str1.equals(str2); // true, compare le contenu
```

![Opérateurs de comparaison](https://www.startertutorials.com/corejava/wp-content/uploads/2014/10/relational-operators.jpg)

### 🔀 Opérateurs logiques

```java
boolean x = true;
boolean y = false;

boolean et = x && y;    // AND: false (les deux doivent être true)
boolean ou = x || y;    // OR: true (au moins un doit être true)
boolean non = !x;       // NOT: false (inverse la valeur)

// Court-circuit: l'évaluation s'arrête dès que possible
boolean test1 = (5 < 3) && methodeJamaisExecutee();  // false sans exécuter la méthode
boolean test2 = (5 > 3) || methodeJamaisExecutee();  // true sans exécuter la méthode

// Opérateurs bit à bit (pour les booleéns)
boolean etBit = x & y;   // AND sans court-circuit: false
boolean ouBit = x | y;   // OR sans court-circuit: true
boolean ouExclusif = x ^ y;  // XOR: true (l'un ou l'autre mais pas les deux)
```

La table de vérité des opérateurs logiques:

| x | y | x && y | x \|\| y | !x | x ^ y |
|---|---|-------|---------|-----|------|
| `true` | `true` | `true` | `true` | `false` | `false` |
| `true` | `false` | `false` | `true` | `false` | `true` |
| `false` | `true` | `false` | `true` | `true` | `true` |
| `false` | `false` | `false` | `false` | `true` | `false` |

### 🔢 Opérateurs bit à bit

```java
int a = 5;  // 101 en binaire
int b = 3;  // 011 en binaire

int and = a & b;   // AND bit à bit: 001 = 1
int or = a | b;    // OR bit à bit: 111 = 7
int xor = a ^ b;   // XOR bit à bit: 110 = 6
int not = ~a;      // NOT bit à bit: ...111010 = -6 (complément à deux)

int decalG = a << 1; // Décalage à gauche: 1010 = 10 (multiplie par 2)
int decalD = a >> 1; // Décalage à droite: 10 = 2 (divise par 2)
int decalDns = -8 >>> 1; // Décalage à droite non signé: 2147483644
```

Visualisation:

```
    5 = 0000 0101
    3 = 0000 0011
    &   0000 0001 = 1
    |   0000 0111 = 7
    ^   0000 0110 = 6
    ~5  1111 1010 = -6
5<<1   0000 1010 = 10
5>>1   0000 0010 = 2
```

### 🧩 Autres opérateurs

```java
// Opérateur ternaire: condition ? valeur_si_vrai : valeur_si_faux
int age = 20;
String statut = (age >= 18) ? "Majeur" : "Mineur";

// Opérateur instanceof: vérifie le type d'un objet
String texte = "Bonjour";
boolean estString = texte instanceof String;  // true

// Opérateur new: crée un nouvel objet
Date maintenant = new Date();

// Opérateur . (point): accède aux membres d'un objet
int longueur = texte.length();

// Opérateurs [] (crochets): accès aux tableaux
int[] nombres = {1, 2, 3};
int premier = nombres[0];  // 1
```

### 🔢 Priorité des opérateurs

De la plus haute à la plus basse priorité:

1. `()`, `[]`, `.`
2. `!`, `~`, `++`, `--`, `+` (unaire), `-` (unaire)
3. `*`, `/`, `%`
4. `+`, `-`
5. `<<`, `>>`, `>>>`
6. `<`, `<=`, `>`, `>=`, `instanceof`
7. `==`, `!=`
8. `&`
9. `^`
10. `|`
11. `&&`
12. `||`
13. `?:`
14. `=`, `+=`, `-=`, etc.

> 💡 **Conseil**: En cas de doute sur la priorité, utilisez des parenthèses pour rendre le code plus lisible!

## 🔄 Structures de contrôle

### 🔀 Structures conditionnelles

#### If-else

```java
int age = 18;

if (age < 13) {
    System.out.println("👶 Enfant");
} else if (age < 18) {
    System.out.println("🧑‍🦱 Adolescent");
} else if (age < 65) {
    System.out.println("👨 Adulte");
} else {
    System.out.println("👴 Senior");
}

// Version compacte pour instruction simple (sans accolades)
if (age >= 18) System.out.println("✅ Majeur");
else System.out.println("❌ Mineur");
```

> ⚠️ **Attention**: L'omission des accolades `{}` peut être source d'erreurs. Utilisez-les toujours pour plus de clarté, ou au moins pour les blocs de plusieurs lignes.

#### Switch

```java
int jour = 3;
String jourSemaine;

switch (jour) {
    case 1:
        jourSemaine = "Lundi";
        break;  // Important pour éviter la chute!
    case 2:
        jourSemaine = "Mardi";
        break;
    case 3:
        jourSemaine = "Mercredi";
        break;
    case 4:
        jourSemaine = "Jeudi";
        break;
    case 5:
        jourSemaine = "Vendredi";
        break;
    case 6:
    case 7:  // Groupement de cas
        jourSemaine = "Week-end";
        break;
    default:  // Cas par défaut
        jourSemaine = "Jour invalide";
}

System.out.println("Nous sommes " + jourSemaine);
```

#### Switch expressions (Java 14+)

Version moderne avec `->`et `yield`:

```java
// Avec -> (flèche), pas besoin de break
String jourSemaine = switch (jour) {
    case 1 -> "Lundi";
    case 2 -> "Mardi";
    case 3 -> "Mercredi";
    case 4 -> "Jeudi";
    case 5 -> "Vendredi";
    case 6, 7 -> "Week-end";  // Cas multiples
    default -> "Jour invalide";
};

// Avec blocs et yield
String periode = switch (jour) {
    case 1, 2, 3, 4, 5 -> {
        System.out.println("Jour de travail");
        yield "Semaine";  // yield retourne la valeur
    }
    case 6, 7 -> {
        System.out.println("Jour de repos");
        yield "Week-end";
    }
    default -> "Inconnu";
};
```