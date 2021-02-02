package MenuBuilder;

public class NumericalErrorPrinter extends ErrorPrinter {
    @Override
    void printUnMatchedInput() {
        System.out.println();
        System.out.println(ANSI_RED + "MatchError: This menu is of type Numerical so you need to write number options" + ANSI_RESET);
        System.out.println();
    }
}
