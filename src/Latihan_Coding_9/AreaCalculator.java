package Latihan_Coding_9;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(AreaCalculator.area(5.0)); // Output: 78.53981633974483
        System.out.println(AreaCalculator.area(-1)); // Output: -1.0
        System.out.println(AreaCalculator.area(5.0, 4.0)); // Output: 20.0
        System.out.println(AreaCalculator.area(-1.0, 4.0));// Output: -1.0
    }

    public static double area(double radius) {
        if (radius < 0)
            return -1.0;
        return Math.PI * radius * radius;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0)
            return -1.0;
        else
            return x * y;
    }
}
