# BIT235 Workshop 2 — Fundamental Programming Structures in Java

**Course:** BIT235 Object Oriented Programming (OOP)
**Workshop 2:** Fundamental Programming Structures in Java
**Topic:** Variables — Primitive Datatypes and String

Eight exercise programs written in plain Java (no external libraries), one file per
exercise, all in `src/`.

---

## 1. Requirements

- JDK 8 or newer (`javac -version`)
- Any editor: VS Code, IntelliJ IDEA, Eclipse, or a terminal

## 2. Compile and run

From the project root:

```bash
# compile every exercise into out/
javac -d out src/*.java

# run one exercise (replace the number)
java -cp out Exercise1_1
```

On macOS / Linux you can chain it in one line, e.g.:

```bash
javac -d out src/*.java && java -cp out Exercise1_1
```

In VS Code: open the folder, open any `src/Exercise1_x.java`, press **F5**
(or the ▷ Run button). The entry point is always `public static void main`.

## 3. The exercises

| # | File | What it does | Key formula / idea |
|---|------|--------------|--------------------|
| 1.1 | `src/Exercise1_1.java` | Reads two integers and displays their difference | `first - second`, `Scanner.nextInt()` |
| 1.2 | `src/Exercise1_2.java` | Converts Celsius to Fahrenheit | `F = C * 9/5 + 32` |
| 1.3 | `src/Exercise1_3.java` | Area of a circle for several radii | `Area = 3.14 * Math.pow(r, 2)` |
| 1.4 | `src/Exercise1_4.java` | Compound interest on P = 5000, r = 4 %, n = 10 | `A = P * Math.pow(1 + r, n)` |
| 1.5 | `src/Exercise1_5.java` | Volumes of the Earth and the Sun and their ratio | `V = (4/3) * 3.14 * Math.pow(r, 3)` |
| 1.6 | `src/Exercise1_6.java` | Distance on a 40 L tank, normal vs. rough road | `distance = tank / (litres per 100 km) * 100` |
| 1.7 | `src/Exercise1_7.java` | Answers the `substring(7, 11)` question | see below |
| 1.8 | `src/Exercise1_8.java` | Compares two strings and their first characters | `equals()`, `charAt(0)` |

### Exercise 1.7 — written answer

`"I love java programming".substring(7, 11)`

- `substring(begin, end)` includes `begin` and **excludes** `end`,
  so the length is `11 - 7 = 4`.
- Characters at index 7, 8, 9, 10 are `j`, `a`, `v`, `a`.

**The string is `"java"` and its length is 4.**

```
Index : 0 1 2 3 4 5 6 7  8  9 10 11
Char  : I   _ l o v e _ j  a  v  a
                        ^-------^
                      begin=7  end=11 (excluded)
```

## 4. Sample output

Exercise 1.1

```
Enter the first integer  : 17
Enter the second integer : 5

The difference of the two numbers is:
17 - 5 = 12
```

Exercise 1.4

```
Principal (P)          : $5,000.00
Interest rate (r)      : 4% per year
Number of years (n)    : 10
Amount (A)             : $7,401.22
Interest earned        : $2,401.22
```

Exercise 1.6

```
Normal road : 8.0 litres / 100 km
  Distance on a full tank : 500.00 km
Rough road  : 9.2 litres / 100 km (+15%)
  Distance on a full tank : 434.78 km
```

Exercise 1.8

```
Enter the first string  : Apple
Enter the second string : Apricot
The two given strings are equal: false
First character of string 1: 'A'
First character of string 2: 'A'
The first characters are equal: true
```

## 5. Common mistakes this code avoids

1. **Integer division.** `4 / 3` is `1` and `9 / 5` is `1` when both operands are
   `int`. The exercises use `4.0 / 3.0` and `9.0 / 5.0` (or multiply by a
   `double` first) so the decimal part is kept.
2. **Percentages.** `4%` must be written as `0.04`, not `4`.
3. **`Math.pow` returns `double`.** Results are printed with `printf` and a
   format such as `%.2f` instead of being cast to `int`.
4. **Comparing strings.** `equals()` compares contents; `==` compares object
   references and is usually wrong for strings.
5. **Mixing `nextInt()` and `nextLine()`.** Exercise 1.8 reads both strings with
   `nextLine()` so no leftover newline is consumed by accident.
6. **`charAt(0)` on an empty string** throws `StringIndexOutOfBoundsException`,
   so the first-character comparison is guarded by `isEmpty()`.

## 6. Repository layout

```
BIT235Workshop2/
├── README.md
├── .gitignore
└── src/
    ├── Exercise1_1.java
    ├── Exercise1_2.java
    ├── Exercise1_3.java
    ├── Exercise1_4.java
    ├── Exercise1_5.java
    ├── Exercise1_6.java
    ├── Exercise1_7.java
    └── Exercise1_8.java
```

Compiled `.class` files go to `out/`, which is ignored by Git.

## 7. Submitting

1. Create a **public** GitHub repository named `BIT235Workshop2`.
2. Push this folder from VS Code (**Source Control → Publish to GitHub →
   public**) or upload the files on github.com.
3. Copy the repository URL into the *GitHub Link* field of the workshop
   document.
