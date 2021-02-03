package MenuBuilder.Caster;

import MenuBuilder.Caster.Interface.ObjectCaster;

public class IntCaster implements ObjectCaster {
    @Override
    public Integer cast(Object input) {
        try {
            return Integer.parseInt((String)input);
        }
        catch (Exception e) {
            return null;
        }
    }
}
