package co.edu.uco.ucobet.generales.crosscutting.exception;

import co.edu.uco.ucobet.generales.crosscutting.exception.enums.Layer;

public class RuleUcobetException extends UcobetException {

    public static final long serialVersionUID = 1L;

    public RuleUcobetException(final String userMessage, final String technicalMessage, final Exception rootException) {
        super(userMessage, technicalMessage, rootException, Layer.RULE);
    }

    public static final RuleUcobetException create(final String userMessage, final String technicalMessage, final Exception rootException) {
        return new RuleUcobetException(userMessage, technicalMessage, rootException);
    }

    public static final RuleUcobetException create(final String userMessage) {
        return new RuleUcobetException(userMessage, userMessage, new Exception());
    }

    public static final RuleUcobetException create(final String userMessage, final String technicalMessage) {
        return new RuleUcobetException(userMessage, technicalMessage, new Exception());
    }
}
