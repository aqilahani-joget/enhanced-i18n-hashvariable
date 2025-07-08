package org.joget.marketplace;

import org.joget.apps.app.lib.AppMessageHashVariable;
import org.joget.apps.app.service.AppUtil;
//import org.joget.commons.util.LogUtil;
import org.joget.commons.util.ResourceBundleUtil;

public class Enhancedi18nHashVariable extends AppMessageHashVariable {

    @Override
    public String processHashVariable(String variableKey) {
        
        String label = AppUtil.replaceAppMessage(variableKey);
        if (label != null && !label.equals(variableKey)) {
            return label;
        }
        String platformTranslation = ResourceBundleUtil.getMessage(variableKey);
        //LogUtil.info(getClass().getName(), platformTranslation);
        return platformTranslation;
    }

    @Override
    public String getName() {
        return "Enhanced i18n Hash Variable";
    }

    @Override
    public String getVersion() {
        return "8.0.1";
    }

    @Override
    public String getDescription() {
        return "Returns Platform Translation for missing App Messages";
    }

    @Override
    public String getLabel() {
        return "Enhanced i18n Hash Variable";
    }
    
}
