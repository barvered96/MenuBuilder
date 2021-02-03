package MenuBuilder.Caster;

import MenuBuilder.Caster.Interface.ObjectCaster;

public class StringCaster implements ObjectCaster {
    @Override
    public String cast(Object input) {
        try {
            return (String)input;
        }
        catch (Exception e) {
            return null;
        }
    }
}
