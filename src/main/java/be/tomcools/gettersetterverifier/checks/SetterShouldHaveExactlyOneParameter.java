package be.tomcools.gettersetterverifier.checks;

import be.tomcools.gettersetterverifier.GetSetVerificationContext;
import be.tomcools.gettersetterverifier.wrappers.Methods;

public class SetterShouldHaveExactlyOneParameter extends PropertyMethodParameterCount {
    private static final String ERROR_FORMAT = "Setters were found that have more or less than one parameter: %s";

    @Override
    protected Methods methodsToTest(GetSetVerificationContext context) {
        return context.getMethods().setterMethods();
    }

    @Override
    protected int parameterCount() {
        return 1;
    }

    @Override
    protected String errorFormat() {
        return ERROR_FORMAT;
    }
}
