package Latihan_Coding_5;

public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2004)); // Output: true
        System.out.println(isLeapYear(1700)); // Output: false
        System.out.println(isLeapYear(1600)); // Output: true
        System.out.println(isLeapYear(2017)); // Output: false
        System.out.println(isLeapYear(2000)); // Output: true
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
