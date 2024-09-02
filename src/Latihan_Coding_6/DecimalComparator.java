package Latihan_Coding_6;

public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // Output: true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); // Output: false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); // Output: true
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123)); // Output: false
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int num1Int = (int) (num1 * 1000);
        int num2Int = (int) (num2 * 1000);
        return num1Int == num2Int;
    }
}
