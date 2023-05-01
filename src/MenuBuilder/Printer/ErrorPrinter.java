package MenuBuilder.Printer;

public class ErrorPrinter {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void printBadInput(String errorMsg) {
        System.out.println();
        System.out.println(ANSI_RED + errorMsg + ANSI_RESET);
        System.out.println();
    }
    public void printUnMatchedInput(String type) {
        System.out.println();
        System.out.println(ANSI_RED + "MatchError: This menu is of type " + type + " so you need to write correct strings" + ANSI_RESET);
        System.out.println();
    }
}
