package MenuBuilder;

public class PrintFunction extends ReturnActionItem {
    public String text;
    public PrintFunction(Menu parentMenu, String displayName, String text) {
        super(parentMenu, displayName);
        this.text = text;
    }
    @Override
    public void ExecuteAction() {
        System.out.println(text);
        super.ExecuteAction();
    }
}
