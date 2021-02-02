package MenuBuilder;

import java.util.Map;

public class InputValidator {
    String validate(Object input, Map menu) {
        if (!menu.containsKey(input)) {
            return "This option does not exist";
        }
        return "";
    }
}
