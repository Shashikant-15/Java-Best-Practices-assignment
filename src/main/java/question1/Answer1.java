package question1;

public class Answer1 {

    // public static void main() {     // we can't make another method within a main method
    private static String compareStringValues(final String value) {

        if (value.equals("MOM"))
            return "MOM";
        else
            return "DAD";
    }

    /**
     * @param args arguments
     */
    public static void main(final String[] args) {
        System.out.println(compareStringValues(null) + "cook food for me");
    }
}
