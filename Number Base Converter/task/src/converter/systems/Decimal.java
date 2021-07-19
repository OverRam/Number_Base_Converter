package converter.systems;

public class Decimal {
    private static StringBuilder sb;

    public static String convertSwitch(String num, int rand, String toFrom) {
        sb = new StringBuilder();
        switch (toFrom) {
            case "/from":
                fromDec(Long.parseLong(num), rand);
                return sb.reverse().toString();
            case "/to":
                toDec(num, rand);
                return sb.toString();
            default:
                return "Wrong promp";
        }

    }

    private static void toDec(String num, int rand) {
        long sum = 0;
        for (int i = 0, j = num.length() - 1; i < num.length(); i++, j--) {
            sum += (num.charAt(j) > 64 ? num.charAt(j) - 55 : num.charAt(j) - 48) * Math.pow(rand, i);
        }
        sb.append(sum);
    }

    // it work to any system u want
    private static String fromDec(long num, int rand) {
        char a = 'A';
        int rem;
        if (num < rand) {
            if (num > 9) {
                return sb.append((char) (a + num - 10)).toString();
            }
            return sb.append(num).toString();
        } else {
            rem = (int) (num % rand);
            if (rem > 9) {
                sb.append((char) (a + rem - 10));
            } else {
                sb.append(rem);
            }
        }
        return fromDec((num - rem) / rand, rand);
    }
}
