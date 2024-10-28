package co.edu.uco.ucobet.generales.domain.city.exceptions;

import co.edu.uco.ucobet.generales.crosscutting.exception.RuleUcobetException;

public class CityIdIsNotNullException extends RuleUcobetException {
    private static final long serialVersionUID = 1L;

    private CityIdIsNotNullException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static final CityIdIsNotNullException create() {
        var userMessage = "El ID de la ciudad no puede ser nulo";
        return new CityIdIsNotNullException(userMessage);
    }
}
