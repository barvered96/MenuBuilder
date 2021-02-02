package MenuBuilder;

public class TextErrorPrinter extends ErrorPrinter {
    @Override
    void printUnMatchedInput() {
        System.out.println();
        System.out.println(ANSI_RED + "MatchError: This menu is of type text  so you need to write correct strings" + ANSI_RESET);
        System.out.println();
    }
}
