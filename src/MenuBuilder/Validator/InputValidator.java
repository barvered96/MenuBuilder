package MenuBuilder.Validator;

import java.util.Map;

public class InputValidator {
    public String validate(Object input, Map menu) {
        if (!menu.containsKey(input)) {
            return "This option does not exist";
        }
        return "";
    }
}
