package auditory_exercise_2;

import java.util.Scanner;

// AT's solution 2023
public class CombinationLock2023 {
    int combination;
    boolean isOpen;
    int attemptsLeft;

    public CombinationLock2023() {
        this.combination = 111;
        this.attemptsLeft = 3;
        this.isOpen = false;
    }

    public CombinationLock2023(int combination) {
        this.combination = combination;
        this.attemptsLeft = 3;
        this.isOpen = false;
    }

    public void open(int input) {
        if (this.combination == input) {
            isOpen = false;
            if (isOpen) {
                System.out.println("Yeey, you opened the lock!");
            } else {
                System.out.println("Yeey, you locked the lock!");
            }
            attemptsLeft = 3;
        } else {
            --attemptsLeft;
            System.out.printf("You didn't guess the combination. In %d attempts you will be locked!", attemptsLeft);
            if (attemptsLeft == 0) {
                throw new RuntimeException();
            }
        }
    }

    public static void main(String[] args) {
        CombinationLock2023 lock = new CombinationLock2023(456);

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int comb = sc.nextInt();
            lock.open(comb);
        }
    }
}
