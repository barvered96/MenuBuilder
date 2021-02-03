package MenuBuilder.MenuItems.ActionItems;

import MenuBuilder.MenuItems.ActionItems.Interface.ActionItem;

public class ExitActionItem extends ActionItem {
    public ExitActionItem(String displayName) { super(displayName); }
    @Override
    public void ExecuteAction() {
        System.exit(0);
    }
}
