package auditory_exercise_2;

// AT's solution 2022
public class CombinationLockAT2022 {
    private int combination;
    private boolean isOpen;
    private static int DEFAULT_COMBINATION = 100;
    private static int MIN_COMBINATION = 100;
    private static int MAX_COMBINATION = 999;

    public CombinationLockAT2022(int combination) {
        if (isCombinationValid(combination))
            this.combination = combination;
        else
            this.combination = DEFAULT_COMBINATION;

        this.isOpen = false;
    }

    private boolean isCombinationValid(int combination) {
        return combination >= MIN_COMBINATION && combination <= MAX_COMBINATION;
    }

    public boolean open(int combination) {
        this.isOpen = (this.combination == combination);
        return this.isOpen;
    }

    public void lock() {
        this.isOpen = true;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public boolean changeCombination(int oldCombination, int newCombination) {
        if (open(oldCombination) && isCombinationValid(newCombination)) {
            this.combination = newCombination;
            this.lock();
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CombinationLockAT2022 validLock = new CombinationLockAT2022(234);
        System.out.println("TESTING isOpen()........");
        System.out.println(validLock.isOpen());

        System.out.println("TESTING open()........");
        System.out.println(validLock.open(233));
        System.out.println(validLock.open(999));
        System.out.println(validLock.open(234));

        System.out.println("TESTING lock()........");
        validLock.lock();
        System.out.println(validLock.isOpen());

        System.out.println("TESTING changeCombination()........");
        System.out.println(validLock.changeCombination(909, 999));
        System.out.println(validLock.changeCombination(234, 11111));
        System.out.println(validLock.changeCombination(234, 111));
        System.out.println(validLock.changeCombination(100, 111));
        System.out.println(validLock.changeCombination(111, 777));

        CombinationLockAT2022 invalidLock = new CombinationLockAT2022(123456);
        System.out.println("TESTING isOpen()........");
        System.out.println(invalidLock.isOpen());

        System.out.println("TESTING open()........");
        System.out.println(invalidLock.open(123456));
        System.out.println(invalidLock.open(233));
        System.out.println(invalidLock.open(100));

        System.out.println("TESTING lock()........");
        invalidLock.lock();
        System.out.println(invalidLock.isOpen());

        System.out.println("TESTING changeCombination()........");
        System.out.println(invalidLock.changeCombination(123456, 111));
        System.out.println(invalidLock.changeCombination(888, 111));
        System.out.println(invalidLock.changeCombination(100, 344));
        System.out.println(invalidLock.changeCombination(344, 555));
    }
}
