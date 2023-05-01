package deobfuscator.deobs.impl.ASM;

import java.math.BigInteger;

public final class MultiplierFinderUtilities {
    private static final BigInteger UNSIGNED_INT_MODULUS = BigInteger.ONE.shiftLeft(Integer.SIZE);
    private static final BigInteger UNSIGNED_LONG_MODULUS = BigInteger.ONE.shiftLeft(Long.SIZE);

    public static int invert(int n) {
        return nToBigInteger(n).modInverse(UNSIGNED_INT_MODULUS).intValue();
    }

    public static long invert(long n) {
        return nToBigInteger(n).modInverse(UNSIGNED_LONG_MODULUS).longValue();
    }

    public static Number invert(Number n) {
        if (n instanceof Integer) {
            return invert(n.intValue());
        } else if (n instanceof Long) {
            return invert(n.longValue());
        } else {
            throw new IllegalArgumentException("Unsupported number type: " + n.getClass().getName());
        }
    }

    public static boolean isInvertible(int n) {
        return (n & 1) == 1;
    }

    public static boolean isInvertible(long n) {
        return isInvertible((int) n);
    }

    public static boolean isInvertible(Number n) {
        if (n instanceof Integer || n instanceof Long) {
            return isInvertible(n.intValue());
        } else {
            throw new IllegalArgumentException("Unsupported number type: " + n.getClass().getName());
        }
    }

    private static BigInteger nToBigInteger(Number n) {
        if (n instanceof Integer) {
            return BigInteger.valueOf(n.intValue());
        } else if (n instanceof Long) {
            return BigInteger.valueOf(n.longValue());
        } else {
            throw new IllegalArgumentException("Unsupported number type: " + n.getClass().getName());
        }
    }
}
