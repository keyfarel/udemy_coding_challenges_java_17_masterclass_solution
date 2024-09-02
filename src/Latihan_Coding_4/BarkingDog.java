package Latihan_Coding_4;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(BarkingDog.shouldWakeUp(true, 1)); // Output: true
        System.out.println(BarkingDog.shouldWakeUp(false, 2)); // Output: false
        System.out.println(BarkingDog.shouldWakeUp(true, 8)); // Output: false
        System.out.println(BarkingDog.shouldWakeUp(true, -1)); // Output: false
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0
                || hourOfDay > 23)
            return false;
        if (barking && (hourOfDay < 8
                || hourOfDay > 22))
            return true;
        return false;
    }
}
