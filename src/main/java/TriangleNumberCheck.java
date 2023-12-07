public class TriangleNumberCheck {
    public static void main(String[] args) {
        System.out.println(isTriangleNumber(125250));
    }

    public static Boolean isTriangleNumber(long number) {
        //number = (n^2 + n) / 2 => n^2 + n - 2 * number = 0
        //delta = 1 + 8*number (delta=b^2−4ac)
        long delta = 1 + 8 * number;
        long sqrtDelta = (long) Math.sqrt(delta);
        System.out.println(sqrtDelta);
        return delta > 0 && sqrtDelta * sqrtDelta == delta;
    }
}
