package converter;

import java.math.BigInteger;

public class Converter {

    public static String convert(String num, int sourceBase, int targetBase) {
        if (targetBase == 10) {
            return toDec(num, sourceBase).toString();
        } else {
            return fromDec(toDec(num, sourceBase).toString(), targetBase).toUpperCase();
        }
    }

    private static BigInteger toDec(String num, int rand) {
        num = num.toUpperCase();  //UpperCase = bigger range

        BigInteger big = BigInteger.ZERO;
        BigInteger range = BigInteger.valueOf(rand);
        for (int i = 0, j = num.length() - 1; i < num.length(); i++, j--) {
            big = big.add(BigInteger.valueOf(num.charAt(j) >= 65 ? num.charAt(j) - 55 : num.charAt(j) - 48)
                    .multiply(range.pow(i)));
        }
        return big;
    }

    private static String fromDec(String num, int rand) {

        BigInteger numberToConvert = new BigInteger(num);
        StringBuilder sb = new StringBuilder();
        BigInteger range = BigInteger.valueOf(rand);
        BigInteger rem;

        do {
            rem = numberToConvert.remainder(range);
            numberToConvert = (numberToConvert.subtract(rem)).divide(range);
            if (rem.compareTo(BigInteger.valueOf(9)) > 0) {
                sb.append((char) ('A' + rem.intValue() - 10));
            } else {
                sb.append(rem);
            }

            if (numberToConvert.compareTo(range) < 0 && numberToConvert.compareTo(BigInteger.ZERO) > 0 ) {
                if (numberToConvert.compareTo(BigInteger.valueOf(9)) > 0) {
                    sb.append((char) ('A' + numberToConvert.intValue() - 10));
                } else {
                    sb.append(numberToConvert);
                }
            }
        } while (numberToConvert.compareTo(range) > -1);

        return sb.reverse().toString();

    }
}
