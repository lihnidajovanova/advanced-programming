## Задача 1

Да се напише програма која ќе ги најде сите парови позитивни цели броеви (a, b) такви што a < b < 1000
и ````(a^2 + b^2 + 1)/(a*b)```` е цел број.

## Задача 2

Да се напише метод кој ќе прима цел број и ќе ја печати неговата репрезентација како Римски број.

пример:
ако се повика со параметар 1998, излезот треба да биде MCMXCVIII.

**за дома:**

````
package mk.ukim.finki.np.av1;

/**
 * Homework 1.1 Roman converter
 */
public class RomanConverter {
    /**
     * Roman to decimal converter
     *
     * @param n number in decimal format
     * @return string representation of the number in Roman numeral
     */
    public static String toRoman(int n) {
        // your solution here
        return "";
    }

    public static void main(String[] args) {
        System.out.println(RomanConverter.toRoman(1998));
    }
}
````

## Задача 3

Ваша задача е да печатите броеви во средни загради, форматирани на следниот начин: [1][2][3], итн. Напишете метод кој
прима два параметри: howMany и lineLength и ги печати броевите од 1 до howMany во претходно опишаниот формат, со што не
смее да се печатат повеќе знаци во една линија од lineLength. Не треба да се започне со отворена
заграда ````[```` ако не може да се затвори во истата линија со соодветна ````]````.

**за дома:**
````
package mk.ukim.finki.np.av1;

/**
 * Homework 1.2 number printer
 */
public class NumberPrinter {

    /**
     * Print numbers from 1 to howMany in following format [1][2]...[howMany]
     *
     * @param howMany    how many numbers to print
     * @param lineLength the length of the lin
     */
    public static void formatNumbers(int howMany, int lineLength) {
        // your solution here
    }

    public static void main(String[] args) {
        formatNumbers(250, 60);
    }
}
````