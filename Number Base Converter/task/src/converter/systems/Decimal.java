package converter.systems;

public class Decimal {
    private static final StringBuilder sb = new StringBuilder();

    static String convertSwitch(long num, int rand) {
        calc(num, rand);
        return sb.reverse().toString();
    }

// it work to any system
    private static String calc(long num, int rand) {
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
        return calc((num - rem) / rand, rand);
    }
}
