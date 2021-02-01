package MenuBuilder;

import java.util.Scanner;

public class IntScanner implements InputScanner {
    Scanner in;
    public IntScanner() {
        this.in = new Scanner(System.in);
    }
    @Override
    public Integer getInput() {
        return this.in.nextInt();
    }
}
