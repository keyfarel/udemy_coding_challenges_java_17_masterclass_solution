package Latihan_Coding_7;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1)); // false
        System.out.println(hasEqualSum(1, 1, 2)); // true
        System.out.println(hasEqualSum(1, -1, 0)); // true

    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        if (num1 + num2 == num3)
            return true;
        else
            return false;
    }
}
