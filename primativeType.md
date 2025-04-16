# 📚 Java Primitive Types

Ce projet documente les **types primitifs** en Java, avec leurs tailles en mémoire et plages de valeurs.  
Java dispose de 8 types de base, essentiels à la manipulation des données.

---

## 🔢 Tableau des types primitifs en Java

| Type       | Taille (bytes) | Valeur minimale             | Valeur maximale               |
|------------|----------------|------------------------------|-------------------------------|
| `byte`     | 1              | -128                         | 127                           |
| `short`    | 2              | -32 768                      | 32 767                        |
| `int`      | 4              | -2 147 483 648               | 2 147 483 647                 |
| `long`     | 8              | -9 223 372 036 854 775 808   | 9 223 372 036 854 775 807    |
| `float`    | 4              | ±1.4 × 10⁻⁴⁵                 | ±3.4 × 10³⁸                  |
| `double`   | 8              | ±4.9 × 10⁻³²⁴                | ±1.8 × 10³⁰⁸                 |
| `char`     | 2              | '\u0000' (0)                 | '\uffff' (65 535)             |
| `boolean`  | 1 (approx.)    | `false`                      | `true`                        |

---

## 🧠 Notes

- Les tailles sont en **octets** (1 byte = 8 bits).
- Les plages de valeurs des entiers et décimaux sont basées sur les spécifications **IEEE 754** pour `float` et `double`.
- Le type `char` est basé sur le standard **Unicode**.
- Le type `boolean` représente deux états (`true` ou `false`) mais sa taille exacte n’est pas définie dans la JVM.

---

## 📦 Utilisation

Ce tableau est utile pour :
- Comprendre la mémoire utilisée par vos variables.
- Éviter les dépassements de type.
- Choisir le bon type selon vos besoins en performance ou précision.

---

## ✍️ Auteur

Réalisé avec ❤️ pour apprendre les bases des types primitifs en Java.

