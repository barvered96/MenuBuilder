package MenuBuilder;

import java.util.Map;

public class TextMenuDisplayer implements MenuDisplayer {
    @Override
    public void print(String title, Map menu) {
        Map<String, MenuItem> menuCast = (Map<String, MenuItem>) menu;
        System.out.println(title);
        System.out.println("-------------------------\n");
        for (Map.Entry<String, MenuItem> item: menuCast.entrySet()) {
            System.out.println(item.getKey());
        }
    }
}