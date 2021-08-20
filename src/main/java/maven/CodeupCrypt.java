package maven;

public class CodeupCrypt {

    public static double version;

    public static String hashPassword(String string) {
        String hashed = "";
        for (char character : string.toCharArray()) {
            switch (character) {
                case 'a':
                case 'A':
                    hashed += 4;
                    break;
                default:
                    hashed += character;
            }
        }
        return hashed;
    }
}
