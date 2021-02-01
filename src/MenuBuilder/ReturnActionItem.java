package MenuBuilder;

public class ReturnActionItem extends ActionItem {
    protected MenuItem parentMenu;
    public ReturnActionItem(Menu parentMenu, String displayName) {
        super(displayName);
        this.parentMenu = parentMenu;
    }

    @Override
    public void ExecuteAction() {
        this.parentMenu.ExecuteAction();
    }
}
