package TriangleFunction;

public class TriangleFunc {

    public static void main(String[] args) throws Exception {
        triangleArea(3, 3, 3);
        triangleArea(3, 4, 5);
        triangleArea(6, 5, 5);
        triangleArea(5, 6, 11);
        triangleArea(9, 9, 0);
    }
    public static boolean test(int args ) throws Exception {

        triangleArea(3, 3, 3);
        triangleArea(3, 4, 5);
        triangleArea(6, 5, 5);
        triangleArea(5, 6, 11);
        triangleArea(9, 9, 0);

        return false;
    }

    public static double triangleArea(int a, int b, int c) throws Exception {

        double square;

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Triangle side cannot be zero");
            throw new Exception();
        } else {
            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("One side is equal or greater than the sum of the other two");
                throw new Exception();
            } else {
                double p = (a + b + c) / 2;
                square = Math.sqrt(p * (p - a) + (p - b) * (p - c));
                System.out.println("Triangle with side " + a + "x" + b + "x" + c + " has square:" + square);
            }
        }
        return square;
    }


}
