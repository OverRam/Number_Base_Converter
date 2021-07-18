package converter.systems;

public class Decimal {
    private static final StringBuilder sb = new StringBuilder();

    static String convertSwitch(long num, int rand) {
        switch (rand) {
            case 2:
                toBinary(num);
                return sb.reverse().toString();
            case 8:
                return toOcta(num);
            case 16:
                return toHex(num);
            default:
                return "Wrong number";
        }
    }

    private static String toBinary(long num) {
        if (num == 1 || num == 0) {
            return sb.append(num).toString();
        } else {
            sb.append(num % 2);
        }
        return toBinary(num / 2);
    }

    private static String toOcta(long num) {
        return "s";
    }

    private static String toHex(long num) {
        return "s";
    }


}
