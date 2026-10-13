import static java.lang.Integer.parseInt;

public class SafeParser {

    public static int parseIntOrDefault(String s, int def) {
        try {
            return parseInt(s);
        } catch (NumberFormatException e) {
            return def;
        }
    }
    public static double parseDoubleOrDefault(String s, double def) {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return def;
        }
    }

    public static void main(String[] args) {
        System.out.println(parseIntOrDefault("123", 0));
        System.out.println(parseIntOrDefault("abc", 10));
        System.out.println(parseIntOrDefault(null, -1));
        System.out.println(parseDoubleOrDefault("45.67", 0.0));
        System.out.println(parseDoubleOrDefault("xeta", 9.9));
    }
}