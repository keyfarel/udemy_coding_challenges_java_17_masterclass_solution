package Latihan_Coding_1;

public class PositiveNegativeZero {
    public static void main(String[] args) throws Exception {
        checkNumber(10); // positive
        checkNumber(-10); // negative
        checkNumber(0); // zero
    }

    public static void checkNumber(int number) {
        if (number > 0)
            System.out.println("positive");
        else if (number < 0)
            System.out.println("negative");
        else
            System.out.println("zero");

    }
}
