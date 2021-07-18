package converter.systems;

public class ConvertTo {
    public static String system(long num, int baseSystem, int toSystemNum) {
        switch (baseSystem) {
            case 2:
                return Binary.toSwitch(num, toSystemNum);
            case 8:
                return Octal.toSwitch(num, toSystemNum);
            case 10:
                return Decimal.convertSwitch(num, toSystemNum);
            case 16:
                return Hex.toSwitch(num, toSystemNum);
            default:
                return "Wrong targetBase";
        }
    }
}
