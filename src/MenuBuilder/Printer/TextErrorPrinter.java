package MenuBuilder.Printer;

import MenuBuilder.Printer.Interface.ErrorPrinter;

public class TextErrorPrinter extends ErrorPrinter {
    @Override
    public void printUnMatchedInput() {
        System.out.println();
        System.out.println(ANSI_RED + "MatchError: This menu is of type text  so you need to write correct strings" + ANSI_RESET);
        System.out.println();
    }
}
