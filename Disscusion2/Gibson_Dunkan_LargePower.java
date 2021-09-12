import java.math.BigInteger;

public class Gibson_Dunkan_LargePower {
    public static void main(String[] args) {
        System.out.println("50 raised to the power of 70 is " + LargePower(50,70));
    }

    public static BigInteger LargePower (int x, int y) {
        BigInteger z = BigInteger.valueOf(x);
        return z.pow(y);
    }
}
