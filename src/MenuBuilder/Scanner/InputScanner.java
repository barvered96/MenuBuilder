package MenuBuilder.Scanner;

import java.util.Scanner;

public class InputScanner {
    Scanner in;

    public InputScanner() {
        in = new Scanner(System.in);
    }

    public Object getInput() { return in.nextLine(); }
}
