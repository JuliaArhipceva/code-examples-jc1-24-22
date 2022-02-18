package lecture2;

/**
 * Class with main method to show {@code boolean} example.
 *
 * @author Julia
 * @version 1.0
 */
public class ExampleBoolean {
    public static void main(String[] args) {
        boolean booleanVarTrue; // declaration

        /*
        This is not allowed and won't be compiled,
        because variable isn't initialized.
         */
        // System.out.println(booleanVarTrue);

        booleanVarTrue = true; // initialization
        System.out.println(booleanVarTrue);

        boolean booleanVarFalse = false; // declaration + initialization
        System.out.println(booleanVarFalse);

        booleanVarFalse = true;
        System.out.println(booleanVarFalse);
    }
}
