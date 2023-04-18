package Value.Tower.Cat;

class Utils {
    static boolean isInteger(String str) {
        return str.matches("^-?\\d+$");
    }

    static boolean isDouble(String str) {
        return str.matches("^-?\\d+\\.\\d+$");
    }
}
