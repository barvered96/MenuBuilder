package MenuBuilder;

public class StringCaster implements ObjectCaster {
    @Override
    public String cast(Object Input) {
        try {
            return (String)Input;
        }
        catch (Exception e) {
            return "";
        }
    }
}
