import java.math.BigInteger;

public class Gibson_Dunkan_LargePower {
    public static void main(String[] args) {
        System.out.println("50 raised to the power of 70 is " + LargePower(50, 70));
    }

    public static BigInteger LargePower (long x, long y) {

        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= y; i++)
        result = result.multiply(new BigInteger(x +""));
        return result;

        // BigInteger z = BigInteger.valueOf(x);
        // return z.pow(y);
    }
}

