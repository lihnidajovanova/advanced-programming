package auditory_exercise_2;

// AT's solution 2021
public class CombinationLock2021 {
    private int combination;
    private boolean isOpen;
    private static int DEFAULT_COMBINATION = 100;

    public CombinationLock2021(int combination) {
        if (isCombinationValid(combination))
            this.combination = combination;
        else
            this.combination = DEFAULT_COMBINATION;
        this.isOpen = false;
    }

    public boolean open(int combination) {
        this.isOpen = (this.combination == combination);
        return this.isOpen;
    }

    public boolean changeCombination(int oldCombination, int newCombination) {
        if (open(oldCombination) && isCombinationValid(newCombination)) {
            this.combination = newCombination;
            return true;
        }
        return false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    private boolean isCombinationValid(int combination) {
        return combination >= 100 && combination <= 999;
    }

    public void lock() {
        this.isOpen = false;
    }

    public static void main(String[] args) {
        CombinationLock2021 validLock = new CombinationLock2021(234);

        System.out.println("TEST IS OPEN");
        System.out.println(validLock.isOpen());

        System.out.println("TEST OPEN");
        System.out.println(validLock.open(233));
        System.out.println(validLock.open(236));
        System.out.println(validLock.open(234));

        validLock.lock();

        System.out.println("TEST CHANGE COMBINATION");
        System.out.println(validLock.changeCombination(234, 777));
        System.out.println(validLock.open(777));

        CombinationLock2021 invalidLock = new CombinationLock2021(234567);

        System.out.println("TEST IS OPEN");
        System.out.println(invalidLock.isOpen());

        System.out.println("TEST OPEN");
        System.out.println(invalidLock.open(103));
        System.out.println(invalidLock.open(236));
        System.out.println(invalidLock.open(100));

        invalidLock.lock();

        System.out.println("TEST CHANGE COMBINATION");
        System.out.println(invalidLock.changeCombination(100, 900));
        System.out.println(invalidLock.open(900));
    }
}