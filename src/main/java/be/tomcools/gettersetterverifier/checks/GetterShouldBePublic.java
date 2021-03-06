package be.tomcools.gettersetterverifier.checks;

import be.tomcools.gettersetterverifier.GetSetVerificationContext;
import be.tomcools.gettersetterverifier.wrappers.Methods;

public class GetterShouldBePublic extends PropertyMethodShouldBePublic {
    private static final String ERROR_FORMAT = "Getter was not public: %s.";

    @Override
    protected Methods getMethodsToTest(GetSetVerificationContext context) {
        return context.getMethods().getterMethods();
    }

    @Override
    protected String errorFormat() {
        return ERROR_FORMAT;
    }
}
