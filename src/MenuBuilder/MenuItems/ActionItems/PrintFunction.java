package MenuBuilder.MenuItems.ActionItems;

import MenuBuilder.MenuItems.Menus.Interface.Menu;

public class PrintFunction extends ReturnActionItem {
    public String text;
    public PrintFunction(Menu parentMenu, String displayName, String text) {
        super(parentMenu, displayName);
        this.text = text;
    }

    protected PrintFunction(Menu parentMenu, String displayName) {
        super(parentMenu, displayName);
    }

    @Override
    public void ExecuteAction() {
        System.out.println(text);
        super.ExecuteAction();
    }
}
