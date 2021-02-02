package MenuBuilder;

import java.util.Scanner;

public class InputScanner {
    Scanner in;

    public InputScanner() {
        in = new Scanner(System.in);
    }

    Object getInput() { return in.nextLine(); }
}
