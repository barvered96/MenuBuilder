package MenuBuilder;

import java.util.Scanner;

public class TextScanner implements InputScanner {
    Scanner in;
    public TextScanner() {
        this.in = new Scanner(System.in);
    }
    @Override
    public String getInput() {
        return this.in.nextLine();
    }
}
