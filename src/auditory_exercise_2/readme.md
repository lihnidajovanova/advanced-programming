## Задача 1 - StringPrefix.java

Да се напише метод кој враќа точно ако String str1 е префикс на String str2. Не е дозволено користење на готови методи
за пребарување, единствено дозволено е користење на charAt.

## Задача 2 - Matrix.java (сума и просек)

Да се имплементираат следните методи кои примаат дво-димензионални низи од double и враќаат како резултат сума и просек.

## Задача 3 - Катанец (CombinationLock.java)

Катанец со комбинации Combination Lock ги има следните својства:

* комбинацијата (секвенца од 3 цифри) е скриена

* катанецот може да се отвори само ако се внесе точната комбинација

* комбинацијата може да се промени само ако се знае претходната комбинација.

Да се дизајнира класа со јавни методи open и changeCombo и приватни податоци кои ја чуваат комбинацијата. Комбинацијата
се поставува преку конструкторот.

## Задача 4 - BigComplex.java

Комплексен број се состои од реален дел и имагинарен дел. Да се импалементира класа BigComplex, во која реалниот и
имагинарниот дел ќе се чуваат во објекти од класата BigDecimals.

**За дома:**
Имплементирајте ги останатите методи за одземање subtract, множење multiply и делење divide.

**Addition (add):** This method adds the real parts and imaginary parts of two complex numbers.

**Subtraction (subtract):** This method subtracts the real parts and imaginary parts of two complex numbers.

**Multiplication (multiply):** This method multiplies two complex numbers using the formula:

<p align="center">(a+bi)×(c+di)=(ac−bd)+(ad+bc)i</p>

**Division (divide):** This method divides two complex numbers using the formula:

<p align="center">
(a+bi)/(c+di) = ((()ac+bd)+(bc-ad)i)/(c^2+d^2)
</p>

Here, we use BigDecimal.divide with a MathContext to ensure proper precision.

**toString method:** Converts the complex number to a string in the format "a + bj".