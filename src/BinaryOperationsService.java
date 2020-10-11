public class BinaryOperationsService {

    public static String sum(String a, String b) {
        int parsedFromBinaryA = Integer.parseInt(a, 2);
        int parsedFromBinaryB = Integer.parseInt(b, 2);
        int result = parsedFromBinaryA + parsedFromBinaryB;
        return Integer.toBinaryString(result);
    }

    public static String mult(String a, String b) {
        int parsedFromBinaryA = Integer.parseInt(a, 2);
        int parsedFromBinaryB = Integer.parseInt(b, 2);
        int result = parsedFromBinaryA * parsedFromBinaryB;
        return Integer.toBinaryString(result);
    }
}

