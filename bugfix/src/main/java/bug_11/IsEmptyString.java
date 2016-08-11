package bug_11;

/**
 * uncommented this piece of code
 *
 * remember for min changes
 */
public class IsEmptyString {

   final private String CUSTOM_DEFAULT_VALUE;// not initialize it in declaration

    public IsEmptyString() {
       CUSTOM_DEFAULT_VALUE = null;
    }

    public static void main(String[] args) {

        IsEmptyString isEmptyString = new IsEmptyString();

        if (args[0].equals(isEmptyString.CUSTOM_DEFAULT_VALUE)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }
}
